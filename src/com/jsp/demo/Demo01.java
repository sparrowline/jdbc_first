package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Demo01 {

	public static void main(String[] args) {
		//Register the driver
	
		try {
			Driver driver =new Driver();
			DriverManager.registerDriver(driver);
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root@123");
			
			System.out.println(connection);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
