package savings;
import java.rmi.*;
import javax.ejb.*;


public abstract class SavingsBean implements EntityBean{
	EntityContext ectxt;
	public void setEntityContext(EntityContext ectxt){
		this.ectxt=ectxt;
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in set entiy");
	}
	public void unsetEntityContext(){
		ectxt=null;
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in unset entiy");
	}
	
	public String ejbCreate( String acctype, java.sql.Date opendate, double balance,String name,String address, long phone, String occupation, String nation, double income,String cheque,String status,java.sql.Date dob, String gender) throws CreateException,RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in create");
		this.setAccno(PKGeneratorFactory.getFactory().getStringPrimaryKey("savings","accno")); 
		this.setAcctype(acctype);
		this.setBalance(balance);
		this.setOpendate(opendate);
		this.setName(name);
		this.setAddress(address);
		this.setPhone(phone);
		this.setOccupation(occupation);
		this.setIncome(income);
		this.setNation(nation);
		this.setCheque(cheque);
		this.setStatus(status);
		this.setDob(dob);
		this.setGender(gender); 		
		return this.getAccno();
	}//end Create 
	
	public void ejbPostCreate( String acctype, java.sql.Date opendate, double balance,String name,String address, long phone, String occupation, String nation, double income,String cheque,String status,java.sql.Date dob, String gender) throws CreateException,RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in postcreate");
	}
	public void ejbRemove(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in remove");}
	public void ejbPassivate(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in pass");}
	public void ejbActivate(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in act");}
	public void ejbLoad(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in load");}
	public void ejbStore(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in set store");}
	public abstract String getAccno();
	public abstract void  setAccno(String accno );
	public abstract String getAcctype();
	public abstract void setAcctype(String acctype );
	public abstract String getName();
	public abstract void setName(String name);
	public abstract String getAddress();
	public abstract void setAddress(String address);
	public abstract long  getPhone() ;
	public abstract void setPhone(long phone) ;
	public abstract String getOccupation() ;
	public abstract void setOccupation(String occupation) ;
	public abstract String  getNation() ;
	public abstract void setNation(String nation ) ;
	public abstract String  getCheque() ;
	public abstract void setCheque(String cheque) ;
	public abstract String  getStatus() ;
	public abstract void setStatus(String status) ;
	public abstract double  getBalance() ;
	public abstract void setBalance(double balance ) ;
	public abstract double getIncome() ;
	public abstract void setIncome(double income) ;
	public abstract java.sql.Date getOpendate() ;
	public abstract void setOpendate(java.sql.Date opendate );
	public abstract java.sql.Date getDob();
	public abstract  void setDob(java.sql.Date dob );
	public abstract  String getGender();
	public abstract  void setGender(String gender );
	public void setAccountno(String accno ){ this.setAccno(accno);}
	public String getAccountno(){ return this.getAccno();}
	public void setAccounttype(String acctype ){ this.setAcctype(acctype);}
	public String getAccounttype(){ return this.getAcctype();}
	public void setCustName(String name){ this.setName(name);}
	public String getCustName(){ return this.getName();}
	public void setCustAddress(String address){ this.setAddress(address);}
	public String getCustAddress(){ return this.getAddress();}
	public void setCustPhone(long phone){ this.setPhone(phone);}
	public long  getCustPhone(){  return this.getPhone();}
	public void setCustOccupation(String occupation){ this.setOccupation(occupation);}
	public String getCustOccupation(){ return getOccupation();}
	public void setCustNation(String nation ){ this.setNation(nation);}
	public String  getCustNation(){  return this.getNation();}
	public void setCustCheque(String cheque){ this.setCheque(cheque);}
	public String  getCustCheque(){  return this.getCheque();}
	public void setAccountStatus(String status){ this.setStatus(status);}
	public String  getAccountStatus(){  return this.getStatus();}
	public void setAccountBalance(double balance ){ this.setBalance(balance);}
	public double  getAccountBalance(){ return this.getBalance();}
	public void setCustIncome(double income){ this.setIncome(income);}
	public double getCustIncome(){ return this.getIncome();}
	public void setAccountOpendate(java.sql.Date opendate ){ this.setOpendate(opendate);}
	public java.sql.Date getAccountOpendate(){ return this.getOpendate();}
	public void setCustDob(java.sql.Date dob ){ this.setDob(dob);}
	public java.sql.Date getCustDob(){ return this.getDob();}
	public void setCustGender(String gender ){ this.setGender(gender);}
	public String getCustGender(){ return this.getGender();}
	
	public ViewSavBean view()throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in view()");
		ViewSavBean bean=new ViewSavBean();
		bean.setAccno(this.getAccno());
		bean.setAcctype(this.getAcctype());
		bean.setOpendate(this.getOpendate());
		bean.setBalance(this.getBalance());
		bean.setName(this.getName());
		bean.setAddress(this.getAddress());
		bean.setPhone(this.getPhone());
		bean.setOccupation(this.getOccupation());
		bean.setNation(this.getNation());
		bean.setCheque(this.getCheque());
		bean.setIncome(this.getIncome());
		bean.setStatus(this.getStatus());
		bean.setGender(this.getGender());
		bean.setDob(this.getDob());
		return bean;
	}//end view
	
	public boolean deposit (double amt) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in dep()");
		String status=this.getAccountStatus();
		if("open".equals(status)){
			this.setAccountBalance(this.getAccountBalance() + amt );
			return true;
		}
		else{
			System.out.println("Closed Account");
			return false;
		}
		
	}//end deposit
	public boolean withdraw (double amt) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in wit()");
		String status=this.getAccountStatus();
		if("open".equals(status)){
			if(this.getAccountBalance()>=amt){
				this.setAccountBalance(this.getAccountBalance() - amt );
				return true;
			}
			else{
				System.out.println("Low Balance");
				return false;
			}
		}
		else{
			System.out.println("Closed Account");
			return false;
		}		
	}//end withdraw  
}//end class