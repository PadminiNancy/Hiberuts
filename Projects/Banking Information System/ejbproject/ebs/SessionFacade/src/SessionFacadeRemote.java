package SessionFacade;
import java.rmi.*;
import javax.ejb.*;
import java.util.*;
import savings.*;
import recurring.*;
import login.*;
import current.*;
import trans.*;

public interface SessionFacadeRemote extends EJBObject{
	
	public int checkUser(String userid,String type) throws RemoteException;
	
	// creating
	public String createSavAccount(ViewSavBean create) throws RemoteException;
	public String createRerAccount(ViewRerBean create) throws RemoteException;
	public String createCurAccount(ViewCurBean create) throws RemoteException;
	public String createTransaction(ViewTransBean create) throws RemoteException;
	
	// viewing 
	public ViewSavBean viewSavAccount(String accno) throws RemoteException;
	public ViewCurBean viewCurAccount(String accno) throws RemoteException;
	public ViewRerBean viewRerAccount(String accno) throws RemoteException;
	
	// modifing
	public int modifySavAccount(String accno ,ViewSavBean modify) throws RemoteException;
	public int modifyRerAccount(String accno, ViewRerBean modify) throws RemoteException;
	public int modifyCurAccount(String accno, ViewCurBean modify) throws RemoteException;
	
	// Transactions
	
	public int depositIntoSav(String accno,double amount) throws RemoteException;
	public int depositIntoCur(String accno,double amount)  throws RemoteException;
	public int withdrawFromSav(String accno,double amount) throws RemoteException;
	public int withdrawFromCur(String accno,double amount)  throws RemoteException;
	public int transferSToS(String src_accno,String des_accno,double amount)throws RemoteException;
	public int transferSToC(String src_accno,String des_accno,double amount)throws RemoteException;
	public int transferCToC(String src_accno,String des_accno,double amount)throws RemoteException;
	public int transferCToS(String src_accno,String des_accno,double amount)throws RemoteException;
	
	//Reports
	
	public Collection getBankReportByDate(java.sql.Date date)throws RemoteException;
	public Collection getBankReportByPeriod(java.sql.Date fdate,java.sql.Date tdate)throws RemoteException;
	public Collection getCustomerReportByDate(String accno,String acctype,java.sql.Date date)throws RemoteException;
	public Collection getCustomerReportByPeriod(String accno,String acctype,java.sql.Date fdate,java.sql.Date tdate)throws RemoteException;
	
	// isCloseFunctions
	public int isSavClose(String accno) throws RemoteException;
	public int isRerClose(String accno) throws RemoteException;
	public int isCurClose(String accno) throws RemoteException;
	
	// closeFunctions
	public int savClose(String accno) throws RemoteException;
	public int rerClose(String accno) throws RemoteException;
	public int curClose(String accno) throws RemoteException;
}