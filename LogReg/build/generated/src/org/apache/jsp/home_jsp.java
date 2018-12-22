package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/template/header.html");
    _jspx_dependants.add("/template/menu.html");
    _jspx_dependants.add("/template/news.jsp");
    _jspx_dependants.add("/template/slide.html");
    _jspx_dependants.add("/template/container.htm");
    _jspx_dependants.add("/template/footer.html");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title>Home</title>\n");
      out.write("        <style>\n");
      out.write("            .trans{ background-image:url(template/images/main.png);\n");
      out.write("                    border-radius:20px;\n");
      out.write("                    color:#666666;\n");
      out.write("\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"template/images/back.jpg\">\n");
      out.write("        <table class=\"trans\" width=\"1000px\" align=\"center\">\n");
      out.write("            <tbody>\n");
      out.write("            <tr><td colspan=\"2\">");
      out.write("<!--\n");
      out.write("To change this template, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title></title>\n");
      out.write("     <style>\n");
      out.write("            .head{color:#990033;\n");
      out.write("                  font-size: 50px;\n");
      out.write("                  font-style: oblique;\n");
      out.write("\n");
      out.write("                 }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <div id=\"header\">\n");
      out.write("        <table width=\"1000px\" class=\"head\"  >\n");
      out.write("        <tr>\n");
      out.write("            <td width=\"200px\"> <img src=\"template/images/19.png\"/></td>\n");
      out.write("            <td width=\"800px\" class=\"head\" align=\"center\"> Online System</td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</html>\n");
      out.write("</td></tr>\n");
      out.write("           \n");
      out.write("            <tr><td colspan=\"2\" style=\"border-radius:10px;border-shadow:100px\">");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <title></title>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("  ul {list-style: none;padding: 0px;margin: 0px;}\n");
      out.write("  ul li {display: block;position: relative;float: left;border:1px solid #000;width: 330px}\n");
      out.write("  li ul {display: none;}\n");
      out.write("  ul li a {display: block;background: #000;opacity:0.4;padding: 5px 10px 5px 10px;text-decoration: none;\n");
      out.write("           white-space: nowrap;color: #fff;}\n");
      out.write("  ul li a:hover {background: #f00;}\n");
      out.write("  li:hover ul {display: block; position: absolute;}\n");
      out.write("  li:hover li {float: none;}\n");
      out.write("  li:hover a {background: #f00;}\n");
      out.write("  li:hover li a:hover {background: #000;}\n");
      out.write("  #drop-nav li ul li {border-top: 0px;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<ul id=\"drop-nav\">\n");
      out.write("  <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("  \n");
      out.write("  <li><a href=\"#\">Create Account</a>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"register.jsp\">User</a></li>\n");
      out.write("      <li><a href=\"adminReg1.jsp\">Admin</a></li>\n");
      out.write("      <li><a href=\"adminReg1.jsp\">Student</a></li>\n");
      out.write("     \n");
      out.write("    </ul>\n");
      out.write("  </li>\n");
      out.write("  \n");
      out.write("  <li><a href=\"#\">Login</a>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"login.jsp\">User</a></li>\n");
      out.write("      <li><a href=\"adminlogin.jsp\">Admin</a></li>\n");
      out.write("      <li><a href=\"adminReg1.jsp\">Student</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </li>\n");
      out.write("</ul>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("</td></tr>\n");
      out.write("            <tr><td width=\"200px\">");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div id=\"news\">\n");
      out.write("        <table width=\"200px\"  style=\"height: 400px;\">\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th style=\"color:red\"> Courses</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("                <td align=\"center\"> <marquee direction=\"up\">\n");
      out.write("                    <center>  <p>Blackberry</p>\n");
      out.write("               <p>Android</p>\n");
      out.write("               <p>Java</p>\n");
      out.write("               <p>.Net</p>\n");
      out.write("               <p>Php</p>\n");
      out.write("               <p>Oracle</p>\n");
      out.write("               <p>C</p>\n");
      out.write("               <p>C++</p>\n");
      out.write("               <p>Python</p>\n");
      out.write("               <p>Ms Office</p>\n");
      out.write("               <p>Google Apps</p>\n");
      out.write("                <p>Cloud Computing</p>\n");
      out.write("                    </center>\n");
      out.write("               </marquee>\n");
      out.write("           </td></tr>\n");
      out.write("           \n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("</td>\n");
      out.write("                <td width=\"800px\">");
      out.write("<!--\n");
      out.write("To change this template, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("//This script is used for slide images\n");
      out.write("//Begin\n");
      out.write("NewImg = new Array(\"template/images/32.jpg\", \"template/images/26.jpg\", \"template/images/30.jpg\", \"template/images/28.jpg\", \"template/images/31.jpg\", \"template/images/33.jpg\");\n");
      out.write("var ImgNum = 0;\n");
      out.write("var ImgLength = NewImg.length - 1;\n");
      out.write("//Time delay between Slides in milliseconds\n");
      out.write("var delay = 6000;\n");
      out.write("var lock = false;\n");
      out.write("var run;\n");
      out.write("function chgImg(direction)\n");
      out.write("{\n");
      out.write("if (document.images)\n");
      out.write("{\n");
      out.write("ImgNum = ImgNum + direction;\n");
      out.write("if (ImgNum > ImgLength)\n");
      out.write(" {\n");
      out.write("ImgNum = 0;\n");
      out.write("}\n");
      out.write("if (ImgNum < 0)\n");
      out.write("{\n");
      out.write("ImgNum = ImgLength;\n");
      out.write("}\n");
      out.write("document.slideshow.src = NewImg[ImgNum];\n");
      out.write("   }\n");
      out.write("}\n");
      out.write("function auto()\n");
      out.write(" {\n");
      out.write("if (lock == true)\n");
      out.write("{\n");
      out.write("lock = false;\n");
      out.write("window.clearInterval(run);\n");
      out.write("}\n");
      out.write("else if (lock == false)\n");
      out.write("{\n");
      out.write("lock = true;\n");
      out.write("run = setInterval(\"chgImg(1)\", delay);\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("  </head>\n");
      out.write("  <body onload=\"javascript:auto()\">\n");
      out.write("      <table>\n");
      out.write("          <tr>\n");
      out.write("              <td>\n");
      out.write("                 <img src=\"template/images/25.jpg\" name=\"slideshow\" width=\"800px\" height=\"400px\" />\n");
      out.write("              </td>\n");
      out.write("          </tr>\n");
      out.write("\n");
      out.write("      </table>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        ");
      out.write("<style>\r\n");
      out.write("    h2{color: #cc3366;}\r\n");
      out.write("    ul li{list-style: none; display:inline-block}\r\n");
      out.write("  #contain{color: #666666}\r\n");
      out.write("</style>\r\n");
      out.write("<div>\r\n");
      out.write("    <table  id=\"contain\" width=\"1000px\"> <tbody>\r\n");
      out.write("            <tr> <td>\r\n");
      out.write("            <h2 align=\"center\">C Language </h2>\r\n");
      out.write("            <div><center><img src=\"images/c.jpg\" :=\"\" alt=\"\" height=\"150\" width=\"200\"></center></div>\r\n");
      out.write("          <p>C is one of the most widely used programming languages of \r\n");
      out.write("all time. It is robust language with rich set of built-in function and \r\n");
      out.write("operators that can be used to write any complex program. Program written\r\n");
      out.write(" in C are efficient and fast. C language is the most widely used \r\n");
      out.write("language in operating system. </p>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("       \r\n");
      out.write("          <h2 align=\"center\">C++ Language </h2>\r\n");
      out.write("          <div><center><img src=\"images/cpp.png\" :=\"\" alt=\"\" height=\"150\" width=\"200\"></center></div>\r\n");
      out.write("          <p>It is an extension to C language developed by Bjarne \r\n");
      out.write("Stroustrup. C++ is an Object Oriented programming language. It is not \r\n");
      out.write("purely object oriented. All the OOPS features in C++ like Abstraction,Encapsulation,Inheritanc etc makes it more worthy\r\n");
      out.write("and useful for programmers. C++ can be said to be as C language with classes. </p>\r\n");
      out.write("         \r\n");
      out.write("                </td>\r\n");
      out.write("                <td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          <h2 align=\"center\">Core Java </h2>\r\n");
      out.write("          <div><center><img src=\"images/java.jpg\" :=\"\" alt=\"\" height=\"150\" width=\"200\"></center></div>\r\n");
      out.write("          <p>Java was developed by James Ghosling, patrick naughton,Mike\r\n");
      out.write(" Sheridan at Sun MicroSystem.Inc in 1991. Initial name was Oak but was \r\n");
      out.write("rename was Java in 1995. It is important for developing desktop \r\n");
      out.write("application,web applications,mobile OS like Android,Embeded \r\n");
      out.write("System,Robotics and games etc. </p>\r\n");
      out.write("          \r\n");
      out.write("                </td> <td>\r\n");
      out.write("          <h2 align=\"center\">Operating System </h2>\r\n");
      out.write("          <div><center><img src=\"images/os.jpg\" :=\"\" alt=\"\" height=\"150\" width=\"200\"></center></div>\r\n");
      out.write("          <p>Computer has many resources(hardware/software),which may be\r\n");
      out.write(" required to complete a task. The commonly required resources are \r\n");
      out.write("input/output devices,memory,files storage space,CPU etc. It has many \r\n");
      out.write("important management task like proccessor management,memory management, \r\n");
      out.write("device management etc. </p>\r\n");
      out.write("          \r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("</div>");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">");
      out.write("<!--\n");
      out.write("To change this template, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title></title>\n");
      out.write("    <style>\n");
      out.write("        .foot{\n");
      out.write("            color:red;\n");
      out.write("            font-size:x-large;\n");
      out.write("            font-family:inherit;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      <table width=\"1000px\" class=\"foot\">\n");
      out.write("          <tr>\n");
      out.write("              <td align=\"center\">\n");
      out.write("                  Developed by ...\n");
      out.write("              </td>\n");
      out.write("\n");
      out.write("          </tr>\n");
      out.write("      </table>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
