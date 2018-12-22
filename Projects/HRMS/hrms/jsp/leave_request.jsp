<%@ page language="java" %>
<%@ page session="true" %>
<html>
<head>
<title>www.hrsolutions.com/Leave Request</title>
<link rel="stylesheet" href="../css/mystyle.css" type="text/css" />
</head>
<body>
<table width="900" border="0" align="center">
<tr>
	<td colspan="2"><%@ include file="../jsp/hrms_header.jsp" %></td>
</tr>
<tr>
<td width="150" ><%@ include file="../jsp/hrms_main_menu.jsp" %></td>  
<td width ="750" valign="top" align = "center">
<form name="form1" method="post">
<table  border="0" align="top" width=600>
  <tr>
  <td colspan='4' height=20 height=20 bgcolor ='#843f8b' class=whitetext align=center>Leave Application</td>
  </tr>
  <tr>
  <td >Request ID</td>
  <td align='left'><input type='text' name='req_id' id='req_id 'size ='10' value=''/> </td>
  <td >Date(YYYY-MM-DD)</td>
  <td align='left'><input type='text' name='today_date' id='today_date 'size ='10' value=''/> </td>
  </tr>
  <tr>
  <td>Employee Id</td>
  <td align='left'><input type='text' name='emp_id' id='emp_id 'size ='10' value=''/> </td>
  <td>Name</td>
  <td align='left'><input type='text' name='emp_name' id='emp_name 'size ='20' value='' /> </td>
  </tr>
  <tr>
  <td>Designation</td>
  <td align='left'><input type='text' name='level_id' id='level_id' size ='10' value=''/> </td>
  <td>Department</td>
  <td align='left'><input type='text' name='dept_id' id='dept_id' size ='10' value=''/> </td>
  </tr>   
  <tr>
  <td colspan='4' height=20 bgcolor ='#843f8b' class=whitetext align=center>Leave Detail</td>
  </tr>
  <tr>
  <td>From<br>(YYYY-MM-DD)</td>
  <td>To(YYYY-MM-DD)</td>
  <td>Days</td>
  <td>&nbsp;</td>
  </tr>
  <tr>
  <td align='left' ><input type='text' name='from_date' id='from_date' size ='10' value=''/> </td>
  <td align='left' ><input type='text' name='to_date' id='to_date' size ='10' value=''/> </td>
  <td align='left'><input type='text' name='days' id='days' size ='5' value=''/> </td>
  <td>&nbsp;</td>
  </tr>
  <tr>
  <td colspan=2>Reason For Leave(100 letters only)</td>
  <td align='left' colspan=2><textarea name='reason' id='reason' col='80' rows='4' value=''/></textarea></td>
  </tr>
  <tr>
  <td colspan=2>Type Of Leave Applied For</td>
  <td align='left' colspan=2><SELECT name='leave_type' >
  <OPTION VALUE=></OPTION> <OPTION VALUE=CL>CL</OPTION><OPTION VALUE=SL>SL</OPTION></SELECT>
  </td>
  </tr>
  <tr>
  <td colspan='4' height=20 bgcolor ='#843f8b' class=whitetext align=center>Major Activity to Be Handled During The Leave Applied</td>
  </td>
  </tr>  
  <tr>
  <td align=right>S.No.</td>
  <td>Activity Deatils</td>
  <td>Name Of the Person Responsible</td>
  <td>Details</td>
  </tr>
  <tr>
  <td align=right>1.</td>
  <td align='left'><input type='text' name='activity_1' id='activity_1' size ='20' value=''/> </td>
  <td align='left'><input type='text' name='person_1' id='person_1' size ='20' value=''/> </td>
  <td align='left'><input type='text' name='detail_1' id='detail_1' size ='20' value=''/> </td>
  </tr><tr>
  <td align=right>2.</td>
  <td align='left'><input type='text' name='activity_2' id='activity_2' size ='20' value=''/> </td>
  <td align='left'><input type='text' name='person_2' id='person_2' size ='20' value=''/> </td>
  <td align='left'><input type='text' name='detail_2' id='detail_2' size ='20' value=''/> </td>
  </tr>
  <tr>
  <td align=right>3.</td>
  <td align='left'><input type='text' name='activity_3' id='activity_3' size ='20' value=''/> </td>
  <td align='left'><input type='text' name='person_3' id='person_3' size ='20' value=''/> </td>
  <td align='left'><input type='text' name='detail_3' id='detail_3' size ='20' value=''/> </td>
  </tr>
  <tr>
  <td colspan='4' height=20 bgcolor ='#843f8b' class=whitetext align=center>Contact Details of the applicant during the leave period</td>
  </tr>
  <tr>
  <td>Address</td>
  <td align='left' colspan='2'><input type='text' name='address' id='address' size ='20' value=''/></td>
  <td></td>
  </tr>
  <tr>
  <td>Remark</td>
  <td align='left' colspan='2'><input type='text' name='remark' id='remark' size ='20' value=''/> </td>
  <td></td>
  </tr>
  <tr>
  <td align='center' colspan='4'>
  <input type='submit' name='submit' id='submit' size ='10' value='Submit'/>
  <input type='hidden' name='action_submit' id='action_submit' size ='10' value='employee_leave_req_submit'/>
  </td>
  </tr>
</table>
</td>
</tr>
<tr>
    <td colspan="2"><%@include file="../jsp/hrms_footer.jsp"%></td>
</tr>
</table>
</body>                                                                                                             
</html>