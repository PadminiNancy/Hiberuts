/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hiberreceipt;
import org.hibernate.*;
/**
 *
 * @author Nancy
 */
public class StudDelete {
    public static void main(String[] args)
    {
SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       try{
           tx = session.beginTransaction();
           Stud1 sd = new Stud1(0);
           session.delete(sd);
           tx.commit();
           session.close();
           System.out.println("Deleted!!");
       }
       catch(Exception e){
           System.out.println(e.toString());
       }


    }
}
