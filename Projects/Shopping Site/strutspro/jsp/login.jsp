<%@ taglib uri="struts/bean-el" prefix="bean" %>
<%@ taglib uri="struts/html-el" prefix="html" %>
<%@ taglib uri="struts/logic-el" prefix="logic" %>
<%@ taglib uri="jstl/c" prefix="c" %>
<html>
<head>
	<title><bean:message key="olns.title" /></title>
</head>
<link rel="stylesheet" href="/strutspro/css/mystyle.css" type="text/css" />
<body>
<table align="center" width="900">
<tr>
	<td colspan="2"><jsp:include page = "../jsp/olns_header.jsp" /></td>
</tr>
<tr>
	<td width="150" bgcolor="#86AEDF">
	<jsp:include page = "../jsp/olns_main_menu.jsp"/>
	</td>
	<td width="750">
	<html:errors />
	<h4><font color="#843f8b"><div align=center>Enter Login id and Password</div></font></h4>
	<html:form action="/Login" name="loginForm" type="com.wiley.LoginForm" ><table align="center">
	<table align="center">
	<tr>
	<td><bean:message key="olns.username" />:</td>
	<td><html:text property="username" /></td>
	</tr>
	<tr>
	<td><bean:message key="olns.password" />:</td>
	<td><html:password property="password" /></td>
	</tr>
	<tr>
	<td colspan="2" align="center"><html:submit /></td>
	</tr>
	</table>
	</html:form>
	</td>
</tr>
<tr>
<td colspan=2><%@ include file="../jsp/olns_footer.jsp" %></td>
</tr>
</table>
</body>
</html>