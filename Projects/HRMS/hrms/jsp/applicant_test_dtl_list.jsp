<%@ page language="java" %>
<%@ page session="true" %>
<%@ page  import="com.Applicant.*" %>
<%@ page  import="java.io.*" %>
<%@ page  import="java.util.*" %>
<html>
<head>
<title>www.hrsolutions.com/Applicant Test Detail List</title>
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
<td width ="750" valign="top">
<table  border="0"  width=100% >
<% 
	String dbopr = "";
    dbopr = (String)session.getAttribute("dbopr");
%>
	<tr>
	<td class=whitetext bgcolor ='#843F8B' align='center' >Test Id</th>
	<td class=whitetext bgcolor ='#843F8B' align='center' >Test Name</th>
	<td class=whitetext bgcolor ='#843F8B' align='center' >Applicant Id</th>
	<td class=whitetext bgcolor ='#843F8B' align='center' colspan='2' >Applicant Name</th>
	<td class=whitetext bgcolor ='#843F8B' align='center' >Test Date</th>
	<td class=whitetext bgcolor ='#843F8B' align='center' >Test Time</th>
	<td class=whitetext bgcolor ='#843F8B' align='center' >Present Status</th>
	<td class=whitetext bgcolor ='#843F8B' align='center' >Total Marks</th>
	<td class=whitetext bgcolor ='#843F8B' align='center' >Marks Gained</th>
	<td class=whitetext bgcolor ='#843F8B' align='center' >Pass Fail</th>
    <td class=whitetext bgcolor ='#843F8B' align='center' >--</th>    
	</tr>
