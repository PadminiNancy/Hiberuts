package login;
import java.rmi.*;
import javax.ejb.*;

public abstract class LoginBean implements EntityBean{
	EntityContext ectxt;
	//public String userid,password,type;

	public void setEntityContext(EntityContext ectxt){
		this.ectxt=ectxt;
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in set entiy");
	}
	public void unsetEntityContext(){
		ectxt=null;
	    System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in unset entiy");
	}
	public String ejbCreate(String userid,String password,String type) throws CreateException,RemoteException{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in create");
		this.setUserid(userid);
		this.setPassword(password);
		this.setType(type);
		return userid;
	}//end Create 
	
	public void ejbPostCreate(String userid,String password,String type) throws CreateException,RemoteException{
	    System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in postcreate");
	}
	
	public void ejbRemove(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in remove");}
	public void ejbPassivate(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in pass");}
	public void ejbActivate(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in act");}
	public void ejbLoad(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in load");}
	public void ejbStore(){System.out.println("@@@@@@@@@@@@@@@@@@@@@@ in set store");}
	public abstract String getUserid();
	public abstract void setUserid( String userid );
	public abstract String getPassword();
	public abstract void setPassword( String password );
	public abstract String getType();
	public abstract void setType( String type );
	public void setLoginUserid( String userid )throws RemoteException{
		this.setUserid(userid);
	}
	public void setLoginPassword( String password )throws RemoteException{
		this.setPassword(password);
	}
	public void setLoginType( String type )throws RemoteException{
		this.setType(type);
	}
	public String getLoginUserid() throws RemoteException{
		return this.getUserid();
	}
	public String getLoginPassword() throws RemoteException{
		return this.getPassword();
	}
	public String getLoginType() throws RemoteException{
		return this.getType();
	}
}//end class