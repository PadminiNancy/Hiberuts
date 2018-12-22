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
	<table width="100%"	border="0" cellspacing="0"cellpadding="2" align="center">
	<tr bgcolor="#AE62AC" class=boldwhite width=30>
	<td align=center><bean:message key="olns.category_id" /></td>
	<td ><bean:message key="olns.category" /></td>
	<td colspan=4>&nbsp;</td>
	</tr>
	<!-- iterate over the results of the query -->
	<%
	int num=0;
	%>
	<logic:iterate id="category" name="categories">
	<tr align="center" bgcolor="#AE62AC">
	<td class=yellowtext>
	<bean:write name="category" property="category_id" />
	</td>
	<td align=left width=200 class=yellowtext>
	<bean:write name="category" property="category" />
	</td>
	<td>
	<a href="../do/GetCategory?category_id=<bean:write
	name="category" property="category_id" />"><bean:message key="olns.update" /></a>
	</td>
	<td>
	<a href="../do/DeleteCategory?category_id=<bean:write
	name="category" property="category_id" />"><bean:message key="olns.delete" /></a>
	</td>
	<td>
	<a href="../do/ShowProduct?category_id=<bean:write
	name="category" property="category_id" />"><bean:message key="olns.showproducts" /></a>
	</td>
	<td bgcolor="#AE62AC">
	<a href="../jsp/addProduct.jsp?category_id=<bean:write
	name="category" property="category_id" />">Add Products</a>
	</td>
	</tr>
	<%//incrementing i
		num=num+1;	%>
	</logic:iterate>
	</table>
	<%
	if(num==0)
	out.println("<div class=boldred>There is No Category Added.</div>");
	else
	out.println("Total Categories: "+num);
	%>
	<a href="../jsp/addCategory.jsp"><div class=violethead align=center>Add New Category</div></a>
	<%
	if((String)request.getParameter("msg")!=null)
	out.println("<br><div class=boldred align=center>There is no Product in this Category</div>");
	%>
	<br><br>
	<table align=center bgcolor="#AE62AC" width=100>
	<tr><td align=center><a href="/strutspro/jsp/logout.jsp" >Logout</a></td></tr>
	</table>

	</td>
	</tr>
	<tr><td colspan=2><%@ include file="../jsp/olns_footer.jsp" %></td></tr>
</table></body></html>