<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
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
		<title>Employee Home!</title>
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
					<h1><a href="#">Online Banking And Managementt System </a></h1>
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
									<li><a href="stafflis.jsp">Board Of Directors</a></li>
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
				<div id="sidebar" style="width: 280px">
					<div class="box">
                                            <br/><br/><br/><br/><br/>
		                    <h3>Welcome:::${sessionScope.ec}</h3>
											</div>
					<div class="box">
											</div>
				</div>
				<div id="content"/>
					<div class="box"/>
<center/>
        <br/>
        <a href="newac_body.jsp"><font face="Bell MT" class="fsx06" color="#400000"><b/>Create New Account</font></a>
        <br/>
        <a href="listAct.jsp"><font face="Bell MT" class="fsx06" color="#400000"><b/>Active Accounts</font></a>
        <br/>
        <a href="UserReg.jsp"><font face="Bell MT" class="fsx06" color="#400000"><b/>Create New User</font></a>
        <br/>
        <a href="list_form.jsp"><font face="Bell MT" class="fsx06" color="#400000"><b/>Account Requests</font></a>
        <br/>
        <a href="listchqReq.jsp"><font face="Bell MT" class="fsx06" color="#400000"><b/>Cheque Book Requests</font></a>
        <br/>
        <a href="liststopReq.jsp"><font face="Bell MT" class="fsx06" color="#400000"><b/>Stop Cheque Payment Requests</font></a>
        <br/>
        <a href="listfundTran.jsp"><font face="Bell MT" class="fsx06" color="#400000"><b/>Fund Transfer Details</font></a>
        <br/>
        <a href="listuserempdraft.jsp"><font face="Bell MT" class="fsx06" color="#400000"><b/>Draft Requests</font></a>
        <br/>
        <a href="listloandetails.jsp"><font face="Bell MT" class="fsx06" color="#400000"><b/>Loan Requests</font></a>
        <br/>
        <a href="list_enquiry.jsp"><font face="Bell MT" class="fsx06" color="#400000"><b/>Enquiries</font></a>
        <br/>
        <a href="ListActServ.do"><font face="Bell MT" class="fsx06" color="#400000"><b/>Account Details</font></a>

        <br/>
         <br/>
        <a href="Logout.jsp"><font face="Bell MT" class="fsx06" color="#400000"><b/>LogOut</font></a>

        <br/>
		<div id="footer">
<marquee onmouseover="this.scrollAmount=0" onmouseout="this.scrollAmount=2" truespeed="0" scrollamount="2" scrolldelay="20">
		
		© Copyright Online Banking Solutions.
		      		 </marquee>		</div>
	</body>
</html:html>