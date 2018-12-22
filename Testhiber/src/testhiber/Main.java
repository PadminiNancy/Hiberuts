/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testhiber;
import org.hibernate.*;
import java.util.*;
/**
 *
 * @author Nancy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       try{
           tx = session.beginTransaction();
           Course cb = new Course("ADCA");
          /* Course cb = (Course)session.get(Course.class,"mca");
           cb.setFees(7050);
           session.update(cb);
           System.out.println(cb.getFees());*/

           /*Query q = session.createQuery("from Course");
           List l = q.list();
           for(int i = 1;i<l.size();i++)
           {
               cb = (Course)l.get(i);
               System.out.println(cb.getCcode()+"\t"+cb.getCname()+"\t"+cb.getFees()+"" +
                       "\t"+cb.getDur());*/

        session.delete(cb);
           
           tx.commit();
           session.close();
           System.out.println("Done!");
       }
       catch(Exception e){
           System.out.println(e.toString());
       }

    }

}
