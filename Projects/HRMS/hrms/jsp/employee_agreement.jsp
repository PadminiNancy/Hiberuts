<%@ page language="java" %>
<%@ page session="true" %>
<%@ page  import="com.Employee.*" %>
<%@ page  import="com.Payroll.*" %>
<%@ page  import="java.util.*" %>
<html>
<head>
<title>www.hrsolutions.com/Employee Agreement</title>
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
<p>&nbsp;</p>
<table  border="0" width=100% align=center>
<%
	String dbopr = "";
	dbopr = (String)session.getAttribute("dbopr");
	EmployeeDBObj employeeDBObj = new EmployeeDBObj();
	employeeDBObj = (EmployeeDBObj)session.getAttribute("employeeDBObj");
%>

	
	<tr>
	<td bgcolor ='#843F8B' class=whitetext align=center height=20><b>Salary Heads Distribution</b></td>
	</tr>
	<form name="form1" method="post">
<%
	if(dbopr != null && ( dbopr.equals("employee_agreement") || dbopr.equals("edit_head") || dbopr.equals("delete_head") ) ){
	%>
	<tr>
	<td>
	<table  border='0'width=400 align=center>
	<tr><td >Employee Id</td>
	<td align='left' >
	<%=employeeDBObj.emp_id%>	
	<input type='hidden' name='emp_id' id='emp_id 'size ='10' value='<%=employeeDBObj.emp_id%>'/>
	</td></tr>
	<tr><td>Employee Name</td>
	<td align='left'>
	<input type='hidden' name='emp_name' id='emp_name' size ='10' value='<%=employeeDBObj.emp_f_name%> <%=employeeDBObj.emp_m_name%> <%=employeeDBObj.emp_l_name%>'/>
	<%=employeeDBObj.emp_f_name%> <%=employeeDBObj.emp_m_name%> <%=employeeDBObj.emp_l_name%>
	</td></tr>
	<tr><td>Department</td>
	<td align='left'><%=employeeDBObj.dept_id%></td></tr>
	<tr><td>Designation</td>
	<td align='left'><%=employeeDBObj.level_id%>
	<input type='hidden' name='level_id' id='level_id 'size ='10' value='<%=employeeDBObj.level_id%>'/>
	</td></tr>
	<tr><td>Agreement Date</td>
	<td align='left'>
	<input type='text' name='agreement_date' id='agreement_date' size ='10' value=''/> (yyyy-mm-dd)</td></tr>
	<tr><td colspan=2>
	<table border=0>
		<tr>
		<td>Allowance Name</td>
		<td align='left'>
		<SELECT name='allowance_name' >
		<OPTION VALUE=></OPTION>
		<OPTION VALUE=Basic>Basic</OPTION>
		<OPTION VALUE=HRA>HRA</OPTION>
		<OPTION VALUE=PF>PF</OPTION>
		<OPTION VALUE=SPLAL>SPLAL</OPTION>
		<OPTION VALUE=DA>DA</OPTION>
		</SELECT>
		</td>
		<td>Allownce Type</td>
		<td align='left'>
		<SELECT name='allowance_type' >
		<OPTION VALUE=></OPTION> <OPTION VALUE=Income>Income</OPTION><OPTION VALUE=Deduction>Deduction</OPTION>
		</SELECT>
		</td>
		</tr>
		<tr>
		<td>Amount</td>
		<td align='left'><input type='text' name='amt' id='amt' size ='10' value=''/></td>
		<td>Taxable</td>
		<td align='left'>
		<SELECT name='taxable' >
		<OPTION VALUE=></OPTION> <OPTION VALUE=Yes>Yes</OPTION><OPTION VALUE=No>No</OPTION>
		</SELECT>
		</td>
		</tr> 
		<tr> 
		<td>Percentage</td>
		<td align='left'><input type='text' name='percentage' id='percentage' size ='10' value=''/></td>
		<td></td>
		<td></td>
		</tr>
	</table>
	</td>
	</tr>
	<tr>
		<td>
		<input type='submit' name='submit' id='submit' size ='10' value='Submit Detail'/>
		<input type='hidden' name='action_submit' id='action_submit' size ='10' value='emp_agreement_dtl_submit'/>
		</td>
	</tr>
	</table>
	</td></tr><tr><td>
<%
}
	ArrayList employeeAgreementList  = new ArrayList();
	employeeAgreementList = (ArrayList)session.getAttribute("employeeAgreementList");
	if ( employeeAgreementList != null && employeeAgreementList.size() > 0){  
	
	out.println("<table border=0 align=center>");
	out.println("<tr bgcolor='#843F8B'>");
	if(dbopr != null && !( dbopr.equals("employee_agreement") || dbopr.equals("edit_head") || dbopr.equals("delete_head")) ){
		 out.println("<td class=whitetext align=center>Employee Id</td>");
	     out.println("<td class=whitetext >Employee Name</td>");
    }
%>
	  <td class=whitetext align=center>Allowance Type</td>
	  <td class=whitetext align=center>Allowance Name</td>
	  <td class=whitetext align=center>Amount</td>
	  <td class=whitetext align=center>Taxable</td>
	  <td class=whitetext align=center>Percentage</td>
	  <td class=whitetext align=center>Opr</td>
	  <td class=whitetext align=center>Opr</td>
	  </tr>
<%      
	  double totalSalary = 0;
	  for ( int rec = 1; rec <= employeeAgreementList.size(); rec++ ){
		  EmployeeAgreement employeeAgreement = new EmployeeAgreement();
		  employeeAgreement = (EmployeeAgreement)employeeAgreementList.get(rec-1);
		  
		  out.println("<tr bgcolor ='#C58DC'>");
		  if(dbopr != null && !( dbopr.equals("employee_agreement") || dbopr.equals("edit_head") || dbopr.equals("delete_head") ) ){
			out.println("<td align='center'>"+employeeAgreement.emp_id+"</td>");
			out.println("<td align='center'>"+employeeAgreement.emp_name+"</td>");
			}
%>
	<td align='center' ><%=employeeAgreement.allowance_name%> </td>
	<td align='center' ><%=employeeAgreement.allowance_type%> </td>
	<td align='center' ><%=employeeAgreement.amt%></td>
	<%
	totalSalary	=   totalSalary + employeeAgreement.amt;
	%>
	<td align='center' ><%=employeeAgreement.taxable%></td>
	<td align='center' ><%=employeeAgreement.percentage%></td>
	<td align='center' bgcolor="#843f8b">
	<a href='http://localhost:8084/hrms/servlet/hrms_payroll?dbopr=edit_head&&emp_id=<%=employeeAgreement.emp_id%>&&allowance_name=<%=employeeAgreement.allowance_name%>' class=yellowlink>Edit</a>
	</td >
	<td align='center' bgcolor="#843f8b">
	<a href='http://localhost:8084/hrms/servlet/hrms_payroll?dbopr=delete_head&&emp_id=<%=employeeAgreement.emp_id%>&&allowance_name=<%=employeeAgreement.allowance_name%>' class=yellowlink>Delete</a>
	</td >
	</tr>
	<% } %>
	</table>
	</td>
	</tr>
	<tr>
	<td align=center class=boldblack>Total Salary:<%=totalSalary%></td>
	</tr>
<% } %>	      
	</table>
	<hr bgcolor="#843f8b">
  </td>
</tr>
<tr>
    <td colspan="2"><%@include file="../jsp/hrms_footer.jsp"%></td>
</tr>
</table>
</body>   
</html>

