package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import com.bookbug.dao.Dao;
import java.sql.ResultSet;
import com.bookbug.bean.User;
import java.sql.PreparedStatement;
import com.bookbug.connection.DbConnection;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String name="";
 String addr="", gender="", pin="", mbno="";
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
    addr=u.getAddress();
    gender=u.getGender();
    pin=u.getPincode();
    mbno=u.getMobileNumber();
    
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

        
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("  <html lang=\"en\" >\n");
      out.write("     <head>\n");
      out.write("          <!-- Required meta tags -->\n");
      out.write("          <meta charset=\"utf-8\">\n");
      out.write("          <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("          <!-- Title tag -->\n");
      out.write("          <link rel=\"shortcut icon\" href=\"img/log.ico\" />\n");
      out.write("          <title>BOOKBUG | Welcome</title>\n");
      out.write("\n");
      out.write("          <!-- Font awesome -->\n");
      out.write("          <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("          <!-- Animate.css -->\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css\">\n");
      out.write("\n");
      out.write("          <!-- Normalize -->\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/7.0.0/normalize.css\">\n");
      out.write("\n");
      out.write("          <!-- AOS -->\n");
      out.write("          <link href=\"https://unpkg.com/aos@2.3.1/dist/aos.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("          <!-- Animation Css\n");
      out.write("          <link rel=\"stylesheet\" href=\"../dist/css/animsition.min.css\">\n");
      out.write("\n");
      out.write("          Ajax Lib\n");
      out.write("          <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("          Animation js\n");
      out.write("          <script src=\"../dist/js/animsition.min.js\"></script> -->\n");
      out.write("\n");
      out.write("          <!-- Custom CSS -->\n");
      out.write("          <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("          <link href=\"css/form.css\" rel=\"stylesheet\">\n");
      out.write("          <link href=\"css/table.css\" rel=\"stylesheet\">\n");
      out.write("          <link href=\"css/checkout.css\" rel=\"stylesheet\">\n");
      out.write("          <link href=\"css/profile.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("          <style>\n");
      out.write("               /* If you wish to remove the astonish.js file, then also be sure to remove these styles. */\n");
      out.write("               .astonish {\n");
      out.write("                    visibility: visible;\n");
      out.write("               }\n");
      out.write("\n");
      out.write("               @media (min-width: 768px) {\n");
      out.write("                    .astonish {\n");
      out.write("                         visibility: hidden;\n");
      out.write("                    }\n");
      out.write("                    .animated {\n");
      out.write("                         visibility: visible;\n");
      out.write("                    }\n");
      out.write("               }\n");
      out.write("              \n");
      out.write("          </style>\n");
      out.write("     </head>\n");
      out.write("     <body onload=\"myFunctionLoading()\">\n");
      out.write("           <!-- Preloader -->\n");
      out.write("           <div id=\"loading\"></div>\n");
      out.write("\n");
      out.write("          <!-- Main Navigation -->\n");
      out.write("          <nav class=\"main-nav\" id=\"main-nav\" style=\"background-color: #030308;\">\n");
      out.write("               <div class=\"content-wrapper-sm\">\n");
      out.write("                    <!-- <a href=\"#\" class=\"navbar-brand\">BOOKBUG</a> -->\n");
      out.write("                    <a class=\"navbar-brand\"  href=\"index.jsp\">\n");
      out.write("\n");
      out.write("                      <img src=\"img/log.png\" alt=\"\" height=\"50px\" width=\"67px\" style=\"left: 0;transform: translateY(-25%);\">\n");
      out.write("                       &nbsp;\n");
      out.write("                      <span>B</span>\n");
      out.write("                      <span class=\"\">O</span>\n");
      out.write("                      <span class=\"\">O</span>\n");
      out.write("                      <span class=\"\">K</span>\n");
      out.write("                      <span>B</span>\n");
      out.write("                      <span class=\"\">U</span>\n");
      out.write("                      <span class=\"\">G</span>\n");
      out.write("                      <span class=\"hidden\">.</span>\n");
      out.write("                      <span class=\"hidden\">C</span>\n");
      out.write("                      <span class=\"hidden\">O</span>\n");
      out.write("                      <span class=\"hidden\">M</span>\n");
      out.write("\n");
      out.write("                    </a>\n");
      out.write("                    <div id=\"menu-button\">\n");
      out.write("                         <div class=\"bar1\"></div>\n");
      out.write("                         <div class=\"bar2\"></div>\n");
      out.write("                         <div class=\"bar3\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"nav-links\">\n");
      out.write("                         <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                         <li><a href=\"store.jsp\">Store</a></li>\n");
      out.write("                         <li><a href=\"");
      out.print(pageLink);
      out.write('"');
      out.write('>');
      out.print(pageName);
      out.write("</a></li>\n");
      out.write("                         <li class=\"last-li\"><a href=\"");
      out.print(MainPageNameLink);
      out.write('"');
      out.write('>');
      out.print(Name);
      out.write("</a></li>\n");
      out.write("                    </ul>\n");
      out.write("               </div>\n");
      out.write("          </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"content-wrapper\">\n");
      out.write("             <div class=\"grid\">\n");
      out.write("                         <div class=\"grid-col-sm-12 grid-col-md-6\" data-animation=\"fadeInLeft\">\n");
      out.write("                              <img class=\"grid-col-sm-12\" src=\"img/cart.png\" alt=\"\">\n");
      out.write("                         </div>\n");
      out.write("                         <div class=\"grid-col-sm-12 grid-col-md-6\" data-animation=\"fadeInRight\">\n");
      out.write("                              <h2 class=\"\">Hey, ");
      out.print(name);
      out.write("</h2>\n");
      out.write("                              <p> <span class=\"number\">1</span> &nbsp; Shipping Info:</span><br>\n");
      out.write("                                <p>Address - ");
      out.print(addr);
      out.write("</p> \n");
      out.write("                                <p>Pin Code - ");
      out.print(pin);
      out.write("</p> \n");
      out.write("                              </p>\n");
      out.write("                              <p><span class=\"number\">2</span> &nbsp; Contact Info:</span><br>\n");
      out.write("                                  <p>Mobile No -  ");
      out.print(mbno);
      out.write(" </p>\n");
      out.write("                              </p>\n");
      out.write("<!--                              <p>Orders are usually processed within 2-4 business days unless otherwise \n");
      out.write("                                  stated in the product description or your confirmation email.</p>-->\n");
      out.write("                              <p> <b style=\"font-weight: 600\">Note: </b>The shipping courier will deliver the parcel to you at your address and \n");
      out.write("                                  collect the order amount instead of us. Please prepare the correct amount\n");
      out.write("                                  in advance and make sure that your mobile phone is active so that the shipping\n");
      out.write("                                  courier can contact you.</p>\n");
      out.write("                              \n");
      out.write("                         </div>\n");
      out.write("                    </div>\n");
      out.write("            <h1 class=\"section-title\" style=\"display: block; text-align: center; \">My Cart</h1>\n");
      out.write("\n");
      out.write("            <div class=\"table-container\"> <!--provides a wrapper for testing the scroll-->\n");
      out.write("                <div class=\"table-wrap\">\n");
      out.write("                    <div class=\"table-head\">\n");
      out.write("                        <table>\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Product ID</th>\n");
      out.write("                                    <!--                      <th>Product Picture</th>-->\n");
      out.write("                                    <th>Product Name</th>\n");
      out.write("                                    <th>Quantity</th>\n");
      out.write("                                    <th>Price</th>\n");
      out.write("                                    <th>Total Price</th>\n");
      out.write("                                    <th>Action</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                        </table>\n");
      out.write("                    </div> <!--/table head-->\n");
      out.write("\n");
      out.write("                    <div class=\"table-body\" id=\"table\">\n");
      out.write("\n");
      out.write("                        <table>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                int items=0;
                                String disable="";
                                String emailId;
                                    response.setHeader("Cache-Control", "no-cache");

                                    response.setHeader("Cache-Control", "no-store");
                                    response.setHeader("Pragma", "no-cache");
                                    response.setDateHeader("Expires", 0);

                                    System.out.println("------------------------------------------------------------------------------------------------------");
                                    System.out.println("in cart");
                                    emailId = "";
                                    if (session.getAttribute("user") != null) {
                                        User u = (User) session.getAttribute("user");
                                        emailId = u.getEmailId();
                                        System.out.println("Here in cart: " + emailId);
                                    }
                                    String row = "";
                                    try {
                                        DbConnection db = new DbConnection();
                                       Connection con = db.con;
                                        String sql = "select A.UserId, A.ProductId, B.ProductName, A.Quantity, B.ProductPrice";
                                        sql = sql + " from cart A inner join products B ";
                                        sql = sql + "on A.ProductId=B.ProductId where A.UserId=?";
                                        PreparedStatement ps = con.prepareStatement(sql);
                                        ps.setString(1, emailId);
                                        ResultSet rs = ps.executeQuery();
                                        while (rs.next()) {
                                            double totalPrice;
                                            int Sales, productPrice; //totalPrice;
                                            String productId, userId, productName, delItem;
                                            userId = rs.getString(1);
                                            System.out.println("userId in cart: " + userId);
                                            productId = rs.getString(2);
                                            System.out.println("productId in cart: " + productId);
                                            productName = rs.getString(3);
                                            System.out.println("productName in cart: " + productName);
                                            Sales = rs.getInt(4);
                                            System.out.println("Sales in cart: " + Sales);
                                            //System.out.println(rs.getString(5));
                                            //productPrice = rs.getInt(5);
                                            String price = rs.getString(5);
                                            System.out.println("Price: "+price);
                                            double pp;
                                            pp= Double.parseDouble(price);
                                            System.out.println("productPrice in cart: " + pp);
                                            totalPrice = pp * Sales;
                                            items++;
                                            //delItem = "del" + productId;
                                            // System.out.println("delItem in cart: " + delItem);

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <td> <input class=\"\" type=\"text\" id=\"\" value=\"");
      out.print(productId);
      out.write("\"> </td>\n");
      out.write("\n");
      out.write("                                    <td><input class=\"\" type=\"text\" id=\"\" value=\"");
      out.print(productName);
      out.write("\"></td>\n");
      out.write("\n");
      out.write("                                    <td><input class=\"\" type=\"text\" id=\"\" value=\"");
      out.print(Sales);
      out.write("\"></td>\n");
      out.write("\n");
      out.write("                                    <td><input class=\"\" type=\"text\" id=\"\" value=\"");
      out.print(pp);
      out.write("\"></td>\n");
      out.write("\n");
      out.write("                                    <td><input class=\"\" type=\"text\" id=\"\" value=\"");
      out.print(totalPrice);
      out.write("\"></td>\n");
      out.write("\n");
      out.write("                                    <td><form action=\"deletecon\" method=\"post\"><input class=\"\" type=\"hidden\" name=\"productId\" id=\"delItemId\" value=\"");
      out.print(productId);
      out.write("\"><input type=\"submit\" name=\"subit_button\" value=\"");
      out.print(productId);
      out.write("\"></form></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                ");


                                            //System.out.println("------------------------------------------------------------------------------------------------------");                      }
                                        }
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                            <span id=\"val\"></span>\n");
      out.write("\n");
      out.write("                    </div> <!--/.table-body-->\n");

    String valueOfButton="";
    if(items>0)
    {
        valueOfButton="Confirm Order";
    }
    else
    {
        valueOfButton="No Products in Cart";
        disable="disabled";
    }
    System.out.println("emaillllllllll:"+emailId);

      out.write("\n");
      out.write("<form action=\"sendToOrdercon\" method=\"post\">\n");
      out.write("    <input class=\"\" type=\"hidden\" id=\"\" name=\"UserId\" value=\"");
      out.print(emailId);
      out.write("\">\n");
      out.write("    <input type=\"submit\" value=\"");
      out.print(valueOfButton);
      out.write("\" name=\"\" ");
      out.print(disable);
      out.write(">\n");
      out.write("</form>\n");
      out.write("                </div> <!--/.table-wrap-->\n");
      out.write("            </div> <!--/.container-->\n");
      out.write("            <!-- <input type=\"hidden\" id=\"noOfItems\" name=\"NumberOfItems\" /> -->\n");
      out.write("            <!-- <input type=\"submit\" class=\"purchase\" name=\"button\" value=\"Purchase\" /> -->\n");
      out.write("            <!-- <a href=\"checkout.jsp\">checkout</a> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- Main footer -->\n");
      out.write("        <footer>\n");
      out.write("             <div class=\"content-wrapper-sm display-flex-between\">\n");
      out.write("                  <!-- Easily replaceble copyright information -->\n");
      out.write("                  <small>BOOKBUG copyright &copy; 2019</small>\n");
      out.write("\n");
      out.write("                  <div class=\"social-links\">\n");
      out.write("                       <ul>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-snapchat-square\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                       </ul>\n");
      out.write("                  </div>\n");
      out.write("             </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\" integrity=\"sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/menu.js\" charset=\"utf-8\"></script>\n");
      out.write("\n");
      out.write("        <!-- AOS -->\n");
      out.write("        <script src=\"https://unpkg.com/aos@2.3.1/dist/aos.js\"></script>\n");
      out.write("        <!-- Optional js files -->\n");
      out.write("\n");
      out.write("        <script src=\"js/astonish.js\" charset=\"utf-8\"></script>\n");
      out.write("        <script src=\"js/nav.js\" charset=\"utf-8\"></script>\n");
      out.write("        <script src=\"js/scroll.js\" charset=\"utf-8\"></script>\n");
      out.write("        <script>\n");
      out.write("          var preloader = document.getElementById('loading');\n");
      out.write("              function myFunctionLoading(){\n");
      out.write("                preloader.style.display = 'none';\n");
      out.write("\n");
      out.write("              }\n");
      out.write("              AOS.init();\n");
      out.write("              \n");
      out.write("              var table = document.getElementById(\"table\"), sumval = 0;\n");
      out.write("              var i =1;\n");
      out.write("              for(i ; i < table.rows.length; i++ ){\n");
      out.write("                  sumval  = sumval + parseInt(table.rows[i]cells[4].innerHTML);\n");
      out.write("              }\n");
      out.write("              document.getElementById(\"val\").innerHTML = \"Total Cart Price :\" + sumval;\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        </body>\n");
      out.write("        </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
