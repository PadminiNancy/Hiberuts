package testhiber;
// Generated Dec 19, 2014 4:08:16 PM by Hibernate Tools 3.2.1.GA



/**
 * Course generated by hbm2java
 */
public class Course  implements java.io.Serializable {


     private String ccode;
     private String cname;
     private Integer fees;
     private int dur;

    public Course() {
    }

	
    public Course(String ccode) {
        this.ccode = ccode;
    }
    public Course(String ccode, String cname, Integer fees, int dur) {
       this.ccode = ccode;
       this.cname = cname;
       this.fees = fees;
       this.dur = dur;
    }
   
    public String getCcode() {
        return this.ccode;
    }
    
    public void setCcode(String ccode) {
        this.ccode = ccode;
    }
    public String getCname() {
        return this.cname;
    }
    
    public void setCname(String cname) {
        this.cname = cname;
    }
    public Integer getFees() {
        return this.fees;
    }
    
    public void setFees(Integer fees) {
        this.fees = fees;
    }
    public int getDur() {
        return this.dur;
    }
    
    public void setDur(int dur) {
        this.dur = dur;
    }




}

