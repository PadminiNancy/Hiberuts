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
<html:errors />
<div class=violethead align=center>Please Fill in the Form to place an Order for items in your <br>Shopping Cart</div>
<hr width=300>
<html:form action="/InsertDeliveryDtl" name="orderForm" type="com.wiley.OrderForm" >
		<table border="0" align="center" cellpadding=2 cellspacing=2 bgcolor="#AE62AC" class=yellowtext>
		<tr>
			<td colspan="2" align="center" class=boldwhite>Delivery Address Details</td>
		</tr>
		<tr>
			<td ><bean:message key="olns.order_id" /></td>
			<td><html:text property="order_id" /></td>
		</tr>
		<tr>
			<td ><bean:message key="olns.contact_name" /></td>
			<td><html:text property="contact_name" /></td>
		</tr>
		<tr>
			<td ><bean:message key="olns.delivery_address" /></td>
			<td><html:text property="delivery_address" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center" class=boldwhite>Credit Card Details</td>
		</tr>
		<tr>
			<td ><bean:message key="olns.cc_name" /></td>
			<td><html:text property="cc_name" /></td>
		</tr>
		<tr>
			<td ><bean:message key="olns.cc_number" /></td>
			<td><html:text property="cc_number" /></td>
		</tr>
		<tr>
			<td ><bean:message key="olns.cc_expiry_date" /></td>
			<td><html:text property="cc_expiry_date" /> (yyyy-mm-dd)</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<html:submit value="Check Out"/><html:reset />
			</td>
		</tr>
		</table>
		</html:form>
		</td>
	</tr>
	<tr>
	<td colspan=2><%@ include file="../jsp/olns_footer.jsp" %></td>
	</tr>
</table></body></html>