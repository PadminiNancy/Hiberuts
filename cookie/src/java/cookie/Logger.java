package cookie;
// Generated Feb 13, 2015 11:32:13 PM by Hibernate Tools 3.2.1.GA



/**
 * Logger generated by hbm2java
 */
public class Logger  implements java.io.Serializable {


     private String loginid;
     private String passwd;

    public Logger() {
    }

	
    public Logger(String loginid) {
        this.loginid = loginid;
    }
    public Logger(String loginid, String passwd) {
       this.loginid = loginid;
       this.passwd = passwd;
    }
   
    public String getLoginid() {
        return this.loginid;
    }
    
    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }
    public String getPasswd() {
        return this.passwd;
    }
    
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }




}

