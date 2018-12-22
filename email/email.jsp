<%@page contentType="text/html" pageEncoding="UTF-8"%>

<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
<!--
body {
	background-color: #FFFFFF;
}
a:active {
	color: #FF00CC;
}
-->
</style>
    </head>
<html>
    <link href="mystyle.css"  rel="stylesheet" type="text/css">
    <body>
        <table align="center" width="900" bgcolor="#FFFFFF">
<tr>
  <td height="70"><div align="right"><img src="images/30_Thousand.png" width="652" height="98"> <a href="aboutus.jsp">HOME</a><a href="login_1.jsp"> LOGIN</a></div></td>
</tr>
<tr><td height="70"></td></tr>
        </table>
    <body background="images/bg14.jpg">
     
<center>
<form action="EmailServlet">
    <h1><font color="blue">Send Email </font></h1>
    <table width="445" height="332" bgcolor="#FFFFFF" style=" border-style:groove; border-radius:14px  ">

<tr>
<tr>
<td><span class="style2">To</span></td>
<td><input type="text" name="to"></td>
</tr>
<tr>
<td><span class="style2">Subject</span></td>
<td><input type="text" name="subject"></td>
</tr>
<tr>
<td><span class="style2">Message</span></td>

<td><textarea cols="25" rows="8" name="message"></textarea></td>
</tr>
<tr><td>&nbsp;</td>
    <td><input type="submit" value="SEND" class="btn"></td><tr>

</table>

</form>
</center>
        <table align="center" cellpadding="2" cellspacing="2" width="900">
         <tr><td ><div align="center" class="greysmall"><hr />
    All Rights are reserved with ABC Softwares Pvt. Ltd.</div></td></tr>
        </table>
</body>
</html>