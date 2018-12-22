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
<p>&nbsp;</p><html:errors />
<p class=violethead align=center>Updating Product</p>
	<html:form action="/EditProduct" name="productForm" type="com.wiley.ProductForm" scope="request" >
	<table width="280" border="0" align="center" cellpadding=2 cellspacing=2 bgcolor="#AE62AC" class=yellowtext>
	<tr>
	<td><bean:message key="olns.product_id" /></td>
	<html:hidden  property="product_id" />
	<td><html:text disabled="true" property="product_id" /></td>
	</tr>
	<tr>
	<td><bean:message key="olns.category_id" /></td>
	<html:hidden  property="category_id" />
	<td><html:text disabled="true" property="category_id" /></td>
	</tr>
	<tr>
	<td><bean:message key="olns.name" /></td>
	<td><html:text property="name" /></td>
	</tr>
	<tr>
	<td><bean:message key="olns.description" /></td>
	<td><html:text property="description" /></td>
	</tr>
	<tr>
	<td><bean:message key="olns.price" /></td>
	<td><html:text property="price" /></td>
	</tr>
	<tr>
	<td colspan="2" align="center">
	<html:submit /><html:cancel /></td>
	</tr>
	</table>
	</html:form>
	<br><br>
	<table align=center bgcolor="#AE62AC" width=100>
	<tr><td align=center><a href="/strutspro/jsp/logout.jsp" >Logout</a></td></tr>
	</table>
</td>
</tr>
<tr>
<td colspan=2><%@ include file="../jsp/olns_footer.jsp" %></td>
</tr>
</table></body></html>

