<%@page import="java.util.*,java.rmi.*, javax.ejb.*,javax.naming.*,trans.*, SessionFacade.*"  %>
<%! 
	String accno,type,status,name;
    int ret; 
%>
<% double amount ;%>
<% 
	System.out.println("in transction process: ");
	String type =request.getParameter("type");
	System.out.println("in Current: "+ type);
	accno=request.getParameter("accno");
	amount = Double.parseDouble(request.getParameter("amt"));
	name= request.getParameter("name");
	java.util.Date u= new java.util.Date();
	java.sql.Date d= new java.sql.Date(u.getYear(),u.getMonth(),u.getDate());
	ViewTransBean bean= new ViewTransBean();
	bean.setAccno(accno);
	bean.setName(name);
	bean.setTraamt(amount);
	bean.setTratype("deposit");
	bean.setTdate(d);
	SessionFacadeRemote remote=(SessionFacadeRemote)session.getAttribute("FACADE");
	if (type.equals("savings")){
		bean.setAcctype("savings");
		ret=remote.isSavClose(accno);
		if(ret==2){
			int i=remote.depositIntoSav(accno,amount);
			if(i==1){
				response.sendRedirect("deposit_sucess.html");
				String str=remote.createTransaction(bean);
			}
			else if (i==13){
				response.sendRedirect("deposit_failed.html");
			}	
		}
		else if(ret==1){
			response.sendRedirect("account_close.html"); 
		}
		else if (ret==11 || ret==13){
			response.sendRedirect("accoutno_notfound.html"); 
		}
	}
	else if (type.equals("current")){
		bean.setAcctype("current");
		ret=remote.isCurClose(accno);
		if(ret==2){
			int i=remote.depositIntoCur(accno,amount);
			if (i==1){
				response.sendRedirect("deposit_sucess.html");
				String str=remote.createTransaction(bean);
			}
			else if (i==13){
				response.sendRedirect("deposit_failed.html");
			}	
		}
		else if(ret==1){
			response.sendRedirect("account_close.html"); 
		}
		else if (ret==11 || ret==13){
			response.sendRedirect("accoutno_notfound.html"); 
		}
	}
%>