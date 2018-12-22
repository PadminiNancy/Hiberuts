<%@ taglib uri="struts/bean-el" prefix="bean" %>
<%@ taglib uri="struts/html-el" prefix="html" %>
<%@ taglib uri="struts/logic-el" prefix="logic" %>
<%@ taglib uri="jstl/c" prefix="c" %>
<html>
<head>
<title><bean:message key="olns.title" /></title>
<link rel="stylesheet" href="/strutspro/css/mystyle.css" type="text/css" />
</head>
<body>
<table align="center" width="900">
<tr>
	<td colspan="2"><jsp:include page = "../jsp/olns_header.jsp" /></td>
</tr>
<tr>
<td width="150" bgcolor="#86AEDF">
    <jsp:include page = "../jsp/olns_main_menu.jsp"/>
</td>
<td width="750" valign=top>
<p align=center class=violethead>Products Avalilable<hr width=150></p>
<html:errors />
<table width="100%" border="0" cellspacing="0" cellpadding="2" bgcolor="#AE62AC">
<tr height=25 class=boldwhite>
	<td  align=center><bean:message key="olns.product_id" /></td>
	<td ><bean:message key="olns.category_id" /></td>
	<td width=200><bean:message key="olns.name" /></td>
	<td ><bean:message key="olns.description" /></td>
	<td ><bean:message key="olns.price" /></td>
	<td >&nbsp;</td>
</tr>
<!-- iterate over the results of the query -->
<logic:iterate id="product" name="products">
<tr align="left" class=yellowtext>
<td align=center>
<bean:write name="product" property="product_id" />
</td>
<td >
<bean:write name="product" property="category_id" />
</td>
<td >
<bean:write name="product" property="name" />
</td>
<td >
<bean:write name="product" property="description" />
</td>
<td >
<bean:write name="product" property="price" />
</td>
<%
 String lBrowsCatelog = "";
 lBrowsCatelog = (String)session.getAttribute("lBrowsCatelog");
 if (lBrowsCatelog != null && lBrowsCatelog.equals("YES")) {
	  %>
	  <td  bgcolor="#AE62AC" align=center>
	  <a href="../do/GetProductDtl?category_id=<bean:write
name="product" property="category_id" />&&product_id=<bean:write
name="product" property="product_id" /> ">Detail</a>
	</td>
	<% }%>
</tr>
</logic:iterate>
</table>
<br><br><div align=center>Click Details and Add product in your Shopping Cart.</div>
</td>
</tr>
<tr>
<td colspan=2><%@ include file="../jsp/olns_footer.jsp" %></td>
</tr>
</table></body></html>