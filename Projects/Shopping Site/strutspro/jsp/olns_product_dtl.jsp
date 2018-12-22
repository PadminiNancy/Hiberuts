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
	<p>&nbsp;</p>
	<p class=violethead align=center>Product Detail</p>
		<html:errors />
		<html:form action="/AddItemToCart" name="productForm" type="com.wiley.ProductForm" scope="session" >
		<table width="280" border="0" align="center" cellpadding=2 cellspacing=2 bgcolor="#AE62AC" class=yellowtext>
			<tr>
			<td><bean:message key="olns.product_id" /></td>
			<html:hidden  property="product_id" />
			<td><html:text disabled="true" property="product_id" /></td>
			</tr>
			<html:hidden  property="category_id" />
			<tr>
			<td><bean:message key="olns.name" /></td>
			<html:hidden  property="name" />
			<td><html:text disabled="true" property="name" /></td>
			</tr>
			<tr>
			<td><bean:message key="olns.description" /></td>
			<html:hidden  property="description" />
			<td><html:text disabled="true" property="description" /></td>
			</tr>
			<tr>
			<td><bean:message key="olns.price" /></td>
			<html:hidden  property="price" />
			<td><html:text disabled="true" property="price" /></td>
			</tr>
			<tr>
			<td colspan="2" align="center">
			<input type="submit" name="submit" value="Add To Cart">
			</tr>
			<tr>
			<td colspan="2" align="center">
			</tr>
		</table>
		</html:form>
	</td>
	</tr>
	<tr>
	<td colspan=2><%@ include file="../jsp/olns_footer.jsp" %></td>
	</tr>
</table></body></html>