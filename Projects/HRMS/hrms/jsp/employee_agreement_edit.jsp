<%@ page language="java" %>
<%@ page session="true" %>
<%@ page  import="com.Payroll.*" %>
<html>
<head>
<title>www.hrsolutions.com/Employee Agreeement Edit</title>
<link rel="stylesheet" href="../css/mystyle.css" type="text/css" />
</head>
<body>
<table width="900" border="0" align="center"> 
<tr>
	<td colspan="2"><%@ include file="../jsp/hrms_header.jsp" %></td>
</tr>
<tr>
<td width="130"><%@ include file="../jsp/hrms_main_menu.jsp" %></td>  
<td width ="730" valign="top" align = "center">
<table  border="0" align="top" width=100%>
<% 

  EmployeeAgreement employeeAgreement = new EmployeeAgreement();
  employeeAgreement = (EmployeeAgreement)session.getAttribute("employeeAgreement");
%>
	<form name="form1" method="post">
	<p>&nbsp;</p>
	<table align=center>
	<tr>
	<td colspan=4 bgcolor=843f8b class=whitetext align=center height=20><b>Employee Agreement Salary Head</b></td>	
	</tr>
	<tr><td>Employee Id</td>
	<td><input type='text' name='emp_id' id='emp_id 'size ='10' value='<%=employeeAgreement.emp_id%>'/></td>
	<td>Name</td>
	<td><input type='text' name='emp_name' id='emp_name 'size ='30' value='<%=employeeAgreement.emp_name%>' /></td>
	</tr>
	<tr><td>Designation</td>
	<td><input type='text' name='level_id' id='level_id' size ='10' value='<%=employeeAgreement.level_id%>'/></td>
	<td></td><td></td></tr>
	<tr>
	<td>Allowance Name</td>
	<td>
	<input type='hidden' name='allowance_name' id='allowance_name' size ='5' value='<%=employeeAgreement.allowance_name%>'/>
	<input type='text' disabled='disabled' name='allowance_name_dup' id='allowance_name_dup' size ='5' value='<%=employeeAgreement.allowance_name%>'/>
	</td>
	<td>Allowance Type</td>
	<td><SELECT name='allowance_type' > <OPTION VALUE=></OPTION> <OPTION VALUE=Income>Income</OPTION><OPTION VALUE=Deduction>Deduction</OPTION></SELECT></td>
	</tr>
	<tr>
	<td>Amount</td>
	<td><input type='text' name='amt' id='amt' size ='5' value='<%=employeeAgreement.amt%>'/></td>
	<td>Taxable</td>
	<td><SELECT name='taxable' > <OPTION VALUE=></OPTION> <OPTION VALUE=Yes>Yes</OPTION><OPTION VALUE=No>No</OPTION></SELECT></td>
	</tr>
	<tr>
	<td>Percentage</td>
	<td><input type='text' name='percentage' id='percentage' size ='5' value='<%=employeeAgreement.percentage%>'/></td>
	<td>Date</td>
	<td><input type='text' name='agreement_date' id='agreement_date' size ='10' value='<%=employeeAgreement.agreement_date%>'/> (yyyy-mm-dd)</td>
	</tr>
	<tr>
	<td colspan=4><input type='submit' name='submit' id='submit' size ='10' value='Edit'/>
	<input type='hidden' name='action_submit' id='action_submit' size ='10' value='employee_sal_head_edit_submit'/> </td>
	</tr>
	</table>
</td></tr>
<tr>
    <td colspan="2"><%@include file="../jsp/hrms_footer.jsp"%></td>
</tr>
</table></body></html>