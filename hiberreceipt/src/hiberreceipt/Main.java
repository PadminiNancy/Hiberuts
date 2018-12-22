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
           Stud1 sd = new Stud1();

           //Set rs = new Set();
           //rs.add(r1);

           Receipt r1 = new Receipt(1,sd,100);

           /*r1.setRectno(1);
           r1.setAmt(100);
           r1.setStud1(sd);*/
           session.save(sd);


   
           System.out.println("Done");

           tx.commit();
           session.close();
       }
       catch(Exception e){
           System.out.println(e.toString());
       }
    }

}
