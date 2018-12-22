<%@page import="java.util.*,java.rmi.*, javax.ejb.*,javax.naming.*,login.*,factory.*,savings.*,SessionFacade.*"  %>
<%! 
	String accno,type,odate,name,address,phone,occupation,nation,cheque,status;
	int ret; 
%>
<% double balance,income ;%>
<% 
	System.out.println("in modifyaccount_process.jsp: ");
	String type =request.getParameter("type");
	System.out.println("in savings: "+ type);

	accno=request.getParameter("accno");
	session.setAttribute("ACCNO",accno);
	if(type.equals("savings")){
		response.sendRedirect("./modify_sav_account.jsp");
	}
	else if(type.equals("current")){
		response.sendRedirect("./modify_cur_account.jsp");
	}
	else if(type.equals("recurring")){
		response.sendRedirect("./modify_rer_account.jsp");
	}
%>