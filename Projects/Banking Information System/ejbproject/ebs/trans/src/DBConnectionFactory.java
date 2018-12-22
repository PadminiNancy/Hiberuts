package trans;
import javax.naming.*;
import java.sql.*;
import javax.sql.*;
import java.util.*;

public final class DBConnectionFactory{

	private static DBConnectionFactory factory;
	Hashtable ht;
	Context ctxt;
	DataSource ds;
	Connection con;
	Map map;
	private DBConnectionFactory(){
		try{
			ht=new Hashtable();
			ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
			ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
			ctxt=new InitialContext(ht);
			map=Collections.synchronizedMap(new HashMap());
		}catch(Exception e){e.printStackTrace();}
	}
	public static DBConnectionFactory getFactory(){
		if(factory==null){
			factory = new DBConnectionFactory();
			return factory;
		}
		return factory;
	}
	
	public Connection getConnection (String jndiName){
		try{
			Object o=map.get(jndiName);
			if(o==null){
				ds=(DataSource)ctxt.lookup(jndiName);
				map.put(jndiName,ds);
			}
			else{
				ds=(DataSource)o;
			}
			con=ds.getConnection();
		}catch(Exception e){e.printStackTrace();}
		return con;
	}
}