package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bookbug.bean.User;

public final class account_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    String addr="", gender="", emailId="", name="", pin="", mbno="";
    String male="";
    String female="";
    
    String Name="", pageName="", pageLink="", MainPageNameLink="";
    try{
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Cache-Control", "no-store");
           response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires",0);



    if(session.getAttribute("user")!=null)
{
    
    User u=(User)session.getAttribute("user");
    
        
    addr=u.getAddress();
     gender=u.getGender();
    emailId=u.getEmailId();
    System.out.println("Here"+emailId);
    name=u.getName();
     pin=u.getPincode();
     mbno=u.getMobileNumber();
     
     

    if(gender.equals("Male"))
    {
        male="checked";
        female="unchecked";
    }
    else
    {
        female="checked";
        male="unchecked";
    }
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
      out.write("<html>\n");
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
      out.write("          <link href=\"css/wave.css\" rel=\"stylesheet\">\n");
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
      out.write("               body{\n");
      out.write("                   margin: 0;\n");
      out.write("               }\n");
      out.write("          </style>\n");
      out.write("     </head>\n");
      out.write("     <body onload=\"myFunctionLoading()\">\n");
      out.write("           <!-- Preloader -->\n");
      out.write("           <div id=\"loading\"></div>\n");
      out.write("\n");
      out.write("          <!-- Main Navigation -->\n");
      out.write("          <nav class=\"main-nav\" id=\"main-nav\"  style=\"background-color: #030308;\">\n");
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
      out.write("<div class=\"top\" style=\"background: transparent\">\n");
      out.write("\n");
      out.write("  <div class=\"grid second-nav\">\n");
      out.write("    <div class=\"column-xs-12\">\n");
      out.write("      <nav>\n");
      out.write("        <ol class=\"top-list\">\n");
      out.write("          <li class=\"toplistitem\"><a href=\"indx.jsp\">Home</a></li>\n");
      out.write("          <li class=\"toplistitem\"><a href=\"shop.jsp\">Store</a></li>\n");
      out.write("          <li class=\"toplistitem active\">My Account</li>\n");
      out.write("        </ol>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("   <main>\n");
      out.write("                 <div class=\"content-wrapper\" id=\"\">\n");
      out.write("                   <div class=\"grid\">\n");
      out.write("\n");
      out.write("                        <div class=\"grid-col-sm-12\" data-animation=\"fadeInLeft\">\n");
      out.write("                      <div class=\"container1\">\n");
      out.write("                      <div class=\"left\">\n");
      out.write("\n");
      out.write("                          <div class=\"tab\">\n");
      out.write("                            <a href=\"account.jsp\"><img class=\"profile-pic\" src=\"img/edituser1.png\" />My Account</a>\n");
      out.write("                            <a href=\"order.jsp\"><img class=\"profile-pic\" src=\"/img/box.png\" />My Orders</a>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"container2\">\n");
      out.write("                          <fieldset>\n");
      out.write("\n");
      out.write("                              <div class=\"edit \">\n");
      out.write("                    <form id=\"signup-form\" class=\"container\" action=\"updateAccount\" method=\"post\" onclick=\"\">\n");
      out.write("                                  <h1>My Account</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                  <!-- One \"tab\" for each step in the form: -->\n");
      out.write("                                  <div class=\"tab \"> <center class=\"mid\">\t<span class=\"number\">1</span> &nbsp; Account Info:</center><br>\n");
      out.write("                                    <br>\n");
      out.write("\n");
      out.write("                                    <p>\n");
      out.write("                                      <input type=\"email\" id=\"mail\" name=\"EmailId\" value=\"");
      out.print(emailId);
      out.write("\" autocomplete=\"off\" readonly style=\"cursor:not-allowed; user-select: none; border-bottom: 0px; text-align: center;\">\n");
      out.write("                                    </p>\n");
      out.write("                                      <br>\n");
      out.write("                                      <h4 style=\"color: #8a97a0;text-align: center;\">Wanna Update Your Password?</h4>\n");
      out.write("                                    <a href=\"account1.jsp\" id=\"update-pass\">\n");
      out.write("                                      <button type=\"button\" id=\"update-pass\" >\n");
      out.write("                                        <span>Update Password Here</span>\n");
      out.write("                                      </button>\n");
      out.write("                                    </a>\n");
      out.write("                                    <br>\n");
      out.write("                                  </div>\n");
      out.write("\n");
      out.write("                                  <div class=\"tab \">\n");
      out.write("                                    <span class=\"mid\">\n");
      out.write("                                      <span class=\"number\">2</span> &nbsp;Personal Info:</span>\n");
      out.write("                                      <br><br>\n");
      out.write("                                    <p>\n");
      out.write("                                      <input type=\"text\" value=\"");
      out.print(name);
      out.write("\" id=\"Name\" name=\"Name\" autocomplete=\"off\">\n");
      out.write("                                    </p>\n");
      out.write("\n");
      out.write("                                    <p><label for=\"MobileNumbe\" style=\"float: left\">Mobile Number:</label>\n");
      out.write("\n");
      out.write("                                      <input type=\"number\" value=\"");
      out.print(mbno);
      out.write("\" id=\"MobileNumber\" name=\"MobileNumber\" autocomplete=\"off\" >\n");
      out.write("                                    </p>\n");
      out.write("\n");
      out.write("                                        <label for=\"radio-one\" style=\"float: left\">Gender:</label><br>\n");
      out.write("                                        <p class=\"gender\">\n");
      out.write("\n");
      out.write("                                            <input type=\"radio\" id=\"radio-one\" name=\"Gender\" value=\"Male\" ");
      out.print(male);
      out.write("/>\n");
      out.write("                                            <label for=\"radio-one\">Male</label>\n");
      out.write("                                            <input type=\"radio\" id=\"radio-two\" name=\"Gender\" value=\"Female\" ");
      out.print(female);
      out.write("  />\n");
      out.write("                                            <label for=\"radio-two\">Female</label>\n");
      out.write("                                          </p>\n");
      out.write("\n");
      out.write("                                  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                  <div class=\" \">\n");
      out.write("                                    <span class=\"mid\">\t<span class=\"number\">3</span> &nbsp;Shipping Info:</span><br><br>\n");
      out.write("                                    <label for=\"bio\">Address:</label>\n");
      out.write("                                     <textarea id=\"Address\" name=\"Address\">");
      out.print(addr);
      out.write("</textarea>\n");
      out.write("                                     <br>\n");
      out.write("                                     <br>\n");
      out.write("                                    <label for=\"zip\">Pincode:</label>\n");
      out.write("                                     <input type=\"number\" id=\"Pincode\" name=\"Pincode\" value=\"");
      out.print(pin);
      out.write("\" autocomplete=\"off\">\n");
      out.write("\n");
      out.write("                                  </div>\n");
      out.write("                                  <br><br>\n");
      out.write("                                  <input type=\"submit\" id=\"update\" value=\"Update\" />\n");
      out.write("                                </form><form class=\"\" action=\"logoutCon\" method=\"get\">\n");
      out.write("                             <input type=\"submit\" id=\"logout\" value=\"Sign Out\" />\n");
      out.write("                           </form>\n");
      out.write("           \n");
      out.write("                      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      </div>  <!-- Grid -->\n");
      out.write("    </div> \n");
      out.write("    </main>\n");
      out.write("  <footer>\n");
      out.write("               <div class=\"content-wrapper-sm display-flex-between\">\n");
      out.write("                    <!-- Easily replaceble copyright information -->\n");
      out.write("                    <small>BOOKBUG copyright &copy; 2019</small>\n");
      out.write("\n");
      out.write("                    <!-- Make sure to edit the links so that they go to your social media. -->\n");
      out.write("                    <div class=\"social-links\">\n");
      out.write("                         <ul>\n");
      out.write("                              <li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                              <li><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                              <li><a href=\"#\"><i class=\"fa fa-snapchat-square\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                              <li><a href=\"#\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                         </ul>\n");
      out.write("                    </div>\n");
      out.write("               </div>\n");
      out.write("          </footer>\n");
      out.write("\n");
      out.write("          <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\" integrity=\"sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=\" crossorigin=\"anonymous\"></script>\n");
      out.write("          <script src=\"js/menu.js\" charset=\"utf-8\"></script>\n");
      out.write("\n");
      out.write("          <!-- Form Validation  -->\n");
      out.write("          <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("          <script src=\"vendor/jquery-ui/jquery-ui.min.js\"></script>\n");
      out.write("          <script src=\"vendor/jquery-validation/dist/jquery.validate.min.js\"></script>\n");
      out.write("          <script src=\"vendor/jquery-validation/dist/additional-methods.min.js\"></script>\n");
      out.write("          <script src=\"js/validation.js\"></script>\n");
      out.write("          <!-- Optional js files -->\n");
      out.write("\n");
      out.write("          <script src=\"js/astonish.js\" charset=\"utf-8\"></script>\n");
      out.write("          <script src=\"js/nav.js\" charset=\"utf-8\"></script>\n");
      out.write("          <script src=\"js/scroll.js\" charset=\"utf-8\"></script>\n");
      out.write("          <script>\n");
      out.write("            var preloader = document.getElementById('loading');\n");
      out.write("                function myFunctionLoading(){\n");
      out.write("                  preloader.style.display = 'none';\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                AOS.init();\n");
      out.write("\n");
      out.write("          </script>\n");
      out.write("\n");
      out.write("     </body>\n");
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
