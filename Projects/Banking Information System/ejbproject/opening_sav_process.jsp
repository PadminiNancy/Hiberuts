<%@page import="java.util.*,java.rmi.*, javax.ejb.*,javax.naming.*,login.*,factory.*,savings.*,SessionFacade.*"  %>
<%! 
	String cheque,status,ret;
    java.sql.Date  odate; 
    double balance ;%>
<% 
	System.out.println("in savings: ");
	java.util.Date u=new java.util.Date();
	odate= new java.sql.Date(u.getYear(),u.getMonth(),u.getDate());	       
	cheque=request.getParameter("cheque");
	status=request.getParameter("status");
	balance=Double.parseDouble(request.getParameter("balance"));
	ViewSavBean bean= (ViewSavBean)session.getAttribute("SAVBEAN");
	bean.setOpendate(odate);
	bean.setCheque(cheque);
	bean.setStatus(status);
	bean.setBalance(balance);
    System.out.println("Address"+bean.getAddress());
	System.out.println("Balance"+bean.getBalance());
	System.out.println("cheque"+bean.getCheque());
	System.out.println("phone "+bean.getPhone());
	SessionFacadeRemote remote=(SessionFacadeRemote)session.getAttribute("FACADE");
	ret= remote.createSavAccount(bean); 
	if (ret.equals("exception")){
		response.sendRedirect("accoutopening_fail.html"); 
	}
	else{ 
		session.setAttribute("ACCNO",ret);
		response.sendRedirect("./view_sav_account.jsp");
	}
%>