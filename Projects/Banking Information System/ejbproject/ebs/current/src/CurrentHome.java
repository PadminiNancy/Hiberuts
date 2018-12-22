package current;
import java.rmi.*;
import javax.ejb.*;

public interface CurrentHome extends EJBHome{
	public CurrentRemote create( String acctype, java.sql.Date opendate, double balance,String name,String address, long phone, String occupation, String nation, double income,String cheque,String status,java.sql.Date dob, String gender) throws CreateException,RemoteException;
	public CurrentRemote findByPrimaryKey(String pk)throws FinderException,RemoteException;
}