package rays.com.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestTransectiontrycatch {
	public static void main (String []args) throws Exception {
		
		//update();
		delete();
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			int i = stmt.executeUpdate("insert into user value (17,'shalini',6600,107)");
			 i = stmt.executeUpdate("insert into user value (18,'ddd',7000,109)");
			 i = stmt.executeUpdate("insert into user value (22,'uuuu',1100,111)");
			System.out.println("data inserted " + i);
			conn.commit();
		
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		}
	}

	private static void delete() throws Exception {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			int i = stmt.executeUpdate("delete from user where id = 22");
			i = stmt.executeUpdate("delete from user where id = 18");
			System.out.println("data delete "+ i);
			conn.commit();
		}catch(Exception e) {
			conn.rollback();
			e.printStackTrace();
		}
		
	}

	private static void update()throws Exception {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			int i = stmt.executeUpdate("update user set name ='yyy' where id = 11");
			i = stmt.executeUpdate("update user set name = 'kkk' where id = 22");
			i = stmt.executeUpdate("update user set name = 'lll' where id = 15");
			System.out.println("data updated" + i);
			conn.commit();
		}catch(Exception e) {
			conn.rollback();
			e.printStackTrace();
		}
		
	}

}
