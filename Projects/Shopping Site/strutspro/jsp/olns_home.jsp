<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>www.myshoppingsite.com</title>
<link rel="stylesheet" href="/strutspro/css/mystyle.css" type="text/css" />
</head>
<body>
<table width="900" border="0" align="center">
<tr>
	<td colspan=2><%@ include file="../jsp/olns_header.jsp"%></td>
</tr>
<tr>
<td width="150" bgcolor="#86AEDF">
	<%@ include file="../jsp/olns_main_menu.jsp"%></td>
<td width="750">
<table width="100%" border="0">
		<tr>
		<td width="52%">
		<table width="100%" border="0" cellspacing="5">
			<tr>
				<td>
				<p align="center"><img src="/strutspro/images/jeansjack.jpg" width="75" height="75" border=1/><br />
				<span class="boldblack">Jeans Jacket</span><br />
				<span class="boldred">Rs. 456 </span></p> 
				</td>
				<td><div align="center"><img src="/strutspro/images/digicam.jpg" width="75" height="75" border=1/><br />
				<span class="boldblack">Digital Camera </span><br />
				<span class="boldred">Rs. 7999 </span></div>
				</td>
			</tr>
			<tr>
				<td><div align="center"><img src="/strutspro/images/krish.jpg" width="60" height="75" border=1/><br />
				<span class="boldblack">DVD Krissh </span><br />
				<span class="boldred">Rs. 400 </span></div>
				</td>
				<td><p align="center"><img src="/strutspro/images/pendrive.jpg" width="60" height="75" border=1/><br />
				<span class="boldblack">1 GB Pen Drive </span><br />
				<span class="boldred">Rs. 1200 </span></p>                  
				</td>
			</tr>
			<tr>
				<td><div align="center"></div></td>
				<td><div align="center"></div></td>
			</tr>
		</table>
		</td>
		<td width="48%">
			<table width="100%" border="0">
			<tr>
				<td colspan="2" bgcolor="#AE62AC" align="center">
				<div class=boldwhite>Categories</div> 
				</td>
			</tr>
			<tr>
				<td width="73%">
				<table width="100%" border="0">
				<tr>
				<td><div align="center"><img src="/strutspro/images/asha.jpg" width="80" height="100" border=1/><br />
				<span class="boldblack">Entertainment</span></div></td>
				<td><div align="center"><img src="/strutspro/images/nokia.gif" width="80" height="100" border=1 /><br />
				<span class="boldblack">Electronics</span></div></td>
				</tr>
				<tr>
				<td colspan="2"><div align="center"><img src="/strutspro/images/tshirts.jpg" width="80" height="100" border=1/><br />
				<span class="boldblack">Apparel &amp; Accessories </span></div></td>
				</tr>
				</table>
				</td>
				<td width="27%" align=center><span class="violetsmall">Food Products <br />
				Books<br />Gift Shop<br />Jewellery<br />Toys &amp; Games<br />Watches And Clocks
				<br />Electronics<br />
				Computers &amp; Peripherals<br />
				Entertainment<br />	Kid Store<br />	Kitchen Accessories</span></td>
			</tr>
			</table>
			<hr>
		</td>
		</tr>
		<tr>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
		</tr>
		<tr>
		<td>
		<img src="/strutspro/images/cart.jpg" alt="Cart" width="57" height="50" border=1/><br />
		<span class="boldblack">Start Shopping! Have Your Cart. </span><br /></td>
		<td>
		<div align="right"><img src="/strutspro/images/weaccept.gif" width="190" height="75" border=1 /></div>
		</td>
		</tr>
	</table>
</td>
</tr>
<tr>
	<td colspan="2"><%@ include file="../jsp/olns_footer.jsp"%></td>
</tr>
</table>
</body></html>