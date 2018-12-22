/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package producthiber;
import org.hibernate.*;
import java.util.*;

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
           Product pd = (Product)session.get(Product.class,50);
             /*Product cb = new Product();
             cb.setProdno(50);
             cb.setProdname("aviva");
             cb.setPrice(500);*/
            pd.setPrice(450);
             System.out.println(pd.getPrice());
             Query q = session.createQuery("from Product");
             List l = q.list();
             for(int i = 1;i<l.size();i++)
             {
                 pd = (Product)l.get(i);
                 System.out.println(pd.getProdno()+"\t"+pd.getProdname()+"\t"+pd.getPrice());
             }
             //session.save(cb);
           tx.commit();
           session.close();
           System.out.println("Done!");
       }
       catch(Exception e){
           System.out.println(e.toString());
       }



    }

}
