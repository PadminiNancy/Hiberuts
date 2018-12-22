/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package randoms;

import org.hibernate.*;

/**
 *
 * @author Nancy
 */
public class Hibernate {
    public static void main(String args[]){
       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       try{
           tx = session.beginTransaction();

           tx.commit();
           session.close();
       }
       catch(Exception e){
           System.out.println(e.toString());
       }




    }

}
