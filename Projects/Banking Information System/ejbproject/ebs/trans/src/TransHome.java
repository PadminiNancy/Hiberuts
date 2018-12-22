package trans;
import java.rmi.*;
import javax.ejb.*;
import java.util.*;

public interface TransHome extends EJBHome{
	public TransRemote create(String accno,String name, String acctype,java.sql.Date tdate,String tratype , double traamt) throws RemoteException,CreateException;
	public TransRemote findByPrimaryKey(String pk)throws FinderException, RemoteException;
	public Collection findByDate(String accno,String acctype,java.sql.Date date)throws FinderException, RemoteException;
	public Collection findByDate(java.sql.Date date)throws FinderException, RemoteException;
	public Collection findByPeriod(String accno,String acctype,java.sql.Date fdate,java.sql.Date tdate)throws FinderException, RemoteException;
	public Collection findByPeriod(java.sql.Date fdate,java.sql.Date tdate)throws FinderException, RemoteException;
}