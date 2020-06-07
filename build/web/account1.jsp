<%@page import="com.bookbug.bean.User"%>
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
<%
String Email="";

  response.setHeader("Cache-Control", "no-cache");
       
        response.setHeader("Cache-Control", "no-store");
           response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires",0);
 
    if(session.getAttribute("user")!=null)
{ 
    User u=(User)session.getAttribute("user");
    Email = u.getEmailId();
}else{
        response.sendRedirect("login.jsp");
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
              <title>BOOKBUG | My Profile</title>

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
              <link href="css/form.css" rel="stylesheet">
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

            <!-- Main content -->
            <main>
                 <div class="content-wrapper" id="">
                   <div class="grid">

                        <div class="grid-col-sm-12" data-animation="fadeInLeft">
                          <div class="container1">
                          <div class="left">
                      <!--        <img class="profile-pic" src="./img/default.png" />
                            <div class="upload-button" alt="Please Upload Square Img">Upload Image</div>
                              <input class="file-upload" type="file" accept="image/*"/> <br><br>-->
                              <div class="tab ">
                                 <a href="account.jsp"><img class="profile-pic" src="img/edituser1.png" />My Account</a>
                                <a href="orders.jsp"><img class="profile-pic" src="img/box.png" />My Orders</a>
                              </div>
                          </div>
                          </div>
                          <div class="container2">
                              <div class="edit">
                          <form action="updatePass" class="container" method="post" id="signup-form">


                            <div class="">
                                <h1 class="section-title" style="text-align: center">Update Your Password Here</h1> <br>
                            <fieldset>




                                      <!-- E-Mail Field -->
                                      <p><input  id="mail" name="EmailId" placeholder="" autocomplete="off" value="<%=Email%>" readonly style="cursor:not-allowed; user-select: none; border-bottom: 0px; text-align: center;"></p>
                                      
                                      <div class="tab "> <span class="mid"> <center id="center">Update Your Password</center><br>


                                <p><input type="password" name="Password" placeholder="Password.." id="Password"  autocomplete="off"></p>
                                  <p><input placeholder="Re-type your password" type="password" id="re_password" name="re_password" autocomplete="off"></p><br>





                            </fieldset>  <br>  <br>



                            </div>
                                      <input type="submit" id="update" value="Update" />

                          </form>
                                      <form action="logoutCon" class="container" method="get"><input type="submit" id="logout" value="Sign Out" /></form>
                                      </div>



                            </div>
                  </div>  <!-- Grid -->
                </div>   <!-- Grid-12 Grid-12 -->
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
<!-- Form Validation  -->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/jquery-ui/jquery-ui.min.js"></script>
<script src="vendor/jquery-validation/dist/jquery.validate.min.js"></script>
<script src="vendor/jquery-validation/dist/additional-methods.min.js"></script>
<script src="js/validation.js"></script>
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
