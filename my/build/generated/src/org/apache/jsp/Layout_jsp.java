package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Layout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fignore_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fignore_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fignore_005fnobody.release();
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>");
      if (_jspx_meth_tiles_005fgetAsString_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"mystyle.css\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <table width=\"600\" height=\"400\" align=\"center\" bgcolor=\"pink\">\r\n");
      out.write("<tr>\r\n");
      out.write("    <td colspan=\"2\">");
      if (_jspx_meth_tiles_005finsert_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>");
      if (_jspx_meth_tiles_005finsert_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td>");
      if (_jspx_meth_tiles_005finsert_005f2(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td colspan=\"2\">");
      if (_jspx_meth_tiles_005finsert_005f3(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table></body></html>\r\n");
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

  private boolean _jspx_meth_tiles_005fgetAsString_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:getAsString
    org.apache.struts.tiles.taglib.GetAttributeTag _jspx_th_tiles_005fgetAsString_005f0 = (org.apache.struts.tiles.taglib.GetAttributeTag) _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fignore_005fnobody.get(org.apache.struts.tiles.taglib.GetAttributeTag.class);
    _jspx_th_tiles_005fgetAsString_005f0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005fgetAsString_005f0.setParent(null);
    // /Layout.jsp(5,11) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_tiles_005fgetAsString_005f0.setName("title");
    // /Layout.jsp(5,11) name = ignore type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_tiles_005fgetAsString_005f0.setIgnore(true);
    int _jspx_eval_tiles_005fgetAsString_005f0 = _jspx_th_tiles_005fgetAsString_005f0.doStartTag();
    if (_jspx_th_tiles_005fgetAsString_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fignore_005fnobody.reuse(_jspx_th_tiles_005fgetAsString_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005fgetAsString_0026_005fname_005fignore_005fnobody.reuse(_jspx_th_tiles_005fgetAsString_005f0);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsert_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_005finsert_005f0 = (org.apache.struts.tiles.taglib.InsertTag) _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_005finsert_005f0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsert_005f0.setParent(null);
    // /Layout.jsp(12,20) name = attribute type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_tiles_005finsert_005f0.setAttribute("header");
    int _jspx_eval_tiles_005finsert_005f0 = _jspx_th_tiles_005finsert_005f0.doStartTag();
    if (_jspx_th_tiles_005finsert_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f0);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsert_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_005finsert_005f1 = (org.apache.struts.tiles.taglib.InsertTag) _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_005finsert_005f1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsert_005f1.setParent(null);
    // /Layout.jsp(15,8) name = attribute type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_tiles_005finsert_005f1.setAttribute("news");
    int _jspx_eval_tiles_005finsert_005f1 = _jspx_th_tiles_005finsert_005f1.doStartTag();
    if (_jspx_th_tiles_005finsert_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f1);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsert_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_005finsert_005f2 = (org.apache.struts.tiles.taglib.InsertTag) _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_005finsert_005f2.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsert_005f2.setParent(null);
    // /Layout.jsp(16,8) name = attribute type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_tiles_005finsert_005f2.setAttribute("body");
    int _jspx_eval_tiles_005finsert_005f2 = _jspx_th_tiles_005finsert_005f2.doStartTag();
    if (_jspx_th_tiles_005finsert_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f2);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsert_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_tiles_005finsert_005f3 = (org.apache.struts.tiles.taglib.InsertTag) _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_tiles_005finsert_005f3.setPageContext(_jspx_page_context);
    _jspx_th_tiles_005finsert_005f3.setParent(null);
    // /Layout.jsp(19,20) name = attribute type = java.lang.String reqTime = false required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_tiles_005finsert_005f3.setAttribute("footer");
    int _jspx_eval_tiles_005finsert_005f3 = _jspx_th_tiles_005finsert_005f3.doStartTag();
    if (_jspx_th_tiles_005finsert_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ftiles_005finsert_0026_005fattribute_005fnobody.reuse(_jspx_th_tiles_005finsert_005f3);
    return false;
  }
}