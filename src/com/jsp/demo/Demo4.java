package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4 {
public static void main(String[] args) {
	//load the Driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	//establish the connection using driverManager
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root" , "root@123");
	
	//establish the statement
		//i.create object of statement 
		
		Statement statement=connection.createStatement();
		
	//execute the statement 
		
		boolean res=statement.execute("insert into jdbc_first_geaa2.user(id,name,phoneno) values(1,'Rizwan',32523535)");
		
	//close the connection
		connection.close();
		
		System.out.println("datainserted");
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
}
	
}
