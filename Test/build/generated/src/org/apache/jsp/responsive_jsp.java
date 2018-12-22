package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class responsive_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      out.write("<html lang=\"en-us\">\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write(".city {\n");
      out.write("    float: left;\n");
      out.write("    margin: 5px;\n");
      out.write("    padding: 15px;\n");
      out.write("    width: 300px;\n");
      out.write("    height: 300px;\n");
      out.write("    border: 1px solid black;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h1>Responsive Web Design Demo</h1>\n");
      out.write("\n");
      out.write("<div class=\"city\">\n");
      out.write("  <h2>London</h2>\n");
      out.write("  <p>London is the capital city of England.</p>\n");
      out.write("  <p>It is the most populous city in the United Kingdom,\n");
      out.write("  with a metropolitan area of over 13 million inhabitants.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"city\">\n");
      out.write("  <h2>Paris</h2>\n");
      out.write("  <p>Paris is the capital of France.</p>\n");
      out.write("  <p>The Paris area is one of the largest population centers in Europe,\n");
      out.write("  with more than 12 million inhabitants.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"city\">\n");
      out.write("  <h2>Tokyo</h2>\n");
      out.write("  <p>Tokyo is the capital of Japan.</p>\n");
      out.write("  <p>It is the center of the Greater Tokyo Area,\n");
      out.write("  and the most populous metropolitan area in the world.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
