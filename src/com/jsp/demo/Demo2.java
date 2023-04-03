package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {
	public static void main(String[] args) {
		//load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		//establish the connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root@123");
			
		//establish the statement
			Statement statement=connection.createStatement();
			
		//execute the query
			boolean res=statement.execute("create table jdbc_first_geaa2.user1(id int(10),name varchar(10),phoneNum bigint(10))");
			
		
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
