package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studdata_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005frequestURI_005fpagesize_005fname_005fid_005fexport;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fmedia_005fgroup_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005frequestURI_005fpagesize_005fname_005fid_005fexport = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fmedia_005fgroup_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005frequestURI_005fpagesize_005fname_005fid_005fexport.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fmedia_005fgroup_005fnobody.release();
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.release();
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
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Details</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"green\">\n");
      out.write("        ");
      //  display:table
      org.displaytag.tags.TableTag _jspx_th_display_005ftable_005f0 = (org.displaytag.tags.TableTag) _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005frequestURI_005fpagesize_005fname_005fid_005fexport.get(org.displaytag.tags.TableTag.class);
      _jspx_th_display_005ftable_005f0.setPageContext(_jspx_page_context);
      _jspx_th_display_005ftable_005f0.setParent(null);
      // /studdata.jsp(20,8) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_display_005ftable_005f0.setUid("data");
      // /studdata.jsp(20,8) name = name type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_display_005ftable_005f0.setName(new String("requestScope.data"));
      // /studdata.jsp(20,8) name = requestURI type = java.lang.String reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_display_005ftable_005f0.setRequestURI("/Stud1Serv.do");
      // /studdata.jsp(20,8) name = pagesize type = int reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_display_005ftable_005f0.setPagesize(10);
      // /studdata.jsp(20,8) name = export type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_display_005ftable_005f0.setExport(true);
      int _jspx_eval_display_005ftable_005f0 = _jspx_th_display_005ftable_005f0.doStartTag();
      if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object data = null;
        java.lang.Integer data_rowNum = null;
        if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_display_005ftable_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_display_005ftable_005f0.doInitBody();
        }
        data = (java.lang.Object) _jspx_page_context.findAttribute("data");
        data_rowNum = (java.lang.Integer) _jspx_page_context.findAttribute("data_rowNum");
        do {
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_display_005fcolumn_005f0(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_display_005fcolumn_005f1(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_display_005fcolumn_005f2(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_display_005fcolumn_005f3(_jspx_th_display_005ftable_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_display_005ftable_005f0.doAfterBody();
          data = (java.lang.Object) _jspx_page_context.findAttribute("data");
          data_rowNum = (java.lang.Integer) _jspx_page_context.findAttribute("data_rowNum");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_display_005ftable_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_display_005ftable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005frequestURI_005fpagesize_005fname_005fid_005fexport.reuse(_jspx_th_display_005ftable_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fdisplay_005ftable_0026_005frequestURI_005fpagesize_005fname_005fid_005fexport.reuse(_jspx_th_display_005ftable_005f0);
      out.write("\n");
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

  private boolean _jspx_meth_display_005fcolumn_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f0 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fmedia_005fgroup_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f0.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /studdata.jsp(21,12) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_display_005fcolumn_005f0.setProperty("roll");
    // /studdata.jsp(21,12) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_display_005fcolumn_005f0.setTitle("Roll no.");
    // /studdata.jsp(21,12) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_display_005fcolumn_005f0.setSortable(true);
    // /studdata.jsp(21,12) name = media type = java.lang.String reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_display_005fcolumn_005f0.setMedia("html");
    // /studdata.jsp(21,12) name = group type = int reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_display_005fcolumn_005f0.setGroup(1);
    int _jspx_eval_display_005fcolumn_005f0 = _jspx_th_display_005fcolumn_005f0.doStartTag();
    if (_jspx_th_display_005fcolumn_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fmedia_005fgroup_005fnobody.reuse(_jspx_th_display_005fcolumn_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fmedia_005fgroup_005fnobody.reuse(_jspx_th_display_005fcolumn_005f0);
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f1 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f1.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /studdata.jsp(22,12) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_display_005fcolumn_005f1.setProperty("name");
    // /studdata.jsp(22,12) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_display_005fcolumn_005f1.setTitle("Student name");
    // /studdata.jsp(22,12) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_display_005fcolumn_005f1.setSortable(true);
    int _jspx_eval_display_005fcolumn_005f1 = _jspx_th_display_005fcolumn_005f1.doStartTag();
    if (_jspx_th_display_005fcolumn_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f1);
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f2 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f2.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /studdata.jsp(23,12) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_display_005fcolumn_005f2.setProperty("doa");
    // /studdata.jsp(23,12) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_display_005fcolumn_005f2.setTitle("date of admission");
    // /studdata.jsp(23,12) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_display_005fcolumn_005f2.setSortable(true);
    int _jspx_eval_display_005fcolumn_005f2 = _jspx_th_display_005fcolumn_005f2.doStartTag();
    if (_jspx_th_display_005fcolumn_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f2);
    return false;
  }

  private boolean _jspx_meth_display_005fcolumn_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_display_005ftable_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  display:column
    org.displaytag.tags.ColumnTag _jspx_th_display_005fcolumn_005f3 = (org.displaytag.tags.ColumnTag) _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.get(org.displaytag.tags.ColumnTag.class);
    _jspx_th_display_005fcolumn_005f3.setPageContext(_jspx_page_context);
    _jspx_th_display_005fcolumn_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_display_005ftable_005f0);
    // /studdata.jsp(24,12) name = property type = java.lang.String reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_display_005fcolumn_005f3.setProperty("pass");
    // /studdata.jsp(24,12) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_display_005fcolumn_005f3.setTitle("password");
    // /studdata.jsp(24,12) name = sortable type = boolean reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_display_005fcolumn_005f3.setSortable(true);
    int _jspx_eval_display_005fcolumn_005f3 = _jspx_th_display_005fcolumn_005f3.doStartTag();
    if (_jspx_th_display_005fcolumn_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fdisplay_005fcolumn_0026_005ftitle_005fsortable_005fproperty_005fnobody.reuse(_jspx_th_display_005fcolumn_005f3);
    return false;
  }
}
