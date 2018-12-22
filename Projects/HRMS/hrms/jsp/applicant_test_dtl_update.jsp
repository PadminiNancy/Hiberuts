<%@ page language="java" %>
<%@ page session="true" %>
<%@ page  import="com.Applicant.*" %>
<%@ page  import="java.io.*" %>
<%@ page  import="java.util.*" %>
<html>
<head>
<title>www.hrsolutions.com/Test Detail Update</title>
<link rel="stylesheet" href="../css/mystyle.css" type="text/css" />
</head>
<body>
<table width="900" border="0" align="center"> 
<tr>
	<td colspan="2" ><%@ include file="../jsp/hrms_header.jsp" %></td>
</tr>
<tr>
<td width="150"  valign="top"><%@ include file="../jsp/hrms_main_menu.jsp" %></td>  
<td width ="750" valign="top">
<p>&nbsp;</p>
<div align=center class=boldblack>Update Result</div>
<hr width=500 color=#843F8B>
<table  border="0"  width=300 align=center >
<form name="form1" method="post">
<% 
	ApplicantTestDtlDBObj applicantTestDtlDBObj = new ApplicantTestDtlDBObj();
	applicantTestDtlDBObj = (ApplicantTestDtlDBObj)session.getAttribute("applicantTestDtlDBObj");
	
%>
	<input type='hidden' name='applicant_id' id='applicant_id' size ='20' value='<%=applicantTestDtlDBObj.applicant_id%>' />
	<input type='hidden' name='test_id' id='test_id' size ='20' value='<%=applicantTestDtlDBObj.test_id%>' />
	<input type='hidden' name='test_name' id='test_name' size ='20' value='<%=applicantTestDtlDBObj.test_name%>' />
	<tr><td>Status in Test</td>
	<td>
	<select name='present_status'>
	<option value=Absent >Absent</option>
	<option value=Present selected>Present</option>
	</select>
	</td></tr>
	<tr><td>Total Marks</td>
	<td>
	<input type='hidden' name='total_marks' id='total_marks' size ='20' value='"+applicantTestDtlDBObj.total_marks+"'/>
	<%=applicantTestDtlDBObj.total_marks%>
	</td></tr>
	<tr>
	<td> Marks Gained</td>
	<td><%
	if( applicantTestDtlDBObj.marks_gained != 0 )
    out.println("<input type='text' name='marks_gained' id='marks_gained' size= '5' value = '"+applicantTestDtlDBObj.marks_gained+"' />");
	else
	out.println("<input type='text' name='marks_gained' id='marks_gained' size= '5' value = '0' />");
   %>
	</td></tr>	
	<tr><td>Result</td>
	<td>
	<%
	if( applicantTestDtlDBObj.pass_fail != null )
	out.println("<input type='text' name='pass_fail' id='pass_fail' size ='5' value='"+applicantTestDtlDBObj.pass_fail+"' />");
	else{
	out.println("<SELECT name='pass_fail' ><option value=></option><option value=Pass>Pass</option><option value=Fail>Fail</option></SELECT></td>");
	}
	%>
	</td></tr>
	<tr><td colospan=2 align=center>
	<input type='hidden' name='action_submit' id='action_submit' size ='10' value='hrms_applicant_wrtn_test_dtl_upd_submit'/>
	<input type='submit' name='submit' id='submit' value='Update Detail'/>
	</td></tr>
</table></td>
</tr>
<tr>
    <td colspan="2"><%@include file="../jsp/hrms_footer.jsp"%></td>
</tr>
</table></body></html>

