<%@ page language="java" %>
<%@ page session="true" %>
<html>
<head>
<title>www.hrsolutions.com/Salary</title>
<link rel="stylesheet" href="../css/mystyle.css" type="text/css" />
</head>
<body>
<table width="900" border="0" align="center"> 
<tr>
	<td colspan="2"><%@ include file="../jsp/hrms_header.jsp" %></td>
</tr>
<tr>
<td width="150"><%@ include file="../jsp/hrms_main_menu.jsp" %></td>  
<td width ="750" valign="top" align = "center">
<p>&nbsp;</p>
<div align=center class=boldblack>Calculate Salary</div>
<hr width=400 color=#843F8B>
<table  border="0" align="top" width=200 align="right">
  <form name="form1" method="post">
  <tr><td>Employee Id</td>
  <td align='left'><input type='text' name='emp_id' id='emp_id 'size ='10' value=''/></td></tr>
  <tr><td>Year</td>
  <td align='left'><select name='year' >
  <option value=></option>
  <%
	for(int i=2007;i>2000;i--)
	out.println("<option value="+i+">"+i+"</option>");
  %>
  </select></td></tr>
  <tr><td>Month</td>
  <td align='left'><SELECT name='month'>
  <option value=></option>
   <%
	for(int i=12;i>0;i--)
	out.println("<option value="+i+">"+i+"</option>");
  %>
  </SELECT></td></tr>
  <tr><td align='center'colspan='2' >
  <input type='submit' name='submit' id='submit' size ='10' value='Calc'/> 
  <input type='hidden' name='action_submit' id='action_submit' size ='10' value='salary_calc_submit'/>
  </td></tr>
  </table><hr width=400 color=#843F8B>
</td>
</tr>
<tr>
    <td colspan="2"><%@include file="../jsp/hrms_footer.jsp"%></td>
</tr>
</table></body></html>