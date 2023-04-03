package jdbcUsingRegisterDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ExPreparedStatementCreateTable {
	public static void main(String[] args) {
		try {
			//load the driver using drivermanager
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			//establish the connection using connection object
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first_geaa2?user=root&password=root@123");
			System.out.println("connection established");

			//establish the statement 
			PreparedStatement preparedStatement =connection.prepareStatement("create table user5(id int primary key,name varchar(10),pNO bigint(10))");
//			preparedStatement.setInt(1, 4);
			
			boolean res = preparedStatement.execute();
			
			connection.close();
			System.out.println("Data Saved");
			System.out.println(res);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
