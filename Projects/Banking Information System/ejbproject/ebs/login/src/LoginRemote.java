package login;
import java.rmi.*;
import javax.ejb.*;

public interface LoginRemote extends EJBObject{

	public void setLoginUserid ( String userid) throws RemoteException;
	public void setLoginPassword( String password) throws RemoteException;
	public void setLoginType( String type) throws RemoteException;
	public String getLoginUserid () throws RemoteException;
	public String getLoginPassword() throws RemoteException;
	public String getLoginType() throws RemoteException;
}