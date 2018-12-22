<%@ page language="java" %>
<%@ page session="true" %>
<%@ page  import="com.Employee.*" %>
<%@ page  import="com.Payroll.*" %>
<%@ page  import="java.util.*" %>
<html>
<head>
<title>www.hrsolutions.com/Salary Slip</title>
<link rel="stylesheet" href="../css/mystyle.css" type="text/css" />
</head>
<body>
<table width="900" border="0" align="center"> 
<tr>
	<td colspan="2" ><%@ include file="../jsp/hrms_header.jsp" %></td>
</tr>
<tr>
<td width="150" valign="top"><%@ include file="../jsp/hrms_main_menu.jsp" %></td>  
<td width ="750" valign="top">
<table  border="0"  width=500 align=center>
<% 
  String dbopr = "";
  dbopr = (String)session.getAttribute("dbopr");
  EmployeeDBObj employeeDBObj = new EmployeeDBObj();
  employeeDBObj = (EmployeeDBObj)session.getAttribute("employeeDBObj");
  int totalAttendance  = 0;
  int totalLeave      = 0;
  int year  = 0;
  int month = 0;
  totalAttendance = Integer.parseInt((String)session.getAttribute("totalAttendance"));
  totalLeave = Integer.parseInt((String)session.getAttribute("totalLeave"));
  year = Integer.parseInt((String)session.getAttribute("year"));
  month = Integer.parseInt((String)session.getAttribute("month"));
%>
<p>&nbsp;</p>
<hr bgcolor="#843f8b" width=500>
  <form name="form1" method="post">
	<tr>
	<td colspan=4 align=center bgcolor="#843f8b" height=20 class=whitetext>Salary Slip For <%=month%>/<%=year%></td>
	</tr>
	<tr><td>Employee Id</td>
	<td><%=employeeDBObj.emp_id%>
	<input type='hidden' name='emp_id' id='emp_id 'size ='10' value='<%=employeeDBObj.emp_id%>'/></td>
	</tr>
	<tr><td>Employee Name</td>
	<td>
	<%=employeeDBObj.emp_f_name%> 
	<%
	if(!"null".equals(employeeDBObj.emp_m_name))
	out.print(employeeDBObj.emp_m_name);
	%>
	<%=employeeDBObj.emp_l_name%>
	<input type='hidden' name='emp_name' id='emp_name' size ='10' value='<%=employeeDBObj.emp_f_name%> 
	<%=employeeDBObj.emp_m_name%> <%=employeeDBObj.emp_l_name%>'/></td>
	</tr>
	<tr><td>Department</td><td><%=employeeDBObj.dept_id%></td></tr> 
	<tr><td>Desination</td><td>
	<%=employeeDBObj.level_id%>
	<input type='hidden' name='level_id' id='level_id 'size ='10' value='<%=employeeDBObj.level_id%>'/></td>
	</tr>
	</table>
<%
	ArrayList empSalList  = new ArrayList();
	empSalList = (ArrayList)session.getAttribute("empSalList");
	if ( empSalList != null && empSalList.size() > 0){  
%>
		<table align=center width=500>
		<tr bgcolor ='#843f8b' align=center>
		<td class=whitetext>Allowance Name</td>
		<td class=whitetext>Amount(Rs.)</td>
		</tr>
		<%
		double totalSalary = 0;
		double taxAmt  = 0 ;
		for ( int rec = 1; rec <= empSalList.size(); rec++ ){
			EmpSal empSal = new EmpSal();
			empSal = (EmpSal)empSalList.get(rec-1);
			
			out.println("<tr bgcolor ='#C58DC'>");
			out.println("<td align='center' >"+empSal.allowance_name+"</td>");
			if ( empSal.allowance_type.equals("Income") ){
				out.println("<td align='center' >(+)"+empSal.amt+"</td>");
				totalSalary	=   totalSalary + empSal.amt;
			}
			else
			if ( empSal.allowance_type.equals("Deduction") ){
				out.println("<td align='center' >(-)"+empSal.amt+"</td>");
			}
			if ( empSal.taxable.equals("Yes") ){
				taxAmt = taxAmt + (empSal.amt * empSal.percentage/100);
			}
			out.println("</tr>");
		}
		%>
	  <tr>
		<td class=boldblack>Total Present: <%=totalAttendance%></td>
		<td class=boldblack>Total Leave: <%=totalLeave%></td>
	  </tr>
	<tr>
		<td class=boldblack>Salary: <%=totalSalary%></td>
		<td class=boldblack>Tax: <%=taxAmt%></td>
	 </tr>
	 </table>
	<%}	  
  String lErrorMsg="";
  lErrorMsg = (String)session.getAttribute("lErrorMsg");
  out.println("<div align=center class=boldred"+lErrorMsg+"</div>");
  %>
  </table>
</td></tr>
<tr>
    <td colspan="2">
	<%@include file="../jsp/hrms_footer.jsp"%>
	</td>
</tr></table></body></html>