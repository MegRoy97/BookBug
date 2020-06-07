<%@page import="com.bookbug.bean.OrderBean"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.bookbug.connection.DbConnection"%>
<%@page import="com.bookbug.bean.Product"%>
<%@page import="com.bookbug.dao.Dao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.bookbug.bean.User"%>
 <% if(session.getAttribute("user")!=null)
{

    User u=(User)session.getAttribute("user");


//       name=u.getName();
   
    String userName=u.getName();
       
}

else
    {
        
         response.sendRedirect("login.jsp");
    }%>
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
<link rel="stylesheet" href="css/cartform.css">
 <link href="css/table.css" rel="stylesheet">
<!--<link rel="stylesheet" href="css/product.css">-->

<link rel="stylesheet" href="css/cart.css">
<style type="text/css">
/*table { border-collapse: collapse; } 
table td { padding: 2px; }*/

tr.accepted, tr.accepted td { background-color: green; }

</style>
</head>


<body>
  <!-- NAVBAR -->
  <div class="navbar1">
      <div class="name">


            <!-- <div class="brand">
                <a href="#splash">BOOKBUG</a>
            </div> -->
            <a href="indx.jsp" style="text-decoration: none; color: #1a1a1d;">
                <div class="container cf brand">

              <img src="log.png" alt="" height="35px" width="65px" style="left: 0; ">
               &nbsp; <span style="text-decoration: none; color: #1a1a1d; transform: translateY(-5%);">BOOKBUG</span>
          

            </div></a>


        </div>
     
        <a class="cart-container">
          <i class="fa fa-sign-out" aria-hidden="true"></i>
          <div class="cart-desc"><form action="logoutCon" class="container" method="get"><input type="submit" id="logout" value="Sign Out" /></form></div>
        </a>

  </div>
<header class="container-fluid header">


   

</header>



<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>

  
 <a href="admin.jsp" class="active">Admin Dashbord</a>
  <a href="adminuser.jsp">View User</a>
  <a href="adminproduct.jsp">View Product</a>
  <a href="adminaddproduct.jsp">Add Product</a>
  <a href="admindash.jsp">View Orders</a>
  

</div>

<div id="main" >
  <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; open</span> <br> <br>
  <div class="container">
    <h1 class="section-title" style="display: block; text-align: center; ">All Orders</h1>
    <p>Here is All Available Products</p>
        

            <div class="table-container"> <!--provides a wrapper for testing the scroll-->
                <div class="table-wrap">
                    <div class="table-head">
                        <table>
                            <thead>
                                <tr>
                                    <th>Order ID</th>
                                    <!--                      <th>Product Picture</th>-->
                                    <th>User ID</th>
                                    <th>Product ID</th>
                                    <th>Number Of Orders</th>
                                    <th>Date Of Order</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                        </table>
                    </div> <!--/table head-->

                    <div class="table-body" id="table">

                        <table>
                            <tbody>
                                <%
                                    try{
                                 OrderBean order=new OrderBean();
                              DbConnection con1=new DbConnection();
                              String sql="select * from orders";
                                  PreparedStatement ps=con1.con.prepareStatement(sql);
                                  ResultSet rs=ps.executeQuery();
                                  while(rs.next()){
                                      String OrderId,UserId,ProductImage,Qty,ProductId,Date;
                                      OrderId=rs.getString(1);
                                      UserId=rs.getString(2);
                                      ProductId=rs.getString(3);
                                      Date=rs.getString(4);
                                      Qty=rs.getString(5);
%>


                                <tr>


                                    <td> <input class="" type="text" id="" value="<%=OrderId%>" readonly style="cursor: not-allowed;text-align: center;"> </td>

                                    <td><input class="" type="text" id="" value="<%=UserId%>" readonly style="cursor: not-allowed;text-align: center;"></td>

                                    <td><input class="" type="text" id="" value="<%=ProductId%>" readonly style="cursor: not-allowed;text-align: center;"></td>

                                    <td><input class="" type="text" id="" value="<%=Qty%>" readonly style="cursor: not-allowed;text-align: center; padding: 0;"></td>

                                    <td><input class="" type="text" id="" value="<%=Date%>" readonly style="cursor: not-allowed;text-align: center;"></td>

                                    <td><button onclick="Accept(this)" >Dispatch</button>
                                    </td>
                                                                                                                                                                           


                                </tr>
                                
                                <%

                                         }    //System.out.println("------------------------------------------------------------------------------------------------------");                      }
                                        
                                    %>
                            
                            </tbody>
                            
                        </table>
                                    
                         
                                <%   
                                   
                                  }
                                  catch (Exception ex) {
                                  System.out.println(ex);
                              }
                                %>

                    </div> <!--/.table-body-->
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
  function Accept(el)
{
   var tr = el.parentNode.parentNode; //tr
   tr.className = "accepted";
}
  </script>
</body>

</html>
