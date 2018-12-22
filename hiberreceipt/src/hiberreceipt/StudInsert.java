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
public class StudInsert {
    public static void main(String[] args)
    {
SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       try{
           tx = session.beginTransaction();
           Stud1 sd = new Stud1();
           sd.setRoll(2);
           sd.setName("padmini");
           sd.setAge(21);
           session.save(sd);
           tx.commit();
           session.close();
           System.out.println("Inserted!!");
       }
       catch(Exception e){
           System.out.println(e.toString());
       }

}
}
