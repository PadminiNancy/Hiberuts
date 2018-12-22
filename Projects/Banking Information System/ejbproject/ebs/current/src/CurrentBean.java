package current;
import java.rmi.*;
import javax.ejb.*;

public abstract class CurrentBean implements EntityBean{
	EntityContext ectxt;
	public void setEntityContext(EntityContext ectxt){
		this.ectxt=ectxt;
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in set entiy");
	}
	public void unsetEntityContext(){
		ectxt=null;
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in unset entiy");
	}
	
	public String ejbCreate(String acctype, java.sql.Date opendate, double balance,String name,String address, long phone, String occupation, String nation, double income,String cheque,String status,java.sql.Date dob, String gender) throws CreateException,RemoteException	{
		 System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in create");
		 this.setAccno(PKGeneratorFactory.getFactory().getStringPrimaryKey("curent","accno")); 
		 this.setAcctype(acctype);
		 this.setOpendate(opendate);
		 this.setBalance(balance);
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

	public void ejbPostCreate(String acctype, java.sql.Date opendate, double balance,String name,String address, long phone, String occupation, String nation, double income,String cheque,String status,java.sql.Date dob, String gender) throws CreateException,RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in postcreate");
	}

	public void ejbRemove(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in remove");}
	public void ejbPassivate(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in pass");}
	public void ejbActivate(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in act");}
	public void ejbLoad(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in load");}
	public void ejbStore(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in set store");}
		
	public abstract void setAccno(String accno );
	public abstract String getAccno();
	
	public abstract void setAcctype(String acctype );
	public abstract String getAcctype();
	
	public abstract void setName(String name);
	public abstract String getName();
	
	public abstract void setAddress(String address);
	public abstract String getAddress();
	
	public abstract void setPhone(long phone);
	public abstract long  getPhone();
	
	public abstract void setOccupation(String occupation);
	public abstract String getOccupation();
	
	public abstract void setNation(String nation );
	public abstract String  getNation();
	
	public abstract void setCheque(String cheque);
	public abstract String  getCheque();
	
	public abstract void setStatus(String status);
	public abstract String  getStatus();
	
	public abstract void setBalance(double balance );
	public abstract double  getBalance();
	
	public abstract void setIncome(double income);
	public abstract double getIncome();
	
	public abstract void setOpendate(java.sql.Date opendate );
	public abstract java.sql.Date getOpendate();
	
	public abstract void setDob(java.sql.Date dob );
	public abstract java.sql.Date getDob();
	
	public abstract void setGender(String gender );
	public abstract String getGender();

	/* Remote Methods *****************/
	
	public void setCurAccno(String accno ){ this.setAccno(accno);}
	public String getCurAccno(){ return this.getAccno();}
	
	public void setCurAcctype(String acctype ){ this.setAcctype(acctype);}
	public String getCurAcctype(){ return this.getAcctype();}
	
	public void setCurName(String name){ this.setName(name);}
	public String getCurName(){ return this.getName();}
	
	public void setCurAddress(String address){ this.setAddress(address);}
	public String getCurAddress(){ return this.getAddress();}
	
	public void setCurPhone(long phone){ this.setPhone(phone);}
	public long  getCurPhone(){  return this.getPhone();}
	
	public void setCurOccupation(String occupation){ this.setOccupation(occupation);}
	public String getCurOccupation(){ return this.getOccupation();}
	
	public void setCurNation(String nation ){ this.setNation(nation);}
	public String  getCurNation(){  return this.getNation();}
	
	public void setCurCheque(String cheque){ this.setCheque(cheque);}
	public String  getCurCheque(){  return this.getCheque();}
	
	public void setCurStatus(String status){ this.setStatus(status);}
	public String  getCurStatus(){  return this.getStatus();}
	
	public void setCurBalance(double balance ){ this.setBalance(balance);}
	public double  getCurBalance(){ return this.getBalance();}
	
	public void setCurIncome(double income){ this.setIncome(income);}
	public double getCurIncome(){ return this.getIncome();}
	
	public void setCurOpendate(java.sql.Date opendate ){ this.setOpendate(opendate);}
	public java.sql.Date getCurOpendate(){ return this.getOpendate();}
	
	public void setCurDob(java.sql.Date dob ){ this.setDob(dob);}
	public java.sql.Date getCurDob(){ return this.getDob();}
	
	public void setCurGender(String gender ){ this.setGender(gender);}
	public String getCurGender(){ return this.getGender();};

	public ViewCurBean view()throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in view()");
		ViewCurBean bean=new ViewCurBean();
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
		String status=this.getCurStatus();
		if("open".equals(status)){
			this.setCurBalance(this.getCurBalance()+amt);
			return true;
		}
		else{
			System.out.println("Closed Account");
			return false;
		}		
	}//end deposit

	public boolean withdraw (double amt) throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in wit()");
		String status=this.getCurStatus();
		if("open".equals(status)){
			if(this.getCurBalance()>=amt){
			this.setCurBalance(this.getCurBalance()-amt);
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