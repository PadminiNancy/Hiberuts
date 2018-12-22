/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package randoms;

/**
 *
 * @author Nancy
 */
import java.util.*;

import org.hibernate.*;
import org.hibernate.Criteria.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
//import org.hibernate.criterion.*;
public class Second {
    private static Criterion yourRestrictions;
    public static void main(String args[]){
     // PrintWriter out = response.getWriter();
        int n=1;

       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       Tryrandom tm = null;
       String s = null;
      // String ss = "abcdefghij";

       try{
           Random rm = new Random();
           tx = session.beginTransaction();
          // Query q= session.createQuery(" From Tryrandom ");
          Criterion restriction = yourRestrictions;
          Object result = null;  // will later contain a random entity
          Criteria crit = session.createCriteria(Tryrandom.class);
          crit.add(restriction);
          crit.setProjection(Projections.rowCount());
            int count = ((Number) crit.uniqueResult()).intValue();
if (0 != count) {
  int index = new Random().nextInt(count);
  crit = session.createCriteria(Tryrandom.class);
  crit.add(restriction);
  result = crit.setFirstResult(index).setMaxResults(1).uniqueResult();
          /* for(int i=0;i<=5;i++)
           {
           tm = (Tryrandom)l.get(i);
           System.out.println(n+(tm.getValue()));
           n++;
           }*/
  System.out.println(result);





           tx.commit();
           session.close();

       }}
       catch(Exception e){
           System.out.println(e.toString());
       }
    }

}
