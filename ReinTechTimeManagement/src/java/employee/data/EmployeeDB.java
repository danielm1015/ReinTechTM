/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.data;

import employee.main.Employee;
import employee.main.TimeClock;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmployeeDB {
    
    /*VERIFY ID MATCHES*/
    
    public static int insert(Employee employee){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "INSERT INTO cs_employees (employeeID, firstName, lastName,"
                + " authLevel, status, payRate, password) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, employee.getEmployeeID());
            ps.setString(2, employee.getFirstName());
            ps.setString(3, employee.getLastName());
            ps.setInt(3, employee.getAuthLevel());
            ps.setBoolean(4, employee.getStatus());
            ps.setDouble(6, employee.getPayRate());
            ps.setString(6, employee.getPassword());

            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    public static int update(Employee employee){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query = "UPDATE cs_employees SET "
                + "FirstName = ?, LastName = ?, "
                + "PayRate =?, AuthLevel = ?, Status = ?, Password = ? "
                + "WHERE employeeID = ?";
        try {
           ps = connection.prepareStatement(query);
            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setDouble(3, employee.getPayRate());
            ps.setInt(4, employee.getAuthLevel());
            ps.setBoolean(5, employee.getStatus());
            ps.setInt(6, employee.getEmployeeID());

            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    // EmployeeServlet will get ID and Password from login.jsp 
    // & Validate if Employee Exists
   protected static int verifyLogin(int verifyID){ //String verifyPassword){
       
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int authLevel = 0;

        String query = "SELECT AuthLevel FROM cs_employees "
                + "WHERE EmployeeID = ?";// and Password = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, verifyID);
           // ps.setString(2, verifyPassword);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                authLevel = rs.getInt("AuthLevel");
            }
            
            return authLevel;
        } catch (SQLException e) {
            System.out.println(e);
            return authLevel;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    // Delete 1 Employee using Employee ID
    public static int delete(Employee employee){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query = "DELETE FROM cs_employees "
                + "WHERE EmployeeID = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, employee.getEmployeeID());
            
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    // Select 1 employee using Employee ID
    public static Employee selectEmployee(int employeeID){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
           
        ResultSet rs = null;

        String query = "SELECT * FROM cs_employees "
                + "WHERE EmployeeID = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, employeeID);
            rs = ps.executeQuery();
            Employee employee = null;
            if (rs.next()) {
                    employee = new Employee();
                    employee.setEmployeeID(rs.getInt("EmployeeID"));
                    employee.setAuthLevel(rs.getInt("AuthLevel"));
                    employee.setPayRate(rs.getDouble("PayRate"));
                    employee.setFirstName(rs.getString("FirstName"));
                    employee.setLastName(rs.getString("LastName"));
                    employee.setStatus(rs.getBoolean("Status"));
            }
            return employee;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    //TODO: WEEK 5-6 - get employee array list working
    public static ArrayList<Employee> selectEmployees(){
        // work here danny
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT * FROM cs_employees";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Employee> employees = new ArrayList<>();
                while (rs.next())
                {
                    Employee employee = new Employee();
                    employee.setEmployeeID(rs.getInt("EmployeeID"));
                    employee.setAuthLevel(rs.getInt("AuthLevel"));
                    employee.setPayRate(rs.getDouble("PayRate"));
                    employee.setFirstName(rs.getString("FirstName"));
                    employee.setLastName(rs.getString("LastName"));
                    employee.setStatus(rs.getBoolean("Status"));
                    employees.add(employee);
                }
            return employees;

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

    
    public static ArrayList<TimeClock> selectTimeClocks(){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT * FROM cs_workhours";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<TimeClock> timeClocks = new ArrayList<TimeClock>();
            while (rs.next())
            {
//                TimeClock timeClock = new TimeClock();
//                timeClock.setDay(rs.getDate("day"));
//                timeClock.setStartTime(rs.getDate("startTime"));
//                timeClock.setLunchOut(rs.getDate("lunchOut"));
//                timeClock.setLunchIn(rs.getDate("lunchIn"));
//                timeClock.setEndTime(rs.getDate("endTime"));
//                
//                timeClocks.add(timeClock);
            }
            return timeClocks;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
                
    }
}



