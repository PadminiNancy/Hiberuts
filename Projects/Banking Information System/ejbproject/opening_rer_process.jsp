<%@page import="java.util.*,java.rmi.*, javax.ejb.*,javax.naming.*,login.*,factory.*,savings.*,SessionFacade.*,recurring.*,java.sql.*"  %>
<%! 
	int year,month,day; 
    String ret,status;
    java.sql.Date odate,mdate;
    double balance,interest,period,matamt ;%>

<% 
	System.out.println("in RECURRING: ");
	java.util.Date u=new java.util.Date();
	year=u.getYear();
	month=u.getMonth();
    day=u.getDate();
	odate= new java.sql.Date(year,month,day);
	balance=Double.parseDouble(request.getParameter("balance"));
	interest=Double.parseDouble(request.getParameter("interest"));
	status=request.getParameter("status");
	period=Double.parseDouble(request.getParameter("period"));
    int i=Integer.parseInt(request.getParameter("period"));
	System.out.println("perion: " + period);
    switch(i){
		case 12 : year+=1;break;
		case 24 : year+=2;break;
		case 36 : year+=3;break;
		case 48 : year+=4;break;
		case 60 : year+=5;break;
	}
	
	mdate= new java.sql.Date(year,month,day);
	matamt=balance+ ( balance*(interest/100)*period)/100;

	ViewRerBean bean= (ViewRerBean)session.getAttribute("RERBEAN");
	bean.setOpendate(odate);
	bean.setInterest(interest);
	bean.setPeriod(period);
	bean.setBalance(balance);
    bean.setMdate(mdate);
    bean.setMatamt(matamt);
    bean.setStatus(status);
	SessionFacadeRemote remote=(SessionFacadeRemote)session.getAttribute("FACADE");
	ret= remote.createRerAccount(bean); 
	if (ret.equals("exception")){
		response.sendRedirect("accoutopening_fail.html"); 
	}
	else{
		session.setAttribute("ACCNO",ret);
		response.sendRedirect("./view_rer_account.jsp");
	}
%>