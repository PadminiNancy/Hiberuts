
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html:html>
	<head>
                         <style type="text/css">
<!--
.fsx01 {font-size: 11px;}
.fsx02 {font-size: 12px;}
.fsx03 {font-size: 13px;}
.fsx04 {font-size: 15px;}
.fsx05 {font-size: 16px;}
.fsx06 {font-size: 19px;}
.fsx07 {font-size: 21px;}
.fsx08 {font-size: 24px;}
.fsx09 {font-size: 27px;}
.fsx10 {font-size: 29px;}
.fsx11 {font-size: 32px;}
.fsx12 {font-size: 35px;}
.fsx13 {font-size: 37px;}
.fsx14 {font-size: 48px;}
.fsx15 {font-size: 64px;}
.fsx16 {font-size: 96px;}
.txdec {text-decoration: none;}

input,textarea,select {color:#000000;font-family:'Times New Roman';font-size:12px;font-weight:normal;font-style:normal;text-decoration:none;}
.dfltt {font-family:'Times New Roman';font-size:12px;font-weight:normal;font-style:normal;text-decoration:none;text-align:left;color:#000000;}
.dfltc {font-family:'Times New Roman';font-size:12px;font-weight:normal;font-style:normal;text-decoration:none;text-align:left;color:#000000;}
body {margin:0;height:100%;width:100%;}
-->
</style>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<title>New Acccount!</title>
		<link href="http://fonts.googleapis.com/css?family=Bitter" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" type="text/css" href="style.css" />
		<script type="text/javascript" src="jquery-1.7.1.min.js"></script>
		<script type="text/javascript" src="jquery.dropotron-1.0.js"></script>
		<script type="text/javascript">
			$(function() {
				$('#menu > ul').dropotron({
					alignment: 'center',
					mode: 'fade',
					offsetY: -13
				});
			});
		</script>
	</head>
	<body>

            <%
                if(session.getAttribute("id")==null)
                    response.sendRedirect("emp_login.jsp");
            %>
		<div id="wrapper"/>
			<div id="header">
				<div id="logo">
					<h1><a href="#">Online Banking Solutions</a></h1>
					<span class="slogan"><b>Make Banking Easy</b></span>
				</div>
			</div>
			<div id="menu">
				<ul>
					<li class="first">
						Home <span class="down-arrow"></span>
						<ul>
                                                                       <li><a href="home.jsp">Home Page</a></li>
							<li>
								About <span class="right-arrow"></span>
								<ul>
		<li><a href="AboutUS.jsp">About Us</a></li>
									<li><a href="affiliate.jsp">Affiliates</a></li>
									<li><a href="Recruitment.jsp">Recruitment<img src="images/new_1.gif" width="28" height="11"/></a></li>
									<li><a href="stafflist.jsp">Board Of Directors</a></li>
									<li><a href="enquiry.jsp">Enquiry</a></li>
                                                                        <li><a href="Bank Architecture.jsp">Location</a></li>
                                                                        <li><a href="AboutMe.jsp">About ME</a></li>

								</ul>
							</li>
                                                        						</ul>
                                                <li class="first">
                                        	New User <span class="down-arrow"></span>
						<ul>
                                                             <li><a href="userform.jsp">Acct Request</a></li>
                                                             <li><a href="help.jsp">Help</a></li>
                                                </ul>
					<li class="first">
						Login <span class="down-arrow"></span>
						<ul>
							<li><a href="admin_login.jsp">Admin Login</a></li>

							<li>
								General Login<span class="right-arrow"></span>
								<ul>
									<li><a href="emp_login.jsp">Employee Login</a></li>
									<li><a href="UserLogin.jsp">User Login</a></li>

									<li>

									</li>

								</ul>
							</li>

						</ul>
					</li>
					<li><a href="feed_ins.jsp">FeedBack</a></li>
					<li class="last"><a href="contact.jsp">ContactS</a></li>
				</ul>
			</div>
                <div id="page" style="height: 640px"/>
				<div id="sidebar">
					<div class="box">
                                            <br/><br/><br/>
						<h3>New Account</h3>
										</div>
					<div class="box">
					</div>
				</div>
				<div id="content"/>
					<div class="box"/>
                                        <center/>
						  <table cellspacing="10" cellpadding="10">
                                                       <tr>
                                                                  <td colspan="2">
            <%
              String msg=request.getParameter("msg");
              if(msg!=null)
            {
            out.print(msg);
            }
            %>
                                                                  </td>
                                                              </tr>
            <html:form action="/NewAcServ">
                <tr>
                    <td><font face="Bell MT" class="fsx06" color="#400000"><b/>Account Number::</font></td><td> <html:text style="height: 21px" property="acno"/> </td>
                </tr>
                <tr>
                    <td><font face="Bell MT" class="fsx06" color="#400000"><b/>Account Type::</font></td><td> <html:text style="height: 21px" property="act_type" /></td>
                        <font face="Bell MT" class="fsx06" color="#red"><b/><html:errors property="act_err"/></font>
                </tr>
                <tr>
                    <td><font face="Bell MT" class="fsx06" color="#400000"><b/>Date Of Opening::</font></td><td> <html:text style="height: 21px" property="dop"/> </td>
                        <font face="Bell MT" class="fsx06" color="red"/><b/><html:errors property="dop_err"/>
                </tr>
                <tr>
                    <td><font face="Bell MT" class="fsx06" color="#40000"><b/>User Name::</font></td><td> <html:text style="height: 21px" property="uname"/> </td>
                        <font face="Bell MT" class="fsx06" color="red"/><b/><html:errors property="nm_err"/>
                </tr>
                <tr>
                    <td><font face="Bell MT" class="fsx06" color="#400000"><b/>PassWord::</font></td><td> <html:password style="height: 21px" property="pass"/> </td>
                         <font face="Bell MT" class="fsx06" color="red"/><b/><html:errors property="pass_err"/>
                </tr>
                <tr>
                    <td><font face="Bell MT" class="fsx06" color="#400000"><b/>Balance ::</font></td><td> <html:text style="height: 21px" property="bal"/> </td>
                </tr>
                <tr>
                    <td><font face="Bell MT" class="fsx06" color="#400000"><b/>Balance Type ::</font></td><td> <html:text  style="height: 21px"property="bal_type"/> </td>
                        <font face="Bell MT" class="fsx06" color="red"/><b/><html:errors property="bal_err"/>
                </tr>
                <tr>
                    <td><font face="Bell MT" class="fsx06" color="#400000"><b/>Branch ::</font></td><td> <html:text style="height: 21px" property="branch"/> </td>
                        <font face="Bell MT" class="fsx06" color="red"/><b/><html:errors property="bal_err"/><html:errors property="br_err"/>
                </tr>
                <tr>
                    <td><font face="Bell MT" class="fsx06" color="#400000"><b/>IFC Code ::</font></td><td> <html:text style="height: 21px" property="ifc_code"/> </td>
                        <font face="Bell MT" class="fsx06" color="red"/><html:errors property="bal_err"/><html:errors property="ifc_err"/>
                </tr>
                <tr>
                    <td>
                        &nbsp; &nbsp;
                        <html:submit value="SUBMIT"/>
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                        <html:reset value="RESET"/>
                    </td>
                 </tr>

            </html:form>
        </table>
                                        <a href="emp_home.jsp"><b/>back</a>
                                         
		<div id="footer">
<marquee onmouseover="this.scrollAmount=0" onmouseout="this.scrollAmount=2" truespeed="0" scrollamount="2" scrolldelay="20">
		
		© Copyright Online Banking Solutions.
		      		 </marquee>		</div>
	</body>
</html:html>