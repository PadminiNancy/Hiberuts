/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author Nancy
 */
public class Main {

   
    public static void main(String[] args) {

        String[] s1 = {"A","M","I","T","A","B","H","B","A","C","H","C","H","A","N" };
        String[] s2 ={"R","A","J","N","I","K","A","N","T","H"};
        String[] s3 = new String[s1.length];
        String [] s = new String[s1.length];
        String t = "";
   int i=0,j,k=0,l=0,m=0;
   boolean f = true;

    l=0;
    try{
    for(i=0;i<s1.length;i++)
    {
      
     for(j=0;j<s2.length;j++)
     {
       if(s1[i].equals(s2[j]))
       {
           s3[l] = s1[i];
           l++;
          

       }

     }



    }

  
 
    for(i=0;i<s3.length;i++)
    {
     t = s3[i];
   
     for(j=0;j<s.length;j++)
     {
      if(s3[i].equals(s[j]))
      {
        f = false;
        break;
      }
     }
  
     if(f)
     {
       s[m] = t;
       m++;
       System.out.println(s3[i]);
     }
     else
         f = true;
   }
    }
    catch(Exception e)
    {
        System.out.println(e.toString());
    }
    }

}
