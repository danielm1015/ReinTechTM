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
public class Employee implements Serializable{
    
    //Employee main variables
    private int employeeID;
    private String firstName;
    private String lastName;
    private String password;
    private int authLevel;
    private double totalHours;
    private double regHours;
    private double overHours;
    private String status;
    private double payRate;
    
    // Date Variables
    //updated date variables
    private Date day;
    private DATETIME startTime;
    private DATETIME lunchOut;
    private DATETIME lunchIn;
    private DATEIME outTime;
    
    //changing variables to match database revisions - Alex 11/3 9:25AM
    /*private Date wedOut;
    private Date thurIn;
    private Date thurOut;
    private Date friIn;
    private Date friOut;*/
    
    public Employee(){
        
    }
    
    //TODO: redo constructor with updated variables
    //TODO: remove unused accessor/mutator methods
    public Employee(int employeeID, String firstName, String lastName, 
                    String password, int authLevel, double totalHours, 
                    double regHours, double overHours, String status, 
                    double payRate, Date monIn, Date monOut, Date tuesIn,
                    Date tuesOut, Date wedIn, Date wedOut, Date thurIn, 
                    Date thurOut, Date friIn, Date friOut){
        
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.authLevel = authLevel;
        this.totalHours = totalHours;
        this.regHours = regHours;
        this.overHours = overHours;
        this.status = status;
        this.payRate = payRate;
        this.monIn = monIn;
        this.monOut = monOut;
        this.tuesIn = tuesIn;
        this.tuesOut = tuesOut;
        this.wedIn = wedIn;
        this.wedOut = wedOut;
        this.thurIn = thurIn;
        this.thurOut = thurOut;
        this.friIn = friIn;
        this.friOut = friOut;
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
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the authLevel
     */
    public int getAuthLevel() {
        return authLevel;
    }

    /**
     * @param authLevel the authLevel to set
     */
    public void setAuthLevel(int authLevel) {
        this.authLevel = authLevel;
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

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the payRate
     */
    public double getPayRate() {
        return payRate;
    }

    /**
     * @param payRate the payRate to set
     */
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    
    /*  ACCESSOR + MUTATOR METHODS FOR TIME STAMPS
    *
    */
    /**
     * @return the monIn
     */
    public Date getMonIn() {
        return monIn;
    }

    /**
     * @param monIn the monIn to set
     */
    public void setMonIn(Date monIn) {
        this.monIn = monIn;
    }

    /**
     * @return the monOut
     */
    public Date getMonOut() {
        return monOut;
    }

    /**
     * @param monOut the monOut to set
     */
    public void setMonOut(Date monOut) {
        this.monOut = monOut;
    }

    /**
     * @return the tuesIn
     */
    public Date getTuesIn() {
        return tuesIn;
    }

    /**
     * @param tuesIn the tuesIn to set
     */
    public void setTuesIn(Date tuesIn) {
        this.tuesIn = tuesIn;
    }

    /**
     * @return the tuesOut
     */
    public Date getTuesOut() {
        return tuesOut;
    }

    /**
     * @param tuesOut the tuesOut to set
     */
    public void setTuesOut(Date tuesOut) {
        this.tuesOut = tuesOut;
    }

    /**
     * @return the wedIn
     */
    public Date getWedIn() {
        return wedIn;
    }

    /**
     * @param wedIn the wedIn to set
     */
    public void setWedIn(Date wedIn) {
        this.wedIn = wedIn;
    }

    /**
     * @return the wedOut
     */
    public Date getWedOut() {
        return wedOut;
    }

    /**
     * @param wedOut the wedOut to set
     */
    public void setWedOut(Date wedOut) {
        this.wedOut = wedOut;
    }

    /**
     * @return the thurIn
     */
    public Date getThurIn() {
        return thurIn;
    }

    /**
     * @param thurIn the thurIn to set
     */
    public void setThurIn(Date thurIn) {
        this.thurIn = thurIn;
    }

    /**
     * @return the thurOut
     */
    public Date getThurOut() {
        return thurOut;
    }

    /**
     * @param thurOut the thurOut to set
     */
    public void setThurOut(Date thurOut) {
        this.thurOut = thurOut;
    }

    /**
     * @return the friIn
     */
    public Date getFriIn() {
        return friIn;
    }

    /**
     * @param friIn the friIn to set
     */
    public void setFriIn(Date friIn) {
        this.friIn = friIn;
    }

    /**
     * @return the friOut
     */
    public Date getFriOut() {
        return friOut;
    }

    /**
     * @param friOut the friOut to set
     */
    public void setFriOut(Date friOut) {
        this.friOut = friOut;
    }
    
    
}
