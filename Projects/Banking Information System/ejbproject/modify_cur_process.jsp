<%@page import="java.util.*,java.rmi.*, javax.ejb.*,javax.naming.*,login.*,factory.*,savings.*,SessionFacade.*,current.*"  %>
<%! String cheque,status;
    int ret;
    java.sql.Date  odate,d; 
    double balance ;%>
<% 
	System.out.println("in modify savings: ");
	ViewCurBean bean= (ViewCurBean)session.getAttribute("MODIFY_CUR_BEAN");
	bean.setName(request.getParameter("name"));
	bean.setOccupation(request.getParameter("occupation"));
	bean.setIncome(Double.parseDouble(request.getParameter("income")));
	bean.setGender(request.getParameter("gender"));
	bean.setAddress(request.getParameter("address"));
	bean.setPhone(Long.parseLong(request.getParameter("phone")));
	bean.setNation(request.getParameter("nation"));
	
	String dob=request.getParameter("dob");
	StringTokenizer st = new StringTokenizer(dob,"-");
	int i=0;
	int a[]=new int[3];
	while(st.hasMoreTokens()){
		a[i]=Integer.parseInt(st.nextToken("-"));
		System.out.println("tocken: " +a[i] );
		i++;
	}
	d=new java.sql.Date(a[0],a[1],a[2]);
	d=d.valueOf(dob);
	bean.setDob(d);	

	SessionFacadeRemote remote=(SessionFacadeRemote)session.getAttribute("FACADE");
	System.out.println("accno:"+ bean.getAccno());
	ret= remote.modifyCurAccount(bean.getAccno(),bean); 
	if(ret==1){
		response.sendRedirect("modified_sucess.html"); 
	}		 
	else if(ret==15||ret==13){
		response.sendRedirect("accoutopening_fail.html"); 
	}
	else if (ret ==11){ 
		// account not found
		response.sendRedirect("accoutno_notfound.html"); 
	}
%>