/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Randomise;

/**
 *
 * @author Nancy
 */
import java.util.*;

import org.hibernate.*;
//import org.hibernate.criterion.*;
public class fourth {
    public static void main(String args[]){
     // PrintWriter out = response.getWriter();
        int n=0;

       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session session = sf.openSession();
       Transaction tx = null;
       Tryrandom tm = null;
       String s = null;
       int size = 5,j,k=1;
      // String ss = "abcdefghij";

       try{
           //Random rm = new Random();
           tx = session.beginTransaction();
           Query q= session.createQuery(" From Tryrandom where clev=?");
           q.setString(0, "C");
           List l=q.list();
          Tryrandom arr[] = new Tryrandom[ l.size()-1];
         

           
         Random rr = new Random();
       

             for(int i=0;i<(3*(l.size()));i++){
                 int a = rr.nextInt(l.size()-1);
             tm =(Tryrandom)l.get(a);
            
              if(n==0){
                  arr[n] = (Tryrandom) l.get(a);
                  n++;
                  continue;
              }
              for( j=0;j<n;j++){
                    if(arr[j]==l.get(a)){
                     //System.out.println("Hello");
                      break;
                    }
                    
              }
             if(j==n){
                  arr[n] = (Tryrandom) l.get(a);
                  n++;
             }

             }
             
            
             
             for(int m=0;m<size;m++){
             System.out.println(k+"\t"+arr[m].getValue()+"\t"+arr[m].getClev());
             k++;
             }
             
                 tx.commit();
           session.close();

       } 
       catch(Exception e){
           System.out.println(e.toString());
       }
    }

}
