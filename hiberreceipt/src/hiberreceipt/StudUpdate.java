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
public class StudUpdate {
    public static void main(String[] args)
    {
SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       try{
           tx = session.beginTransaction();
           Stud1 sd = (Stud1)session.get(Stud1.class,1);
           sd.setName("abc");
           session.saveOrUpdate(sd);
           tx.commit();
           session.close();
           System.out.println("Updated!!");
       }
       catch(Exception e){
           System.out.println(e.toString());
       }

}
}