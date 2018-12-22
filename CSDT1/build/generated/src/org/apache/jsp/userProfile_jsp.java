package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");
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
      out.write("                  background-color: #FF9999;\n");
      out.write("                 }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <div id=\"header\">\n");
      out.write("        <table width=\"1200px\" class=\"head\">\n");
      out.write("        <tr>\n");
      out.write("            <td width=\"200px\"> <img src=\"images/19.png\"/></td>\n");
      out.write("            <td width=\"1000px\" class=\"head\" align=\"center\"> Corporation Software And Development Training</td>\n");
      out.write("        </tr>\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</html>");
      out.write("\n");
      out.write("       ");
      out.write("<!--\n");
      out.write("To change this template, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("      <style>\n");
      out.write("          nav ul ul{display: none}\n");
      out.write("          nav ul li:hover > ul{display: block;}\n");
      out.write("          nav ul{\n");
      out.write("              background: #efefef;\n");
      out.write("              background: linear-gradient(top, #efefef 0%, #bbbbbb 100%);\n");
      out.write("              background: moz-linear-gradient(top, #efefef 0%, #bbbbbb 100%);\n");
      out.write("              background: webkit-linear-gradient(top, #efefef 0%, #bbbbbb 100%);\n");
      out.write("              box-shadow: 0px 0px 9px rgba(0, 0, 0, 0.15);\n");
      out.write("              padding: 0 20px;\n");
      out.write("              border-radius: 0px;\n");
      out.write("              list-style: none;\n");
      out.write("              position: relative;\n");
      out.write("              display: inline-table;\n");
      out.write("           }\n");
      out.write("\n");
      out.write("           nav ul:after{\n");
      out.write("               content:\"\";clear: both; display: block;\n");
      out.write("          }\n");
      out.write("          nav ul li{\n");
      out.write("            float: left;}\n");
      out.write("          nav ul li:hover{\n");
      out.write("              background: #4b545f;\n");
      out.write("              background: linear-gradient(top, #4f5964 0%, #5f6975 40%);\n");
      out.write("              background: moz-linear-gradient(top, #4f5964 0%, #5f6975 40%);\n");
      out.write("              background: webkit-linear-gradient(top, #4f5964 0%, #5f6975 40%);\n");
      out.write("\n");
      out.write("          }\n");
      out.write("          nav ul li:hover a{color: #fff;}\n");
      out.write("\n");
      out.write("          nav ul li a{\n");
      out.write("              display: block; padding: 25px 40px;\n");
      out.write("              color: #757575; text-decoration:  none;\n");
      out.write("           }\n");
      out.write("\n");
      out.write("           nav ul ul{\n");
      out.write("               background: #5f6975; border-radius: 0px; padding: 0;\n");
      out.write("               position: absolute; top: 100%;\n");
      out.write("           }\n");
      out.write("           nav ul ul li{\n");
      out.write("               float: none;\n");
      out.write("               border-top: 1px solid #6b727c;\n");
      out.write("               border-bottom: ipx solid #575f6a;\n");
      out.write("               position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav ul ul li a{\n");
      out.write("                 padding: 15px 40px;\n");
      out.write("                 color: #fff;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            nav ul ul li a:hover{\n");
      out.write("                 background: #4b545f;\n");
      out.write("             }\n");
      out.write("\n");
      out.write("             nav ul ul ul{\n");
      out.write("                 position: absolute; left: 100%; top: 0;\n");
      out.write("              }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  <nav>\n");
      out.write("      <ul>\n");
      out.write("          <li><a href=\"#\">Home</a></li>\n");
      out.write("          <li><a href=\"#\">Tutorials</a>\n");
      out.write("           <ul>\n");
      out.write("              <li><a href=\"#\">Photoshop</a></li>\n");
      out.write("              <li><a href=\"#\">Illustrator</a></li>\n");
      out.write("              <li><a href=\"#\">Web Design</a>\n");
      out.write("                  <ul>\n");
      out.write("                       <li><a href=\"#\">HTML</a>\n");
      out.write("                       <li><a href=\"#\">CSS</a>\n");
      out.write("\n");
      out.write("                  </ul>\n");
      out.write("\n");
      out.write("              </li>\n");
      out.write("              </ul>\n");
      out.write("          </li>\n");
      out.write("               <li><a href=\"#\">Articles</a>\n");
      out.write("                   <ul>\n");
      out.write("                       <li><a href=\"#\">Web Design</a></li>\n");
      out.write("                       <li><a href=\"#\">User experience</a></li>\n");
      out.write("                   </ul>\n");
      out.write("\n");
      out.write("               </li>\n");
      out.write("               <li><a href=\"#\">Inspirations</a></li>\n");
      out.write("                <li><a href=\"#\">Login</a>\n");
      out.write("                   <ul>\n");
      out.write("                       <li><a href=\"login.jsp\">User</a></li>\n");
      out.write("                       <li><a href=\"#\">Admin</a></li>\n");
      out.write("                   </ul>\n");
      out.write("\n");
      out.write("               </li>\n");
      out.write("      </ul>\n");
      out.write("  </nav>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("       ");
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
      out.write("      <table width=\"1200px\">\n");
      out.write("          <tr>\n");
      out.write("              <td class=\"foot\" align=\"center\"> Developed be CSDT</td>\n");
      out.write("          </tr>\n");
      out.write("      </table>\n");
      out.write("  </div>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
