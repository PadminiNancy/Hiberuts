package log;
// Generated Dec 14, 2015 11:58:52 AM by Hibernate Tools 3.2.1.GA



/**
 * Studreg generated by hbm2java
 */
public class Studreg  implements java.io.Serializable {


     private String sname;
     private Studlog studlog;
     private String addr;
     private String eid;
     private String cno;

    public Studreg() {
    }

	
    public Studreg(String sname, Studlog studlog) {
        this.sname = sname;
        this.studlog = studlog;
    }
    public Studreg(String sname, Studlog studlog, String addr, String eid, String cno) {
       this.sname = sname;
       this.studlog = studlog;
       this.addr = addr;
       this.eid = eid;
       this.cno = cno;
    }
   
    public String getSname() {
        return this.sname;
    }
    
    public void setSname(String sname) {
        this.sname = sname;
    }
    public Studlog getStudlog() {
        return this.studlog;
    }
    
    public void setStudlog(Studlog studlog) {
        this.studlog = studlog;
    }
    public String getAddr() {
        return this.addr;
    }
    
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getEid() {
        return this.eid;
    }
    
    public void setEid(String eid) {
        this.eid = eid;
    }
    public String getCno() {
        return this.cno;
    }
    
    public void setCno(String cno) {
        this.cno = cno;
    }




}

