<%@ page language="java" %>
<%@ page session="true" %>
<%@ page  import="com.Applicant.*" %>
<html>
<head>
<title>www.hrsolutions.com/Edit Applicant</title>
<link rel="stylesheet" href="../css/mystyle.css" type="text/css" />
</head>
<body>
<table width="900" border="0" align="center"> 
<tr>
	<td colspan="2">
		<%@ include file="../jsp/hrms_header.jsp" %>
	</td>
</tr>
<tr>
<td width="150" valign="top"><%@ include file="../jsp/hrms_main_menu.jsp" %></td>  
<td width ="750">
<table  border="0" align="top" width=100% >
<% 
  String dbopr = "";
  dbopr = (String)session.getAttribute("dbopr");
  ApplicantDBObj applicantDBObj = new ApplicantDBObj();
  applicantDBObj = (ApplicantDBObj)session.getAttribute("applicantDBObj");
%>
<form name="form1" method="post">
	<tr>
	<td bgcolor ='#C58DC4' colspan='4' align=center height=20><b>Contact Information</b></td>
	</tr>
	<tr>
	<td width=150 >Applicant Id</td>
	<td align='left' >
	<input type='text' disabled='disabled 'name='applicant_id_dup' id='applicant_id_dup 'size ='10' value='<%=applicantDBObj.applicant_id%>'/>
	</td>
	<td>
	<input type='hidden' name='applicant_id' id='applicant_id 'size ='20' value='<%=applicantDBObj.applicant_id%>'/>
	</td>
	<td>&nbsp;</td>
	</tr>
	<tr><td>Name</td>
	<td><input type='text' name='applicant_name' id='applicant_name 'size ='40' value='<%=applicantDBObj.applicant_name%>' /></td>
	<td>&nbsp;</td><td>&nbsp;</td>
	</tr>
	<tr><td>Address1</td>
	<td><input type='text' name='address_1' id='address_1' size ='40' value='<%=applicantDBObj.address_1%>'/></td>
	<td>&nbsp;</td><td>&nbsp;</td>
	</tr>
	<tr><td>Address2</td>
	<td><input type='text' name='address_2' id='address_2' size ='40' value='<%=applicantDBObj.address_2%>'/></td>
	<td>&nbsp;</td><td>&nbsp;</td>
	</tr>
	<tr><td>Current Location</td>
	<td><input type='text' name='current_location' id='current_location' size ='10' value='<%=applicantDBObj.current_location%>'/>
	</td>
	<td>Email</td>
	<td><input type='text' name='email' id='email' size ='25' value='<%=applicantDBObj.email%>'/></td>
	</tr>
	<tr><td>Phone</td>
	<td><input type='text' name='phone' id='phone' size ='15' value='<%=applicantDBObj.phone%>'/></td>
	<td>Mobile</td><td><input type='text' name='mobile' id='mobile' size ='15' value='<%=applicantDBObj.mobile%>'/></td>
	</tr>
	<tr>
	<td bgcolor ='#C58DC4' colspan='4' align=center height=20><b>Personal Information</b></td>
	</tr>
	<tr><td colspan='4'><br>
	DOB&nbsp;&nbsp;&nbsp;<input type='text' name='dob' id='dob' size ='10' value='<%=applicantDBObj.dob%>'/>
	 (yyyy-mm-dd)&nbsp;&nbsp;&nbsp;Gender&nbsp;&nbsp;&nbsp;<input type='text' name='gender' id='gender' size ='10' value='<%=applicantDBObj.gender%>'/>
	&nbsp;&nbsp;&nbsp;Nationality&nbsp;&nbsp;&nbsp;<input type='text' name='nationality' id='nationality' size ='10' value='<%=applicantDBObj.nationality%>'/><br>.
	</td>
	<tr>
	<tr>
	<td bgcolor ='#C58DC4' colspan='4' align=center height=20><b>Professionals & Educational Details</b><td>
	</tr>
	<tr><td>Work Exp</td>
	<td><input type='text' name='work_exp' id='work_exp' size ='10' value='<%=applicantDBObj.work_exp%>'/></td>
	<td>&nbsp;</td><td>&nbsp;</td>
	</tr>
	<tr><td>Skills</td>
	<td><input type='text' name='skill' id='skill' size ='30' value='<%=applicantDBObj.skill%>'/></td>
	<td>&nbsp;</td><td>&nbsp;</td>
	</tr>
	<tr><td>Industry</td>
	<td><input type='text' name='industry' id='industry' size ='30' value='<%=applicantDBObj.industry%>'/></td>
	<td>&nbsp;</td><td>&nbsp;</td>
	</tr>
	<tr><td>Catecory</td>
	<td><input type='text' name='category' id='category' size ='10' value='<%=applicantDBObj.category%>'/></td>
	<td>&nbsp;</td><td>&nbsp;</td>
	</tr>
	<tr><td>Roles</td>
	<td><input type='text' name='roles' id='roles' size ='10' value='<%=applicantDBObj.roles%>'/></td>
	<td>&nbsp;</td><td>&nbsp;</td>
	</tr>
	<tr><td>Current employer</td>
	<td><input type='text' name='current_employer' id='current_employer' size ='30' value='<%=applicantDBObj.current_employer%>'/></td>
	<td >Current Salary </td>
	<td ><input type='text' name='current_sal' id='current_sal' size ='10' value='<%=applicantDBObj.current_sal%>'/></td>
	</tr>
	<tr><td>Highest Degree</td>
	<td><input type='text' name='highest_degree' id='highest_degree' size ='10' value='<%=applicantDBObj.highest_degree%>'/></td>
	<td colspan=2 align=right>Second Highest Degree&nbsp;&nbsp;&nbsp;&nbsp;
	<input type='text' name='second_highest_degree' id='second_highest_degree' size ='10' value='<%=applicantDBObj.second_highest_degree%>'/>
	</td>
	</tr>
	<tr>
	<td bgcolor ='#C58DC4' colspan='6' align=center height=20><b>Domain Knowledge</b></td>
	</tr>
	<tr><td>Domain</td>
	<td><input type='text' name='domain' id='domain' size ='10' value='<%=applicantDBObj.domain%>'/></td>
	<td>&nbsp;</td><td>&nbsp;</td>
	</tr>
<%   if (dbopr != null && !dbopr.equals("detail")) { %>
	 <tr>
	 <td align='center' colspan='6'>
	 <input type='submit' name='submit' id='submit' size ='10' value='Update'/> </td>
	 <input type='hidden' name='action_edit' id='action_edit' size ='10' value='hrms_applicant_edit_submit'/> </td>
	 </tr>
<% } %>
</table>
</td>
</tr>
<tr>
    <td colspan="2"><%@include file="../jsp/hrms_footer.jsp"%></td>
</tr>
</table></body></html>