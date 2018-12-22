<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page import="java.util.*" %>
<html>
<head>
<title>Banking Information System</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<%@page import="java.util.*,java.rmi.*, javax.ejb.*,javax.naming.*,login.*,factory.*,savings.*,SessionFacade.*,recurring.*"  %>
<% ViewRerBean bean=null; %>
<%! String accno;%>
<link rel="stylesheet" href="css/mystyle.css" type="text/css" />
<body>
<table width=800 align=center border=0>
<tr>
<td align=center height=65 class=banner bgcolor=#8A4F28>Banking Information System</td>
</tr>
<tr><td>
<div align=center class=brownhead>Modify Your Recurring Account</div><br>
<form action="./modify_rer_process.jsp" method="post">
<%
	SessionFacadeRemote remote=(SessionFacadeRemote)session.getAttribute("FACADE");
	accno=(String)session.getAttribute("ACCNO");
	bean=remote.viewRerAccount(accno);
	session.setAttribute("MODIFY_RER_BEAN",bean);
	if (bean != null ){
%>
<table border="1" align="center" bordercolor="#000000">
	<tr bgcolor="#CCCCCC"> 
	<td bordercolor="#FFFFFF"><strong><font color="#FF0000">Your Account No</font></strong></td>
	<td><%= bean.getAccno() %></td>
	</tr>
</table>
<table width="80%" border="0" align="center">
	<tr>
	<td width="46%">
		<table width="94%" border="0" align="center">
		<tr> 
		<td width="65%" bgcolor="#CCCCCC"><font color="#330099"><strong>Account Type</strong></font></td>
		<td width="35%" bgcolor="#CCCCCC"><%= bean.getAcctype()%></td>
		</tr>
		<tr> 
		<td bgcolor="#CCCCCC"><font color="#330099"><strong>Opening Date</strong></font></td>
		<td bgcolor="#CCCCCC"><%= bean.getOpendate()%></td>
		</tr>
		<tr> 
		<td bgcolor="#CCCCCC"><font color="#330099"><strong>Deposit</strong></font></td>
		<td bgcolor="#CCCCCC"><%= bean.getBalance()%></td>
		</tr>
		<tr> 
		<td bgcolor="#CCCCCC"><font color="#330099"><strong>Maturity Date</strong></font></td>
		<td bgcolor="#CCCCCC"><%= bean.getMdate()%></td>
		</tr>
		<tr> 
		<td bgcolor="#CCCCCC"><font color="#330099"><strong>Maturity Amount</strong></font></td>
		<td bgcolor="#CCCCCC"><%= bean.getMatamt() %></td>
		</tr>
		<tr> 
		<td bgcolor="#CCCCCC"><font color="#330099"><strong>Rate of Interest</strong></font></td>
		<td bgcolor="#CCCCCC"><%=bean.getInterest()%></td>
		</tr>
		<tr> 
		<td bgcolor="#CCCCCC"><font color="#330099"><strong>No.of.Months</strong></font></td>
		<td bgcolor="#CCCCCC"><%=bean.getPeriod()%></td>
		</tr>
		<tr>
		<td bgcolor="#CCCCCC"><font color="#330099"><strong>Status</strong></font></td>
		<td bgcolor="#CCCCCC"><%= bean.getStatus()%></td>
		</tr>
		</table>
	</td>
	<td width="54%">
		<table border="0" align="center">
		<tr> 
		<td bgcolor="#CCCCCC"><font color="#330099"><strong>Account Holder Name</strong></font></td>
		<td bgcolor="#CCCCCC">
		<input name="name" type="text" id="name" value="<%=bean.getName()%>"></td>
		</tr><tr> 
		<td bgcolor="#CCCCCC"><font color="#330099"><strong>Occupation</strong></font></td>
		<td bgcolor="#CCCCCC"><input name="occupation" type="text" id="occupation" value="<%=bean.getOccupation()%>">
		</td>
		</tr><tr> 
		<td bgcolor="#CCCCCC"><font color="#330099"><strong>Income</strong></font></td>
		<td bgcolor="#CCCCCC"><input name="income" type="text" id="income" value="<%=bean.getIncome()%>"></td>
		</tr>
		<tr> 
		<td bgcolor="#CCCCCC"><font color="#330099"><strong>Date of Birth</strong></font></td>
		<td bgcolor="#CCCCCC"><input name="dob" type="text" id="dob" value="<%=bean.getDob()%>"></td>
		</tr>
		<tr> 
		<td bgcolor="#CCCCCC"><font color="#330099"><strong>Gender</strong></font></td>
		<td bgcolor="#CCCCCC"><font color="#330099"><input name="gender" type="text" id="gender" value="<%=bean.getGender()%>"></font></td>
		</tr>
		<tr> 
		<td bgcolor="#CCCCCC"><font color="#330099"><strong>Address</strong></font></td>
		<td bgcolor="#CCCCCC"><input name="address" type="text" id="address" value="<%=bean.getAddress()%>"></td>
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
<% }
else { 
	response.sendRedirect("modify_accoutno_notfound.html");
} %>
<p align="center"><input name="modify" type="submit" id="modify" value="modify"></p>
<div align="center"><hr width=100>
<a href="accmodify.html" class=bblink>Back</a>
<hr width=100></div>
</form>
</td></tr>
<tr>
<td align=center class=greysmall><hr width=800>
All rights are reserved with E-Banking Solutions Pvt. Ltd.</td></tr>
</table></body></html>