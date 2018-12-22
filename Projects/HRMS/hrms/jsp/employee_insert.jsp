<%@ page language="java" %>
<%@ page session="true" %>
<html>
<head>
<title>www.hrsolutions.com/Create Profile</title>
<link rel="stylesheet" href="../css/mystyle.css" type="text/css" />
</head>
<body>
<table width="900" border="0" align="center"> 
<tr>
	<td colspan="2"><%@ include file="../jsp/hrms_header.jsp" %></td>
</tr>
<tr>
<td width="150">
<%@ include file="../jsp/hrms_main_menu.jsp" %>
</td>  
<td width ="750" valign="top" align = "center">
<p>&nbsp;</p>
Enter Profile Detail for New Employee.
<hr width=100% color=#843F8B>
<table  border="0" align="top" width=100% >
  <form name="form1" method="post">
  <tr>
	  <td>Employee Id</td>
	  <td align='left'><input type='text' name='emp_id' id='emp_id 'size ='10' value=''/></td>
	  <td>&nbsp;</td>
	  <td align='left'>&nbsp;</td>
  </tr>
	  <tr>
	  <td>First Name</td>
	  <td><input type='text' name='emp_f_name' id='emp_f_name 'size ='10' value=''/></td>
	  <td colspan=2>  
	  Middle Name&nbsp;&nbsp;&nbsp;<input type='text' name='emp_m_name' id='emp_m_name' size ='10' value=''/>
	  &nbsp;&nbsp;&nbsp;Last Name&nbsp;&nbsp;&nbsp;<input type='text' name='emp_l_name' id='emp_l_name' size ='10' value=''/>
	  </td>
  </tr>
  <tr>
	  <td>Org Id</td>
	  <td align='left'><input type='text' name='org_id' id='org_id' size ='10' value=''/></td>
	  <td>Designation</td>
	  <td align='left'><input type='text' name='level_id' id='level_id' size ='10' value=''/> </td>
  </tr>  
  <tr>
	  <td>Dept</td>
	  <td align='left'><input type='text' name='dept_id' id='dept_id' size ='10' value=''/> </td>
	  <td>DOB</td>
	  <td align='left'><input type='text' name='dob' id='dob' size ='10' value=''/> (yyyy-mm-dd)</td>
  </tr>
  <tr>
	  <td>Join Date</td>
	  <td align='left' ><input type='text' name='dojoin' id='dojoin' size ='10' value=''/> (yyyy-mm-dd)</td>
	  <td>&nbsp;</td>
	  <td>&nbsp;</td>
  </tr>
  <tr>
	  <td>Address1</td>
	  <td align='left' colspan='2'><input type='text' name='address_1' id='address_1' size ='40' value=''/> </td>
	  <td>&nbsp;</td>
	  <td>&nbsp;</td>
  </tr>
  <tr>
	  <td>Address2</td>
	  <td align='left' colspan='2'><input type='text' name='address_2' id='address_2' size ='40' value=''/> </td>
	  <td>&nbsp;</td>
	  <td>&nbsp;</td>
  </tr> 
  <tr>
	  <td>City</td>
	  <td align='left'><input type='text' name='city' id='city' size ='10' value=''/> </td>
	  <td>&nbsp;</td>
	  <td>&nbsp;</td>
  </tr>
  <tr>
	  <td>State</td>
	  <td align='left'><input type='text' name='state' id='state' size ='10' value=''/> </td>
	  <td>Nationality</td>
	  <td align='left'><input type='text' name='nationality' id='nationality' size ='10' value=''/> </td>
	  </tr>
  <tr>
	  <td align='center' colspan='4'>
	  <input type='submit' name='submit' id='submit' size ='10' value='Submit'/>
	  <input type='hidden' name='action_submit' id='action_submit' size ='10' value='hrms_employee_insert_submit'/>
	  </td>
  </tr>
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