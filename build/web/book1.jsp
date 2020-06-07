
<%@page import="com.bookbug.bean.User"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.bookbug.connection.DbConnection"%>
<%@page import="com.bookbug.bean.Product"%>
<%@page import="com.bookbug.dao.Dao"%>
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
              <link href="css/product.css" rel="stylesheet">
              <link href="css/checkout.css" rel="stylesheet">
              <!--<link href="css/profile.css" rel="stylesheet">-->

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
<!--  <div class="top container">

    <div class="grid second-nav">
      <div class="column-xs-12">
        <nav>
          <ol class="top-list">
            <li class="toplistitem"><a href="#">Home</a></li>
            <li class="toplistitem"><a href="#">Store</a></li>
            <li class="toplistitem active">Book - 1</li>
          </ol>
        </nav>
      </div>
    </div>


  </div>-->

  <div class="product group">
      <%
 
System.out.println("------------------------------------------------------------------------------------------------------");
          String pid, pname, pimage, pprice, pauthor, ppages, ppub, pdesc, pcat;
            Dao dao=new Dao();
            String ProductId=request.getParameter("ProductId");
            System.out.println("PRoducct Iddddddddd "+ProductId);
            Product product= new Product();
            product=dao.BookDao(ProductId);
            pid=product.getProductId();
            System.out.println("pid in book1: "+pid);
            pname=product.getProductName();
            pimage=product.getProductImage();
            pprice=product.getProductPrice();
            pauthor=product.getProductAuthor();
            ppages=product.getProductPages();
            ppub=product.getProductPub();
            pdesc=product.getProductDesc();
            pcat=product.getProductCategory();
             
System.out.println("------------------------------------------------------------------------------------------------------");
     
           %>
    <div class="col-1-2 product-image">
      <div class="bg"><img src="images/<%=pimage%>" alt=""> </div>

    </div>
    <div class="col-1-2 product-info">
      <h1><%=pname%></h1><br>
      <h2>Rs. <%=pprice%></h2>



      <form action="addtocartcon" method="post" class="">
          <input type="text" value="<%=pid%>" name="productId" hidden>
<!--        <p class="select-dropdown">
          <select>
            <option value="Format" disabled>Format</option>

            <option value="Format">Paperback</option>
            <option value="Format">Audio CD</option>
             <option value="Format">E-Book</option>
            <option value="Format">Large</option> 
          </select>
        </p>-->
        <p class="select-dropdown"> Quantity :
        <select name="Quantity">
          <option value="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
          <option value="4">4</option>
          <option value="5">5</option>
        </select>
        </p>
        <input type="submit" class="add-btn" value="Add to Cart">

      </form>

<br>




    <p><%=pdesc%></p>

      <table>
        <tr >
          <th colspan="3" style="text-align: center;">Book Details</th>
        </tr>

        <tr>
          <td colspan="2">Imprint</td>
          <td style="text-align: center;"><%=ppub%></td>

        </tr>
      
        <tr>
          <td colspan="2">Author</td>
          <td style="text-align: center;"><%=pauthor%></td>

        </tr>
        <tr>
          <td colspan="2">Total No. of Pages</td>
          <td style="text-align: center;"><%=ppages%></td>

        </tr>
        <tr>
          <td colspan="2">Category</td>
          <td style="text-align: center;"><%=pcat%></td>

        </tr>


      </table>

    </div>

  </div>



</div>
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

