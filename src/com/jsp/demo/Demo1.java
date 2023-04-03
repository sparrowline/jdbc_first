package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args) {
		 try {
			 //first step load the driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//second step establish the connection.
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root@123");
			
			//establish the statement.
			Statement statement=connection.createStatement();
			
			//execute the statement
			
			boolean res=statement.execute("create table jdbc_first_geaa2.user(id int primary key,name varchar(10),phoneno bigint(10))");
			
			System.out.println("Table created");
			
			//close the connection
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
 
}
