package savings;
import java.io.*;

public class ViewSavBean implements Serializable{
	String accno,acctype,name,address,occupation,nation,cheque,status,gender;
	double balance,income;
	long phone;
	java.sql.Date dob;

	java.sql.Date opendate;
	public void setAccno(String accno ){ this.accno=accno;}
	public String getAccno(){ return accno;}
	
	public void setAcctype(String acctype ){ this.acctype=acctype;}
	public String getAcctype(){ return acctype;}
	
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
	
	public void setCheque(String cheque){ this.cheque=cheque;}
	public String  getCheque(){  return cheque;}
	
	public void setStatus(String status){ this.status=status;}
	public String  getStatus(){  return status;}
	
	public void setBalance(double balance ){ this.balance=balance;}
	public double  getBalance(){ return balance;}
	
	public void setIncome(double income){ this.income=income;}
	public double getIncome(){ return income;}
	
	public void setOpendate(java.sql.Date opendate ){ this.opendate=opendate;}
	public java.sql.Date getOpendate(){ return opendate;}
	
	public void setDob(java.sql.Date dob ){ this.dob=dob;}
	public java.sql.Date getDob(){ return dob;}
	
	public void setGender(String gender ){ this.gender=gender;}
	public String getGender(){ return gender;}

}//end