<%--
    Document   : billDummyPage
    Created on : May 16, 2019, 1:47:21 PM
    Author     : MEGHA
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page import="com.bookbug.connection.DbConnection"%>
<%@page import="com.bookbug.bean.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String name="";

String Name="", pageName="", pageLink="", MainPageNameLink="";
try{
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Cache-Control", "no-store");
       response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires",0);



if(session.getAttribute("user")!=null)
{

User u=(User)session.getAttribute("user");

name=u.getName();


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
     response.sendRedirect("login.jsp");
}
}
catch(Exception ex)
{
    out.println(ex);
}
%>
<!DOCTYPE html>

  <html lang="en" >
     <head>
          <!-- Required meta tags -->
          <meta charset="utf-8">
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

          <!-- Title tag -->
          <link rel="shortcut icon" href="img/log.ico" />
          <title>BOOKBUG | Welcome</title>

          <!-- Font awesome -->
          <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

          <!-- Animate.css -->
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">

          <!-- Normalize -->
          <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/7.0.0/normalize.css">

          <!-- AOS -->
          <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">

          <!-- Animation Css
          <link rel="stylesheet" href="../dist/css/animsition.min.css">

          Ajax Lib
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>

          Animation js
          <script src="../dist/js/animsition.min.js"></script> -->

          <!-- Custom CSS -->
          <link href="css/styles.css" rel="stylesheet">
          <link href="css/cartform.css" rel="stylesheet">
          <link href="css/table.css" rel="stylesheet">
          <link href="css/checkout.css" rel="stylesheet">
          <link href="css/profile.css" rel="stylesheet">

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
          <nav class="main-nav" id="main-nav" style="background-color: #030308;">
               <div class="content-wrapper-sm">
                    <!-- <a href="#" class="navbar-brand">BOOKBUG</a> -->
                    <a class="navbar-brand"  href="index.jsp">

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
                         <li><a href="store.jsp">Store</a></li>
                         <li><a href="<%=pageLink%>"><%=pageName%></a></li>
                         <li class="last-li"><a href="<%=MainPageNameLink%>"><%=Name%></a></li>
                    </ul>
               </div>
          </nav>








        <div class="content-wrapper">
             <div class="grid">
                 <div class="grid-col-sm-12 grid-col-md-6" data-animation="fadeInLeft">
                     <img class="grid-col-sm-12" src="img/purchase.png" alt="" style="">
<!--                      <h2 class="grid-col-sm-12" style="text-align: center;">THANKS </h2>-->
                        <!--  <p> <span class="number">1</span> &nbsp; Shipping Info:</span><br>
                                <p>Address - </p>
                                <p>Pin Code -</p>
                              </p>
                              <p><span class="number">2</span> &nbsp; Contact Info:</span><br>
                                  <p>Mobile No - </p>
                              </p>-->
