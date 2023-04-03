package jdbcUsingRegisterDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ExPreparedStatementUpdate {
public static void main(String[] args) {
	try {
		//load the driver using drivermanager
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//establish the connection using connection object
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first_geaa2?user=root&password=root@123");
		
		//establish the statement 
		System.out.println("hkj");
		PreparedStatement preparedStatement =connection.prepareStatement("Update user set name='syed' where id=? ");
		preparedStatement.setInt(1, 4);
		
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
