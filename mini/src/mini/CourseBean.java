/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mini;

/**
 *
 * @author Nancy
 */
public class CourseBean {
    private String ccode;
    private String cname;
    private int fees;
    private int dur;

    /**
     * @return the ccode
     */
    public String getCcode() {
        return ccode;
    }

    /**
     * @param ccode the ccode to set
     */
    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    /**
     * @return the cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * @param cname the cname to set
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * @return the fees
     */
    public int getFees() {
        return fees;
    }

    /**
     * @param fees the fees to set
     */
    public void setFees(int fees) {
        this.fees = fees;
    }

    /**
     * @return the dur
     */
    public int getDur() {
        return dur;
    }

    /**
     * @param dur the dur to set
     */
    public void setDur(int dur) {
        this.dur = dur;
    }

}
