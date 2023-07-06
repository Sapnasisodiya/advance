package com.rays.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserModel{ 
	
	public void add(UserBean bean) throws Exception {
	
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		PreparedStatement ps = conn.prepareStatement("insert into `user` values (?,?,?,?)");
		
		ps.setInt(1,bean.getId());
		ps.setString(2,bean.getName());
		ps.setInt(3,bean.getSalary());
		ps.setInt(4,bean.getAddress());
		
		
		int i = ps.executeUpdate();
		System.out.println("data inserted"+ i);
		
	
	}

	public void delete(UserBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		PreparedStatement ps = conn.prepareStatement("delete from user where id = ?");
		ps.setInt(1,bean.getId());
		
		int i = ps.executeUpdate();
		System.out.println("data deleted" + i);	
		
	}

	public void update(UserBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		PreparedStatement ps = conn.prepareStatement("update user set name = ?, salary = ?, address = ? ,where id = ?");
		
		ps.setString(1, bean.getName());
		ps.setInt(2, bean.getSalary());
		ps.setInt(3,bean.getAddress());
		ps.setInt(4, bean.getId());
		
		int i = ps.executeUpdate();
		System.out.println("data updated"+ i);
	}
}

		
	
		
	


