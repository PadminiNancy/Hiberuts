<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page import="java.util.*" %>
<html>
<head>
<title>Banking Information System</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<link rel="stylesheet" href="css/mystyle.css" type="text/css" />
<body>
<table width=800 align=center border=0>
<tr>
<td align=center height=65 class=banner bgcolor=#8A4F28>Banking Information System</td>
</tr>
<tr><td>
<p>&nbsp;</p>
<div align=center class=brownhead>Opening Saving Account</div><br>
<form action="./opening_sav_process.jsp" method="post">
<table border="0" align="center" bordercolor="#FF9999">
<tr bgcolor="#FFFFFF"> 
	<td><font color="#330066"><strong>Enter Balance</strong></font></td>
	<td> <input name="balance" type="text" id="balance"></td>
</tr>
<tr bgcolor="#FFFFCC"> 
	<td><font color="#330066"><strong>Cheque</strong></font></td>
	<td>
	<input name="cheque" type="radio" value="yes" checked><font color="#330066"><strong>Yes 
	<input type="radio" name="cheque" value="no">No</strong></font></td>
    </tr>
	<tr bgcolor="#FFFFFF"> 
	<td><font color="#330066"><strong>OpeningDate</strong></font></td>
	<td><font color="#FF0000"> 	<% 
		java.util.Date d1= new  java.util.Date();
	   	java.sql.Date d= new java.sql.Date(d1.getYear(),d1.getMonth(),d1.getDate());
		System.out.println("date"+d);
	%>
	<font color="#FF0000"><input name="odate" type="text" id="odate"  value ="<%=d %>" readonly=""></font> </font></td>
    </tr>
    <tr bgcolor="#FFFFCC"> 
	<td><font color="#330066"><strong>Status</strong></font></td>
	<td><select name="status" id="status">
          <option selected>open</option>
          <option>close</option>
    </select></td>
	</tr>
</table>
<div align=center><input type="submit" name="Submit" value="Submit">
<input type="reset" name="Submit2" value="Reset"></div>
</form>  

</td></tr>
<tr>
<td align=center class=greysmall><hr width=800>
All rights are reserved with E-Banking Solutions Pvt. Ltd.</td></tr>
</table></body></html>