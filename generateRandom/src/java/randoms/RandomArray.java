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
public class RandomArray {
    public static void main(String args[]){
        Random r = new Random();
        String s = null;
  char a1[] =  {'A','B','C','D','E','F','G','H','I','J'};
    int i,rng = 10,a=1;
  //  char a2[] = {'A','B','C','D','E','F','G','H','I','J','K','L'};
   // String s = {"A","B","C","D","E","F","G","H","I","J"};
    for(i=0;i<=10;i++){

        s = s+ a1[i];
    }
  for(i=0;i<=10;i++){
  a = a+1;
 
  System.out.println(a+"    "+s.charAt(r.nextInt(s.length())));
  }
}
}
