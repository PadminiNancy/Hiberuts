package current;
import java.rmi.*;
import javax.ejb.*;

public interface CurrentRemote extends EJBObject{
	public boolean deposit (double amt) throws RemoteException;
	public boolean withdraw (double amt) throws RemoteException;
	public ViewCurBean view()throws RemoteException;
	  
	public void setCurAccno(String accno ) throws RemoteException;
	public String getCurAccno() throws RemoteException;

	public void setCurAcctype(String acctype ) throws RemoteException;
	public String getCurAcctype() throws RemoteException;

	public void setCurName(String name) throws RemoteException;
	public String getCurName() throws RemoteException;

	public void setCurAddress(String address) throws RemoteException;
	public String getCurAddress() throws RemoteException;

	public void setCurPhone(long phone) throws RemoteException;
	public long  getCurPhone() throws RemoteException;

	public void setCurOccupation(String occupation) throws RemoteException;
	public String getCurOccupation() throws RemoteException;

	public void setCurNation(String nation ) throws RemoteException;
	public String  getCurNation() throws RemoteException;

	public void setCurCheque(String cheque) throws RemoteException;
	public String  getCurCheque() throws RemoteException;

	public void setCurStatus(String status) throws RemoteException;
	public String  getCurStatus() throws RemoteException;

	public void setCurBalance(double balance ) throws RemoteException;
	public double  getCurBalance() throws RemoteException;

	public void setCurIncome(double income) throws RemoteException;
	public double getCurIncome() throws RemoteException;

	public void setCurOpendate(java.sql.Date opendate ) throws RemoteException;
	public java.sql.Date getCurOpendate() throws RemoteException;

	public void setCurDob(java.sql.Date dob ) throws RemoteException;
	public java.sql.Date getDob() throws RemoteException;

	public void setCurGender(String gender ) throws RemoteException;
	public String getCurGender() throws RemoteException;
}