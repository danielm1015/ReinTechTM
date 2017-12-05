/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.data;

import java.time.Clock;
import employee.main.TimeClock;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class TimeClockDB {
    
    public static int updateStartTime(TimeClock timeClock){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query = "UPDATE cs_workhours SET "
                + "StartTime = ?";
        try {
           ps = connection.prepareStatement(query);
           ps.setString(1, timeClock.getStartTime());
 /*           ps.setString(2, employee.getLastName());
            ps.setDouble(3, employee.getPayRate());
            ps.setInt(4, employee.getAuthLevel());
            ps.setBoolean(5, employee.getStatus());
            ps.setInt(6, employee.getEmployeeID());
*/
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
 /*   public static TimeClock selectHour(int employeeID){
        //TODO:COMPLETE METHOD
        return null;
    } */
	
    public static ArrayList<TimeClock> selectTimeClocks(){
    ConnectionPool pool = ConnectionPool.getInstance();
    Connection connection = pool.getConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;

    String query = "SELECT * FROM cs_workhours";
    try {
        ps = connection.prepareStatement(query);
        rs = ps.executeQuery();
        ArrayList<TimeClock> timeClocks = new ArrayList<>();
            while (rs.next())
            {
                TimeClock timeClock = new TimeClock();
                timeClock.setEmployeeID(rs.getInt("EmployeeID"));
                timeClock.setDay(rs.getString("Day"));
                timeClock.setStartTime(rs.getString("StartTime"));
                timeClock.setLunchOut(rs.getString("LunchOut"));
                timeClock.setLunchIn(rs.getString("LunchIn"));
                timeClock.setEndTime(rs.getString("EndTime"));
                timeClocks.add(timeClock);
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
