package log;
// Generated Dec 14, 2015 11:58:52 AM by Hibernate Tools 3.2.1.GA



/**
 * Userreg generated by hbm2java
 */
public class Userreg  implements java.io.Serializable {


     private String uname;
     private Userlog userlog;
     private String addr;
     private String eid;
     private String cno;

    public Userreg() {
    }

	
    public Userreg(String uname, Userlog userlog) {
        this.uname = uname;
        this.userlog = userlog;
    }
    public Userreg(String uname, Userlog userlog, String addr, String eid, String cno) {
       this.uname = uname;
       this.userlog = userlog;
       this.addr = addr;
       this.eid = eid;
       this.cno = cno;
    }
   
    public String getUname() {
        return this.uname;
    }
    
    public void setUname(String uname) {
        this.uname = uname;
    }
    public Userlog getUserlog() {
        return this.userlog;
    }
    
    public void setUserlog(Userlog userlog) {
        this.userlog = userlog;
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


