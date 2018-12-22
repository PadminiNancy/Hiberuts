package trans;
import java.rmi.*;
import javax.ejb.*;
public interface TransRemote extends EJBObject{
	public ViewTransBean getTransDetails()throws RemoteException;
}