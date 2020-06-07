
<%@page import="com.bookbug.bean.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
try{
response.setHeader("Cache-Control", "no-cache");
   response.setHeader("Cache-Control", "no-store");
   response.setHeader("Cache-Control", "must-revalidate");
      response.setHeader("Pragma", "no-cache");
   response.setDateHeader("Expires", 0);}
   catch(Exception ex)
     {
         out.println(ex);
     }
%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>BOOKBUG | Error</title>
    <meta name="viewport" content="width-device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/style1.css">
  	<!-- <link rel="stylesheet" href="./css/players.css"> -->
    <link href="https://fonts.googleapis.com/css?family=Abel|Montserrat|Patua+One" rel="stylesheet">
    <!-- <script src="js/jquery.min.js"></script>
    <script src="js/fullclip.min.js"></script> -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css">
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
    <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
  </head>
  <style media="screen">
    section.error i {
        size: letter;
        font-size: 500%;
        padding: 50px;
    		color: #737272;

    }
    .error {
        text-align: center;

    }


    .container2{
    	width: 50%;
    	background: #dcd9d9;
    	border-radius: 30px;
    	margin: 12% auto;
    	border: 2px solid #3ac162;
    	box-shadow: 5px 20px 30px #888888;
      height: auto;
    }

    .container2 h1
    {
    	padding-bottom: 20px;

    	font-style: italic;
    	font-weight: 800;
    	font-family: 'Montserrat',sans-serif;
    	/* color: #3ac162; */
    }

    .container2 h2{
    	padding: 10px 10px 15px 10px;
    	font-size: 25px;
      color: #f72828;

    }

    .container2 h5{
    	padding: 0px 10px 15px 10px;
    	font-size: 20px;
    	font-weight: 500;
    }

    .container2 h6{
    	padding: 20px 20px 50px 20px;
    	font-size: 14px;
    	font-weight: lighter;
    }




  </style>
  <body>



    <section class="error">
      <div data-aos="zoom-out-up" class="container2">


        <i class="fa fa-exclamation-triangle" aria-hidden="true"></i>

        <h1>Uh Oh...
          <!-- <br><i style="font-size: 200%; padding: 0;"class="fa fa-frown-o" aria-hidden="true"></i> -->
        </h1>
        <h2>You already have an Account</h2>
        <h5>Seems like you already our member. If you don't have any account create one</h5>
        <h6 style="padding-bottom: 20px;"><a href="login.jsp">Click Here</a> to Login</h6>
        <h6 style="padding-top: 0;"> New Here? <a href="reg.jsp">Create an Account</a></h6>

        


      </div>
    </section>


    <script href="./src/jquery.min.js"></script>
    <script href="./src/fullclip.min.js"></script>

    <script type="text/javascript">

        // Menu-toggle button

        $(document).ready(function() {
              $(".menu-icon").on("click", function() {
                    $("nav ul").toggleClass("showing");
              });
        });

        // // Scrolling Effect
        //
        // $(window).on("scroll", function() {
        //       if($(window).scrollTop()) {
        //             $('nav').addClass('black');
        //       }
        //
        //       else {
        //             $('nav').removeClass('black');
        //       }
        // })
        //----Calling AOS---(Animation)
          AOS.init();

    </script>
  </body>
</html>
