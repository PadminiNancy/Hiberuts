<%@ page language="java" %>
<%@ page session="true" %>
<%@ page  import="com.Applicant.*" %>
<%@ page  import="java.io.*" %>
<%@ page  import="java.util.*" %>
<html>
<head>
<title>www.hrsolutions.com/Selected Candidates</title>
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
<p>&nbsp;</p>
<div align=center class=boldblack>List of Selected Candidates to be Appointed.</div>
<hr width=400 color=#843F8B>
<table  border="0"  width=100% >
<% 
    String dbopr = "";
    dbopr = (String)session.getAttribute("dbopr");
%>
	<tr height=20>
	<td class=whitetext bgcolor ='#843f8b' align='center' colspan='2'>Applicant Id</td>
	<td class=whitetext bgcolor ='#843f8b' align='center' colspan='2' >Applicant Name</td>
	<td class=whitetext bgcolor ='#843f8b' align='center' colspan='2'></td>
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
			
			<input type='hidden' name='test_id' id='test_id' size ='20' value='<%=applicantTestDtlDBObj.test_id%>'/>
			<input type='hidden' name='test_name' id='test_name' size ='20' value='<%=applicantTestDtlDBObj.test_name%>'/>
			<input type='hidden' name='aplicant_id' id='aplicant_id' size ='20' value='<%=applicantTestDtlDBObj.applicant_id%>'/>
			<td align='center' colspan='2' ><%=applicantTestDtlDBObj.applicant_id%></td>
			<input type='hidden' name='applicant_name' id='applicant_name' size ='20' value='<%=applicantTestDtlDBObj.applicant_name%>'/>
			<td align='center' colspan='2' ><%=applicantTestDtlDBObj.applicant_name%></td>
			<input type='hidden' name='test_date' id='test_date' size ='20' value='<%=applicantTestDtlDBObj.test_date%>'/>
			<input type='hidden' name='test_time' id='test_time' size ='20' value='<%=applicantTestDtlDBObj.test_time%>'/>
			<td align='center' bgcolor="#843f8b">
			<a href='' class=yellowlink>Detail </a>
			</td >
			<td align='center' bgcolor="#843f8b">
			<a href='' class=yellowlink>Issue Joining Letter </a>
			</td >
			<%
		}
	}
	out.println("</tr>");
%>
</table>
</td></tr>
<tr>
    <td colspan="2"><%@include file="../jsp/hrms_footer.jsp"%></td>
</tr></table></body></html>