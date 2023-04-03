package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3 {
public static void main(String[] args) {
	//load the driver
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	//establish the connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root@123");
		
		
	//establish the statement
		
		Statement statement=connection.createStatement();
		
	//execute the statement
		
		boolean res=statement.execute("create table jdbc_first_geaa2.user3(id int(10),name varchar(10),number bigint(10))");
		
	//close the connection
		connection.close();
		
	System.out.println("table created");
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
	
}
}
