<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="struts/bean-el" prefix="bean" %>
<%@ taglib uri="struts/html-el" prefix="html" %>
<%@ taglib uri="struts/logic-el" prefix="logic" %>
<%@ taglib uri="jstl/c" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>www.myshoppingsite.com</title>
<link rel="stylesheet" href="../css/mystyle.css" type="text/css" />
</head>
<body>
<table width="900" border="0" align="center"> 
<tr>
	<td colspan="2"><%@ include file="../jsp/olns_header.jsp" %></td>
</tr>
<tr>
<td width="150"  bgcolor="#86AEDF"><%@ include file="../jsp/olns_main_menu.jsp" %></td>
<td width="750" align="center" valign="top">
	<p>&nbsp;</p>
	<hr bgcolor="#843f8b" width=300>
	<h3><font color="#843f8b">Contact Us</font></h3>
	<hr bgcolor="#843f8b" width=300>
	<p align=center>A-23C, Rakesh Marg, Delhi-110083
	<br><br>E-Mail: info@myshoppingsite.com.
	<br><br>Ph:22338754, 23894567, 45673287</p>
</td>
</tr>
<tr>
    <td colspan="2"><%@include file="olns_footer.jsp"%></td>
</tr>
</table></body></html>