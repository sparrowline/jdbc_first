package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo5 {
public static void main(String[] args) {
	//load the driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	//establish the connection by driverManager
		
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root@123");
		
	//establish the statement 
		
		Statement statement=connection.createStatement();
		
	//execute the statement
		
		boolean res=statement.execute("insert into jdbc_first_geaa2.user values(4,'gouse',32463468)");
		
	//close the connection
		connection.close();
		System.out.println(res);
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
