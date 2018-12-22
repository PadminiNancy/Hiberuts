package recurring;
import java.io.*;
public class ViewRerBean implements Serializable{
	String accno,acctype,name,address,occupation,nation,gender,status;
	double balance,income,matamt,interest,period;
	java.sql.Date opendate,mdate,dob;
	long phone;
	
	public void setAccno(String accno ){ this.accno=accno;}
	public String getAccno(){ return accno;}
	
	public void setAcctype(String acctype ){ this.acctype=acctype;}
	public String getAcctype(){ return acctype;}
	
	public void setOpendate(java.sql.Date opendate ){ this.opendate=opendate;}
	public java.sql.Date getOpendate(){ return opendate;}
	
	public void setMdate(java.sql.Date mdate ){ this.mdate=mdate;}
	public java.sql.Date getMdate(){ return mdate;}
	
	public void setName(String name){ this.name=name;}
	public String getName(){ return name;}
	
	public void setAddress(String address){ this.address=address;}
	public String getAddress(){ return address;}
	
	public void setPhone(long phone){ this.phone=phone;}
	public long  getPhone(){  return phone;}
	
	public void setOccupation(String occupation){ this.occupation=occupation;}
	public String getOccupation(){ return occupation;}
	
	public void setNation(String nation ){ this.nation=nation;}
	public String  getNation(){  return nation;}
	
	public void setBalance(double balance ){ this.balance=balance;}
	public double  getBalance(){ return balance;}
	
	public void setIncome(double income){ this.income=income;}
	public double getIncome(){ return income;}
	
	public void setMatamt(double matamt){ this.matamt=matamt;}
	public double getMatamt(){ return matamt;}
	
	public void setInterest(double interest){ this.interest=interest;}
	public double getInterest(){ return interest;}
	
	public void setPeriod(double period){ this.period=period;}
	public double getPeriod(){ return period;}
	
	public void setGender(String gender ){ this.gender=gender;}
	public String  getGender(){  return gender;}
	
	public void setDob(java.sql.Date dob ){ this.dob=dob;}
	public java.sql.Date  getDob(){  return dob;}
	
	public void setStatus(String status ){ this.status=status;}
	public String  getStatus(){  return status;}
}//end