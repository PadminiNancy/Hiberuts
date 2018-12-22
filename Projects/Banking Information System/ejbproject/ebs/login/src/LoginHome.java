package login;
import java.rmi.*;
import javax.ejb.*;
public interface LoginHome extends EJBHome{
	public LoginRemote create(String userid,String password,String type) throws CreateException,RemoteException;
	public LoginRemote findByPrimaryKey(String userid) throws FinderException, RemoteException;
}