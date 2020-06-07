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
<link rel="stylesheet" href="css/form.css">

<!--<link rel="stylesheet" href="css/product.css">-->

<link rel="stylesheet" href="css/cart.css">

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
        <a class="cart-container" >
          <i class="fa fa-sign-out" aria-hidden="true"></i>
          <div class="cart-desc"><form action="logoutCon" class="container" method="get"><input type="submit" id="logout" value="Sign Out" /></form></div>
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
<a href="admin.jsp" class="active">Admin Dashbord</a>
  <a href="adminuser.jsp">View User</a>
  <a href="adminproduct.jsp">View Product</a>
  <a href="adminaddproduct.jsp">Add Product</a>
  <a href="admindash.jsp">View Orders</a>

</div>

<div id="main" >
  <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; open</span> <br> <br>
  <div class="container">
    <h1 class="section-title" style="display: block; text-align: center; ">Add Your Product Here</h1>
    
    <form id="regForm" action="productcon" method="post" onclick="return validation()" enctype="multipart/form-data">
        <br>


         <!-- <p><input placeholder="Last name..." oninput="this.className = ''"></p> -->
        <!--<p><input  id="" name="ProductId" required--> 
            <!--placeholder="Enter the product ID" oninput="this.className = ''" autocomplete="off"></p>-->

        <p> <label for="name">Enter Product Name</label>
            <input  oninput="this.className = ''" 
             type="text" id="name" name="ProductName" title="" autocomplete="off" required style="border-bottom: 2px solid #ccc;"></p>
	<p>  <label for="price">Enter Product Price</label>
            <input  oninput="this.className = ''" type="number" autocomplete="off" id="price" name="ProductPrice"
            required autocomplete="off" style="border-bottom: 2px solid #ccc;"></p>
        <p> <label for="author">Enter Author Name</label>
            <input type="text" id="author" name="ProductAuthor" required
            autocomplete="off"  oninput="this.className = ''" style="border-bottom: 2px solid #ccc;"></p>
                                                                                                                                                                                            
        <p> <label for="pages">Enter Total Number of Pages</label>
            <input type="number" id="pages" name="ProductPages" required 
            autocomplete="off"  oninput="this.className = ''" style="border-bottom: 2px solid #ccc;"></p>
        <p> <label for="pub">Enter Publisher Name</label>
            <input type="text" id="pub" name="ProductPub" required 
            autocomplete="off"  oninput="this.className = ''" style="border-bottom: 2px solid #ccc;"></p>
        <p> <label for="desc">Enter Description</label>
            <textarea type="text" id="desc" name="ProductDesc" required
             autocomplete="off"  oninput="this.className = ''" style="border-bottom: 2px solid #ccc;"></textarea></p>
                                                                                                            
                                                                                                                    
          <!--<span class="mid"> Select Category</span>-->
           <br>
            <br>  
           <p class="form-radio">
               <label for="gender">Select Category</label>
           <div class="form-flex">
		<input type="radio" id="radio-one" name="Category" value="Horror" checked/>
		<label for="">Horror</label>
		<input type="radio" id="radio-two" name="Category" value="Computer Programming" />
		<label for="">Computer Programming</label>
                <input type="radio" id="radio-three" name="Category" value="Biographical" />
		<label for="">Biographical</label>   
                </div>
            </p>
            <input type="file" name="file" value="" name="ProductImage" style="outline: 0px;" required>
            <br>
           <br>
           <input type="submit" value="Submit">
						

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
