<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="struts/bean-el" prefix="bean" %>
<%@ taglib uri="struts/html-el" prefix="html" %>
<%@ taglib uri="struts/logic-el" prefix="logic" %>
<%@ taglib uri="jstl/c" prefix="c" %>
<html >
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
<td width=150 bgcolor="#86AEDF"><%@ include file="../jsp/olns_main_menu.jsp" %></td>
<td width=750 align="center" >
<html:form action ="/SearchProductByKeyword" name="searchForm" type="com.wiley.SearchForm" >

<table width=300 height=100 bgcolor="#AE62AC" class=yellowtext>
	<tr><td>
	Enter a Keyword to Search!
	</td></tr>
	<tr><td>
	Search <input type="text" name="search_keyword" value="">
	</td></tr>
	<tr><td>
	<input type="submit" value="Search">
	</td></tr>
</table>
</html:form>
</td>
</tr>
<tr>
    <td colspan="2"><%@include file="olns_footer.jsp"%></td>
</tr>
</table></body></html>