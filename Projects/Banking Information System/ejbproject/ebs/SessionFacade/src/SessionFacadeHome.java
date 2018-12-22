package SessionFacade;
import java.rmi.*;
import javax.ejb.*;

public interface SessionFacadeHome extends EJBHome{

	public SessionFacadeRemote create() throws CreateException,RemoteException;
	
}