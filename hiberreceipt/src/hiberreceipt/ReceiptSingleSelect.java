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
public class ReceiptSingleSelect {
    public static void main(String[] args)
    {
       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       try{
           tx = session.beginTransaction();
           Receipt r1 = (Receipt)session.get(Receipt.class,56);
           System.out.println(r1.getRectno()+"\t"+r1.getAmt()+"\t"+r1.getStud1().getRoll());
           tx.commit();
           session.close();
       }
       catch(Exception e){
           System.out.println(e.toString());
       }

}
}