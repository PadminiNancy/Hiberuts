<%@page import="java.util.*,java.rmi.*, javax.ejb.*,javax.naming.*,login.*,factory.*,savings.*,SessionFacade.*,recurring.*,current.*"  %>
<%! 
	String accno,type,odate,name,address,phone,occupation,nation,cheque,status;
    int ret; 
%>
<% double balance,income ;%>
<% 
	System.out.println("in viewaccount_process.jsp: ");
	String type =request.getParameter("type");
	System.out.println("in savings: "+ type);
	accno=request.getParameter("accno");
	session.setAttribute("ACCNO",accno);
	if(type.equals("savings")){
		response.sendRedirect("./view_sav_account.jsp");
	}
	else if(type.equals("current")){
		response.sendRedirect("./view_cur_account.jsp");
	}
	else if(type.equals("recurring")){
		response.sendRedirect("./view_rer_account.jsp");
	}
%>