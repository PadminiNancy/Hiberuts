<%@ page import="java.util.*,java.rmi.*, javax.ejb.*,javax.naming.*,SessionFacade.SessionFacadeHome,SessionFacade.SessionFacadeRemote"  %>
<%! 
	String userid,password,type;
    int ret; %>
<% 
	System.out.println("in login process.jsp: ");
	String type =request.getParameter("type");
	System.out.println("type "+ type);
	
	userid=request.getParameter("userid");
	password=request.getParameter("password");
	Hashtable ht= new Hashtable();
	ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
	ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
	InitialContext ctxt= new InitialContext(ht);
	SessionFacadeHome home=(SessionFacadeHome)ctxt.lookup("SessionFacade.SessionFacadeHome");
	SessionFacadeRemote remote=home.create();
	ret= remote.checkUser(userid,password); 
	switch(ret){
		case 1: 
			session.setAttribute("FACADE",remote);
			session.setAttribute("name", userid);
			session.setAttribute("type", type);
			if("Manager".equals(type))
			response.sendRedirect("manager.html");
			else
			response.sendRedirect("userlogin_failed.html");
			break;
		case 2: 
			session.setAttribute("FACADE",remote);
			session.setAttribute("name", userid);
			session.setAttribute("type", type);
			if("Clerk".equals(type))
			response.sendRedirect("clerk.html");
			else
			response.sendRedirect("userlogin_failed.html");
			break;
		default: response.sendRedirect("userlogin_failed.html");
	}
%>
 	
	
