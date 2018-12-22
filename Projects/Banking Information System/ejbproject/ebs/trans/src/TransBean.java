package trans;
import java.rmi.*;
import javax.ejb.*;

abstract public class TransBean implements EntityBean{
	public void setEntityContext(EntityContext ctxt){}
	public void unsetEntityContext() {}
	public void ejbActivate(){}
	public void ejbPassivate(){}
	public void ejbLoad(){}
	public void ejbStore(){}
	public void ejbRemove(){}
	
	public String ejbCreate(String accno,String name, String acctype,java.sql.Date tdate,String tratype,double traamt) throws RemoteException,CreateException{
	setTransno(PKGeneratorFactory.getFactory().getStringPrimaryKey("reports","transno"));
	setAccno(accno);
	setAcctype(acctype);
	setName(name);
	setTdate(tdate);
	setTratype(tratype);
	setTraamt(traamt);
	return this.getTransno();
}
	public void ejbPostCreate(String accno,String name, String acctype,java.sql.Date tdate,String tratype,double traamt) throws RemoteException,CreateException{
	}

	abstract public void setTransno(String transno);
	abstract public String getTransno();

	abstract public void setAccno(String accno);
	abstract public String getAccno();
	
	abstract public void setName(String name);
	abstract public String getName();
	
	abstract public void setAcctype(String acctype);
	abstract public String getAcctype();
	
	abstract public void setTdate(java.sql.Date tdate);
	abstract public java.sql.Date getTdate();

	abstract public void setTratype(String tratype);
	abstract public String getTratype();
	
	abstract public void setTraamt(double traamt);
	abstract public double getTraamt();
	
	public ViewTransBean getTransDetails()throws RemoteException{
		ViewTransBean bean=new ViewTransBean();
		bean.transno=getTransno();
		bean.accno=getAccno();
		bean.name=getName();
		bean.acctype=getAcctype();
		bean.tdate=getTdate();
		bean.tratype=getTratype();
		bean.traamt=getTraamt();
		return bean;
	}
}