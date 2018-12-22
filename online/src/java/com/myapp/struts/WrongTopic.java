/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

/**
 *
 * @author Nancy
 */
public class WrongTopic extends org.apache.struts.action.ActionForm implements java.io.Serializable{
    private String topic;
    private int tmarks;
    private int omarks;

    /**
     * @return the topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * @param topic the topic to set
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * @return the tmarks
     */
    public int getTmarks() {
        return tmarks;
    }

    /**
     * @param tmarks the tmarks to set
     */
    public void setTmarks(int tmarks) {
        this.tmarks = tmarks;
    }

    /**
     * @return the omarks
     */
    public int getOmarks() {
        return omarks;
    }

    /**
     * @param omarks the omarks to set
     */
    public void setOmarks(int omarks) {
        this.omarks = omarks;
    }
}
