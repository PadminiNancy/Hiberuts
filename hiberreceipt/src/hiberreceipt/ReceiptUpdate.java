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
public class ReceiptUpdate {
    public static void main(String[] args)
    {
       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       try{
           tx = session.beginTransaction();
           Receipt r1 = (Receipt)session.get(Receipt.class,1);
           r1.setAmt(200);
           tx.commit();
           session.close();
           System.out.println("Receipt Updated!!");
       }
       catch(Exception e){
           System.out.println(e.toString());
       }

}
}
