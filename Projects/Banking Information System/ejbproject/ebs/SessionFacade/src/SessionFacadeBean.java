package SessionFacade;
import java.rmi.*;
import javax.ejb.*;
import java.util.*;
import javax.naming.*;
import savings.*;
import login.*;
import recurring.*;
import current.*;
import trans.*;

public class SessionFacadeBean implements SessionBean{
	public SessionContext sctxt;
	public int ret;
	
	public void setSessionContext(SessionContext sctxt){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in set session");
		this.sctxt=sctxt;
	}
	public void ejbCreate(){
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in create facade");
		this.ret=0;
	}
	public void ejbRemove(){}
	public void ejbActivate(){}
	public void ejbPassivate(){}
	
	//****************************** user functions ******************************
	
	//****************************** login validations******************************
	public int checkUser(String userid,String password) throws RemoteException{
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			LoginHome home=(LoginHome)Context.lookup("java:comp/env/ejb/LoginEJB");
			LoginRemote remote=home.findByPrimaryKey(userid);
			String pass= remote.getLoginPassword();
			String type= remote.getLoginType();
			if(password.equals(pass)){
				if(type.equals("manager")){
					return 1;
				}
				else if(type.equals("clerk")){
					return 2;
				}
				else {
					return 3;
				}
			}
			else{
				return 3;
			}
		}catch(FinderException e){
			System.out.println("cannot find the user"+e);
			return 11;
		}
		catch(RemoteException e){
			System.out.println("Remote Exception in finding the user"+ e);
			return 13;
		}
		catch (Exception e){
			System.out.println("Remote Exception in finding the user"+ e);
			return 15;
		}		
	}
	//****************************** creating accounts ****************************************
	public String createSavAccount(ViewSavBean create) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in create sav account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			SavingsHome home=null;
			home = (SavingsHome)Context.lookup("java:comp/env/ejb/SavingsEJB");
			SavingsRemote remote=home.create(create.getAcctype(),create.getOpendate(),create.getBalance(),create.getName(),create.getAddress(),create.getPhone(),create.getOccupation(),create.getNation(),create.getIncome(),create.getCheque(),create.getStatus(),create.getDob(),create.getGender());
			return remote.getAccountno();
		}catch(CreateException e){System.out.println("Crreate Exception"+e);
			return "exception";
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return "exception";
		}
		catch(Exception e){
			System.out.println("Cannot look up");
			return "exception";
		}
	}//end sav
	
	public String createRerAccount(ViewRerBean create) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in create RER account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			RecurringHome home=null;
			home = (RecurringHome)Context.lookup("java:comp/env/ejb/RecurringEJB");
			RecurringRemote remote=home.create(create.getAcctype(),create.getOpendate(),create.getBalance(),create.getPeriod(),create.getMatamt(),create.getInterest(),create.getName(),create.getAddress(),create.getPhone(),create.getOccupation(),create.getNation(),create.getIncome(),create.getDob(),create.getGender(),create.getMdate(),create.getStatus());
			return remote.getRecAccno();
		}
		catch(CreateException e){
			System.out.println("Crreate Exception"+e);
			return "exception";
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return "exception";
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return "exception";
		}
	}//end rer
	
	public String createCurAccount(ViewCurBean create) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in create CUR account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			CurrentHome home=null;
			home = (CurrentHome)Context.lookup("java:comp/env/ejb/CurrentEJB");
			CurrentRemote remote=home.create(create.getAcctype(),create.getOpendate(),create.getBalance(),create.getName(),create.getAddress(),create.getPhone(),create.getOccupation(),create.getNation(),create.getIncome(),create.getCheque(),create.getStatus(),create.getDob(),create.getGender());
			return remote.getCurAccno();
		}catch(CreateException e){
			System.out.println("Crreate Exception"+e);
			return "exception";
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return "exception";
		}
		catch(Exception e){System.out.println("Cannot look up");
			return "exception";
		}
	}//end cur
	
	public String createTransaction(ViewTransBean create) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in create Transcation");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			TransHome home=null;
			home = (TransHome)Context.lookup("java:comp/env/ejb/TransEJB");
			TransRemote remote=home.create(create.getAccno(),create.getName(),create.getAcctype(),create.getTdate(),create.getTratype(),create.getTraamt());
			if(remote!=null){	
				return "sucess";
			}
			else {
				return "exception";
			}
		}catch(CreateException e){
			System.out.println("Create Exception"+e);
			return "exception";
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return "exception";
		}
		catch(Exception e){
			System.out.println("Cannot look up");
			return "exception";
		}
	}
	//********************************* viewing accounts ******************************************
		
	public ViewSavBean viewSavAccount(String accno) throws RemoteException{
		ViewSavBean bean=null;
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in VIEW sav account");	
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			SavingsHome home=(SavingsHome)Context.lookup("java:comp/env/ejb/SavingsEJB");
			SavingsRemote remote=home.findByPrimaryKey(accno);
			bean=remote.view();
		    return bean;
		}catch(FinderException e){
			System.out.println("Account not found");
			return bean;
		}
		catch(Exception e){
			System.out.println("Cannot look up");
			return bean;
		}
	}//end sav
	
	public ViewCurBean viewCurAccount(String accno) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in VIEW CUR account");
		ViewCurBean bean=null;
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			CurrentHome home=(CurrentHome)Context.lookup("java:comp/env/ejb/CurrentEJB");
		    CurrentRemote remote= home.findByPrimaryKey(accno);
		    bean=remote.view();
		    return bean;
		}
		catch(FinderException e){
			System.out.println("Account not found");
			return bean;
		}
		catch(Exception e){
			System.out.println("Cannot look up");
			return bean;
		}
	}//end cur
	
	public ViewRerBean viewRerAccount(String accno) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in VIEW RER account");	
		ViewRerBean bean=null;
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			RecurringHome home=null;
			home = (RecurringHome)Context.lookup("java:comp/env/ejb/RecurringEJB");
			RecurringRemote remote=home.findByPrimaryKey(accno);
			bean =remote.view();
			return bean;
		}catch(FinderException e){
			System.out.println("Account not found");
			return bean;
		}
		catch(Exception e){
			System.out.println("Cannot look up");
			return bean;
		}
	}//end rer
	
	//****************************** modifing accounts ************************************
	public int modifySavAccount(String accno, ViewSavBean modify) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in modify sav account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			SavingsHome home=null;
			home = (SavingsHome)Context.lookup("java:comp/env/ejb/SavingsEJB");
			SavingsRemote remote=home.findByPrimaryKey(accno);
			remote.setAccounttype(modify.getAcctype());
			remote.setAccountOpendate(modify.getOpendate());
			remote.setAccountBalance(modify.getBalance());
			remote.setCustName(modify.getName());
			remote.setCustAddress(modify.getAddress());
			remote.setCustPhone(modify.getPhone());
			remote.setCustOccupation(modify.getOccupation());
			remote.setCustNation(modify.getNation());
			remote.setCustCheque(modify.getCheque());
			remote.setCustIncome(modify.getIncome());
			remote.setAccountStatus(modify.getStatus());
			remote.setCustGender(modify.getGender());
			remote.setCustDob(modify.getDob());
			return this.ret=1;
		}catch(FinderException e){
			System.out.println("Cannot Find up");
			return this.ret=11;
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return this.ret=13;
		}
		catch(Exception e){
			System.out.println("Cannot look up");
			return this.ret=15;
		}
	}//end sav
	
	public int modifyRerAccount(String accno,ViewRerBean modify) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in modify RER account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			RecurringHome home=null;
			home = (RecurringHome)Context.lookup("java:comp/env/ejb/RecurringEJB");
			RecurringRemote remote=home.findByPrimaryKey(accno);
			remote.setRecAcctype(modify.getAcctype());
			remote.setRecOpendate(modify.getOpendate());
			remote.setRecBalance(modify.getBalance());
			remote.setRecName(modify.getName());
			remote.setRecAddress(modify.getAddress());
			remote.setRecPhone(modify.getPhone());
			remote.setRecOccupation(modify.getOccupation());
			remote.setRecNation(modify.getNation());
			remote.setRecIncome(modify.getIncome());
			remote.setRecMatamt(modify.getMatamt());
			remote.setRecInterest(modify.getInterest());
			remote.setRecPeriod(modify.getPeriod());
			remote.setRecGender(modify.getGender());
			remote.setRecDob(modify.getDob());
			remote.setRecMdate(modify.getMdate());
			remote.setRecStatus(modify.getStatus());	
			return this.ret=1;
		}catch(FinderException e){
			System.out.println("Cannot Find up");
			return this.ret=11;
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return this.ret=13;
		}
		catch(Exception e){
			System.out.println("Cannot look up");
			return this.ret=15;
		}
	}//end rer
	
	public int modifyCurAccount(String accno, ViewCurBean modify) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in create CUR account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			CurrentHome home=null;
			home = (CurrentHome)Context.lookup("java:comp/env/ejb/CurrentEJB");
			CurrentRemote remote= home.findByPrimaryKey(accno);
			remote.setCurAcctype(modify.getAcctype());
			remote.setCurOpendate(modify.getOpendate());
			remote.setCurBalance(modify.getBalance());
			remote.setCurName(modify.getName());
			remote.setCurAddress(modify.getAddress());
			remote.setCurPhone(modify.getPhone());
			remote.setCurOccupation(modify.getOccupation());
			remote.setCurNation(modify.getNation());
			remote.setCurCheque(modify.getCheque());
			remote.setCurIncome(modify.getIncome());
			remote.setCurStatus(modify.getStatus());
			remote.setCurGender(modify.getGender());
			remote.setCurDob(modify.getDob());
			return this.ret=1;
		}catch(FinderException e){
			System.out.println("Cannot Find up");
			return this.ret=11;
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return this.ret=13;
		}
		catch(Exception e){
			System.out.println("Cannot look up");
			return this.ret=15;
		}
	}//end cur
	
	//*************************************TRANSCATIONS***************************************
	public int depositIntoSav(String accno,double amount) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in DEPOSIT sav account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			SavingsHome home=null;
			home = (SavingsHome)Context.lookup("java:comp/env/ejb/SavingsEJB");
			SavingsRemote remote=home.findByPrimaryKey(accno);
			if(remote.deposit(amount))
				return 1;
			else
				return 13;
		}
		catch(FinderException e){
			System.out.println("Cannot Find up"+e);
			return this.ret=11;
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return this.ret=13;
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return this.ret=15;
		}
	}//end dep
	
	public int depositIntoCur(String accno,double amount)  throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in DEPOSIT cur account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			CurrentHome home=null;
			home = (CurrentHome)Context.lookup("java:comp/env/ejb/CurrentEJB");
			CurrentRemote remote=home.findByPrimaryKey(accno);
			if(remote.deposit(amount))
				return 1;
			else
				return 13;
		}
		catch(FinderException e){System.out.println("Cannot Find up"+e);
			return this.ret=11;
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return this.ret=13;
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return this.ret=15;
		}
	}//end dep
	
	public int withdrawFromSav(String accno,double amount) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in withdraw sav account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			SavingsHome home=null;
			home = (SavingsHome)Context.lookup("java:comp/env/ejb/SavingsEJB");
			SavingsRemote remote=home.findByPrimaryKey(accno);
			if(remote.withdraw(amount))
				return 1;
			else
				return 13;
		}
		catch(FinderException e){
			System.out.println("Cannot Find up"+e);
			return this.ret=11;
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return this.ret=13;
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return this.ret=15;
		}
	}//end with
	
	public int withdrawFromCur(String accno,double amount)  throws RemoteException{
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			CurrentHome home=null;
			home = (CurrentHome)Context.lookup("java:comp/env/ejb/CurrentEJB");
			CurrentRemote remote=home.findByPrimaryKey(accno);
			if(remote.withdraw(amount))
				return 1;
			else
				return 13;
		}
		catch(FinderException e){
			System.out.println("Cannot Find up"+e);
			return this.ret=11;
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return this.ret=13;
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return this.ret=15;
		}
	}// end with

	public int transferSToS(String src_accno,String des_accno,double amount)throws RemoteException{
		try{
			int i=withdrawFromSav(src_accno,amount);
			int j=depositIntoSav(des_accno,amount);
			if(i==1 && j==1) 
				return 1;
			else
				return 15;
		}catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return this.ret=13;
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return this.ret=15;
		}
	}//end stos
	
	public int transferSToC(String src_accno,String des_accno,double amount)throws RemoteException{
		try{
			int i=withdrawFromSav(src_accno,amount);
			int j=depositIntoCur(des_accno,amount);
			if(i==1 && j==1)
				return 1;
			else
				return 15;
		}catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return this.ret=13;
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return this.ret=15;
		}
	}//end stoc
	
	public int transferCToC(String src_accno,String des_accno,double amount)throws RemoteException{
		try{
			int i=withdrawFromCur(src_accno,amount);
			int j=depositIntoCur(des_accno,amount);
			if(i==1 && j==1) 
				return 1;
			else
				return 15;
		}catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return this.ret=13;
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return this.ret=15;
		}
	}//end ctoc
	
	public int transferCToS(String src_accno,String des_accno,double amount)throws RemoteException{
		try{
			int i=withdrawFromCur(src_accno,amount);
			int j=depositIntoSav(des_accno,amount);
			if(i==1 && j==1) return 1;
			else return 15;
		}catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return this.ret=13;
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return this.ret=15;
		}
	}//end ctoc
	
	//**************************************** reports *********************************************
	
	public Collection getBankReportByDate(java.sql.Date date)throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in getBANKReportByDATE");
		List list =null;
		try{
			Hashtable ht = new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL ,"t3://localhost:7001");
			InitialContext ctxt= new InitialContext(ht);
			TransHome home=(TransHome)ctxt.lookup("java:comp/env/ejb/TransEJB");
			Collection col = home.findByDate(date);
			if(!col.isEmpty()){
				list = new ArrayList();
				Iterator i=col.iterator();
				while(i.hasNext()){
					TransRemote remote =(TransRemote) i.next();
					ViewTransBean bean=(ViewTransBean)remote.getTransDetails();
					list.add(bean);
				}
			}
			return list;	 
		}catch(Exception e){
			System.out.println("Exception"+e);
			return list;
		}
	}//end date
	
	public Collection getBankReportByPeriod(java.sql.Date fdate,java.sql.Date tdate)throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in getBANKReportByPeriod");
		List list =null;
		try{
			Hashtable ht = new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL ,"t3://localhost:7001");
			InitialContext ctxt= new InitialContext(ht);
			TransHome home=(TransHome)ctxt.lookup("java:comp/env/ejb/TransEJB");
			Collection col = home.findByPeriod(fdate,tdate);
			if(!col.isEmpty()){
				list = new ArrayList();
				Iterator i=col.iterator();
				while(i.hasNext()){
					TransRemote remote =(TransRemote) i.next();
					ViewTransBean bean=(ViewTransBean)remote.getTransDetails();
					list.add(bean);
				}
			}
			return list;	 
		}catch(Exception e){
			System.out.println("Exception"+e);
			return list;
		}
	}//end period
	
	public Collection getCustomerReportByDate(String accno,String acctype,java.sql.Date date)throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in getCustomerReportByPeriod");
		List list =null;
		try{
			Hashtable ht = new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL ,"t3://localhost:7001");
			InitialContext ctxt= new InitialContext(ht);
			TransHome home=(TransHome)ctxt.lookup("java:comp/env/ejb/TransEJB");
			Collection col = home.findByDate(accno,acctype,date);
			if(!col.isEmpty()){
				list = new ArrayList();
				Iterator i=col.iterator();
				while(i.hasNext()){
					TransRemote remote =(TransRemote) i.next();
					ViewTransBean bean=(ViewTransBean)remote.getTransDetails();
					list.add(bean);
				}
			}
				return list;	 
		}catch(Exception e){
			System.out.println("Exception"+e);
			return list;
		}
	}//end date
	
	public Collection getCustomerReportByPeriod(String accno,String acctype,java.sql.Date fdate,java.sql.Date tdate)throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in getCustomerReportByPeriod");
		List list =null;
		try{
			Hashtable ht = new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL ,"t3://localhost:7001");
			InitialContext ctxt= new InitialContext(ht);
			TransHome home=(TransHome)ctxt.lookup("java:comp/env/ejb/TransEJB");
			Collection col = home.findByPeriod(accno,acctype,fdate,tdate);
			if(!col.isEmpty()){
				list = new ArrayList();
				Iterator i=col.iterator();
				while(i.hasNext()){
					TransRemote remote =(TransRemote) i.next();
					ViewTransBean bean=(ViewTransBean)remote.getTransDetails();
					list.add(bean);
				}
			}
			return list;	 
		}catch(Exception e){
			System.out.println("Exception"+e);
			return list;
		}
	}//end period
	
	//**********************************  isclose functions ************************************
	
	public int isSavClose(String accno) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in is close sav account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			SavingsHome home=null;
			home = (SavingsHome)Context.lookup("java:comp/env/ejb/SavingsEJB");
			SavingsRemote remote=home.findByPrimaryKey(accno);
			if("close".equals(remote.getAccountStatus()))
				return 1;
			else
				return 2;
		}
		catch(FinderException e){
			System.out.println("Cannot Find up"+e);
			return 11;
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return 13;
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return 15;
		}
	}//sav close
	
	public int isCurClose(String accno) throws RemoteException{
	
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in isclose cur account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			CurrentHome home=null;
			home = (CurrentHome)Context.lookup("java:comp/env/ejb/CurrentEJB");
			CurrentRemote remote=home.findByPrimaryKey(accno);
			if("close".equals(remote.getCurStatus()))
				return 1;
			else
				return 2;
		}
		catch(FinderException e){
			System.out.println("Cannot Find up"+e);
			return 11;
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return 13;
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return 15;
		}
	}//cur close
	
	public int isRerClose(String accno) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in isclose rer account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			RecurringHome home=null;
			home = (RecurringHome)Context.lookup("java:comp/env/ejb/RecurringEJB");
			RecurringRemote remote=home.findByPrimaryKey(accno);
			if("close".equals(remote.getRecStatus()))
				return 1;
			else
				return 2;
		}
		catch(FinderException e){
			System.out.println("Cannot Find up"+e);
			return 11;
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return 13;
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return 15;
		}
	}// rer close
	
	//**********************************  close functions ************************************
	public int savClose(String accno) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in is close sav account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			SavingsHome home=null;
			home = (SavingsHome)Context.lookup("java:comp/env/ejb/SavingsEJB");
			SavingsRemote remote=home.findByPrimaryKey(accno);
			if("close".equals(remote.getAccountStatus())){
				System.out.println("Closed Account");
				return 1;
			}				
			else{
				System.out.println("Closing Account");
				remote.setAccountStatus("close");	
				return 2;
			}
		}
		catch(FinderException e){
			System.out.println("Cannot Find up"+e);
			return 11;
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return 13;
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return 15;
		}
	}//sav close
	
	public int curClose(String accno) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in close cur account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			CurrentHome home=null;
			home = (CurrentHome)Context.lookup("java:comp/env/ejb/CurrentEJB");
			CurrentRemote remote=home.findByPrimaryKey(accno);
			
			if("close".equals(remote.getCurStatus())){
				System.out.println("Closed Account");
				return 1;
			}				
			else{
				System.out.println("Closing Account");
				remote.setCurStatus("close");	
				return 2;
			}		
		}
		catch(FinderException e){
			System.out.println("Cannot Find up"+e);
			return 11;
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return 13;
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return 15;
		}
	}//cur close
	
	public int rerClose(String accno) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in close rer account");
		try{
			Hashtable ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			InitialContext Context = new InitialContext(ht);
			RecurringHome home=null;
			home = (RecurringHome)Context.lookup("java:comp/env/ejb/RecurringEJB");
			RecurringRemote remote=home.findByPrimaryKey(accno);
			
			if("close".equals(remote.getRecStatus())){
				System.out.println("Closed Account");
				return 1;
			}				
			else{
				System.out.println("Closing Account");
				remote.setRecStatus("close");	
				return 2;
			}			
		}
		catch(FinderException e){
			System.out.println("Cannot Find up"+e);
			return 11;
		}
		catch(RemoteException e){
			System.out.println("RemoteException"+e);
			return 13;
		}
		catch(Exception e){
			System.out.println("Cannot look up"+e);
			return 15;
		}
	}// rer close
}//end class