<%
	ArrayList ApplicantTestDtlList = new ArrayList();
	ApplicantTestDtlList = (ArrayList)session.getAttribute("ApplicantTestDtlList");
	ArrayList selectApplicantTechList = new ArrayList();
	selectApplicantTechList = (ArrayList)session.getAttribute("selectApplicantTechList");
	if ( ApplicantTestDtlList != null && ApplicantTestDtlList.size() > 0 ){
		for ( int size = 1; size <= ApplicantTestDtlList.size() ; size++ ){
			ApplicantTestDtlDBObj applicantTestDtlDBObj = new ApplicantTestDtlDBObj();
			applicantTestDtlDBObj = (ApplicantTestDtlDBObj)ApplicantTestDtlList.get(size-1);
			%>
<form name="form1" method="post">		  
<tr bgcolor ='#C58DC'>

<td align='center'  ><%=applicantTestDtlDBObj.test_id%>
<input type='hidden' name='test_id' id='test_id' size ='20' value='<%=applicantTestDtlDBObj.test_id%>'/>
</td>

<td align='left'  ><%=applicantTestDtlDBObj.test_name%>
<input type='hidden' name='test_name' id='test_name' size ='20' value='<%=applicantTestDtlDBObj.test_name%>'/>
</td>

<td align='center'  ><%=applicantTestDtlDBObj.applicant_id%>
<input type='hidden' name='aplicant_id' id='aplicant_id' size ='20' value='<%=applicantTestDtlDBObj.applicant_id%>'/>
</td>

<td align='left' colspan='2' ><%=applicantTestDtlDBObj.applicant_name%>
<input type='hidden' name='applicant_name' id='applicant_name' size ='20' value='<%=applicantTestDtlDBObj.applicant_name%>'/>
</td>

<td align='center' ><%=applicantTestDtlDBObj.test_date%>
<input type='hidden' name='test_date' id='test_date' size ='20' value='<%=applicantTestDtlDBObj.test_date%>'/></td>

<td align='center' ><%=applicantTestDtlDBObj.test_time%>
<input type='hidden' name='test_time' id='test_time' size ='20' value='<%=applicantTestDtlDBObj.test_time%>'/>
</td>
		<%
         if( applicantTestDtlDBObj.present_status != null ) 
		 out.println("<td align='center'><input type='text' disabled='disabled' name='present_status' id='present_status 'size ='5' value='"+applicantTestDtlDBObj.present_status+"' /> </td>");
         else{
		 out.println("<td align='center'  ><input type='text' disabled='disabled' name='present_status' id='present_status 'size ='5' value='' /></td>");
		 }
		 %>
<td align='center'><%=applicantTestDtlDBObj.total_marks%>
<input type='hidden' name='total_marks' id='total_marks' size ='20' value='<%=applicantTestDtlDBObj.total_marks%>'/>
</td>
<td align='center'>
<input type='text' disabled='disabled' name='marks_gained' id='marks_gained' size= '5' value = '<%=applicantTestDtlDBObj.marks_gained%>' />
</td>
	<%
	if( applicantTestDtlDBObj.pass_fail != null )
	out.println("<td align='center'><input type='text' disabled='disabled' name='pass_fail' id='pass_fail 'size ='5' value='"+applicantTestDtlDBObj.pass_fail+"' /> </td>");
	else{
	out.println("<td align='center'><input type='text' disabled='disabled' name='pass_fail' id='pass_fail 'size ='5' value='' /> </td>");
	}

	if( dbopr != null && ( dbopr.equals("shortlist_after_wrtn") || dbopr.equals("applicant_call_for_tech") || dbopr.equals("delete")) ){
	  out.println("<td align='center' bgcolor ='#843F8B'>");
	  out.println("<a href='http://localhost:8084/hrms/servlet/applicant_test_dtl?dbopr=applicant_call_for_tech&&applicant_id="+applicantTestDtlDBObj.applicant_id+"' class=yellowlink>Select For Tech </a>");
	  out.println("</td >");
	  
	}
	else
	if( dbopr != null && ( dbopr.equals("shortlist_after_tech") || dbopr.equals("applicant_call_for_hr") || dbopr.equals("discard")) )
	{
	  out.println("<td align='center' bgcolor ='#843F8B'>");
	  out.println("<a href='http://localhost:8084/hrms/servlet/applicant_test_dtl?dbopr=applicant_call_for_hr&&applicant_id="+applicantTestDtlDBObj.applicant_id+"' class=yellowlink>Select For HR </a>");
	  out.println("</td >");
	  
	}
	else
	if( dbopr != null && ( dbopr.equals("shortlist_after_hr") || dbopr.equals("applicant_call_for_final") || dbopr.equals("discard_for_final")) )
	{
	  out.println("<td align='center' bgcolor ='#843F8B'>");
	  out.println("<a href='http://localhost:8084/hrms/servlet/applicant_test_dtl?dbopr=applicant_call_for_final&&applicant_id="+applicantTestDtlDBObj.applicant_id+"' class=yellowlink>Select For FInal </a>");
	  out.println("</td >");
	  
	}
	else  
	if( dbopr != null && ( dbopr.equals("upd_wrtn_performance") || dbopr.equals("upd_wrtn_record")) )
	{
	  out.println("<td align='center' bgcolor ='#843F8B'>");
	  out.println("<a href='http://localhost:8084/hrms/servlet/applicant_test_dtl?dbopr=upd_wrtn_record&&applicantid="+applicantTestDtlDBObj.applicant_id+" ' class=yellowlink>Edit </a>");
	  out.println("</td >");
	}
	else  
	if( dbopr != null && ( dbopr.equals("upd_tech_performance") || dbopr.equals("upd_tech_record")) )
	{
	  out.println("<td align='center' bgcolor ='#843F8B'>");
	  out.println("<a href='http://localhost:8084/hrms/servlet/applicant_test_dtl?dbopr=upd_tech_record&&applicantid="+applicantTestDtlDBObj.applicant_id+" ' class=yellowlink>Edit </a>");
	  out.println("</td >");
	}
	else  
	if( dbopr != null && ( dbopr.equals("upd_hr_performance") || dbopr.equals("upd_hr_record")) )
	{
	  out.println("<td align='center' bgcolor ='#843F8B'>");
	  out.println("<a href='http://localhost:8084/hrms/servlet/applicant_test_dtl?dbopr=upd_hr_record&&applicantid="+applicantTestDtlDBObj.applicant_id+" ' class=yellowlink>Edit </a>");
	  out.println("</td >");
	}	     
  }
} 
else{
	out.println("Applicant does not exist!!!");
}
     
