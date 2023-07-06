package rays.com.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestCURD {
	public static void main (String []args) throws Exception {
		
		//testupdate();
		//testdelete();
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("insert into user value (5,'shalini',6600,105)");
		System.out.println("data inserted " + i);
		
	}

	private static void testdelete() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("delete from user where id = 3");
		System.out.println("data delete" + i);
	}
		
	

	private static void testupdate()throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("update user set name = 'ritu' where id = 2");
		System.out.println("data update "+ i);
	}
		
	

}
