package com.jsp.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class GetConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2nd step create connection using DriverManager
			
			Properties properties = new Properties();
			//2nd
			FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");
			//3rd
			properties.load(fileInputStream);
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first_geaa2",properties);
			
			System.out.println(connection);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
		
	}
}
