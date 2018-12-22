/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hiberreceipt;
import org.hibernate.*;
/**
 *
 * @author Nancy
 *
 **/
public class ReceiptInsert {
    public static void main(String[] args)
    {
SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       try{
           tx = session.beginTransaction();
           Receipt r1 = new Receipt();
           r1.setRectno(46);
           r1.setAmt(100);
           Stud1 sd = new Stud1();
           sd.setRoll(2);
           r1.setStud1(sd);
           session.save(r1);
           tx.commit();
           session.close();
           System.out.println("Done!!");
       }
       catch(Exception e){
           System.out.println(e.toString());
       }

}
}
