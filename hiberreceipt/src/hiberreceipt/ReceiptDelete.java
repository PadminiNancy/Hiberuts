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
public class ReceiptDelete {
    public static void main(String[] args)
    {
SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       try{
           tx = session.beginTransaction();
           Receipt r1=new Receipt(46);
          session.delete(r1);
           tx.commit();
           session.close();
       }
       catch(Exception e){
           System.out.println(e.toString());
       }

}
}
