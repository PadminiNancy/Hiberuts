package savings;
import java.rmi.*;
import javax.ejb.*;

public interface SavingsHome extends EJBHome{
	public SavingsRemote create( String acctype, java.sql.Date opendate, double balance,String name,String address, long phone, String occupation, String nation, double income,String cheque,String status,java.sql.Date dob, String gender) throws CreateException,RemoteException;
	public SavingsRemote findByPrimaryKey(String pk)throws FinderException,RemoteException;
}