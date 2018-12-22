package recurring;
import java.rmi.*;
import javax.ejb.*;

public interface RecurringRemote extends EJBObject{
	public ViewRerBean view() throws RemoteException;
	public  double cancel () throws RemoteException;
				
	public void setRecAccno(String accno ) throws RemoteException;
	public String getRecAccno() throws RemoteException;
	
	public void setRecAcctype(String acctype ) throws RemoteException;
	public String getRecAcctype() throws RemoteException;
	
	public void setRecOpendate(java.sql.Date opendate ) throws RemoteException;
	public java.sql.Date getRecOpendate() throws RemoteException;
	
	public void setRecMdate(java.sql.Date mdate ) throws RemoteException;
	public java.sql.Date getRecMdate() throws RemoteException;
	
	public void setRecName(String name) throws RemoteException;
	public String getRecName() throws RemoteException;
	
	public void setRecAddress(String address) throws RemoteException;
	public String getRecAddress() throws RemoteException;
	
	public void setRecPhone(long phone) throws RemoteException;
	public long  getRecPhone() throws RemoteException;
	
	public void setRecOccupation(String occupation) throws RemoteException;
	public String getRecOccupation() throws RemoteException;
	
	public void setRecNation(String nation ) throws RemoteException;
	public String  getRecNation() throws RemoteException;
	
	public void setRecBalance(double balance ) throws RemoteException;
	public double  getRecBalance() throws RemoteException;
	
	public void setRecIncome(double income) throws RemoteException;
	public double getRecIncome() throws RemoteException;
	
	public void setRecMatamt(double matamt) throws RemoteException;
	public double getRecMatamt() throws RemoteException;
	
	public void setRecInterest(double interest) throws RemoteException;
	public double getRecInterest() throws RemoteException;
	
	public void setRecPeriod(double period) throws RemoteException;
	public double getRecPeriod() throws RemoteException;
	
	public void setRecGender(String gender ) throws RemoteException;
	public String  getRecGender() throws RemoteException;
	
	public void setRecDob(java.sql.Date dob ) throws RemoteException;
	public java.sql.Date  getRecDob() throws RemoteException;
	
	public void setRecStatus(String status ) throws RemoteException;
	public String  getRecStatus() throws RemoteException;  
}