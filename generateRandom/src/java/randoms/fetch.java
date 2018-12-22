/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package randoms;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author Nancy
 */
public class fetch {
    public static void main(String args[])
    {
     SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       Tryrandom tr=null;
       try{
           tx = session.beginTransaction();
           Query q=session.createQuery("From Tryrandom");
           List l=q.list();
           for(int i=0;i<l.size();i++)
           {



           tr=(Tryrandom)l.get(i);
           System.out.println(tr.getValue()+"\t"+tr.getSno());
           }
           

           tx.commit();
           session.close();
       }
       catch(Exception e){
           System.out.println(e.toString());
       }






    }

}
