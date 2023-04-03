package jdbcUsingRegisterDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.PreparedQuery;
import com.mysql.cj.jdbc.Driver;

public class ExPreparedStatementCreateTable_1 {
public static void main(String[] args) {
	//load the driver using drivermanager
	try {
		DriverManager.registerDriver(new Driver());
		
		// establish the connection using gerConnection
		
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first_geaa2?user=root&password=root@123");
		System.out.println("connection established");
		
		//establish the statement using preparedStatement
		
		
		
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
