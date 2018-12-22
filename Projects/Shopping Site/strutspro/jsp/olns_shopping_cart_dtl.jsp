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
<html:errors />
<p class=violethead align=center>Your Shopping Cart Status</p>

<table width="100%" border="0" cellspacing="0" cellpadding="3"  bgcolor="#AE62AC">
	<tr align="left" class=boldwhite>
	<td ><bean:message key="olns.product_id" /></td>
	<td ><bean:message key="olns.name" /></td>
	<td ><bean:message key="olns.description" /></td>
	<td ><bean:message key="olns.price" /></td>
	<td ><bean:message key="olns.quantity" /></td>
	<td ><bean:message key="olns.subtotal" /></td>
		</tr>
		<!-- iterate over the results of the query -->
		<logic:iterate id="shoppingItem" name="lShoppingCartArr">
		<html:form action ="/UpdateShopingCartItem" name="shoppingItemForm" type="com.wiley.ShoppingItemForm" >
		<tr align="left" class=yellowtext>
		<td >
		<bean:define id="prod_id" name="shoppingItem" property="product_id"/>
		<html:hidden  property="product_id" value="${prod_id}"/>
		<bean:write name="shoppingItem" property="product_id" />
		</td>
		<td >
		<bean:define
		id="prod_name" name="shoppingItem" property="name"/>
		<html:hidden  property="name" value="${prod_name}"/>
		<bean:write name="shoppingItem" property="name" />
		</td>
		<td >
		<bean:define id="prod_description" name="shoppingItem" property="description"/>
		<html:hidden  property="description" value="${prod_description}"/>
		<bean:write name="shoppingItem" property="description" />
		</td>
		<td >
		<bean:define id="prod_price" name="shoppingItem" property="price"/> 
		<html:hidden  property="price" value="${prod_price}"/>
		<bean:write name="shoppingItem" property="price" />
		</td>
		<td >
		<bean:define id="prod_qty" name="shoppingItem" property="quantity"/> 
		<html:text size="2" property="quantity" value="${prod_qty}" />
		</td>
		<td >
		<bean:write name="shoppingItem" property="subtotal" />
		</td>
		<td>
		<input type="submit" name="submit" value="Update">
		</td>
		<td>
		<input type="submit" name="submit" value="Remove">
		</td>
		</tr>
		</html:form>
		</logic:iterate>
		<tr>
<td colspan=7>
<table align=center width=300 cellspacing=5 cellpadding=3>
	<tr align=center><td bgcolor="#AE62AC" width=150>
	<a href="../jsp/olns_order_delivery_dtl.jsp">Check Out</a>
	</td><td bgcolor="#AE62AC">
	<a href="../jsp/olns_product_search_result.jsp">Add More</a>
	</td></tr>
</table>
</td>
</tr>
</table>
</td></tr>
<tr>
	<td colspan=2><%@ include file="../jsp/olns_footer.jsp" %></td>
</tr>
</table></body></html>