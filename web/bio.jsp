<!--
     Date Created: 16/01/19
     Date Revised: 19/01/19
-->
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.bookbug.connection.DbConnection"%>
<%@page import="com.bookbug.bean.Product"%>
<%@page import="com.bookbug.dao.Dao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.bookbug.bean.User"%>
<%
    String Name="", pageName="", pageLink="", MainPageNameLink="";
     try{
       response.setHeader("Cache-Control", "no-cache");
       response.setHeader("Cache-Control", "no-store");
          response.setHeader("Pragma", "no-cache");
       response.setDateHeader("Expires",0);
        if(session.getAttribute("user")!=null)
        {
        User u=(User)session.getAttribute("user");
        String userName=u.getName();
        Name="";
        pageName="Cart";
            pageLink="cart.jsp";
        MainPageNameLink="account.jsp";
        for(int i=0; i<userName.length(); i++)
        {
            if(userName.charAt(i)!=' ')
            {
                Name=Name+userName.charAt(i);
            }
            else
                break;
        }
        }
        else
        {
            pageName="Cart";
            pageLink="login.jsp";
            Name="Log In";
            MainPageNameLink="login.jsp";

        }
     }
     catch(Exception ex)
     {
         out.println(ex);
     }
%>
<!DOCTYPE html>
<html>
     <head>
          <!-- Required meta tags -->
          <meta charset="utf-8">
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

          <!-- Title tag -->
          <link rel="shortcut icon" href="img/log.ico" />
          <title>BOOKBUG | Store</title>

          <!-- Font awesome -->
          <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

          <!-- Animate.css -->
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">

          <!-- Normalize -->
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/7.0.0/normalize.css">

          <!-- Font Icon For Form-->
          <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
          <link rel="stylesheet" href="vendor/jquery-ui/jquery-ui.min.css">


          <!-- animsition.css
          <link rel="stylesheet" href="../dist/css/animsition.min.css">

           jQuery
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>

           animsition.js
          <script src="../dist/js/animsition.min.js"></script>-->

          <!-- Custom CSS -->
          <link href="css/styles.css" rel="stylesheet">
          <!-- <link href="wave.css" rel="stylesheet"> -->
          <!-- Shop css -->
          <link rel="stylesheet" href="css/shop.css">



          <style>
               /* If you wish to remove the astonish.js file, then also be sure to remove these styles. */
               .astonish {
                    visibility: visible;
               }

               @media (min-width: 768px) {
                    .astonish {
                         visibility: hidden;
                    }
                    .animated {
                         visibility: visible;
                    }
               }



          </style>
     </head>
     <body onload="myFunctionLoading()">
           <!-- Preloader -->
           <div id="loading"></div>

          <!-- Main Navigation -->
          <nav class="main-nav" id="main-nav"  style="background-color: #030308;">
               <div class="content-wrapper-sm">
                    <!-- <a href="#" class="navbar-brand">BOOKBUG</a> -->
                    <a class="navbar-brand" href="index.jsp">

                      <img src="img/log.png" alt="" height="50px" width="67px" style="left: 0;transform: translateY(-25%);">
                       &nbsp;
                      <span>B</span>
                      <span class="">O</span>
                      <span class="">O</span>
                      <span class="">K</span>
                      <span>B</span>
                      <span class="">U</span>
                      <span class="">G</span>
                      <span class="hidden">.</span>
                      <span class="hidden">C</span>
                      <span class="hidden">O</span>
                      <span class="hidden">M</span>

                    </a>
                    <div id="menu-button">
                         <div class="bar1"></div>
                         <div class="bar2"></div>
                         <div class="bar3"></div>
                    </div>
                    <ul class="nav-links">
                         <li><a href="about.jsp">About</a></li>
                         <li><a class="current" href="store.jsp" >Store</a></li>
                         <li><a href="<%=pageLink%>"><%=pageName%></a></li>
                         <li class="last-li"><a href="<%=MainPageNameLink%>"><%=Name%></a></li>
                    </ul>
               </div>
          </nav>



          <!-- Main content -->
          <main>
            <div class="grid">


            </div>
               <div class="product-container" id="">
                 <div class="grid-col-sm-12" data-animation="fadeInLeft" style="overflow-y:  hidden;">
                   <ul class="sc-nav">
                    <li><a  href="store.jsp">All</a></li>
                    <li><a href="horror.jsp">Horror</a></li>
                    <li><a class="active" href="bio.jsp">biography</a></li>
                    <li><a href="tech.jsp">Technology</a></li>
                  </ul>



                 </div>



                    <div class="xop-section">
                      <ul class="xop-grid">
                        
                          <div class="xop-box">
                            <%
                            try{

                                Product product=new Product();
                                DbConnection con1=new DbConnection();
                                String sql="select * from products where ProductCategory like ?";


                                PreparedStatement ps=con1.con.prepareStatement(sql);

                                ps.setString(1,"Biographical%");
                                ResultSet rs=ps.executeQuery();
                                while(rs.next()){
                                    String ProductId,ProductPrice,ProductImage, ProductName;
                                    ProductId=rs.getString(1);
                                    ProductPrice=rs.getString(3);
                                    ProductImage=rs.getString(9);
                                    ProductName=rs.getString(2);

                                  %>
                            <li><form class="items" action="book1.jsp" method="post">
                              <div class="pimg">
                                 <img src="images/<%=ProductImage%>" alt=""> 
                                <!--<img src="./img/reading.png" alt="">-->
                                <!--<div class="quickviewbtn">Quick View</div>-->
                              </div>
                              <div class="details">
                                <h3 class="item" title="ODI"> <%=ProductName%> </h3><br>
                                 <span class="price"> Price : <%=ProductPrice%> </span><br><br>
                                <input type="text" hidden class="" value="<%=ProductId%>" name="ProductId">



                              </div>
                              <input type="submit" value="View Product" class="addbtn">
                            </form></li>
                            <%


                                  }
                                  }
                                  catch (Exception ex) {
                                  System.out.println(ex);
                              }
                                  %>


                          </div>
                        
                      </ul>
                    </div>

               </div>

          </main>

          <!-- Main footer -->
          <footer>
               <div class="content-wrapper-sm display-flex-between">

                    <small>Your copyright &copy; 2019</small>

                    <div class="social-links">
                         <ul>
                              <li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                              <li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                              <li><a href="#"><i class="fa fa-snapchat-square" aria-hidden="true"></i></a></li>
                              <li><a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
                         </ul>
                    </div>
               </div>
          </footer>

          <!-- Scripts placed at the bottom for faster loading -->
          <script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
          <script src="js/menu.js" charset="utf-8"></script>
          <!-- Form Validation  -->
          <script src="vendor/jquery/jquery.min.js"></script>
          <script src="vendor/jquery-ui/jquery-ui.min.js"></script>
          <script src="vendor/jquery-validation/dist/jquery.validate.min.js"></script>
          <script src="vendor/jquery-validation/dist/additional-methods.min.js"></script>
          <script src="js/validation.js"></script>
          <!-- Optional js files -->

          <script src="js/astonish.js" charset="utf-8"></script>
          <script src="js/nav.js" charset="utf-8"></script>
          <script src="js/scroll.js" charset="utf-8"></script>
          <script>
            var preloader = document.getElementById('loading');
                function myFunctionLoading(){
                  preloader.style.display = 'none';

                }

          </script>

     </body>
</html>
