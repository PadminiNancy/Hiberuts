package savings;
import javax.naming.*;
import java.sql.*;
import java.util.*;


public final class EJBHomeFactory
{
private static EJBHomeFactory factory;
Hashtable ht;
Context ctxt;
Object o;
Connection con;
Map map;
private EJBHomeFactory()
{
try
	{
	ht=new Hashtable();
	ht.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
	ht.put(Context.PROVIDER_URL,"t3://localhost:7001");
	ctxt=new InitialContext(ht);
	map=Collections.synchronizedMap(new HashMap());
	}catch(Exception e){e.printStackTrace();}
}

public static EJBHomeFactory getFactory()
{
	if(factory==null)
		{
		factory = new EJBHomeFactory();
		return factory;
		}
	return factory;
}

public Object lookupHome (String jndiName)
{

try{
	o =map.get(jndiName);
	if(o==null)
		{
		o=ctxt.lookup(jndiName);
		map.put(jndiName,o);
		}
}catch(Exception e){e.printStackTrace();}
return o;
}

}
	
