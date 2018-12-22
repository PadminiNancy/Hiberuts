/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package android;

import java.util.*;
import org.hibernate.*;
/**
 *
 * @author Nancy
 */
public class Retrieve {

    public static void main(String args[])
    {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = null;
        Andreg ad = null;
        String rs = "%";
        int i=0;
        

        try
        {
          tx = ss.beginTransaction();
          Query q = ss.createQuery("from Andreg");
          List l = q.list();

          for(i=0; i<l.size();i++)
          {
            ad = (Andreg) l.get(i);
            rs = rs+(ad.getRoll()+"#"+ad.getSname()+"#"+ad.getCno()+"#"+ad.getEmail()+"%");
           //System.out.println(ad.getRoll()+"\t"+ad.getSname()+"\t"+ad.getCno()+"\t"+ad.getEmail());
           //System.out.println("\n");
          }

           String s[] = rs.split("%");
           int ls;
         for(i=0; i<s.length;i++)
         {
             String fs[] = s[i].split("#");
             for(int j=0; j<fs.length;j++)
                System.out.print(fs[j]+"\t");
             System.out.println("\n");
             ls = fs.length;
         }

          // String fd[][] = new fd[s.length][ls];
      /*String name="a"+"%"+"b"+"%"+"c"+"#"+"d"+"%"+"e"+"%"+"f";
         String s[] = name.split("#");
         for(int i=0; i<s.length;i++)
         {
             String fs[] = s[i].split("%");
             for(int j=0; j<fs.length;j++)
                System.out.print(fs[j]);
             System.out.println("\n");
         }*/
        }


        catch(Exception e)
        {

            System.out.println(e.toString());

        }

    }

}
