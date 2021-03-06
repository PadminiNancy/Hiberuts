package noticehiber;
// Generated Dec 22, 2014 10:15:53 AM by Hibernate Tools 3.2.1.GA



/**
 * StudNoticeId generated by hbm2java
 */
public class StudNoticeId  implements java.io.Serializable {


     private int roll;
     private short nid;

    public StudNoticeId() {
    }

    public StudNoticeId(int roll, short nid) {
       this.roll = roll;
       this.nid = nid;
    }
   
    public int getRoll() {
        return this.roll;
    }
    
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public short getNid() {
        return this.nid;
    }
    
    public void setNid(short nid) {
        this.nid = nid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof StudNoticeId) ) return false;
		 StudNoticeId castOther = ( StudNoticeId ) other; 
         
		 return (this.getRoll()==castOther.getRoll())
 && (this.getNid()==castOther.getNid());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getRoll();
         result = 37 * result + this.getNid();
         return result;
   }   


}


