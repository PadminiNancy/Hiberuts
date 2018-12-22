<%@page import="java.util.*,java.rmi.*, javax.ejb.*,javax.naming.*,login.*,factory.*,savings.*,SessionFacade.*,recurring.*,current.*"  %>
<%! 
	String accno,type,name,address, phone, occupation,nation,dob,gender;
	java.sql.Date d;
    int ret; %>
<% double income ;%>
<% 
	System.out.println("in Current: ");
	String type =request.getParameter("acctype");
	System.out.println("in Current: "+ type);
	name=request.getParameter("name");
	address=request.getParameter("address");
	phone = request.getParameter("phone");
	occupation=request.getParameter("occupation");
	nation=request.getParameter("nation");
	income=Double.parseDouble(request.getParameter("income"));
	dob=request.getParameter("dob");
	gender=request.getParameter("gender");

	long ph=Long.parseLong(phone);
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

	if (type.equals("savings")){
		ViewSavBean bean= new ViewSavBean();
		bean.setAcctype(type);
		bean.setName(name);
		bean.setAddress(address);
		bean.setPhone(ph);
		bean.setOccupation(occupation);
		bean.setNation(nation);
		bean.setDob(d);
		bean.setIncome(income);
        bean.setGender(gender);
		session.setAttribute("SAVBEAN",bean);
		response.sendRedirect("./opening_sav_account.jsp");
	}
	else if (type.equals("recurring")){
		ViewRerBean bean= new ViewRerBean();
		bean.setAcctype(type);
		bean.setName(name);
		bean.setAddress(address);
		bean.setPhone(ph);
		bean.setOccupation(occupation);
		bean.setNation(nation);
		bean.setDob(d);
		bean.setIncome(income);
        bean.setGender(gender);
		session.setAttribute("RERBEAN",bean);
		response.sendRedirect("./opening_rer_account.jsp");
	}
	else if (type.equals("current")){
		ViewCurBean bean= new ViewCurBean();
		bean.setAcctype(type);
		bean.setName(name);
		bean.setAddress(address);
		bean.setPhone(ph);
		bean.setOccupation(occupation);
		bean.setNation(nation);
		bean.setDob(d);
		bean.setIncome(income);
        bean.setGender(gender);
		session.setAttribute("CURBEAN",bean);
		response.sendRedirect("./opening_cur_account.jsp");
	}
%>