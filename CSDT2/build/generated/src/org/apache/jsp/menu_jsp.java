package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <title></title>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("  ul {list-style: none;padding: 0px;margin: 0px;}\n");
      out.write("  ul li {display: block;position: relative;float: left;border:1px solid #99cc99}\n");
      out.write("  li ul {display: none;}\n");
      out.write("  ul li a {display: block;background: #99cc99;padding: 5px 10px 5px 10px;text-decoration: none;\n");
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
      out.write("</body>\n");
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
