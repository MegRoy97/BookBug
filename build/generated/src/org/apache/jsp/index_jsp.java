package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bookbug.bean.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--\n");
      out.write("     Date Created: 16/01/19\n");
      out.write("     Date Revised: 19/01/19\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");

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
      out.write("               .hover{\n");
      out.write("                   opacity: 0.8;\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("               }\n");
      out.write("               .hover:hover{\n");
      out.write("                   opacity: 0.8;\n");
      out.write("               }\n");
      out.write("          </style>\n");
      out.write("     </head>\n");
      out.write("     <body onload=\"myFunctionLoading()\">\n");
      out.write("           <!-- Preloader -->\n");
      out.write("           <div id=\"loading\"></div>\n");
      out.write("\n");
      out.write("          <!-- Main Navigation -->\n");
      out.write("          <nav class=\"main-nav\" id=\"main-nav\">\n");
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
      out.write("          <!-- Main header section -->\n");
      out.write("          <header>\n");
      out.write("\n");
      out.write("               <section class=\"section\">\n");
      out.write("\n");
      out.write("               <div class=\"wave\">\n");
      out.write("\n");
      out.write("               </div>\n");
      out.write("\n");
      out.write("               <div class=\"wrapper astonish animated fadeInDown\">\n");
      out.write("                    <h1>Welcome to BOOKBUG</h1>\n");
      out.write("                    <h2>The Power of Reading<br>We believe reading can change the world</h2>\n");
      out.write("               </div>\n");
      out.write("             </section>\n");
      out.write("               <!-- <div class=\"wrapper astonish animated fadeInDown\">\n");
      out.write("                    <h1>BOOKBUG</h1>\n");
      out.write("                    <h2>A free, responsive, landing page. <br>\n");
      out.write("                    Created by Jesus Rodriguez.</h2>\n");
      out.write("               </div> -->\n");
      out.write("          </header>\n");
      out.write("\n");
      out.write("          <!-- Main content -->\n");
      out.write("          <main>\n");
      out.write("               <div class=\"content-wrapper\" id=\"\">\n");
      out.write("\n");
      out.write("                   \n");
      out.write("                    <div class=\"grid\">\n");
      out.write("                         <div class=\"grid-col-sm-12 grid-col-md-6\" data-animation=\"fadeInLeft\">\n");
      out.write("                              <img class=\"grid-col-sm-12\" src=\"img/reading.png\" alt=\"\">\n");
      out.write("                         </div>\n");
      out.write("                         <div class=\"grid-col-sm-12 grid-col-md-6\" data-animation=\"fadeInRight\">\n");
      out.write("                              <h2 class=\"section-title\">A BEAUTIFUL HOUSE, A BEAUTIFUL BOOK</h2>\n");
      out.write("                              <p>Our newest feature. An online shop-in-shop featuring books & \n");
      out.write("                                  objects from the personal collections of fascinating people. \n");
      out.write("                                  New York design studio Various Projects have provided our first collection & \n");
      out.write("                                  we couldn't be happier. Works by Yoko Ono & Enzo Mari, books on Sixties Art\n");
      out.write("                                  & film design, custom stationary items and more. </p>\n");
      out.write("                         </div>\n");
      out.write("                    </div>\n");
      out.write("               </div>\n");
      out.write("\n");
      out.write("               <div id=\"reserve\" class=\"content-wrapper-lg text-center\" data-animation=\"zoomIn\">\n");
      out.write("                    <h2 class=\"section-title\">Categories We Have</h2>\n");
      out.write("                    <div class=\"grid\">\n");
      out.write("                         <div class=\"grid-col-sm-12 grid-col-md-6\" data-animation=\"fadeInLeft\">\n");
      out.write("                             <a href=\"horror.jsp\" class=\"hover\"> <img class=\"grid-col-sm-12\" src=\"img/horror.jpg\" alt=\"\">\n");
      out.write("                                 </a><p>HORROR</p></div>  \n");
      out.write("                         <div class=\"grid-col-sm-12 grid-col-md-6\" data-animation=\"fadeInRight\">\n");
      out.write("                              <a href=\"bio.jsp\" class=\"hover\"> <img class=\"grid-col-sm-12\" src=\"img/bio.jpg\" alt=\"\">\n");
      out.write("                                  </a> <p>BIOGRAPHICAL</p></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"grid\">\n");
      out.write("                         <div class=\"grid-col-sm-12 grid-col-md-6\" data-animation=\"fadeInLeft\">\n");
      out.write("                             <a href=\"tech.jsp\" class=\"hover\"> <img class=\"grid-col-sm-12\" src=\"img/tch.jpg\" alt=\"\">\n");
      out.write("                                 </a><p>TECHNOLOGY</p></div>  \n");
      out.write("                         <div class=\"grid-col-sm-12 grid-col-md-6\" data-animation=\"fadeInRight\">\n");
      out.write("                              <a href=\"horror.jsp\" class=\"hover\"> <img class=\"grid-col-sm-12\" src=\"img/view.jpg\" alt=\"\">\n");
      out.write("                                  </a> <p>VIEW ALL</p></div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("               </div>\n");
      out.write("\n");
      out.write("               <div class=\"content-wrapper\" id=\"\">\n");
      out.write("\n");
      out.write("                    <div class=\"grid-col-sm-12\">\n");
      out.write("                         <h2 class=\"section-title\">IN DEFENSE OF HOME LIBRARIES</h2>\n");
      out.write("                              <p>A French gentleman who possessed a large library was asked an old question by a visitor, a question so often posed to those who own a lot of books:</p>\n");
      out.write("                              <p>\"And have you read them all?\"</p>\n");
      out.write("                              <p>But this wise collector turned to his guest and, with an astonished look on his face, simply replied \"No, and I haven't drunk all the wine in my cellar either.\"</p>\n");
      out.write("                              <p>The point was made at once. His books, like his prized bottles, were waiting for the moment he chose to open them, there for his pleasure according to his own timing. After all, what good would a cellar of empty bottles be to him? Or a library of books already completed? </p>\n");
      out.write("                    </div>\n");
      out.write("               </div>\n");
      out.write("\n");
      out.write("               <!-- This is an embedded Google map, this is easily customizable especially if you get a Google API key, this will allow for more customizable features. -->\n");
      out.write("          <iframe id=\"map\" src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d14736.576655667184!2d88.45665687858748!3d22.57371081625746!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3a02753269586b03%3A0xfbb4d0c346a81109!2sTechno+India+College+of+Technology!5e0!3m2!1sen!2sin!4v1556979333301!5m2!1sen!2sin\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>\n");
      out.write("          </main>\n");
      out.write("\n");
      out.write("          <!-- Main footer -->\n");
      out.write("          <footer>\n");
      out.write("               <div class=\"content-wrapper-sm display-flex-between\">\n");
      out.write("                    <!-- Easily replaceble copyright information -->\n");
      out.write("                    <small>BOOKBUG copyright &copy; 2019</small>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("          <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\" integrity=\"sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=\" crossorigin=\"anonymous\"></script>\n");
      out.write("          <script src=\"js/menu.js\" charset=\"utf-8\"></script>\n");
      out.write("          <!-- AOS -->\n");
      out.write("          <script src=\"https://unpkg.com/aos@2.3.1/dist/aos.js\"></script>\n");
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
