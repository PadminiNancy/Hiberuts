package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class timer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html><head>\n");
      out.write("<script>\n");
      out.write("<!--\n");

String clock = request.getParameter( "clock" );
if( clock == null ) clock = "180";

      out.write("\n");
      out.write("var timeout = ");
      out.print(clock);
      out.write(";\n");
      out.write("function timer()\n");
      out.write("{\n");
      out.write("if( --timeout > 0 )\n");
      out.write("{\n");
      out.write("document.forma.clock.value = timeout;\n");
      out.write("window.setTimeout( \"timer()\", 1000 );\n");
      out.write("}\n");
      out.write("else\n");
      out.write("{\n");
      out.write("document.forma.clock.value = \"Time over\";\n");
      out.write("///disable submit-button etc\n");
      out.write("}\n");
      out.write("}\n");
      out.write("//-->\n");
      out.write("</script>\n");
      out.write("<body>\n");
      out.write("<form action=\"");
      out.print(request.getRequestURL());
      out.write("\" name=\"forma\">\n");
      out.write("Seconds remaining: <input type=\"text\" name=\"clock\" value=\"");
      out.print(clock);
      out.write("\" style=\"border:0px solid white\">\n");
      out.write("...\n");
      out.write("</form>\n");
      out.write("<script>\n");
      out.write("<!--\n");
      out.write("timer();\n");
      out.write("//-->\n");
      out.write("</script>\n");
      out.write("</body></html>\n");
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
