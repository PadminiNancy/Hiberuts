package savings;
import java.rmi.*;
import javax.ejb.*;

public interface SavingsRemote extends EJBObject{
    public boolean deposit (double amt) throws RemoteException;
	public boolean withdraw (double amt) throws RemoteException;
	public ViewSavBean view()throws RemoteException;
	public void setAccountno(String accno ) throws RemoteException;
	public String getAccountno() throws RemoteException;
	public void setAccounttype(String acctype ) throws RemoteException;
	public String getAccounttype() throws RemoteException;
	public void setCustName(String name) throws RemoteException;
	public String getCustName() throws RemoteException;
	public void setCustAddress(String address) throws RemoteException;
	public String getCustAddress() throws RemoteException;
	public void setCustPhone(long phone) throws RemoteException;
	public long  getCustPhone() throws RemoteException;
	public void setCustOccupation(String occupation) throws RemoteException;
	public String getCustOccupation() throws RemoteException;
	public void setCustNation(String nation ) throws RemoteException;
	public String  getCustNation() throws RemoteException;
	public void setCustCheque(String cheque) throws RemoteException;
	public String  getCustCheque() throws RemoteException;
	public void setAccountStatus(String status) throws RemoteException;
	public String  getAccountStatus() throws RemoteException;
	public void setAccountBalance(double balance ) throws RemoteException;
	public double  getAccountBalance() throws RemoteException;
	public void setCustIncome(double income) throws RemoteException;
	public double getCustIncome() throws RemoteException;
	public void setAccountOpendate(java.sql.Date opendate ) throws RemoteException;
	public java.sql.Date getAccountOpendate() throws RemoteException;
	public void setCustDob(java.sql.Date dob ) throws RemoteException;
	public java.sql.Date getCustDob() throws RemoteException;
	public void setCustGender(String gender ) throws RemoteException;
	public String getCustGender() throws RemoteException;
}