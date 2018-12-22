package recurring;
import java.rmi.*;
import javax.ejb.*;
public interface RecurringHome extends EJBHome{
	public RecurringRemote create( String acctype, java.sql.Date opendate, double balance,double period,double matamt,double interest, String name,String address, long phone, String occupation, String nation, double income,java.sql.Date dob,String gender, java.sql.Date mdate,String status) throws CreateException,RemoteException;
	public RecurringRemote findByPrimaryKey(String pk)throws FinderException,RemoteException;
}

