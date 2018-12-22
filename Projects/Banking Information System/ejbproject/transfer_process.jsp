<%@page import="java.util.*,java.rmi.*, javax.ejb.*,javax.naming.*, trans.*, SessionFacade.*"  %>
<%!
	String saccno,daccno,sacctype,dacctype,status,name;
	int ret; %>
<% double amount;%>
<% 
	System.out.println("in transfer process: ");
	saccno =request.getParameter("saccno");
	sacctype =request.getParameter("sacctype");
	daccno=request.getParameter("daccno");
	dacctype=request.getParameter("dacctype");
	amount = Double.parseDouble(request.getParameter("amount"));
	name= request.getParameter("name");
	java.util.Date u= new java.util.Date();
	java.sql.Date d= new java.sql.Date(u.getYear(),u.getMonth(),u.getDate());
	
	ViewTransBean bean= new ViewTransBean();
	bean.setAccno(saccno);
	bean.setAcctype(sacctype);
	bean.setName(name);
	bean.setTraamt(amount);
	bean.setTratype("transfer");
	bean.setTdate(d);
	
	System.out.println(saccno+name+amount+d);
	SessionFacadeRemote remote=(SessionFacadeRemote)session.getAttribute("FACADE");
	if (sacctype.equals("savings") && dacctype.equals("savings")){
			int i=remote.transferSToS(saccno,daccno,amount);
			if(i==1){
				response.sendRedirect("transfer_sucess.html");
				String str=remote.createTransaction(bean);
			}
			else{
				response.sendRedirect("transfer_failed.html");
			}	
	}
	else if (sacctype.equals("savings") && dacctype.equals("current")){
		int i=remote.transferSToC(saccno,daccno,amount);
			if (i==1){
				response.sendRedirect("transfer_sucess.html");
				String str=remote.createTransaction(bean);
			}
			else{
				response.sendRedirect("transfer_failed.html");
			}	
	
	}
	else if (sacctype.equals("current") && dacctype.equals("current")){
			int i=remote.transferCToC(saccno,daccno,amount);
			if (i==1){
				response.sendRedirect("transfer_sucess.html");
				String str=remote.createTransaction(bean);
			}
			else{
				response.sendRedirect("transfer_failed.html");
			}	
	}
	else if (sacctype.equals("current") && dacctype.equals("savings")){
			int i=remote.transferCToS(saccno,daccno,amount);
			if (i==1){
				response.sendRedirect("transfer_sucess.html");
				String str=remote.createTransaction(bean);
			}
			else{
				response.sendRedirect("transfer_failed.html");
			}	
		
	}
%>