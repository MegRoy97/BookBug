 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.bookbug.bean.User"%>
<% String emailId="";
    if(session.getAttribute("user")!=null)
{

    User u=(User)session.getAttribute("user");

    emailId=u.getEmailId();
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
<link rel="stylesheet" href="css/form.css">


<!-- <link rel="stylesheet" href="css/merchant.css"> -->

<style>
* {
  box-sizing: border-box;
}

/* Create four equal columns that floats next to each other */
.column {
  float: left;
  width: 25%;
  padding: 10px;
  height: 300px; /* Should be removed. Only for demonstration */
}
.column h2,p  {
    text-align: center;
        
}
.column p{
    justify-content: center;
    
}
/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}
.row a{
    color: #101010;
    
}

/* Responsive layout - makes the four columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .column {
    width: 100%;
  }
}
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
        <a class="cart-container">
          <i class="fa fa-sign-out" aria-hidden="true"></i>
          <div class="cart-desc"><form action="logoutCon" class="" method="get"><input type="submit" id="logout" value="Sign Out" /></form></div>
        </a>

  </div>
  <hr>
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

  
  <a href="admin.jsp" class="active">Admin Dashbord</a>
  <a href="adminuser.jsp">View User</a>
  <a href="adminproduct.jsp">View Product</a>
  <a href="adminaddproduct.jsp">Add Product</a>
  
  <a href="admindash.jsp">View Orders</a>

</div>

<div id="main" >
  <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; open</span> <br> <br>
  <div class="container">
    <h2>Admin Panel</h2>
    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
      Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit
      esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
    <br>
    <br>
    <br>
    <div class="row">
        <a href="adminaddproduct.jsp"><div class="column" style="background-color:#ccc;">
    <h2>Add a Product</h2>
    <p>Click Here To add Product into your database</p>
  </div></a>
  <a href="adminproduct.jsp"><div class="column" style="background-color:#ddd;">
    <h2>View Product</h2>
    <p>Click here to see available products in your database </p>
  </div></a>
  <a href="adminuser.jsp"><div class="column" style="background-color:#ccc;">
    <h2>View Users</h2>
    <p>Click here to view all registered users in your database</p>
  </div></a>
  <a href="admindash.jsp"><div class="column" style="background-color:#ddd;">
    <h2>View Orders</h2>
    <p>Click here to view all placed orders in your database</p>
  </div></a>
</div>
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
