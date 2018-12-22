package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feed_005fins_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_style_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_textarea_rows_property_cols_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_reset_value_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_html = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_style_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_textarea_rows_property_cols_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_errors_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_reset_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_text_style_property_nobody.release();
    _jspx_tagPool_html_textarea_rows_property_cols_nobody.release();
    _jspx_tagPool_html_errors_property_nobody.release();
    _jspx_tagPool_html_submit_value_nobody.release();
    _jspx_tagPool_html_reset_value_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_html_0.setPageContext(_jspx_page_context);
      _jspx_th_html_html_0.setParent(null);
      int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
      if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t<head>\n");
          out.write("                                                         <style type=\"text/css\">\n");
          out.write("<!--\n");
          out.write(".fsx01 {font-size: 11px;}\n");
          out.write(".fsx02 {font-size: 12px;}\n");
          out.write(".fsx03 {font-size: 13px;}\n");
          out.write(".fsx04 {font-size: 15px;}\n");
          out.write(".fsx05 {font-size: 16px;}\n");
          out.write(".fsx06 {font-size: 19px;}\n");
          out.write(".fsx07 {font-size: 21px;}\n");
          out.write(".fsx08 {font-size: 24px;}\n");
          out.write(".fsx09 {font-size: 27px;}\n");
          out.write(".fsx10 {font-size: 29px;}\n");
          out.write(".fsx11 {font-size: 32px;}\n");
          out.write(".fsx12 {font-size: 35px;}\n");
          out.write(".fsx13 {font-size: 37px;}\n");
          out.write(".fsx14 {font-size: 48px;}\n");
          out.write(".fsx15 {font-size: 64px;}\n");
          out.write(".fsx16 {font-size: 96px;}\n");
          out.write(".txdec {text-decoration: none;}\n");
          out.write("\n");
          out.write("input,textarea,select {color:#000000;font-family:'Times New Roman';font-size:12px;font-weight:normal;font-style:normal;text-decoration:none;}\n");
          out.write(".dfltt {font-family:'Times New Roman';font-size:12px;font-weight:normal;font-style:normal;text-decoration:none;text-align:left;color:#000000;}\n");
          out.write(".dfltc {font-family:'Times New Roman';font-size:12px;font-weight:normal;font-style:normal;text-decoration:none;text-align:left;color:#000000;}\n");
          out.write("body {margin:0;height:100%;width:100%;}\n");
          out.write("-->\n");
          out.write("</style>\n");
          out.write("\t\n");
          out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
          out.write("\t\t<meta name=\"description\" content=\"\" />\n");
          out.write("\t\t<meta name=\"keywords\" content=\"\" />\n");
          out.write("\t\t<title>FeedBack!</title>\n");
          out.write("\t\t<link href=\"http://fonts.googleapis.com/css?family=Bitter\" rel=\"stylesheet\" type=\"text/css\" />\n");
          out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
          out.write("\t\t<script type=\"text/javascript\" src=\"jquery-1.7.1.min.js\"></script>\n");
          out.write("\t\t<script type=\"text/javascript\" src=\"jquery.dropotron-1.0.js\"></script>\n");
          out.write("\t\t<script type=\"text/javascript\">\n");
          out.write("\t\t\t$(function() {\n");
          out.write("\t\t\t\t$('#menu > ul').dropotron({\n");
          out.write("\t\t\t\t\talignment: 'center',\n");
          out.write("\t\t\t\t\tmode: 'fade',\n");
          out.write("\t\t\t\t\toffsetY: -13\n");
          out.write("\t\t\t\t});\n");
          out.write("\t\t\t});\n");
          out.write("\t\t</script>\n");
          out.write("\t</head>\n");
          out.write("\t<body>\n");
          out.write("\t\t<div id=\"wrapper\"/>\n");
          out.write("\t\t\t<div id=\"header\">\n");
          out.write("\t\t\t\t<div id=\"logo\">\n");
          out.write("\t\t\t\t\t<h1><a href=\"#\">Online Banking Solutions</a></h1>\n");
          out.write("\t\t\t\t\t<span class=\"slogan\"><b>Make Banking Easy</b></span>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t\t<div id=\"menu\">\n");
          out.write("\t\t\t\t<ul>\n");
          out.write("\t\t\t\t\t<li class=\"first\">\n");
          out.write("\t\t\t\t\t\tHome <span class=\"down-arrow\"></span>\n");
          out.write("\t\t\t\t\t\t<ul>\n");
          out.write("                                                                       <li><a href=\"home.jsp\">Home Page</a></li>\n");
          out.write("\t\t\t\t\t\t\t<li>\n");
          out.write("\t\t\t\t\t\t\t\tAbout <span class=\"right-arrow\"></span>\n");
          out.write("\t\t\t\t\t\t\t\t<ul>\n");
          out.write("\t\t<li><a href=\"AboutUS.jsp\">About Us</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"affiliate.jsp\">Affiliates</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"Recruitment.jsp\">Recruitment<img src=\"images/new_1.gif\" width=\"28\" height=\"11\"/></a></li>\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"stafflist.jsp\">Board Of Directors</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"enquiry.jsp\">Enquiry</a></li>\n");
          out.write("                                                                        <li><a href=\"Bank Architecture.jsp\">Location</a></li>\n");
          out.write("                                                                        <li><a href=\"AboutMe.jsp\">About ME</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t</ul>\n");
          out.write("\t\t\t\t\t\t\t</li>\n");
          out.write("                                                        \t\t\t\t\t\t</ul>\n");
          out.write("                                                <li class=\"first\">\n");
          out.write("                                        \tNew User <span class=\"down-arrow\"></span>\n");
          out.write("\t\t\t\t\t\t<ul>\n");
          out.write("                                                             <li><a href=\"userform.jsp\">Acct Request</a></li>\n");
          out.write("                                                             <li><a href=\"help.jsp\">Help</a></li>\n");
          out.write("                                                </ul>\n");
          out.write("\t\t\t\t\t<li class=\"first\">\n");
          out.write("\t\t\t\t\t\tLogin <span class=\"down-arrow\"></span>\n");
          out.write("\t\t\t\t\t\t<ul>\n");
          out.write("\t\t\t\t\t\t\t<li><a href=\"admin_login.jsp\">Admin Login</a></li>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<li>\n");
          out.write("\t\t\t\t\t\t\t\tGeneral Login<span class=\"right-arrow\"></span>\n");
          out.write("\t\t\t\t\t\t\t\t<ul>\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"emp_login.jsp\">Employee Login</a></li>\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"UserLogin.jsp\">User Login</a></li>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<li>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t</li>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t</ul>\n");
          out.write("\t\t\t\t\t\t\t</li>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t</ul>\n");
          out.write("\t\t\t\t\t</li>\n");
          out.write("\t\t\t\t\t<li><a href=\"feed_ins.jsp\">FeedBack</a></li>\n");
          out.write("\t\t\t\t\t<li class=\"last\"><a href=\"contact.jsp\">ContactS</a></li>\n");
          out.write("\t\t\t\t</ul>\n");
          out.write("\t\t\t</div>\n");
          out.write("                <div id=\"page\" style=\"height:640px\"/>\n");
          out.write("\t\t\t\t<div id=\"sidebar\" style=\"width: 280px\">\n");
          out.write("\t\t\t\t\t<div class=\"box\">\n");
          out.write("<br/><br/><br/><br/>\n");
          out.write("                                            <h3>FeedBack</h3>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t<div class=\"box\">\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t<div class=\"date-list\">\n");
          out.write("\t\t\t\t\t\t\t<ul class=\"list date-list\">\n");
          out.write("\t\t\t\t\t\t\t\t<li class=\"first\"><span class=\"date\"></span> <a href=\"#\"></a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><span class=\"date\"></span> <a href=\"#\"></a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><span class=\"date\"></span> <a href=\"#\"></a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><span class=\"date\"></span> <a href=\"#\"></a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li><span class=\"date\"></span> <a href=\"#\"></a></li>\n");
          out.write("\t\t\t\t\t\t\t\t<li class=\"last\"><span class=\"date\"></span> <a href=\"#\"></a></li>\n");
          out.write("\t\t\t\t\t\t\t</ul>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t\t<div id=\"content\"/>\n");
          out.write("\t\t\t\t\t<div class=\"box\"/>\n");
          out.write("<center/>\n");
          out.write("\t\t\t\t\t\t          <table cellpadding=\"10\" cellspacing=\"10\">\n");
          out.write("            ");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_0.setPageContext(_jspx_page_context);
          _jspx_th_html_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
          _jspx_th_html_form_0.setAction("/FeedServ");
          int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
          if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                ");
 String s1=request.getParameter("msg");
                if(s1!=null)
                    out.println(s1);

                
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td><font face=\"Bell MT\" class=\"fsx06\" color=\"#400000\"><b/>FeedBack Id ::</font></td><td> ");
              if (_jspx_meth_html_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write(" </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td><font face=\"Bell MT\" class=\"fsx06\" color=\"#400000\"><b/>FeedBack Date ::</font></td><td> ");
              if (_jspx_meth_html_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write(" </td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td><font face=\"Bell MT\" class=\"fsx06\" color=\"#400000\"><b/>FeedBack::</font></td><td>");
              if (_jspx_meth_html_textarea_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("</td><td>");
              if (_jspx_meth_html_errors_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("</td>\n");
              out.write("                </tr>\n");
              out.write("                <tr>\n");
              out.write("                    <td>\n");
              out.write("                        &nbsp; &nbsp;\n");
              out.write("                        ");
              if (_jspx_meth_html_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\n");
              out.write("                        ");
              if (_jspx_meth_html_reset_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_html_form_0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("                    </td>\n");
              out.write("                 </tr>\n");
              out.write("\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
            return;
          }
          _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
          out.write("\n");
          out.write("        </table>\n");
          out.write("                                                <a href=\"userhome.jsp\"><b/>back</a>\n");
          out.write("\t<br/><br/><br/><br/>\n");
          out.write("                                                <div id=\"footer\">\n");
          out.write("<marquee onmouseover=\"this.scrollAmount=0\" onmouseout=\"this.scrollAmount=2\" truespeed=\"0\" scrollamount=\"2\" scrolldelay=\"20\">\n");
          out.write("\n");
          out.write("\t\t© Copyright Online Banking Solutions.\n");
          out.write("\t\t      \t\t </marquee>\t\t</div>\n");
          out.write("\t</body>\n");
          int evalDoAfterBody = _jspx_th_html_html_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
        return;
      }
      _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
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

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_0.setStyle("height: 21px");
    _jspx_th_html_text_0.setProperty("fid");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_style_property_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_style_property_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_text_1.setStyle("height: 21px");
    _jspx_th_html_text_1.setProperty("fdate");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_style_property_nobody.reuse(_jspx_th_html_text_1);
      return true;
    }
    _jspx_tagPool_html_text_style_property_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_textarea_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:textarea
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_textarea_0 = (org.apache.struts.taglib.html.TextareaTag) _jspx_tagPool_html_textarea_rows_property_cols_nobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_textarea_0.setPageContext(_jspx_page_context);
    _jspx_th_html_textarea_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_textarea_0.setCols("25");
    _jspx_th_html_textarea_0.setRows("8");
    _jspx_th_html_textarea_0.setProperty("ftext");
    int _jspx_eval_html_textarea_0 = _jspx_th_html_textarea_0.doStartTag();
    if (_jspx_th_html_textarea_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_textarea_rows_property_cols_nobody.reuse(_jspx_th_html_textarea_0);
      return true;
    }
    _jspx_tagPool_html_textarea_rows_property_cols_nobody.reuse(_jspx_th_html_textarea_0);
    return false;
  }

  private boolean _jspx_meth_html_errors_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_property_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_errors_0.setProperty("ftext");
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_0);
      return true;
    }
    _jspx_tagPool_html_errors_property_nobody.reuse(_jspx_th_html_errors_0);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setValue("SUBMIT");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_submit_value_nobody.reuse(_jspx_th_html_submit_0);
      return true;
    }
    _jspx_tagPool_html_submit_value_nobody.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_html_reset_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:reset
    org.apache.struts.taglib.html.ResetTag _jspx_th_html_reset_0 = (org.apache.struts.taglib.html.ResetTag) _jspx_tagPool_html_reset_value_nobody.get(org.apache.struts.taglib.html.ResetTag.class);
    _jspx_th_html_reset_0.setPageContext(_jspx_page_context);
    _jspx_th_html_reset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_reset_0.setValue("RESET");
    int _jspx_eval_html_reset_0 = _jspx_th_html_reset_0.doStartTag();
    if (_jspx_th_html_reset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_reset_value_nobody.reuse(_jspx_th_html_reset_0);
      return true;
    }
    _jspx_tagPool_html_reset_value_nobody.reuse(_jspx_th_html_reset_0);
    return false;
  }
}
