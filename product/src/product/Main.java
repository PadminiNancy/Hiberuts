/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package product;

/**
 *
 * @author Nancy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int prodno = 2;
        String prodname = "Nivea";
        int price = 100;
        


        ProBean pb = new ProBean();
        pb.setProdno(prodno);
        pb.setProdname(prodname);
        pb.setPrice(price);

        try{
            ProDataModel pm = new ProDataModel();
            String s = pm.insert(pb);
            if(s.equals("success"))
                System.out.println("Records inserted successfully!!");
            else
                System.out.println("Invalid input!!");


        }
        catch(Exception e){
         System.out.println(e.toString());
        }

    }

}




































