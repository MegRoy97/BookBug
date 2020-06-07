package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admindash_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" >\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Admin | BOOKBUG</title>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/styl1.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/admin.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/form.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"css/merchant.css\"> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <!-- NAVBAR -->\n");
      out.write("  <div class=\"navbar1\">\n");
      out.write("      <div class=\"name\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- <div class=\"brand\">\n");
      out.write("                <a href=\"#splash\">BOOKBUG</a>\n");
      out.write("            </div> -->\n");
      out.write("            <a href=\"indx.jsp\" style=\"text-decoration: none; color: #1a1a1d;\"><div class=\" container cf brand\">\n");
      out.write("\n");
      out.write("              <img src=\"log.png\" alt=\"\" height=\"35px\" width=\"65px\" style=\"left: 0; \">\n");
      out.write("               &nbsp; <span style=\"text-decoration: none; color: #1a1a1d; transform: translateY(-5%);\">BOOKBUG</span>\n");
      out.write("              <!-- <span>B</span>\n");
      out.write("              <span class=\"\">O</span>\n");
      out.write("              <span class=\"\">O</span>\n");
      out.write("              <span class=\"\">K</span>\n");
      out.write("              <span>B</span>\n");
      out.write("              <span class=\"\">U</span>\n");
      out.write("              <span class=\"\">G</span> -->\n");
      out.write("\n");
      out.write("            </div></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- <a class=\"account-container\" href=\"./SCREEN/split.jsp\">\n");
      out.write("            <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("            <div class=\"cart-desc\"></div>\n");
      out.write("        </a> -->\n");
      out.write("        <!-- <div class=\"dropdown-con\">\n");
      out.write("          <p>Hello World!</p>\n");
      out.write("        </div> -->\n");
      out.write("        <a class=\"cart-container\" href=\"cart.jsp\">\n");
      out.write("          <i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i>\n");
      out.write("          <div class=\"cart-desc\">Logout</div>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("<header class=\"container-fluid header\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("\n");
      out.write("  <a href=\"admin.jsp\" class=\"active\">Admin Profile</a>\n");
      out.write("  <a href=\"adminuser.jsp\">User</a>\n");
      out.write("  <a href=\"adminproduct.jsp\">Product</a>\n");
      out.write("  <a href=\"admindash.jsp\">Dashbord</a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"main\" >\n");
      out.write("  <span style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\">&#9776; open</span> <br> <br>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h2>Admin Panel</h2>\n");
      out.write("    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n");
      out.write("      Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit\n");
      out.write("      esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("      <form id=\"\" action=\"\" method=\"post\" onclick=\"return validation()\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          <p><label for=\"fromdate\" style=\"float: left\">From:</label>\n");
      out.write("            <input type=\"date\" id=\"fromdate\" name=\"bdate\" value=\"yyyy-mm-dd\" min=\"1947-01-01\" max=\"2018-12-31\" required></p>\n");
      out.write("\n");
      out.write("            <p><label for=\"todate\" style=\"float: left\">To:</label>\n");
      out.write("              <input type=\"date\" id=\"todate\" name=\"bdate\" value=\"yyyy-mm-dd\" min=\"1947-01-01\" max=\"2018-12-31\" required></p>\n");
      out.write("              <input type=\"submit\" name=\"\" value=\"Submit\">\n");
      out.write("      \n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>\n");
      out.write("<script  src=\"js/index.js\"></script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("  function openNav() {\n");
      out.write("    document.getElementById(\"mySidenav\").style.width = \"250px\";\n");
      out.write("    document.getElementById(\"main\").style.marginLeft = \"250px\";\n");
      out.write("    document.body.style.backgroundColor = \"rgba(0,0,0,0)\";\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function closeNav() {\n");
      out.write("    document.getElementById(\"mySidenav\").style.width = \"0\";\n");
      out.write("    document.getElementById(\"main\").style.marginLeft= \"0\";\n");
      out.write("    document.body.style.backgroundColor = \"white\";\n");
      out.write("  }\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