if( selectApplicantTechList != null && selectApplicantTechList.size() > 0)
{
out.println("<tr>");
out.println("<td class=whitetext bgcolor ='#843F8B' align='center' colspan='13'>The Selected Applicant</th>");
out.println("</tr>");
for ( int size = 1; size <= selectApplicantTechList.size() ; size++ ){

	ApplicantTestDtlDBObj applicantTestDtlDBObj = new ApplicantTestDtlDBObj();
	applicantTestDtlDBObj = (ApplicantTestDtlDBObj)selectApplicantTechList.get(size-1);
			  
	out.println("<tr bgcolor ='dfdfd'>");
	out.println("<td align='center'  >"+applicantTestDtlDBObj.test_id+"</td>");
	out.println("<td align='center'  >"+applicantTestDtlDBObj.test_name+" </td>");
	out.println("<td align='center' >"+applicantTestDtlDBObj.applicant_id+"</td>");	  
	out.println("<td align='center' colspan='2' >"+applicantTestDtlDBObj.applicant_name+"</td>");
	out.println("<td align='center' >"+applicantTestDtlDBObj.test_date+"</td>");
	out.println("<td align='center' >"+applicantTestDtlDBObj.test_time+"</td>");
	out.println("<td align='center' >"+applicantTestDtlDBObj.present_status+"</td>");
	out.println("<td align='center' >"+applicantTestDtlDBObj.total_marks+"</td>");
	out.println("<td align='center' >"+applicantTestDtlDBObj.marks_gained+"</td>");
	out.println("<td align='center' >"+applicantTestDtlDBObj.pass_fail+"</td>");

if( dbopr != null && ( dbopr.equals("shortlist_after_wrtn") || dbopr.equals("shortlist_after_tech") || dbopr.equals("applicant_call_for_tech") || dbopr.equals("delete") )){
	out.println("<td align='center' colspan='2' bgcolor ='#843F8B'>");
	out.println("<a href='http://localhost:8084/hrms/servlet/applicant_test_dtl?dbopr=delete&&applicant_id="+applicantTestDtlDBObj.applicant_id+" ' class=yellowlink>Delete</a>");
	out.println("</td >");
}
else
if( dbopr != null && ( dbopr.equals("shortlist_after_tech") || dbopr.equals("applicant_call_for_hr") || dbopr.equals("discard") )){
	out.println("<td align='center' colspan='2' bgcolor ='#843F8B'>");
	out.println("<a href='http://localhost:8084/hrms/servlet/applicant_test_dtl?dbopr=discard&&applicant_id="+applicantTestDtlDBObj.applicant_id+" ' class=yellowlink>Discard</a>");
	out.println("</td >");
}
else
if( dbopr != null && ( dbopr.equals("shortlist_after_hr") || dbopr.equals("discard_for_final") || dbopr.equals("applicant_call_for_final")  )){
	out.println("<td align='center' colspan='2' bgcolor ='#843F8B'>");
	out.println("<a href='http://localhost:8084/hrms/servlet/applicant_test_dtl?dbopr=discard_for_final&&applicant_id="+applicantTestDtlDBObj.applicant_id+" ' class=yellowlink>Remove</a>");
	out.println("</td >");
	}
	out.println("</tr>");
}

if( dbopr != null && (  dbopr.equals("delete") || dbopr.equals("applicant_call_for_tech") )){
	out.println("<tr>");
	out.println("<td align='center' colspan='13'><input type='submit' name='submit' id='submit' size ='10' value='Call For Tech'/> </td>");
	out.println("<input type='hidden' name='action_submit' id='action_submit' size ='10' value='applicant_call_tech_dtl_submit'/> ");
	out.println("</tr>");
}
else
if( dbopr != null && (  dbopr.equals("discard") || dbopr.equals("applicant_call_for_hr") )){
	out.println("<tr>");
	out.println("<td align='center' colspan='13'><input type='submit' name='submit' id='submit' size ='10' value='Call For HR'/> </td>");
	out.println("<input type='hidden' name='action_submit' id='action_submit' size ='10' value='applicant_call_hr_dtl_submit'/> ");
	out.println("</tr>");
}
else
if( dbopr != null && (  dbopr.equals("discard_for_final") || dbopr.equals("applicant_call_for_final") )){
	out.println("<tr>");
	out.println("<td align='center' colspan='13'><input type='submit' name='submit' id='submit' size ='10' value='Select Final'/> </td>");
	out.println("<input type='hidden' name='action_submit' id='action_submit' size ='10' value='applicant_select_for_final_submit'/> ");
	out.println("</tr>");
}
}
out.println("</tr>");      
%>
</table>
</td>
</tr>
<tr>
    <td colspan="2"><%@include file="../jsp/hrms_footer.jsp"%></td>
</tr>
</table>
</body>    
</html>

