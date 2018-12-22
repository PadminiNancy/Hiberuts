package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class news_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

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
      out.write("            th{color: red;}\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div id=\"news\">\n");
      out.write("        <table width=\"200px\"  style=\"height: 400px;\">\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th> Latest News</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("                <td align=\"center\"> <marquee direction=\"up\">\n");
      out.write("                    <center>  <p>Blackberry</p>\n");
      out.write("               <p>Blackberry</p>\n");
      out.write("               <p>Blackberry</p>\n");
      out.write("               <p>Blackberry</p>\n");
      out.write("               <p>Blackberry</p>\n");
      out.write("               <p>Blackberry</p>\n");
      out.write("               <p>Blackberry</p>\n");
      out.write("               <p>Blackberry</p>\n");
      out.write("               <p>Blackberry</p>\n");
      out.write("               <p>Blackberry</p> </center>\n");
      out.write("               </marquee>\n");
      out.write("           </td></tr>\n");
      out.write("           \n");
      out.write("        </table>\n");
      out.write("    </div>\n");
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
