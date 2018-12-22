<%@ page language="java" %>
<%@ page session="true" %>
<%@ page  import="com.TimeManagement.*" %>
<%@ page  import="java.io.*" %>
<%@ page  import="java.util.*" %>
<html>
<head>
<title>www.hrsolutions.com/Attendance Summary...</title>
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
<div align=center class=boldblack>Daily Attendance Summary</div>
<hr width=100% color=#843F8B>
<table  border="0"  width=100% >
<% 

    String dbopr = "";
    dbopr = (String)session.getAttribute("dbopr");
%>	
	<tr>
	<td bgcolor ='#843F8B' align='center' class=whitetext>Emloyee Id</td>
	<td bgcolor ='#843F8B' align='center' class=whitetext>Employee Name</td>
	<td bgcolor ='#843F8B' align='center' class=whitetext>In Time</td>
	<td bgcolor ='#843F8B' align='center' class=whitetext>Out Time</td>
	<td bgcolor ='#843F8B' align='center' class=whitetext>Remark</td>
	<td bgcolor ='#843F8B' align='center' class=whitetext>Opr</td>
    </tr>
<%
    ArrayList empDailyAttendanceList = new ArrayList();
    empDailyAttendanceList = (ArrayList)session.getAttribute("empDailyAttendanceList");
	if ( empDailyAttendanceList != null && empDailyAttendanceList.size() > 0 ){
		for ( int size = 1; size <= empDailyAttendanceList.size() ; size++ ){
			EmpDailyAttendanceDBObj  empDailyAttendanceDBObj = new EmpDailyAttendanceDBObj();
			empDailyAttendanceDBObj = (EmpDailyAttendanceDBObj)empDailyAttendanceList.get(size-1);
			%>
		  <form name="form1" method="post">
		  
		  <tr bgcolor ='#C58DC'>
		  <td align='center'><%=empDailyAttendanceDBObj.emp_id%></td>
		  <td align='center' ><%=empDailyAttendanceDBObj.emp_name%> </td>
		  <td align='center' ><%=empDailyAttendanceDBObj.in_time%></td>
		  <td align='center' ><%=empDailyAttendanceDBObj.out_time%></td>
		  <td align='center' >
		  <%
		  if(empDailyAttendanceDBObj.remark!=null)
		  out.print(empDailyAttendanceDBObj.remark);
			else
		  out.print("--");
		  %>		  
		  <td align='center' bgcolor=#843F8B >
	<a href='http://localhost:8084/hrms/servlet/time_management?dbopr=edit&&emp_id=<%=empDailyAttendanceDBObj.emp_id%>&&today_date=<%=empDailyAttendanceDBObj.today_date%>' class=yellowlink>Edit</a>
		  </td >
		  </tr>
		  <%
		}
	}
	else{
		out.println("Applicant does not exist!!!");
	}
%>
</table>
</tr>
</td>
<tr>
    <td colspan="2"><%@include file="../jsp/hrms_footer.jsp"%></td>
</tr>
</table>
</body>   
</html>

