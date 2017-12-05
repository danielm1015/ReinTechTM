/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.main;

import java.io.Serializable;

/**
 *
 * @author Alexander
 */
public class Hour implements Serializable{
    
    private int employeeID;
    private double totalHours;
    private double regHours;
    private double overHours;
    
    public Hour(){}
    
    public Hour(int employeeID, double totalHours, double regHours, 
                double overHours){
        
        this.employeeID = employeeID;
        this.totalHours = totalHours;
        this.regHours = regHours;
        this.overHours = overHours;
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
     * @return the totalHours
     */
    public double getTotalHours() {
        return totalHours;
    }

    /**
     * @param totalHours the totalHours to set
     */
    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    /**
     * @return the regHours
     */
    public double getRegHours() {
        return regHours;
    }

    /**
     * @param regHours the regHours to set
     */
    public void setRegHours(double regHours) {
        this.regHours = regHours;
    }

    /**
     * @return the overHours
     */
    public double getOverHours() {
        return overHours;
    }

    /**
     * @param overHours the overHours to set
     */
    public void setOverHours(double overHours) {
        this.overHours = overHours;
    }
    
    
}
