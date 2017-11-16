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
    private Date day;
    private Date startTime;
    private Date lunchOut;
    private Date lunchIn;
    private Date endTime;
    
    public TimeClock(){}
    
    public TimeClock(int employeeID, Date day, Date startTime, Date lunchOut, 
                    Date lunchIn, Date endTime){
        
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
    public Date getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(Date day) {
        this.day = day;
    }

    /**
     * @return the startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the lunchOut
     */
    public Date getLunchOut() {
        return lunchOut;
    }

    /**
     * @param lunchOut the lunchOut to set
     */
    public void setLunchOut(Date lunchOut) {
        this.lunchOut = lunchOut;
    }

    /**
     * @return the lunchIn
     */
    public Date getLunchIn() {
        return lunchIn;
    }

    /**
     * @param lunchIn the lunchIn to set
     */
    public void setLunchIn(Date lunchIn) {
        this.lunchIn = lunchIn;
    }

    /**
     * @return the endTime
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
}
