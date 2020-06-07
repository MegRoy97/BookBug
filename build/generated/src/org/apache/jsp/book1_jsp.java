package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bookbug.bean.User;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import com.bookbug.connection.DbConnection;
import com.bookbug.bean.Product;
import com.bookbug.dao.Dao;

public final class book1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");

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

      out.write("\n");
      out.write("\n");
      out.write(" <!DOCTYPE html>\n");
      out.write("\n");
      out.write("      <html lang=\"en\" >\n");
      out.write("         <head>\n");
      out.write("              <!-- Required meta tags -->\n");
      out.write("              <meta charset=\"utf-8\">\n");
      out.write("              <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("              <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("              <!-- Title tag -->\n");
      out.write("              <link rel=\"shortcut icon\" href=\"img/log.ico\" />\n");
      out.write("              <title>BOOKBUG | My Profile</title>\n");
      out.write("\n");
      out.write("              <!-- Font awesome -->\n");
      out.write("              <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("              <!-- Animate.css -->\n");
      out.write("              <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css\">\n");
      out.write("\n");
      out.write("              <!-- Normalize -->\n");
      out.write("              <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/7.0.0/normalize.css\">\n");
      out.write("\n");
      out.write("              <!-- AOS -->\n");
      out.write("              <link href=\"https://unpkg.com/aos@2.3.1/dist/aos.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("              <!-- Animation Css\n");
      out.write("              <link rel=\"stylesheet\" href=\"../dist/css/animsition.min.css\">\n");
      out.write("\n");
      out.write("              Ajax Lib\n");
      out.write("              <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("              Animation js\n");
      out.write("              <script src=\"../dist/js/animsition.min.js\"></script> -->\n");
      out.write("\n");
      out.write("              <!-- Custom CSS -->\n");
      out.write("              <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("              <link href=\"css/form.css\" rel=\"stylesheet\">\n");
      out.write("              <link href=\"css/checkout.css\" rel=\"stylesheet\">\n");
      out.write("              <link href=\"css/profile.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("              <style>\n");
      out.write("                   /* If you wish to remove the astonish.js file, then also be sure to remove these styles. */\n");
      out.write("                   .astonish {\n");
      out.write("                        visibility: visible;\n");
      out.write("                   }\n");
      out.write("\n");
      out.write("                   @media (min-width: 768px) {\n");
      out.write("                        .astonish {\n");
      out.write("                             visibility: hidden;\n");
      out.write("                        }\n");
      out.write("                        .animated {\n");
      out.write("                             visibility: visible;\n");
      out.write("                        }\n");
      out.write("                   }\n");
      out.write("              </style>\n");
      out.write("         </head>\n");
      out.write("         <body onload=\"myFunctionLoading()\">\n");
      out.write("               <!-- Preloader -->\n");
      out.write("               <div id=\"loading\"></div>\n");
      out.write("\n");
      out.write("              <!-- Main Navigation -->\n");
      out.write("              <nav class=\"main-nav\" id=\"main-nav\" style=\"background-color: #030308;\">\n");
      out.write("                   <div class=\"content-wrapper-sm\">\n");
      out.write("                        <!-- <a href=\"#\" class=\"navbar-brand\">BOOKBUG</a> -->\n");
      out.write("                        <a class=\"navbar-brand\"  href=\"index.jsp\">\n");
      out.write("\n");
      out.write("                          <img src=\"img/log.png\" alt=\"\" height=\"50px\" width=\"67px\" style=\"left: 0;transform: translateY(-25%);\">\n");
      out.write("                           &nbsp;\n");
      out.write("                          <span>B</span>\n");
      out.write("                          <span class=\"\">O</span>\n");
      out.write("                          <span class=\"\">O</span>\n");
      out.write("                          <span class=\"\">K</span>\n");
      out.write("                          <span>B</span>\n");
      out.write("                          <span class=\"\">U</span>\n");
      out.write("                          <span class=\"\">G</span>\n");
      out.write("                          <span class=\"hidden\">.</span>\n");
      out.write("                          <span class=\"hidden\">C</span>\n");
      out.write("                          <span class=\"hidden\">O</span>\n");
      out.write("                          <span class=\"hidden\">M</span>\n");
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                        <div id=\"menu-button\">\n");
      out.write("                             <div class=\"bar1\"></div>\n");
      out.write("                             <div class=\"bar2\"></div>\n");
      out.write("                             <div class=\"bar3\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <ul class=\"nav-links\">\n");
      out.write("                             <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                             <li><a href=\"store.jsp\">Store</a></li>\n");
      out.write("                             <li><a href=\"");
      out.print(pageLink);
      out.write('"');
      out.write('>');
      out.print(pageName);
      out.write("</a></li>\n");
      out.write("                             <li class=\"last-li\"><a href=\"");
      out.print(MainPageNameLink);
      out.write('"');
      out.write('>');
      out.print(Name);
      out.write("</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                   </div>\n");
      out.write("              </nav>\n");
      out.write("\n");
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
      out.write("            <li ><a href=\"shop.jsp\" class=\"active-class\">Store</a></li>\n");
      out.write("            <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- <hr style=\"border-bottom: 1px solid #000; width: 150%; margin: 0; left : 0; transform: scale(1.2);\"> -->\n");
      out.write("    <!-- <ul>\n");
      out.write("       <li><a href=\"#\">Category 1</a></li>\n");
      out.write("       <li><a href=\"#\">Category 2</a></li>\n");
      out.write("       <li ><a href=\"shop.jsp\" class=\"active-class\">Store</a></li>\n");
      out.write("       <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("   </ul> -->\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("  <div class=\"top container\">\n");
      out.write("\n");
      out.write("    <div class=\"grid second-nav\">\n");
      out.write("      <div class=\"column-xs-12\">\n");
      out.write("        <nav>\n");
      out.write("          <ol class=\"top-list\">\n");
      out.write("            <li class=\"toplistitem\"><a href=\"#\">Home</a></li>\n");
      out.write("            <li class=\"toplistitem\"><a href=\"#\">Store</a></li>\n");
      out.write("            <li class=\"toplistitem active\">Book - 1</li>\n");
      out.write("          </ol>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"product group\">\n");
      out.write("      ");

 
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
     
           
      out.write("\n");
      out.write("    <div class=\"col-1-2 product-image\">\n");
      out.write("      <div class=\"bg\"><img src=\"images/");
      out.print(pimage);
      out.write("\" alt=\"\"> </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-1-2 product-info\">\n");
      out.write("      <h1>");
      out.print(pname);
      out.write("</h1><br>\n");
      out.write("      <h2>Rs. ");
      out.print(pprice);
      out.write("</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <form action=\"addtocartcon\" method=\"post\" class=\"\">\n");
      out.write("          <input type=\"text\" value=\"");
      out.print(pid);
      out.write("\" name=\"productId\" hidden>\n");
      out.write("<!--        <p class=\"select-dropdown\">\n");
      out.write("          <select>\n");
      out.write("            <option value=\"Format\" disabled>Format</option>\n");
      out.write("\n");
      out.write("            <option value=\"Format\">Paperback</option>\n");
      out.write("            <option value=\"Format\">Audio CD</option>\n");
      out.write("             <option value=\"Format\">E-Book</option>\n");
      out.write("            <option value=\"Format\">Large</option> \n");
      out.write("          </select>\n");
      out.write("        </p>-->\n");
      out.write("        <p class=\"select-dropdown\">\n");
      out.write("        <select name=\"Quantity\">\n");
      out.write("          <option value=\"1\">1</option>\n");
      out.write("          <option value=\"2\">2</option>\n");
      out.write("          <option value=\"3\">3</option>\n");
      out.write("          <option value=\"4\">4</option>\n");
      out.write("          <option value=\"5\">5</option>\n");
      out.write("        </select>\n");
      out.write("        </p>\n");
      out.write("        <input type=\"submit\" class=\"add-btn\" value=\"Add to Cart\">\n");
      out.write("<!--        <input type=\"\" class=\"add-btn\" name=\"\" value=\"Add To Cart\">-->\n");
      out.write("      </form>\n");
      out.write("\n");
      out.write("      <br><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("      <p>Ihost Wars delves into America?s role in funding militants during the period of Soviet Union's? invasion of Afghanistan,\n");
      out.write("        and how it ensued in the 9/11 tragedy. Ghost Wars has been penned by Steve Coll based on his extensive research. The book is greatly informative,\n");
      out.write("        and won the Pulitzer Prize.\n");
      out.write("        <span id=\"dots\">...</span>\n");
      out.write("          <span id=\"more\"\"> <br>Ghost Wars is possibly the most authentic and illuminating account of the fiasco of the United States in stopping bin Laden. The book probes into the activities of the Central Intelligence Agency, when the Soviet Union attacked Afghanistan. Coll has collected facts and figures from CIA officers, US officials, their Afghan associates, and foreign spymasters including Bill Casey and George Tenet. He recounts how a section of Afghans protested against the Soviet invasion, and how the CIA began providing the rebels with monetary support and arms at the right point of time. The reason behind this was that the US wanted the Soviets to remain as far away from Central Asia as possible because it was wealthy in terms of oil. They even financed training camps at the Afghanistan-Pakistan border. Osama bin Laden was one of the people who got trained in this process. Although America left Afghanistan after the Soviets withdrew, it had already equipped the militants with weapons. What remained a great surprise was why America didn?t do anything to stop Pakistan from letting Taliban flourish in its own land. In the meanwhile, the anxiety of nuclear-armed Pakistan picking a battle with nuclear-armed India also persisted. Ghost Wars reveals the drama within the US government concerning the security of the nation. Coll asserts that the U.S. politicians and military frontrunners were well aware for several years about Islamic fanaticism causing shocking penalties for the US. It even took years to just track down bin Laden. Coll has taken more than ten years to write this book, patiently explaining the history. His comprehensive research and captivating narrative in this book won him the esteemed Pulitzer Prize for General Non-Fiction in the year 2005.\n");
      out.write("\n");
      out.write("        About Steve Coll\n");
      out.write("\n");
      out.write("        Steve Coll is an American journalist and author. He was born in 1958. In the year 1980, Coll completed his graduation with English and History majors from the Occidental College in Los Angeles. He eventually started working at The New Yorker, The Post, and The Washington Post. Coll is currently the CEO and President of the NGO, New America Foundation. His book Eagle on the Street is based on his own Pulitzer Prize winning account of the SEC?s battle with Wall Street. His work The Bin Ladens won him the PEN/John Kenneth Galbraith Award for nonfiction. Private Empire: ExxonMobil and American Power was honoured with the Financial Times and Goldman Sachs Business Book of the Year Award. Steve Coll has also been the recipient of the Robert F. Kennedy Memorial Award in the year 2000 for his outstanding coverage of the civil war in Sierra Leone. Some of the other notable books written by Coll are The Deal of the Century: The Breakup of AT&T, On the Grand Trunk Road: A Journey into South Asia, and The Taking of Getty Oil.</span>\n");
      out.write("        <button onclick=\"myFunction()\" id=\"myBtn\"> Read More </button>\n");
      out.write("\n");
      out.write("      </p>-->\n");
      out.write("\n");
      out.write("    <p>");
      out.print(pdesc);
      out.write("</p>\n");
      out.write("\n");
      out.write("      <table>\n");
      out.write("        <tr >\n");
      out.write("          <th colspan=\"3\" style=\"text-align: center;\">Book Details</th>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("        <tr>\n");
      out.write("          <td colspan=\"2\">Imprint</td>\n");
      out.write("          <td style=\"text-align: center;\">");
      out.print(ppub);
      out.write("</td>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("        <!-- <tr>\n");
      out.write("          <td colspan=\"3\" style=\"text-align: center;\">Contributors</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </tr> -->\n");
      out.write("        <tr>\n");
      out.write("          <td colspan=\"2\">Author</td>\n");
      out.write("          <td style=\"text-align: center;\">");
      out.print(pauthor);
      out.write("</td>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td colspan=\"2\">Total No. of Pages</td>\n");
      out.write("          <td style=\"text-align: center;\">");
      out.print(ppages);
      out.write("</td>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td colspan=\"2\">Category</td>\n");
      out.write("          <td style=\"text-align: center;\">");
      out.print(pcat);
      out.write("</td>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("<!--        <tr>\n");
      out.write("          <td colspan=\"2\">Height</td>\n");
      out.write("          <td style=\"text-align: center;\">7.8 Inches (US)</td>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td colspan=\"2\">Length</td>\n");
      out.write("          <td style=\"text-align: center;\">5.08 in</td>\n");
      out.write("\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td colspan=\"2\">Weight</td>\n");
      out.write("          <td style=\"text-align: center;\">500 gm</td>\n");
      out.write("\n");
      out.write("        </tr>-->\n");
      out.write("\n");
      out.write("      </table>\n");
      out.write("      <!-- <a href=\"\" class=\"share-link\">Tweet</a>\n");
      out.write("      <a href=\"\" class=\"share-link\">Like</a>\n");
      out.write("      <a href=\"\" class=\"share-link\">Pin</a>\n");
      out.write("      <a href=\"\" class=\"share-link\">Email</a> -->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- <footer class=\"container-fluid footer\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("     <a href=\"#\" target=\"_blank\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("    <a href=\"#\" target=\"_blank\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</footer> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>\n");
      out.write("<script  src=\"js/index.js\"></script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    // const activeImage = document.querySelector(\".product-image .active\");\n");
      out.write("    // //const productImages = document.querySelectorAll(\".image-list img\");\n");
      out.write("    // const navItem = document.querySelector('a.toggle-nav');\n");
      out.write("    //\n");
      out.write("    // function changeImage(e) {\n");
      out.write("    //   activeImage.src = e.target.src;\n");
      out.write("    // }\n");
      out.write("    //\n");
      out.write("    // function toggleNavigation(){\n");
      out.write("    // //const navItem = document.querySelector('toggle-nav');\n");
      out.write("    // //this.nextElementSibling.classList.toggle('');\n");
      out.write("    //   this.nextElementSibling.classList.toggle('active');\n");
      out.write("    // }\n");
      out.write("    //\n");
      out.write("    // productImages.forEach(image => image.addEventListener(\"click\", changeImage));\n");
      out.write("    // navItem.addEventListener('click', toggleNavigation);\n");
      out.write("\n");
      out.write("\n");
      out.write("    function myFunction() {\n");
      out.write("  var dots = document.getElementById(\"dots\");\n");
      out.write("  var moreText = document.getElementById(\"more\");\n");
      out.write("  var btnText = document.getElementById(\"myBtn\");\n");
      out.write("\n");
      out.write("  if (dots.style.display === \"none\") {\n");
      out.write("    dots.style.display = \"inline\";\n");
      out.write("    btnText.innerHTML = \"Read more\";\n");
      out.write("    moreText.style.display = \"none\";\n");
      out.write("  } else {\n");
      out.write("    dots.style.display = \"none\";\n");
      out.write("    btnText.innerHTML = \"Read less\";\n");
      out.write("    moreText.style.display = \"inline\";\n");
      out.write("  }\n");
      out.write("}\n");
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
