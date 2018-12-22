/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package login;
import org.hibernate.*;
/**
 *
 * @author Nancy
 */
public class Test {
    public static void main(String args[])
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       try{
           tx = session.beginTransaction();

           tx.commit();
           session.close();
           System.out.println("Done");
       }
       catch(Exception e){
           System.out.println(e.toString());
       }



    }

}
