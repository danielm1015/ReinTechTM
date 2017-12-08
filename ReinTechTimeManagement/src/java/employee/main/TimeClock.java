/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.main;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Alexander
 */
public class TimeClock implements Serializable{
    
    private int employeeID;
    private String day;
    private String startTime;
    private String lunchOut;
    private String lunchIn;
    private String endTime;
    
    public TimeClock(){}
    
    public TimeClock(int employeeID, String day, String startTime, String lunchOut, 
                    String lunchIn, String endTime){
        
        this.employeeID = employeeID;
        this.day = day;
        this.startTime = startTime;
        this.lunchOut = lunchOut;
        this.lunchIn = lunchIn;
        this.endTime = endTime;
    }

    /**
     * @return the employeeID
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the lunchOut
     */
    public String getLunchOut() {
        return lunchOut;
    }

    /**
     * @param lunchOut the lunchOut to set
     */
    public void setLunchOut(String lunchOut) {
        this.lunchOut = lunchOut;
    }

    /**
     * @return the lunchIn
     */
    public String getLunchIn() {
        return lunchIn;
    }

    /**
     * @param lunchIn the lunchIn to set
     */
    public void setLunchIn(String lunchIn) {
        this.lunchIn = lunchIn;
    }

    /**
     * @return the endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    
}