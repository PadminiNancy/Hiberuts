/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hiberreceipt;
import org.hibernate.*;
import java.util.*;
/**
 *
 * @author Nancy
 */
public class StudSingleSelect {
    public static void main(String[] args)
    {
     SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
      // Receipt r = null;
       try{
           tx = session.beginTransaction();
           Stud1 sd = null; //(Stud1)session.get(Stud1.class,1);
          // Receipt rd = (Receipt)session.get(Receipt.class,1);
          // System.out.println(sd.getRoll()+"\t"+sd.getName());
            Query q= session.createQuery(" From Stud1");
           List l=q.list();
           for(int i=0;i<l.size();i++)
           {
            sd=(Stud1)l.get(i);
            System.out.print(sd.getRoll()+"\t"+sd.getName()+" ");

            Iterator iter = sd.getReceipts().iterator();
            while(iter.hasNext())
            {

              Receipt r1 = (Receipt) iter.next();
              System.out.println(r1.getRectno() +"\t" + r1.getAmt());
            }
           }

           tx.commit();
           session.close();
       }
       catch(Exception e){
           System.out.println(e.toString());
       }

}
}
