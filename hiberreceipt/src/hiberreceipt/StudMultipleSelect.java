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
public class StudMultipleSelect {
    public static void main(String args[])
    {
SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       Stud1 s1=null;
       try{
           tx = session.beginTransaction();
           Query q= session.createQuery(" From Stud1");
           List l=q.list();
           for(int i=0;i<l.size();i++)
           {
            s1=(Stud1)l.get(i);
            System.out.println(s1.getRoll()+"\t"+s1.getName());

          }


           tx.commit();
           session.close();
       }
       catch(Exception e){
           System.out.println(e.toString());
       }

}


}