package employee.data;

import employee.main.Hour;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HourDB {
	
	public static int insert(Hour hour){
		//TODO:COMPLETE METHOD
		return 0;
	}
	
	public static int update(Hour hour){
		//TODO:COMPLETE METHOD
		return 0;
	}
	
	public static int delete(Hour hour){
		//TODO:COMPLETE METHOD
		return 0;
	}
	
	public static Hour selectHour(int employeeID){
		//TODO:COMPLETE METHOD
		return null;
	}
	
	public static ArrayList<Hour> selectHours(){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT * FROM cs_hours";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Hour> hours = new ArrayList<>();
                while (rs.next())
                {
                    Hour hour = new Hour();
                    hour.setEmployeeID(rs.getInt("EmployeeID"));
                    hour.setTotalHours(rs.getDouble("TotalHours"));
                    hour.setRegHours(rs.getDouble("RegHours"));
                    hour.setOverHours(rs.getDouble("OverHours"));
                    hours.add(hour);
                }
            return hours;

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
