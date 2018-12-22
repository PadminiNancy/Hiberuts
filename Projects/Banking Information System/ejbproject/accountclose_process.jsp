<%@page import="java.util.*,java.rmi.*, javax.ejb.*,javax.naming.*,login.*,savings.*,SessionFacade.*"  %>
<%! String accno,type;
%>
<% 
System.out.println("in accountclose_process.jsp: ");
String type =request.getParameter("acctype");
System.out.println("in savings: "+ type);
accno=request.getParameter("accno");
SessionFacadeRemote remote=(SessionFacadeRemote)session.getAttribute("FACADE");

if(type.equals("savings")){
	int i= remote.savClose(accno);
	if(i==1) 
	   response.sendRedirect("account_already_close.html");
	else if(i==11||i==13||i==15)
	   response.sendRedirect("accoutno_notfound2.html");
	else
		response.sendRedirect("bankmaster.html");
}
else if(type.equals("current")){
	int i= remote.curClose(accno);
	if(i==1) 
		response.sendRedirect("account_already_close.html");
	else if(i==11||i==13||i==15)
	   response.sendRedirect("accoutno_notfound2.html");
	else
		response.sendRedirect("bankmaster.html");
}
else if(type.equals("recurring")){
	int i= remote.rerClose(accno);
	if(i==1) 
	   response.sendRedirect("account_already_close.html");
	else if(i==11||i==13||i==15)
	   response.sendRedirect("accoutno_notfound2.html");
	else
		response.sendRedirect("bankmaster.html");
} %>