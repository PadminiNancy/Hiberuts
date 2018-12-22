package recurring;
import java.rmi.*;
import javax.ejb.*;

public abstract class RecurringBean implements EntityBean{
	EntityContext ectxt;
	public void setEntityContext(EntityContext ectxt){
		this.ectxt=ectxt;
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ Recurring in set entiy");
	}
	public void unsetEntityContext(){
		ectxt=null;
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ Recurring in unset entiy");
	}
	public String ejbCreate( String acctype, java.sql.Date opendate, double balance,double period,double matamt,double interest, String name,String address, long phone, String occupation, String nation, double income,java.sql.Date dob,String gender, java.sql.Date mdate,String status) throws CreateException,RemoteException{
		 System.out.println("@@@@@@@@@@@@@@@@@@@@@@ Recurring in create");
		 this.setAccno(PKGeneratorFactory.getFactory().getStringPrimaryKey("Recurring","accno")); 
		 this.setAcctype(acctype);
		 this.setOpendate(opendate);
		 this.setBalance(balance);
		 this.setName(name);
		 this.setAddress(address);
		 this.setPhone(phone);
		 this.setOccupation(occupation);
		 this.setIncome(income);
		 this.setNation(nation);
		 this.setMatamt(matamt);
		 this.setPeriod(period);
		 this.setInterest(interest);
		 this.setGender(gender);
         this.setDob(dob);
         this.setMdate(mdate);
	 	 this.setStatus(status);	
		 return this.getAccno();
	}//end Create 
	public void ejbPostCreate( String acctype, java.sql.Date opendate, double balance,double period,double matamt,double interest, String name,String address, long phone, String occupation, String nation, double income,java.sql.Date dob,String gender, java.sql.Date mdate,String status) throws CreateException,RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ Recurring in postcreate");
	}
	public void ejbRemove(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ Recurring in remove");}
	public void ejbPassivate(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ Recurring in pass");}
	public void ejbActivate(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@  Recurring in act");}
	public void ejbLoad(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ Recurring in load");}
	public void ejbStore(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ Recurring in set store");}
	
	// define the persistence virtual fields
	public abstract void setAccno(String accno );
	public abstract String getAccno();
	
	public  abstract void setAcctype(String acctype );
	public  abstract String getAcctype();
	
	public  abstract void setOpendate(java.sql.Date opendate );
	public  abstract java.sql.Date getOpendate();
	
	public  abstract void setMdate(java.sql.Date mdate );
	public  abstract java.sql.Date getMdate();
	
	public  abstract void setName(String name);
	public  abstract String getName();
	
	public  abstract void setAddress(String address);
	public  abstract String getAddress();
	
	public  abstract void setPhone(long phone);
	public  abstract long  getPhone();
	
	public  abstract void setOccupation(String occupation);
	public  abstract String getOccupation();
	
	public  abstract void setNation(String nation );
	public  abstract String  getNation();
	
	
	public  abstract void setBalance(double balance );
	public  abstract double  getBalance();
	
	public  abstract void setIncome(double income);
	public  abstract double getIncome();
	
	public  abstract void setMatamt(double matamt);
	public  abstract double getMatamt();
	
	public  abstract void setInterest(double interest);
	public  abstract double getInterest();
	
	public  abstract void setPeriod(double period);
	public  abstract double getPeriod();
	
	public  abstract void setGender(String gender );
	public  abstract String  getGender();
	
	public  abstract void setDob(java.sql.Date dob );
	public  abstract java.sql.Date  getDob();
	
	public  abstract void setStatus(String status );
	public  abstract String  getStatus();

	public void setRecAccno(String accno ){ this.setAccno(accno);}
	public String getRecAccno(){ return this.getAccno();}
	
	public void setRecAcctype(String acctype ){ this.setAcctype(acctype);}
	public String getRecAcctype(){ return this.getAcctype();}
	
	public void setRecOpendate(java.sql.Date opendate ){ this.setOpendate(opendate);}
	public java.sql.Date getRecOpendate(){ return this.getOpendate();}
	
	public void setRecMdate(java.sql.Date mdate ){ this.setMdate(mdate);}
	public java.sql.Date getRecMdate(){ return this.getMdate();}
	
	public void setRecName(String name){ this.setName(name);}
	public String getRecName(){ return this.getName();}
	
	public void setRecAddress(String address){ this.setAddress(address);}
	public String getRecAddress(){ return this.getAddress();}
	
	public void setRecPhone(long phone){ this.setPhone(phone);}
	public long  getRecPhone(){  return this.getPhone();}
	
	public void setRecOccupation(String occupation){ this.setOccupation(occupation);}
	public String getRecOccupation(){ return this.getOccupation();}
	
	public void setRecNation(String nation ){ this.setNation(nation);}
	public String  getRecNation(){  return this.getNation();}
	
	
	public void setRecBalance(double balance ){ this.setBalance(balance);}
	public double  getRecBalance(){ return this.getBalance();}
	
	public void setRecIncome(double income){ this.setIncome(income);}
	public double getRecIncome(){ return this.getIncome();}
	
	public void setRecMatamt(double matamt){ this.setMatamt(matamt);}
	public double getRecMatamt(){ return this.getMatamt();}
	
	public void setRecInterest(double interest){ this.setInterest(interest);}
	public double getRecInterest(){ return this.getInterest();}
	
	public void setRecPeriod(double period){ this.setPeriod(period);}
	public double getRecPeriod(){ return this.getPeriod();}
	
	public void setRecGender(String gender ){ this.setGender(gender);}
	public String  getRecGender(){  return this.getGender();}
	
	public void setRecDob(java.sql.Date dob ){ this.setDob(dob);}
	public java.sql.Date  getRecDob(){  return this.getDob();}
	
	public void setRecStatus(String status ){ this.setStatus(status);}
	public String  getRecStatus(){  return this.getStatus();}
	public ViewRerBean view()throws RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ Recurring in view()");
		ViewRerBean bean=new ViewRerBean();
		bean.setAccno(this.getAccno());
		bean.setAcctype(this.getAcctype());
		bean.setOpendate(this.getOpendate());
		bean.setBalance(this.getBalance());
		bean.setName(this.getName());
		bean.setAddress(this.getAddress());
		bean.setPhone(this.getPhone());
		bean.setOccupation(this.getOccupation());
		bean.setNation(this.getNation());
		bean.setIncome(this.getIncome());
		bean.setMatamt(this.getMatamt());
		bean.setInterest(this.getInterest());
		bean.setPeriod(this.getPeriod());
		bean.setGender(this.getGender());
		bean.setDob(this.getDob());
		bean.setMdate(this.getMdate());
		bean.setStatus(this.getStatus());
		return bean;
	}//end view
	public  double cancel () throws RemoteException{
		java.util.Date u= new java.util.Date();
		int cy,oy, cm, om;
		cy = u.getYear();
		cm= u.getMonth();
		oy= getRecOpendate().getYear();
		om=getRecOpendate().getMonth();
		if(cy!=oy && cy>oy) 		//>1
		{
			if((cy-oy)==1) // ==1
			{
				if(cm==om || cm>om){
					this.setRecMatamt( getRecBalance()+ (getRecBalance() * 1 * (getRecInterest()/100))/100);
				}
				else{
					this.setRecMatamt( getRecBalance());
				}	
			}
			else if ((cy-oy)>1) //>1
			{
				int p= cy-oy;
				if(cm==om || cm>om){ 
					this.setRecMatamt( getRecBalance()+ (getRecBalance() * p * (getRecInterest()/100))/100 );
				}
				else if (cm<om){
					this.setRecMatamt( getRecBalance()+ (getRecBalance() * (p-1) * (getRecInterest()/100))/100 );				
				}
			}	
		}
		else if (cy==oy)//<1
		{
			this.setRecMatamt( getRecBalance());
		}
		//compare with system date and calculate amt
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in mat()"+getRecMatamt());
		return getRecMatamt();
	}//end 
}//end class