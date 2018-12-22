package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html:html>\n");
      out.write("\t<head>\n");
      out.write("                    <style type=\"text/css\">\n");
      out.write("\n");
      out.write("body {margin: 0; background-position: center;}\n");
      out.write("#header_wrapper {margin: auto;height: 185px; background-position: top center;}\n");
      out.write("#menu_wrapper {margin: auto; padding: 0; height: 35px; background: #6B4E3E;}\n");
      out.write("#menu_container {height: 33px; width: 880px;}\n");
      out.write("/* menu styles */\n");
      out.write(".menu-wrapper {margin: 8px 0 0 0; padding: 0px; width: 850px; height: 20px; position: absolute;\n");
      out.write("z-index: 99999;}\n");
      out.write("ul.dropdown, ul.dropdown li, ul.dropdown ul {margin: 0px; padding: 0px; list-style: none; font-family:\n");
      out.write("Arial, Helvetica, sans-serif}\n");
      out.write("ul.dropdown {margin: 0 0 0 5px; padding: 0; position: relative; z-index: 9999; float: left; width:\n");
      out.write("900px;}\n");
      out.write("ul.dropdown li {margin: auto; padding: 0; float: left; font-size: 12px; text-align: center; border-right:\n");
      out.write("1px solid #2b0e06;}\n");
      out.write("ul.dropdown li a {color: #fcf7e9; margin: 0px; padding: 3px 10px 2px 10px; text-decoration: none;}\n");
      out.write("ul.dropdown li a:hover {color: #bc975f;}\n");
      out.write("ul.dropdown li.hover, ul.dropdown li:hover { position: relative; z-index: 9999; color: #bc975f;}\n");
      out.write("ul.dropdown ul { visibility: hidden; position: absolute; top: 100%; left: 0; z-index: 999; }\n");
      out.write("ul.dropdown li:hover > ul {margin: auto; padding: 5px 0 0 0; visibility: visible; width: 172px;}\n");
      out.write("ul.dropdown li ul li {margin: auto; padding: 0; float: left; width: 172px;  text-align: left;\n");
      out.write("border-bottom: 1px dotted #764c35; border-right:none;}\n");
      out.write("ul.dropdown li ul li a {margin: auto; padding: 10px 10px 0; text-transform: none; float: left; border:\n");
      out.write("none; font-size: 12px; width: 152px; background-color:#6B4E3E;}\n");
      out.write("ul.dropdown li ul li a:hover {color: #bc975f;}\n");
      out.write("ul.dropdown li ul li:hover {background-color:#6B4E3E;}\n");
      out.write("/* end menu styles */\n");
      out.write("</style>\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\n");
      out.write("\t\t<title>Home Page!</title>\n");
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
      out.write("                <div id=\"page\" style=\"height: 640px\"/>\n");
      out.write("                <div id=\"sidebar\">\n");
      out.write("\t\t\t\t\t<div class=\"box\">\n");
      out.write("                                            <h4 style=\"color:green\"><b/>Apply Online<img src=\"images/new_1.gif\" width=\"28\" height=\"11\" alt=\"\" /></h4>\n");
      out.write("&nbsp;<a href=\"loan.jsp\"><img class=\"alignleft\" src=\"images/carloannew.jpg\" width=\"154\" height=\"41\" alt=\"\" title=\"Online Car Loan\" /></a>\n");
      out.write("<br/><br/><br/>\n");
      out.write("&nbsp;<a href=\"loan.jsp\"><img class=\"alignleft\" src=\"images/homloannew.jpg\" width=\"154\" height=\"41\" alt=\"\" /></a>\n");
      out.write("<br/><br/><br/>\n");
      out.write("&nbsp;<a href=\"loan.jsp\"><img class=\"alignleft\" src=\"images/eduloannew.jpg\" width=\"154\" height=\"41\" alt=\"\" /></a>\n");
      out.write("<br/><br/><br/>\n");
      out.write("&nbsp;<a href=\"goldrates.jsp\"><img class=\"alignleft\" src=\"images/goldcoin1.gif\" width=\"94\" height=\"136\" alt=\"\" /></a>\n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                <div id=\"content\"/>\n");
      out.write("\t\t\t\t\t<div class=\"box\"/>\n");
      out.write("                                        <div id=\"Oobj6\" style=\"height:165px;\">\n");
      out.write("<object id=\"Igeo6\" classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=4,0,2,0\" width=\"775\" height=\"165\">\n");
      out.write("\t<param name=\"movie\" value=\"images/woodsville.swf\">\n");
      out.write("\t<param name=\"quality\" value=\"best\">\n");
      out.write("        <param name=\"play\" value=\"true\">\n");
      out.write("\t<param name=\"loop\" value=\"false\">\n");
      out.write("\t<param name=\"menu\" value=\"false\">\n");
      out.write("\t<embed src=\"images/woodsville.swf\" type=\"application/x-shockwave-flash\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" quality=\"best\" play=\"true\" loop=\"true\" menu=\"false\" width=\"600\" height=\"140\">\n");
      out.write("</object>\n");
      out.write("                                        </div>\n");
      out.write("                                        &nbsp;<br/><center/><h4 style=\"color:olive\">Welcome to</h4>\n");
      out.write("                                        <center/><font size=\"5px\" face=\"Bell MT\" class=\"fsx06\" color=\"pink\"><b/><h4 style=\"color:maroon\">Online Banking <br/>Solutions</h4></font><br/>\n");
      out.write("\n");
      out.write("                                        <div id=\"footer\">\n");
      out.write("     <marquee onmouseover=\"this.scrollAmount=0\" onmouseout=\"this.scrollAmount=2\" truespeed=\"0\" scrollamount=\"2\" scrolldelay=\"20\">\n");
      out.write("\t\t<b/>© Copyright Online Banking Solutions.\n");
      out.write("\t\t      \t\t </marquee>\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html:html>");
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
