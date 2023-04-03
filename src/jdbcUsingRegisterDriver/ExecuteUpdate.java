package jdbcUsingRegisterDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecuteUpdate {

	public static void main(String[] args) {
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first_geaa2?user=root&password=root@123");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(?,?,?)");
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "omer-2");
			preparedStatement.setLong(3, 2353262l);
			
			int res = preparedStatement.executeUpdate();
			
			connection.close();
			
			if(res>0) {
				System.out.println("Data saved");
			}

		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}
	}
	
}
