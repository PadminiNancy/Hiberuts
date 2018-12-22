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
<%
if((String)request.getParameter("msg")!=null)
out.println("<div align=center class=boldred>No Product in this category</div>");
%>
<html:errors />
	<html:form action ="/SearchProductByKeyword" name="searchForm" type="com.wiley.SearchForm" >
	<table align="center" bgcolor="#AE62AC" width=300>
	<tr>
	<td ><font color=yellow>Category List</font><hr></td>
	</tr>
	<!-- iterate over the results of the query -->
	<logic:iterate id="category" name="categories">
	<tr align="left">
	<td>
	<a href="../do/SearchProductByCategoryId?category_id=<bean:write
name="category" property="category_id" />&&lBrowsCatelog=YES "><bean:write name="category" property="category" /></a>
	</td>
	</tr>
	</logic:iterate>
	</table>
	</html:form>
</td>
</tr>
<tr>
<td colspan=2><%@ include file="../jsp/olns_footer.jsp" %></td>
</tr>
</table></body></html>