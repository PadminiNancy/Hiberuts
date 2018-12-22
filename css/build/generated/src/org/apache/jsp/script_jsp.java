package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class script_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("            rate_value;\n");
      out.write("           function view(){\n");
      out.write("            var form = document.getElementById('formBuzType'); // if you passed the form, you wouldn't need this line.\n");
      out.write("     for(var i = 0; i < form.buztype.length; i++)\n");
      out.write("     {\n");
      out.write("          if(form.buztype[i].checked)\n");
      out.write("          {\n");
      out.write("          var selectedValue = form.buztype[i].value;\n");
      out.write("          }\n");
      out.write("          function myFunc()\n");
      out.write("          {\n");
      out.write("              var a = 100;\n");
      out.write("              alert(a);\n");
      out.write("          }\n");
      out.write("     }\n");
      out.write("\n");
      out.write("\n");
      out.write("     alert(selectedValue);\n");
      out.write("     return false;\n");
      out.write("           }\n");
      out.write("            </script>\n");
      out.write("        <label class=\"label\" for=\"buztype\"></label>\n");
      out.write("\n");
      out.write("        <input type=\"radio\" id=\"r1\" name=\"buztype\" value=\"Fixed Rate\" onclick=\"view();\"> Fixed Rate\n");
      out.write("\n");
      out.write("<input type=\"radio\" id=\"r2\" name=\"buztype\" value=\"Variable Rate\" onclick=\"view();\"> Variable Rate\n");
      out.write("\n");
      out.write("<input type=\"radio\" id=\"r3\" name=\"buztype\" value=\"Multi Rate\" onclick=\"view();\"> Multi Rate\n");
      out.write("<input type=\"submit\" value=\"aa\" onclick=\"myFunc();\"\n");
      out.write("        \n");
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