<!--                              <p>Orders are usually processed within 2-4 business days unless otherwise
                                  stated in the product description or your confirmation email.</p>-->
                </div>
                <div class="grid-col-sm-12 grid-col-md-6" data-animation="fadeInLeft">
                              <p> <b style="font-weight: 600">Hi, <%=Name%> </b> <br><br>From all of us at The BOOKBUG.COM, 
                                  welcome to our family! Thank you so much for your purchase. 
                                  It’s a classic, and we’re sure you’ll love it! 
                                  </p>
                              <p>Thank you again for choosing us, we hope to hear from you again soon!</p>
                              <p><a href="store.jsp" style="text-decoration: none">  Continue Shopping </a> </p>

                         </div>
                    </div>

            <h1 class="section-title" style="display: block; text-align: center;">Order Details</h1>

            <div class="table-container"> <!--provides a wrapper for testing the scroll-->
                <div class="table-wrap">
                    <div class="table-head">
                      <table>
                           <thead>
                              <tr>
                                  <th>Order ID</th>
                                  <th>Product ID</th>
                                  <th>Product Picture</th>
                                  <th>Product Name</th>
                                  
                                  <th>Quantity</th>
                                  <th>Price</th>
                                  <th>Total Price</th>
                              </tr>
                          </thead>
                          </table>
                    </div> <!--/table head-->

                    <div class="table-body">
                      <table>

                            <tbody>
                                  <%
                                   String emailId = "";
                                   if (session.getAttribute("user") != null) {
                                      User u = (User) session.getAttribute("user");
                                      emailId = u.getEmailId();
                                      System.out.println("Here in billDummyPage: " + emailId);
                                   }
                                       String timeOfOrder=(String)request.getAttribute("timemessage");
                                       request.removeAttribute("timemessage");
                                          SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                                  Date date=new Date();
                                  String dateOfOrder= sdf.format(date);
                                      String row = "";
                                    try {
                                        DbConnection db = new DbConnection();
                                       Connection con = db.con;
                                        String sql = "select A.OrderId, A.UserId, A.ProductId, B.ProductName, A.Quantity, B.ProductPrice, B.ProductImage";
                                        sql = sql + " from orders A inner join products B ";
                                        sql = sql + "on A.ProductId=B.ProductId where A.UserId=? and A.TimeOfOrder=? and A.DateOfOrder=?";
                                        PreparedStatement ps = con.prepareStatement(sql);
                                        ps.setString(1, emailId);
                                        ps.setString(2, timeOfOrder);
                                        ps.setString(3, dateOfOrder);
                                        ResultSet rs = ps.executeQuery();
                                        while (rs.next()) {
                                            double totalPrice;
                                            int OrderId, Sales, productPrice; //totalPrice;
                                            String productId, userId, productName, productImage;
                                            OrderId = rs.getInt(1);
                                            userId=rs.getString(2);
                                            System.out.println("userId in cart: " + userId);
                                            productId = rs.getString(3);
                                            System.out.println("productId in cart: " + productId);
                                            productName = rs.getString(4);
                                            System.out.println("productName in cart: " + productName);
                                            Sales = rs.getInt(5);
                                            System.out.println("Sales in cart: " + Sales);
                                            //System.out.println(rs.getString(5));
                                            //productPrice = rs.getInt(5);
                                            String price = rs.getString(6);
                                            System.out.println("Price: "+price);
                                            double pp;
                                            pp= Double.parseDouble(price);
                                            System.out.println("productPrice in cart: " + pp);
                                            totalPrice = pp * Sales;
                                            productImage=rs.getString(7);
                                            System.out.println("productImage in billdummypage: "+productImage);


        %>
                                        <tr>

                                            <td><%=OrderId%></td>

                                    <td> <%=productId%> </td>
                                    <td><img src="images/<%=productImage%>" height=100px></td>

                                    <td><%=productName%></td>

                                    

                                    <td><%=Sales%></td>

                                    <td><%=pp%></td>

                                    <td><%=totalPrice%></td>



                                </tr>
                                <%

                                        }
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                %>
                            </tbody>
                        </table>

                    </div> <!--/.table-body-->
                </div>
            </div> <!--table-container-->
        </div> <!--Content-Wrapper-->
                            
   <!-- Main footer -->
        <footer>
             <div class="content-wrapper-sm display-flex-between">
                  <!-- Easily replaceble copyright information -->
                  <small>BOOKBUG copyright &copy; 2019</small>

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


        <script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
        <script src="js/menu.js" charset="utf-8"></script>

        <!-- AOS -->
        <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
        <!-- Optional js files -->

        <script src="js/astonish.js" charset="utf-8"></script>
        <script src="js/nav.js" charset="utf-8"></script>
        <script src="js/scroll.js" charset="utf-8"></script>
        <script>
          var preloader = document.getElementById('loading');
              function myFunctionLoading(){
                preloader.style.display = 'none';

              }
              AOS.init();
              
            
        </script>

        </body>
        </html>
