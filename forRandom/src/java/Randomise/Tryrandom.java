package Randomise;
// Generated Feb 22, 2015 12:00:00 PM by Hibernate Tools 3.2.1.GA



/**
 * Tryrandom generated by hbm2java
 */
public class Tryrandom  implements java.io.Serializable {


     private short sno;
     private String value;
     private String clev;

    public Tryrandom() {
    }

	
    public Tryrandom(short sno) {
        this.sno = sno;
    }
    public Tryrandom(short sno, String value, String clev) {
       this.sno = sno;
       this.value = value;
       this.clev = clev;
    }
   
    public short getSno() {
        return this.sno;
    }
    
    public void setSno(short sno) {
        this.sno = sno;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    public String getClev() {
        return this.clev;
    }
    
    public void setClev(String clev) {
        this.clev = clev;
    }




}


