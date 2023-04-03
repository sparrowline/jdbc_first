package com.jsp.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ExCallableStatement {
public static void main(String[] args) {
	
	Properties properties = new Properties();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//established connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first_geaa2",properties);
		
		FileInputStream fileInputStream = new FileInputStream("dbconfig.properties");
		
		properties.load(fileInputStream);
		
		System.out.println(connection);
		
		
	} catch (ClassNotFoundException | SQLException | IOException e) {
		e.printStackTrace();
	}
	
}
}
