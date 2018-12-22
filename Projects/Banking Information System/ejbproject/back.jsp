
<%
String type=(String)session.getAttribute("type");

	if("Clerk".equals(type))
		response.sendRedirect("clerk.html");
	else
		response.sendRedirect("manager.html");
%>