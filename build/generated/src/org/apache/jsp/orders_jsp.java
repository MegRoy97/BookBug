package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orders_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");

String abc="";

      out.write("\n");
      out.write("<html lang=\"en\" >\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>My Profile | BOOKBUG</title>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("\n");
      out.write("<!-- <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"> -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/styl1.css\">\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"css/merchant.css\"> -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/profile.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <!-- NAVBAR -->\n");
      out.write("  <div class=\"container navbar\">\n");
      out.write("      <div class=\"name\"><a href=\"account.jsp\">Hi, Guest</a></div>\n");
      out.write("        <a class=\"account-container\" href=\"reglogin.jsp\">\n");
      out.write("            <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("            <div class=\"cart-desc\">Login / Register</div>\n");
      out.write("        </a>\n");
      out.write("        <!-- <div class=\"dropdown-con\">\n");
      out.write("          <p>Hello World!</p>\n");
      out.write("        </div> -->\n");
      out.write("        <a class=\"cart-container\" href=\"cart.jsp\">\n");
      out.write("          <i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i>\n");
      out.write("          <div class=\"cart-desc\">0 items</div>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <hr>\n");
      out.write("<header class=\"container-fluid header\">\n");
      out.write("\n");
      out.write("    <div class=\"container cf\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- <div class=\"brand\">\n");
      out.write("            <a href=\"#splash\">BOOKBUG</a>\n");
      out.write("        </div> -->\n");
      out.write("        <a href=\"indx.jsp\"><div class=\"brand\">\n");
      out.write("\n");
      out.write("          <img src=\"log.png\" alt=\"\" height=\"65px\" width=\"95px\" style=\"left: 0; transform: translateY(-35%);\">\n");
      out.write("           &nbsp;\n");
      out.write("          <span>B</span>\n");
      out.write("          <span class=\"hidden\">O</span>\n");
      out.write("          <span class=\"hidden\">O</span>\n");
      out.write("          <span class=\"hidden\">K</span>\n");
      out.write("          <span>B</span>\n");
      out.write("          <span class=\"hidden\">U</span>\n");
      out.write("          <span class=\"hidden\">G</span>\n");
      out.write("\n");
      out.write("        </div></a>\n");
      out.write("\n");
      out.write("        <i class=\"fa fa-bars hamb\"></i>\n");
      out.write("\n");
      out.write("         <ul>\n");
      out.write("            <li><a href=\"#\">Category 1</a></li>\n");
      out.write("            <li><a href=\"#\">Category 2</a></li>\n");
      out.write("            <li ><a href=\"shop.jsp\" class=\"\">Shop</a></li>\n");
      out.write("            <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- <hr style=\"border-bottom: 1px solid #000; width: 150%; margin: 0; left : 0; transform: scale(1.2);\"> -->\n");
      out.write("    <!-- <ul>\n");
      out.write("       <li><a href=\"#\">Category 1</a></li>\n");
      out.write("       <li><a href=\"#\">Category 2</a></li>\n");
      out.write("       <li ><a href=\"shop.jsp\" class=\"active-class\">Browse Products</a></li>\n");
      out.write("       <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("   </ul> -->\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          <!-- pROFILE -->\n");
      out.write("\n");
      out.write("          <div data-aos=\"fade-up-right\" class=\"container1\">\n");
      out.write("          <div class=\"left\">\n");
      out.write("<!--            <img class=\"profile-pic\" src=\"./img/default.png\" />\n");
      out.write("              <div class=\"upload-button\" alt=\"Please Upload Square Img\">Upload Image</div>\n");
      out.write("              <input class=\"file-upload\" type=\"file\" accept=\"image/*\"/> <br><br>-->\n");
      out.write("              <div class=\"tab\">\n");
      out.write("                 <a href=\"account.jsp\"><img class=\"profile-pic\" src=\"./img/user.png\" />My Account</a>\n");
      out.write("                <a href=\"orders.jsp\"><img class=\"profile-pic\" src=\"./img/box.png\" />My Orders</a>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("          <div data-aos=\"fade-up-left\" class=\"container2\">\n");
      out.write("          <form action=\"#\" class=\"edit\" method=\"post\" onsubmit=\"return validation()\">\n");
      out.write("\n");
      out.write("            <h1>My Orders</h1>\n");
      out.write("            <section id=\"orderlist\">\n");
      out.write("              <ul id=\"ordersul\">\n");
      out.write("                  ");
      out.print(abc);
      out.write("\n");
      out.write("              </ul>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("<!--            <form action=\"logoutCon\" method=\"get\">\n");
      out.write("              <input id=\"logout\" type=\"submit\" name=\"\" value=\"Sign Out\">\n");
      out.write("            </form>-->\n");
      out.write("            <!-- <a href=\"#\"><button type=\"button\" id=\"clear-orders\">Clear Orders  </button></a> -->\n");
      out.write("          </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<script href=\"./src/jquery.min.js\"></script>\n");
      out.write("<script href=\"./src/fullclip.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script  src=\"js/index.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    //------------ Menu-toggle button--------------\n");
      out.write("\n");
      out.write("    $(document).ready(function() {\n");
      out.write("          $(\".menu-icon\").on(\"click\", function() {\n");
      out.write("                $(\"nav ul\").toggleClass(\"showing\");\n");
      out.write("          });\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    //------------Scrolling Effect------------\n");
      out.write("\n");
      out.write("    // $(window).on(\"scroll\", function() {\n");
      out.write("    //       if($(window).scrollTop()) {\n");
      out.write("    //             $('nav').addClass('black');\n");
      out.write("    //       }\n");
      out.write("    //\n");
      out.write("    //       else {\n");
      out.write("    //             $('nav').removeClass('black');\n");
      out.write("    //       }\n");
      out.write("    // })\n");
      out.write("\n");
      out.write("    //----Calling AOS---(Animation)\n");
      out.write("      AOS.init();\n");
      out.write("\n");
      out.write("\n");
      out.write("    //------------Upload Picture----------\n");
      out.write("    $(document).ready(function() {\n");
      out.write("\n");
      out.write("\n");
      out.write("    var readURL = function(input) {\n");
      out.write("        if (input.files && input.files[0]) {\n");
      out.write("            var reader = new FileReader();\n");
      out.write("\n");
      out.write("            reader.onload = function (e) {\n");
      out.write("                $('.profile-pic').attr('src', e.target.result);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            reader.readAsDataURL(input.files[0]);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("    $(\".file-upload\").on('change', function(){\n");
      out.write("        readURL(this);\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $(\".upload-button\").on('click', function() {\n");
      out.write("       $(\".file-upload\").click();\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("              </script>\n");
      out.write("            </body>\n");
      out.write("          </html>\n");
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
