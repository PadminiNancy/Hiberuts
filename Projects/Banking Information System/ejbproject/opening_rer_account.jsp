<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Banking Information System</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<script language="JavaScript">
function fun(){
	var i=document.rer.period.value
}
</script>
</head>
<% 
	java.util.Date u= new java.util.Date();
	java.sql.Date odate=new java.sql.Date(u.getYear(),u.getMonth(),u.getDate());
	System.out.println(odate);
%>
<%@ page import="java.util.*,login.*,factory.*,savings.*,SessionFacade.*,recurring.*" %>
<link rel="stylesheet" href="css/mystyle.css" type="text/css" />
<body>
<table width=800 align=center border=0>
<tr>
<td align=center height=65 class=banner bgcolor=#8A4F28>Banking Information System</td>
</tr>
<tr><td>
<br>
<div align=center class=brownhead>Creating Recurring Deposits</div><br>
<p>&nbsp;</p>
<form action="./opening_rer_process.jsp" method="post" name="rer">
<table border="0" align="center">
<tr bgcolor="#FFFFCC"> 
	<td><font color="#330066">Deposited Date</font></td>
	<td> <input name="odate" type="text" id="odate" value="<%=odate%>" readonly=""></td>
</tr>
<tr> 
	<td><font color="#330066">Deposited Amount</font></td>
	<td><input name="balance" type="text" id="balance"></td>
</tr>
<tr bgcolor="#FFFFCC"> 
	<td><font color="#330066">Rate of Interest</font></td>
	<td> <select name="interest" id="interest">
		<option selected>10</option>
		<option>12</option>
		<option>14</option>
	</select>( % )</td>
</tr>
<tr> 
<td><font color="#330066">No. of Months</font></td>
<td><select name="period" id="period" onBlur=fun()>
		  <option selected>12</option>
          <option>24</option>
          <option>36</option>
          <option>48</option>
          <option>60</option>
        </select></td></tr>
<tr bgcolor="#FFFFCC">
<td><font color="#330066">Status</font></td>
<td> 
	<select name="status" id="status">
	<option selected>open</option>
	<option>close</option>
	</select>
</td>
</tr>
</table>
<div align=center>	
    <input type="submit" name="Submit" value="Submit">
    <input type="reset" name="Submit2" value="Reset">
</div>
</form>  
</td></tr>
<tr>
<td align=center class=greysmall><hr width=800>
All rights are reserved with E-Banking Solutions Pvt. Ltd.</td></tr>
</table></body></html>