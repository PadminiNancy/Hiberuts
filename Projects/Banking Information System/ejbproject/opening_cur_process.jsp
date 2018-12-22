<%@page import="java.util.*,java.rmi.*, javax.ejb.*,javax.naming.*,login.*,factory.*,savings.*,SessionFacade.*,current.*"  %>

<%! 
	String cheque,status,ret;
    java.sql.Date odate;
    double balance ;%>
<% 
	System.out.println("in savings: ");
	java.util.Date u=new java.util.Date();
	odate= new java.sql.Date(u.getYear(),u.getMonth(),u.getDate());
	
	System.out.println(odate);
    cheque=request.getParameter("cheque");
	status=request.getParameter("status");
	balance=Double.parseDouble(request.getParameter("balance"));

	ViewCurBean bean= (ViewCurBean)session.getAttribute("CURBEAN");

	bean.setOpendate(odate);
	bean.setCheque(cheque);
	bean.setStatus(status);
	bean.setBalance(balance);
	SessionFacadeRemote remote=(SessionFacadeRemote)session.getAttribute("FACADE");
	ret= remote.createCurAccount(bean); 
	if (ret.equals("exception")){ 
		response.sendRedirect("accoutopening_fail.html"); 
	}
	else{
		session.setAttribute("ACCNO",ret);
		response.sendRedirect("./view_cur_account.jsp");
	}
%>