/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package log;
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
      System.out.println("Yiepie!!!");
      tx.commit();
      session.close();

     }
     catch(Exception e)
     {
      System.out.println("Something went wrong!!!");
     }
    }

}
