package jdbcUsingRegisterDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class RegisterDriver {
	public static void main(String[] args) {
		try {
			//registering the driver using registerDriver method present in DriverManager class 
		// we are passing the direct constructor	Driver driver=new Driver();

			DriverManager.registerDriver(new Driver());
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:?user=root&password=root@123");
			
			System.out.println(connection);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
