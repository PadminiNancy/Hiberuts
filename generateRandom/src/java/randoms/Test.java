/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package randoms;
import org.hibernate.*;
import java.util.*;
/**
 *
 * @author Nancy
 */
public class Test {
public static void main(String args[]){
     SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       try{
           tx = session.beginTransaction();
Criteria c=session.createCriteria(Tryrandom.class);
List l = c.list();
for(int i=0; i<l.size(); i++){
    System.out.println(((Tryrandom)l.get(i)).getValue());
}
System.out.println(l.size());
           tx.commit();
           session.close();
       }
       catch(Exception e){
           System.out.println(e.toString());
       }



}
}
