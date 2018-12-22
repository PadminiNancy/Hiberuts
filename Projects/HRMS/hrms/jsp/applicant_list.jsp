<%@ page language="java" %>
<%@ page session="true" %>
<%@ page  import="com.Applicant.*" %>
<%@ page  import="java.io.*" %>
<%@ page  import="java.util.*" %>
<html>
<head>
<title>www.hrsolutions.com/Applicant List</title>
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
<div align=center class=boldblack>List of Applicants</div>
<hr bgcolor="#843f8b">
<table  border="0"  width=100% >
<% 
    String dbopr = "";
    dbopr = (String)session.getAttribute("dbopr");
%>
	<tr class="whitetext" height=20>
	<td bgcolor ='#843F8B' align='center' >Applicant Id</td>
	<td bgcolor ='#843F8B' align='center' >Name</td>
	<td bgcolor ='#843F8B' align='center' >Work Exp</td>
	<td bgcolor ='#843F8B' align='center' colspan='2'>Skills</td>
	<td bgcolor ='#843F8B' align='center' >Highest Degree</td>
	<%
    if( dbopr != null && (dbopr.equals("call_for_written") || dbopr.equals("call") || dbopr.equals("remove")) ){
	%>
		<td bgcolor ='#843F8B' align='center' >Select</td>
		<td bgcolor ='#843F8B' align='center' >Detail</td>
		<%
	}
	else{ %>
		<td bgcolor ='#843F8B' align='center' >Edit</td>
		<td bgcolor ='#843F8B' align='center' >Delete</td>
		<td bgcolor ='#843F8B' align='center' >Detail</td>
	<% }%>
	</tr>
	<%
	ArrayList ApplicantList = new ArrayList();
	ApplicantList = (ArrayList)session.getAttribute("ApplicantList");
	ArrayList applicantTestList =  new ArrayList();
	applicantTestList = (ArrayList)session.getAttribute("applicantTestList");
	if ( ApplicantList != null && ApplicantList.size() > 0 ){
		for ( int size = 1; size <= ApplicantList.size() ; size++ ){
			ApplicantDBObj applicantDBObj = new ApplicantDBObj();
			applicantDBObj = (ApplicantDBObj)ApplicantList.get(size-1);
		%>			 
		<form name="form1" method="post">
			<tr bgcolor ='#C58DC4' height=18>
			<td align='center'  ><%=applicantDBObj.applicant_id%></td>
			<td align='left'  ><%=applicantDBObj.applicant_name%> </td>
			<td align='center' ><%=applicantDBObj.work_exp%></td>
			<td align='left' colspan='2' ><%=applicantDBObj.skill%></td>
			<td align='center' ><%=applicantDBObj.highest_degree%></td>
			<%     
			if( dbopr != null && ( dbopr.equals("call_for_written") || dbopr.equals("call") || dbopr.equals("remove") )){
			%>
			<td align='center' bgcolor="#843F8B">
			<a href='http://localhost:8084/hrms/servlet/applicant_test_dtl?dbopr=call&&applicant_id=<%=applicantDBObj.applicant_id%>' class=yellowlink>Select</a>
			</td >
			<td align='center' bgcolor="#843F8B">
			<a href='http://localhost:8084/hrms/servlet/hrms_applicant?dbopr=detail&&applicant_id=<%=applicantDBObj.applicant_id%>' class=yellowlink>Detail </a>
			</td >
			<%
			}
			else{
			%>
			<td align='center' bgcolor="#843F8B">
			<a href='http://localhost:8084/hrms/servlet/hrms_applicant?dbopr=edit&&applicant_id=<%=applicantDBObj.applicant_id%>' class="yellowlink">Edit </a>
			</td >
			<td align='center' bgcolor="#843F8B">
			<a href='http://localhost:8084/hrms/servlet/hrms_applicant?dbopr=delete&&applicant_id=<%=applicantDBObj.applicant_id%>' class="yellowlink">Delete </a>
			</td >
			<td align='center' bgcolor="#843F8B">
			<a href='http://localhost:8084/hrms/servlet/hrms_applicant?dbopr=detail&&applicant_id=<%=applicantDBObj.applicant_id%>' class="yellowlink">Detail </a>
			</td >
			<%	  } %>
		</tr>
		<% }
		if( applicantTestList != null && applicantTestList.size() > 0){
		%>		
		<th bgcolor ='#843F8B' align='center' colspan='8'><font color=white>The Selected Applicant</font></th>
		<%		  
			for ( int size = 1; size <= applicantTestList.size() ; size++ ){
				ApplicantDBObj applicantDBObj = new ApplicantDBObj();
				applicantDBObj = (ApplicantDBObj)applicantTestList.get(size-1);
		%>
		<tr bgcolor ='#C58DC4'>
		<td align='center'  ><%=applicantDBObj.applicant_id%></td>
		<td align='left'  ><%=applicantDBObj.applicant_name%></td>
		<td align='center' ><%=applicantDBObj.work_exp%></td>
		<td align='left' colspan='2' ><%=applicantDBObj.skill%></td>
		<td align='center' ><%=applicantDBObj.highest_degree%></td>
		<%
	if( dbopr != null && ( dbopr.equals("call_for_written") || dbopr.equals("call") || dbopr.equals("remove") )){
	%>
	<td align='center' colspan='2' bgcolor="#843F8B">
	<a href='http://localhost:8084/hrms/servlet/applicant_test_dtl?dbopr=remove&&applicant_id=<%=applicantDBObj.applicant_id%>' class=yellowlink>Remove </a>
	</td >
	<% }%>
	</tr>
	<% }%>
<% }         
  	  if( dbopr != null && ( dbopr.equals("call") || dbopr.equals("remove") || ( applicantTestList != null && applicantTestList.size() > 0) )){
%>	  <tr>
	  <td align='center' colspan='8'><input type='submit' name='submit' id='submit' size ='10' value='Enter Test Detail'/> </td>
	  <input type='hidden' name='action_select' id='action_select' size ='10' value='applicant_call_for_wrtn_test_submit'/>
	  </tr>
<%	  }
	  
  }
  else{
	 out.print("Applicant does not exist!!!");
  } %>
</table>
</td>
</tr>
<tr>
    <td colspan="2"><%@include file="../jsp/hrms_footer.jsp"%></td>
</tr>
</table></body></html>