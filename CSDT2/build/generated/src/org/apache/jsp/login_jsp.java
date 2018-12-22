package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/menu.html");
    _jspx_dependants.add("/footer.html");
  }

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            .login{background-color: #99CC99;\n");
      out.write("             text-align: center;}\n");
      out.write("            a:link{color: blue;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"#\" style=\"background-color:#99FFCC; width:800px\">\n");
      out.write("        ");
      out.write("<!--\n");
      out.write("To change this template, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            .head{color:#990033;\n");
      out.write("                  font-size: 50px;\n");
      out.write("                  \n");
      out.write("                 }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <div id=\"header\">\n");
      out.write("        <table width=\"1000px\" class=\"head\"  style=\"opacity:1.0;filter:alpha(opacity=100);\">\n");
      out.write("        <tr>\n");
      out.write("            <td width=\"200px\"> <img src=\"images/19.png\"/></td>\n");
      out.write("            <td width=\"800px\" class=\"head\" align=\"center\"> Corporation Software And Development Training</td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("                ");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <title></title>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("  ul {list-style: none;padding: 0px;margin: 0px;}\n");
      out.write("  ul li {display: block;position: relative;float: left;border:1px solid #000}\n");
      out.write("  li ul {display: none;}\n");
      out.write("  ul li a {display: block;background: #cc9999;padding: 5px 10px 5px 10px;text-decoration: none;\n");
      out.write("           white-space: nowrap;color: #fff;}\n");
      out.write("  ul li a:hover {background: #f00;}\n");
      out.write("  li:hover ul {display: block; position: absolute;}\n");
      out.write("  li:hover li {float: none;}\n");
      out.write("  li:hover a {background: #f00;}\n");
      out.write("  li:hover li a:hover {background: #000;}\n");
      out.write("  #drop-nav li ul li {border-top: 0px;}\n");
      out.write("   \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("    <body background=\"images/back.jpg\">\n");
      out.write("       \n");
      out.write("  <ul id=\"drop-nav\">\n");
      out.write("  <li><a href=\"#\">Support</a></li>\n");
      out.write("  <li><a href=\"#\">Web Design</a>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"#\">HTML</a></li>\n");
      out.write("      <li><a href=\"#\">CSS</a></li>\n");
      out.write("      <li><a href=\"#\">JavaScript</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </li>\n");
      out.write("  <li><a href=\"#\">Content Management</a>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"#\">Joomla</a></li>\n");
      out.write("      <li><a href=\"#\">Drupal</a></li>\n");
      out.write("      <li><a href=\"#\">WordPress</a></li>\n");
      out.write("      <li><a href=\"#\">Concrete 5</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </li>\n");
      out.write("  <li><a href=\"#\">Contact</a>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"#\">General Inquiries</a></li>\n");
      out.write("      <li><a href=\"#\">Ask me a Question</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </li>\n");
      out.write("</ul>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("                        <table align=\"center\" class=\"login\" width=\"1000px\" style=\"border-radius:40px; border-shadow:100px; height: 400px\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>User Name</td>\n");
      out.write("                                <td> <input type=\"text\" name=\"uname\" value=\"\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Password</td>\n");
      out.write("                                <td> <input type=\"password\" name=\"uname\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><input type=\"submit\" value=\"Login\"/></td>\n");
      out.write("                                <td><a href=\"register.jsp\"> Sign UP</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                   ");
      out.write("<!--\n");
      out.write("To change this template, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("      <style>\n");
      out.write("          .foot{background-color: #FF9999;\n");
      out.write("                color:#993366;\n");
      out.write("               }\n");
      out.write("      </style>\n");
      out.write("  </head>\n");
      out.write("  <div id=\"footer\">\n");
      out.write("      <table width=\"1000px\">\n");
      out.write("          <tr>\n");
      out.write("              <td class=\"foot\" align=\"center\"> Developed be CSDT</td>\n");
      out.write("          </tr>\n");
      out.write("      </table>\n");
      out.write("  </div>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("              \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
