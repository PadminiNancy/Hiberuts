/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mini;

/**
 *
 * @author Nancy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ccode = "bca";
        String cname = "bachelor comp app";
        int fees = 1000;
        int dur = 3;
        String s;

        CourseBean cb = new CourseBean();
        cb.setCcode(ccode);
        cb.setCname(cname);
        cb.setFees(fees);
        cb.setDur(dur);

        try{

            CourseDataModel dm = new CourseDataModel();
            s = dm.insert(cb);
            if(s.equals("success"))
                System.out.println("Record inserted successfuly!");
            else
                System.out.println("Invalid input id!!");
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }

}
