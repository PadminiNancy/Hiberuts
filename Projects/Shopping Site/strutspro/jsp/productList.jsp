<%@ taglib uri="struts/bean-el" prefix="bean" %>
<%@ taglib uri="struts/html-el" prefix="html" %>
<%@ taglib uri="struts/logic-el" prefix="logic" %>
<%@ taglib uri="jstl/c" prefix="c" %>
<%@ page import="java.util.*" %>
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
<p>&nbsp;</p>
<html:errors />
<table width="100%" border="0" cellspacing="0" cellpadding="2" align="center">
<tr bgcolor="#AE62AC" height=25 class=boldwhite>
	<td align=center ><bean:message key="olns.product_id" /></td>
	<td ><bean:message key="olns.category_id" /></td>
	<td ><bean:message key="olns.name" /></td>
	<td ><bean:message key="olns.description" /></td>
	<td ><bean:message key="olns.price" /></td>
	<td >&nbsp;</td>
	<td >&nbsp;</td>
</tr>
<!-- iterate over the results of the query -->
<logic:iterate id="product" name="products">
	<tr bgcolor="#AE62AC">
	<td class=yellowtext align=center>
	<bean:write name="product" property="product_id" />
	</td>
	<td class=yellowtext>
	<bean:write name="product" property="category_id" />
	</td>
	<td class=yellowtext>
	<bean:write name="product" property="name" />
	</td>
	<td class=yellowtext>
	<bean:write name="product" property="description" />
	</td>
	<td class=yellowtext>
	<bean:write name="product" property="price" />
	</td class=yellowtext>
	<td >
	<a href="../do/GetProduct?product_id=<bean:write name="product" property="product_id" />&&category_id=<bean:write
	name="product" property="category_id" />">Edit</a>
	</td>
	<td>
	<a href="../do/DeleteProduct?product_id=<bean:write name="product" property="product_id" />&&category_id=<bean:write
	name="product" property="category_id" />">Delete</a>
	</td>
	</tr>
</logic:iterate>
<tr>
<td colspan=7>
<table align=center width=300 cellspacing=5 cellpadding=3>
	<tr align=center><td bgcolor="#AE62AC" width=150>
	<a href="../jsp/addProduct.jsp?category_id=<bean:write name="product" property="category_id" />">
	Add Product</a>
	</td><td bgcolor="#AE62AC">
	<a href="../jsp/categoryList.jsp" />Show Categories</a>
	</td></tr>
</table>
<br><br>
<table align=center bgcolor="#AE62AC" width=100>
<tr><td align=center><a href="/strutspro/jsp/logout.jsp" >Logout</a></td></tr>
</table>
</td>
</tr>
</table>
</td>
</tr>
<tr>
	<td colspan=2><%@ include file="../jsp/olns_footer.jsp" %></td>
</tr>
</table></body></html>

