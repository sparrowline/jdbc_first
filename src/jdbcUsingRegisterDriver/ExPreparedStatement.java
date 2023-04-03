package jdbcUsingRegisterDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class ExPreparedStatement {
	public static void main(String[] args) {
		try {
			Driver driver= new Driver();
			
			DriverManager.registerDriver(driver);
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first_geaa2?user=root&password=root@123");
			
//			PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(?,?,?)");
//			preparedStatement.setInt(1, 4);
//			preparedStatement.setString(2, "yuva raja");
//			preparedStatement.setLong(3, 1245243435l);
			
		//delete operation using prepareStatment
			PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
			ResultSet res = preparedStatement.executeQuery();
			while(res.next()) {
				System.out.println("User Id : " +res.getInt(1));
				System.out.println("User Name : " + res.getString(2));
				System.out.println("User Phone : " + res.getLong(3));
				System.out.println("------------------------------------");
			}
			connection.close();
			System.out.println("Data saved");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
