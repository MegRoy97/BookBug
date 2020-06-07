<!--
     Date Created: 16/01/19
     Date Revised: 19/01/19
-->
<%@page import="com.bookbug.bean.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
          <link href="css/wave.css" rel="stylesheet">

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
               .hover{
                   opacity: 0.8;
                   
                   
               }
               .hover:hover{
                   opacity: 0.8;
               }
          </style>
     </head>
     <body onload="myFunctionLoading()">
           <!-- Preloader -->
           <div id="loading"></div>

          <!-- Main Navigation -->
          <nav class="main-nav" id="main-nav">
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

          <!-- Main header section -->
          <header>

               <section class="section">

               <div class="wave">

               </div>

               <div class="wrapper astonish animated fadeInDown">
                    <h1>Welcome to BOOKBUG</h1>
                    <h2>The Power of Reading<br>We believe reading can change the world</h2>
               </div>
             </section>
               <!-- <div class="wrapper astonish animated fadeInDown">
                    <h1>BOOKBUG</h1>
                    <h2>A free, responsive, landing page. <br>
                    Created by Jesus Rodriguez.</h2>
               </div> -->
          </header>

          <!-- Main content -->
          <main>
               <div class="content-wrapper" id="">

                   
                    <div class="grid">
                         <div class="grid-col-sm-12 grid-col-md-6" data-animation="fadeInLeft">
                              <img class="grid-col-sm-12" src="img/reading.png" alt="">
                         </div>
                         <div class="grid-col-sm-12 grid-col-md-6" data-animation="fadeInRight">
                              <h2 class="section-title">A BEAUTIFUL HOUSE, A BEAUTIFUL BOOK</h2>
                              <p>Our newest feature. An online shop-in-shop featuring books & 
                                  objects from the personal collections of fascinating people. 
                                  New York design studio Various Projects have provided our first collection & 
                                  we couldn't be happier. Works by Yoko Ono & Enzo Mari, books on Sixties Art
                                  & film design, custom stationary items and more. </p>
                         </div>
                    </div>
               </div>

               <div id="reserve" class="content-wrapper-lg text-center" data-animation="zoomIn">
                    <h2 class="section-title">Categories We Have</h2>
                    <div class="grid">
                         <div class="grid-col-sm-12 grid-col-md-6" data-animation="fadeInLeft">
                             <a href="horror.jsp" class="hover"> <img class="grid-col-sm-12" src="img/horror.jpg" alt="">
                                 </a><p>HORROR</p></div>  
                         <div class="grid-col-sm-12 grid-col-md-6" data-animation="fadeInRight">
                              <a href="bio.jsp" class="hover"> <img class="grid-col-sm-12" src="img/bio.jpg" alt="">
                                  </a> <p>BIOGRAPHICAL</p></div>
                    </div>
                    <div class="grid">
                         <div class="grid-col-sm-12 grid-col-md-6" data-animation="fadeInLeft">
                             <a href="tech.jsp" class="hover"> <img class="grid-col-sm-12" src="img/tch.jpg" alt="">
                                 </a><p>TECHNOLOGY</p></div>  
                         <div class="grid-col-sm-12 grid-col-md-6" data-animation="fadeInRight">
                              <a href="horror.jsp" class="hover"> <img class="grid-col-sm-12" src="img/view.jpg" alt="">
                                  </a> <p>VIEW ALL</p></div>
                    </div>
                    </div>
               </div>

               <div class="content-wrapper" id="">

                    <div class="grid-col-sm-12">
                         <h2 class="section-title">IN DEFENSE OF HOME LIBRARIES</h2>
                              <p>A French gentleman who possessed a large library was asked an old question by a visitor, a question so often posed to those who own a lot of books:</p>
                              <p>"And have you read them all?"</p>
                              <p>But this wise collector turned to his guest and, with an astonished look on his face, simply replied "No, and I haven't drunk all the wine in my cellar either."</p>
                              <p>The point was made at once. His books, like his prized bottles, were waiting for the moment he chose to open them, there for his pleasure according to his own timing. After all, what good would a cellar of empty bottles be to him? Or a library of books already completed? </p>
                    </div>
               </div>

               <!-- This is an embedded Google map, this is easily customizable especially if you get a Google API key, this will allow for more customizable features. -->
          <iframe id="map" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d14736.576655667184!2d88.45665687858748!3d22.57371081625746!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3a02753269586b03%3A0xfbb4d0c346a81109!2sTechno+India+College+of+Technology!5e0!3m2!1sen!2sin!4v1556979333301!5m2!1sen!2sin" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
          </main>

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
