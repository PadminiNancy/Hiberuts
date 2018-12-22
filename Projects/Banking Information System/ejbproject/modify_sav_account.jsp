<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<%@ page import="java.util.*" %>
<head>
<title>Banking Information System</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<%@page import="java.util.*,java.rmi.*, javax.ejb.*,javax.naming.*,login.*,factory.*,savings.*,SessionFacade.*"  %>
<% ViewSavBean bean=null; %>
<%! String accno;%>
<link rel="stylesheet" href="css/mystyle.css" type="text/css" />
<body>
<table width=800 align=center border=0>
<tr>
<td align=center height=65 class=banner bgcolor=#8A4F28>Banking Information System</td>
</tr>
<tr><td>
<div align=center class=brewnhead>Modify Your Saving Account</div><br>
<form action="./modify_sav_process.jsp" method="post" >
<%     
	SessionFacadeRemote remote=(SessionFacadeRemote)session.getAttribute("FACADE");
	accno=(String)session.getAttribute("ACCNO");
	bean=remote.viewSavAccount(accno);
	session.setAttribute("MODIFY_SAV_BEAN",bean);
	if (bean != null ){
%>
<table border="1" align="center" bordercolor="#000000">
	<tr bgcolor="#CCCCCC"> 
	<td bordercolor="#FFFFFF"><strong><font color="#FF0000">Your Account No </font></strong></td>
	<td><%= bean.getAccno() %></td>
	</tr>
</table>
<p>&nbsp;</p>
<table width="81%" border="0" align="center">
	<tr>
	<td width="38%"><table width="90%" border="0" align="center">
	<tr> 
	<td width="61%" bgcolor="#CCCCCC"><font color="#330099"><strong>Account Type</strong></font></td>
	<td width="39%" bgcolor="#CCCCCC"><%= bean.getAcctype()%></td>
	</tr>
	<tr>
	<td bgcolor="#CCCCCC"><font color="#330099"><strong>Opening Date</strong></font></td>
	<td bgcolor="#CCCCCC"><%= bean.getOpendate()%></td>
	</tr>
	<tr> 
	<td bgcolor="#CCCCCC"><font color="#330099"><strong>Balance</strong></font></td>
	<td bgcolor="#CCCCCC"><%= bean.getBalance()%></td>
	</tr>
	<tr> 
	<td bgcolor="#CCCCCC"><font color="#330099"><strong>Cheque Facility</strong></font></td>
	<td bgcolor="#CCCCCC"><%= bean.getCheque()%></td>
	</tr>
	<tr>
	<td bgcolor="#CCCCCC"><font color="#330099"><strong>Status</strong></font></td>
	<td bgcolor="#CCCCCC"><%= bean.getStatus() %></td>
	</tr>
</table>
</td>
<td width="62%">
<table width="89%" border="0" align="center">
	<tr> 
	<td width="72%" bgcolor="#CCCCCC"><font color="#330099"><strong>Account Holder Name</strong></font></td>
	<td width="28%" bgcolor="#CCCCCC"><input name="name" type="text" id="name" value="<%=bean.getName()%>"></td>
	</tr>
	<tr> 
	<td bgcolor="#CCCCCC"><font color="#330099"><strong>Occupation</strong></font></td>
	<td bgcolor="#CCCCCC">
	<input name="occupation" type="text" id="occupation" value="<%=bean.getOccupation()%>"></td>
	</tr>
	<tr> 
	<td bgcolor="#CCCCCC"><font color="#330099"><strong>Income</strong></font></td>
	<td bgcolor="#CCCCCC">
	<input name="income" type="text" id="income" value="<%=bean.getIncome()%>"></td>
	</tr>
	<tr> 
	<td bgcolor="#CCCCCC"><font color="#330099"><strong>Date of Birth</strong></font></td>
	<td bgcolor="#CCCCCC">
	<input name="dob" type="text" id="dob" value="<%=bean.getDob()%>"></td>
	</tr>
	<tr>
	<td bgcolor="#CCCCCC"><font color="#330099"><strong>Gender</strong></font></td>
	<td bgcolor="#CCCCCC"><input name="gender" type="text" id="gender" value="<%=bean.getGender()%>"></td>
	</tr>
	<tr> 
	<td bgcolor="#CCCCCC"><font color="#330099"><strong>Address</strong></font></td>
	<td bgcolor="#CCCCCC"> <input type="text" name="address" id="address" value="<%= bean.getAddress() %>"></td>
	</tr>
	<tr> 
	<td bgcolor="#CCCCCC"><font color="#330099"><strong>Phone Number</strong></font></td>
	<td bgcolor="#CCCCCC"><input name="phone" type="text" id="phone" value="<%=bean.getPhone()%>"></td>
	</tr>
	<tr> 
	<td bgcolor="#CCCCCC"><font color="#330099"><strong>Nationality</strong></font></td>
	<td bgcolor="#CCCCCC"><input name="nation" type="text" id="nation" value="<%=bean.getNation()%>"></td>
	</tr>
</table>
</td>
</tr>
</table>
<%	}else{
		response.sendRedirect("modify_accoutno_notfound.html");
	}
%>       
<div align="center">
<p><input name="modify" type="submit" id="modify" value="modify"></p>
<div align=center><hr width=100>
<a href="accmodify.html" class=bblink>Back</a><hr width=100></p>
</div>
</form>
</td></tr>
<tr>
<td align=center class=greysmall><hr width=800>
All rights are reserved with E-Banking Solutions Pvt. Ltd.</td></tr>
</table></body></html>