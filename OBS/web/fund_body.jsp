<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
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
		<title>Fund Status!</title>
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
			<div id="page" style="height:640px"/>
                        <div id="sidebar" style="height:375px">
					<div class="box">
						</div>
					<div class="box">
						</div>
				</div>
				<div id="content"/>
					<div class="box"/>
                                        &nbsp;
                                        <center/>
						<font face="Bell MT" class="fsx06" color="#400000"/><b/>Fund Transfered!!!!!
                                               <br/> <a href="userhome.jsp"><b/>back</a>
<br/><br/><br/>
		<div id="footer">
<marquee onmouseover="this.scrollAmount=0" onmouseout="this.scrollAmount=2" truespeed="0" scrollamount="2" scrolldelay="20">
		
		© Copyright Online Banking Solutions.
		      		 </marquee>		</div>
	</body>
</html:html>