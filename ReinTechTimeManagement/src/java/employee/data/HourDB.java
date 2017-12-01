/*
Java Object Variables

employeeID
totalHours
regHours
overHours


*/

public class HourDB {
	
	public static int insert(Hour hour){
		//TODO:COMPLETE METHOD
		return null;
	}
	
	public static int update(Hour hour){
		//TODO:COMPLETE METHOD
		return null;
	}
	
	public static int delete(Hour hour){
		//TODO:COMPLETE METHOD
		return null;
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
                    Hour hour = new hour();
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
