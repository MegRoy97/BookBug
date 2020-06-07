<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.bookbug.connection.DbConnection"%>
<%@page import="com.bookbug.dao.Dao"%>
<!DOCTYPE html>
<html lang="en" >

<head>
  <meta charset="UTF-8">
  <title>Admin | BOOKBUG</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">

<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,700' rel='stylesheet' type='text/css'>

<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">

<link rel="stylesheet" href="css/styl1.css">
<link rel="stylesheet" href="css/admin.css">
<!--<link rel="stylesheet" href="css/form.css">

<link rel="stylesheet" href="css/cart.css">-->
<style>
    * {
  box-sizing: border-box;
}

body {
  font-family: sans-serif;
  color: #404040;
  padding: 0;
  margin: 0;
}

table {
  border-collapse: collapse;
  table-layout: fixed;
  width: 100%;
  background: white;
}

th, td {
  border: 1px solid lightgray;
  padding: 8px;
  text-align: left;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
  text-align: center;
}
th:first-child, 
td:first-child {
  width: 12%;
}
th:last-child, 
td:last-child {
  text-align: right;
  width: 12%;
}

th {
  background: #8bab43;
  color: white;
  text-transform: uppercase;
  font-weight: normal;
}

table tr:first-child td {
  border-top: none;
}


table-body::-webkit-scrollbar-track
{
	border: 0;
	background-color: #fff;
}

.table-body::-webkit-scrollbar
{
	width: 5px;
	background-color: #fff;
}

.table-body::-webkit-scrollbar-thumb
{
	background-color: #000000;	
}

.table-container {
  
  width: 100%;
  padding: 0px;
  height: 300px;
}

.table-wrap {
  height: 100%;
  overflow: hidden;
  display: flex;
  flex-direction: column;
}
.table-head {
  flex: 0 0 37px;
  /*overflow-y: scroll;*/
}
.table-body {
  overflow-y: scroll;
}
.table-body {
</style>

</head>


<body>

  <!-- NAVBAR -->
  <div class="navbar1">
      <div class="name">


            <!-- <div class="brand">
                <a href="#splash">BOOKBUG</a>
            </div> -->
            <a href="indx.jsp" style="text-decoration: none; color: #1a1a1d;"><div class=" container cf brand">

              <img src="log.png" alt="" height="35px" width="65px" style="left: 0; ">
               &nbsp; <span style="text-decoration: none; color: #1a1a1d; transform: translateY(-5%);">BOOKBUG</span>
              <!-- <span>B</span>
              <span class="">O</span>
              <span class="">O</span>
              <span class="">K</span>
              <span>B</span>
              <span class="">U</span>
              <span class="">G</span> -->

            </div></a>


        </div>
        <!-- <a class="account-container" href="./SCREEN/split.jsp">
            <i class="fa fa-user" aria-hidden="true"></i>
            <div class="cart-desc"></div>
        </a> -->
        <!-- <div class="dropdown-con">
          <p>Hello World!</p>
        </div> -->
        <a class="cart-container" href="cart.jsp">
          <i class="fa fa-sign-out" aria-hidden="true"></i>
          <div class="cart-desc">Logout</div>
        </a>

  </div>
<header class="container-fluid header">


    <!-- <hr style="border-bottom: 1px solid #000; width: 150%; margin: 0; left : 0; transform: scale(1.2);"> -->
    <!-- <ul>
       <li><a href="#">Category 1</a></li>
       <li><a href="#">Category 2</a></li>
       <li ><a href="shop.jsp" class="active-class">Browse Products</a></li>
       <li><a href="#">Contact Us</a></li>
   </ul> -->

</header>



<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>

  <a href="admin.jsp" class="active">Admin Profile</a>
  <a href="adminuser.jsp">User</a>
  <a href="adminproduct.jsp">Product</a>
  <a href="admindash.jsp">Dashbord</a>

</div>

<div id="main" >
  <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; open</span> <br> <br>
  <div class="container">
    <h2>Admin Panel</h2>
    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
      Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit
      esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
      <form action="cart" method="post">
      <div class="table-container"> <!--provides a wrapper for testing the scroll-->
  <div class="table-wrap">
    <div class="table-head">
      <table>
        <thead>
          <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <!--<th>User Id</th>-->
            <!--<th>Date Of Order</th>-->
            <th>Total Quantity</th>
            <th>Total Price</th>
          </tr>
        </thead>
      </table>
    </div> <!--/table head-->
    <div class="table-body">
      <table>
        <tbody>
                <%
                    try{
        String fromDate="", toDate="";
        fromDate=request.getParameter("fromDate");
        toDate=request.getParameter("toDate");
        System.out.println("fromDate: "+fromDate);
        System.out.println("toDate: "+toDate);
        DbConnection con1=new DbConnection();
        String sql="select A.ProductId, B.ProductName, sum(A.Quantity) as Sales,(sum(A.Quantity))*(B.ProductPrice) as SalesPrice";
        sql=sql+" from orders A inner join products B ";
        sql=sql+"on A.ProductId=B.ProductId where A.DateOfOrder>=? and A.DateOfOrder<=? group by A.ProductId;";
 
            PreparedStatement ps=con1.con.prepareStatement(sql);
           ps.setString(1, fromDate);
            ps.setString(2, toDate);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String productId, productName, Sales, SalesPrice;
                productId=rs.getString(1);
                System.out.println("productId: "+productId);
                productName=rs.getString(2);
                System.out.println("productName: "+productName);
//dateOfOrder=rs.getString(3);
                Sales=rs.getString(3);
                System.out.println("Sales: "+Sales);
                SalesPrice=rs.getString(4);
                System.out.println("SalesPrice: "+SalesPrice);
                
    %>
          <tr>
              <td><%=productId%></td>
            <td><%=productName%></td>
            <!--<td>bhfjshj@gmail.com</td>-->
            <!--<td>11/02/2018</td>-->
            <td><%=Sales%></td>
            <td><%=SalesPrice%></td>
          </tr>
<%
}
}
 catch (Exception ex) {
            System.out.println(ex);
        }
%>
        </tbody>
      </table>
    </div> <!--/.table-body-->
  </div> <!--/.table-wrap-->
</div> <!--/.container--> 
          <!-- <input type="hidden" id="noOfItems" name="NumberOfItems" /> -->
           <!-- <input type="submit" class="purchase" name="button" value="Purchase" /> -->
           <!-- <a href="checkout.jsp">checkout</a> -->

      </form>

  </div>


</div>



<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>
<script  src="js/index.js"></script>
  <script type="text/javascript">
  function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
    document.body.style.backgroundColor = "rgba(0,0,0,0)";
  }

  function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("main").style.marginLeft= "0";
    document.body.style.backgroundColor = "white";
  }
  </script>
</body>

</html>
