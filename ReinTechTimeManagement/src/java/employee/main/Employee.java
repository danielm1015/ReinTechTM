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
public class Employee implements Serializable{
    
    //Employee main variables
    private int employeeID;
    private String firstName;
    private String lastName;
    private String password;
    private int authLevel;
    private boolean status;
    private double payRate;
   
    
    public Employee(){

        
    }
    
    //TODO: redo constructor with updated variables
    //TODO: remove unused accessor/mutator methods
    public Employee(int employeeID, String firstName, String lastName, 
                    String password, int authLevel, boolean status, 
                    double payRate){
        
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.authLevel = authLevel;
        this.status = status;
        this.payRate = payRate;
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
     * @return the status
     */
    public boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
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

}
