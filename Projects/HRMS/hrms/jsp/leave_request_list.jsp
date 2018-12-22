<%@ page language="java" %>
<%@ page session="true" %>
<%@ page  import="com.LeaveManagement.*" %>
<%@ page  import="java.io.*" %>
<%@ page  import="java.util.*" %>
<html>
<head>
<title>www.hrsolutions.com/Leave Request List</title>
<link rel="stylesheet" href="../css/mystyle.css" type="text/css" />
</head>
<body>
<table width="900" border="0" align="center">
<tr>
	<td colspan="2"><%@ include file="../jsp/hrms_header.jsp" %></td>
</tr>
<tr>
<td width="150"><%@ include file="../jsp/hrms_main_menu.jsp" %></td>  
<td width ="750" valign="top">
<p>&nbsp;</p>
<div align=center class=boldblack>List of Approved Leave Requests</div>
<hr width=100% color=#843F8B>
<table  border="0" width=600 align=center>
<% 
    String dbopr = "";
    dbopr = (String)session.getAttribute("dbopr");
%>
	<tr>
	<td class=whitetext bgcolor ='#843f8b' align='center' >Request Id</td>
	<td class=whitetext bgcolor ='#843f8b' align='center' >Emloyee Id</td>
	<td class=whitetext bgcolor ='#843f8b' align='center' >Employee Name</td>
	<td class=whitetext bgcolor ='#843f8b' align='center' >Request Date</td>
	<td class=whitetext bgcolor ='#843f8b' align='center' >From Date </td>
	<td class=whitetext bgcolor ='#843f8b' align='center' >To Date </td>
	<td class=whitetext bgcolor ='#843f8b' align='center' >Days</td>
	<%
	if(dbopr != null && !dbopr.equals("approved_leave"))
		out.println("<td class=whitetext bgcolor ='#843f8b' align='center' >Opr</td>");
	%>
    </tr>
	<%
	ArrayList leaveRequestList = new ArrayList();
	leaveRequestList = (ArrayList)session.getAttribute("leaveRequestList");
	if ( leaveRequestList != null && leaveRequestList.size() > 0 ){
		for ( int size = 1; size <= leaveRequestList.size() ; size++ ){
			LeaveRequest  leaveRequest = new LeaveRequest();
			leaveRequest = (LeaveRequest)leaveRequestList.get(size-1);
			%>
			<form name="form1" method="post">
			<tr bgcolor ='#C58DC'>
			<td align='center'><%=leaveRequest.req_id%></td>
			<td align='center'><%=leaveRequest.emp_id%></td>
			<td align='center' ><%=leaveRequest.emp_name%> </td>
			<td align='center' ><%=leaveRequest.today_date%> </td>
			<td align='center' ><%=leaveRequest.from_date%></td>
			<td align='center' ><%=leaveRequest.to_date%></td>
			<td align='center' ><%=leaveRequest.days%></td>
			<%
			if(dbopr != null && !dbopr.equals("approved_leave")){
			out.println("<td align='center' bgcolor='#843f8b'>");
			%>
		<a href='http://localhost:8084/hrms/servlet/leave_management?dbopr=approve&&req_id=<%=leaveRequest.req_id%>&&emp_id=<%=leaveRequest.emp_id%> ' class=yellowlink>Approve</a>
			</td>
			<%}%>
			</tr>
	<%
		}
	}
	else{
		out.println("Request does not exist!!!");
	}
%>
</table>
<hr width=100% color=#843F8B>
</td>
</tr>
<tr>
    <td colspan="2"><%@include file="../jsp/hrms_footer.jsp"%></td>
</tr>
</table>
</body>                                                                                                              
</html>