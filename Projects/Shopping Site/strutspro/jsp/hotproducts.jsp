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
<td width="750" valign=top>
	<hr bgcolor="#843f8b" width=300>
	<h3><font color="#843f8b"><div align=center>Hot Pruducts!</div></font></h3>
	<hr bgcolor="#843f8b" width=300>
<table width="100%" border="0" cellspacing="5">
<tr>
<td>
<p align="center"><img src="/strutspro/images/jeansjack.jpg" width="75" height="75" border=1 /><br />
<span class="boldblack">Jeans Jacket</span><br />
<span class="boldred">Rs. 456 </span></p>                  
</td>
<td>
<div align="center"><img src="/strutspro/images/digicam.jpg" width="75" height="75" border=1/><br />
<span class="boldblack">Digital Camera </span><br />
<span class="boldred">Rs. 7999 </span></div>
</td>
</tr>
<tr>
<td><div align="center"><img src="/strutspro/images/krish.jpg" width="60" height="75" border=1/><br />
<span class="boldblack">DVD Krissh </span><br />
<span class="boldred">Rs. 400 </span></div></td>
<td><p align="center"><img src="/strutspro/images/pendrive.jpg" width="60" height="75" border=1/><br />
<span class="boldblack">1 GB Pen Drive </span><br />
<span class="boldred">Rs. 1200 </span></p>                  
</td>
</tr>
<tr>
<td><div align="center"></div></td>
<td><div align="center"></div></td>
</tr>
</table>
</td></tr>
<tr>
    <td colspan="2"><%@include file="olns_footer.jsp"%></td>
</tr>    
</table></body></html>