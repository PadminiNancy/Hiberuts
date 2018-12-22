<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page import="java.util.*" %>
<html>
<head>
<title>Banking Information System</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<%@page import="java.util.*,java.rmi.*, javax.ejb.*,javax.naming.*,trans.*, SessionFacade.*"  %>
<link rel="stylesheet" href="css/mystyle.css" type="text/css" />
<body>
<table width=800 align=center border=0>
<tr>
<td align=center height=65 class=banner bgcolor=#8A4F28>Banking Information System</td>
</tr>
<tr><td>
<%! 
	String fdate,tdate,acctype,accno;
    int i,j;
	StringTokenizer st1,st2;
	java.sql.Date d1,d2;
	java.util.Date u=new java.util.Date();
	java.util.Date u1;
	Collection col;
%>
<div align=center class=brownhead>Customer Monthly Report<div><br>
Date: <%=new java.sql.Date(u.getYear(),u.getMonth(),u.getDate())%><br>
<%
	System.out.println("in date_report.jsp: " );
	fdate= request.getParameter("fdate");
	tdate= request.getParameter("tdate");
	acctype= request.getParameter("acctype");
	accno= request.getParameter("accno");
	st1 = new StringTokenizer(fdate,"-");
	st2 = new StringTokenizer(tdate,"-");
	i=0;
	int a[]=new int[3];
 	int b[]=new int[3];
	while(st1.hasMoreTokens()){
		a[i]=Integer.parseInt(st1.nextToken("-"));
		System.out.println("tocken: " +a[i] );
		i++;
	}
	j=0;
	while(st2.hasMoreTokens()){
		b[j]=Integer.parseInt(st2.nextToken("-"));
		System.out.println("tocken: " +b[j] );
		j++;
	}
	d1=new java.sql.Date(a[0],a[1],a[2]);
	d1=d1.valueOf(fdate);
	d2=new java.sql.Date(b[0],b[1],b[2]);
	d2=d2.valueOf(tdate);
	
	System.out.println("sql date: " + d1 );
	System.out.println("sql date: " + d2 );
	SessionFacadeRemote remote=(SessionFacadeRemote)session.getAttribute("FACADE");
	col=remote.getCustomerReportByPeriod(accno,acctype,d1,d2);
%>
<table border="0" align="center">
<tr bgcolor="#FFFFCC"> 
	<td><strong><font color="#660000">Transaction Date </font></strong></td>
    <td><strong><font color="#660000">AccNo.</font></strong></td>
    <td><strong><font color="#660000">AccountType</font></strong></td>
    <td><strong><font color="#660000">Transaction Done by</font></strong></td>
    <td><strong><font color="#660000">Transaction Type</font></strong></td>
	<td><strong><font color="#660000">Transaction Amount</font></strong></td>
</tr>
<%
	if(!col.isEmpty()){
		Iterator i=col.iterator();
		while(i.hasNext()){
			ViewTransBean bean=(ViewTransBean)i.next();
			if(bean==null){
				response.sendRedirect("transcation_failed.html");
			}			  
			else{
%>
			<tr bgcolor="#CCCCCC"> 
			<td><%= bean.getTdate()%></td>
			<td><%=bean.getAccno()%></td>
			<td><%= bean.getAcctype()%></td>
			<td><%=bean.getName()%></td>
			<td><%= bean.getTratype()%></td>
			<td><%=bean.getTraamt()%></td>
			<%
			}// if	
		}//for while	%>
	</tr>
	<% } else{
		response.sendRedirect("transcation_failed.html");
	}
%>
</table>
<p>&nbsp;</p>
<div align="center"><hr width=100>
<a href="reports.html" class=bblink>Back</a><hr width=100>
</div></td></tr>
<tr>
<td align=center class=greysmall><hr width=800>
All rights are reserved with E-Banking Solutions Pvt. Ltd.</td></tr>
</table></body></html>