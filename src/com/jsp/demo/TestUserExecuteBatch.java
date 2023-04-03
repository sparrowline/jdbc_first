package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestUserExecuteBatch {
	 
	public static void main(String[] args) {
		
		List<User> list = new ArrayList<User>();
		User user1=new  User();
		user1.setId(15);
		user1.setName("A");
		user1.setPhone(987890878l);
		
		User user2=new  User();
		user2.setId(16);
		user2.setName("B");
		user2.setPhone(987890878l);
		
		User user3=new  User();
		user3.setId(17);
		user3.setName("C");
		user3.setPhone(987890878l);
		
		list.add(user1);
		list.add(user2);
		list.add(user3);
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first_geaa2?user=root&password=root@123");
			//establish the statement
			PreparedStatement preparedStatement =connection.prepareStatement("insert into user values(?,?,?)");
			for(User user:list) {
				preparedStatement.setInt(1, user.getId());
				preparedStatement.setString(2, user.getName());
				preparedStatement.setLong(3, user.getPhone());
				preparedStatement.addBatch();
			}
			//execute the statement
			
			preparedStatement.executeBatch();
			
			connection.close();
			System.out.println("completed");
			System.out.println(list);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
