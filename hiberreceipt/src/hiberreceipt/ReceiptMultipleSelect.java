/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hiberreceipt;
import java.util.List;
import org.hibernate.*;
/**
 *
 * @author Nancy
 */
public class ReceiptMultipleSelect {
    public static void main(String args[])
    {
SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       Receipt s1=null;
       try{
           tx = session.beginTransaction();
           Query q= session.createQuery(" From Receipt");
           List l=q.list();
           for(int i=0;i<l.size();i++)
           {
            s1=(Receipt)l.get(i);
            System.out.println(s1.getRectno()+"\t"+s1.getAmt()+"\t"+s1.getStud1().getRoll());

          }


           tx.commit();
           session.close();
       }
       catch(Exception e){
           System.out.println(e.toString());
       }

}


}