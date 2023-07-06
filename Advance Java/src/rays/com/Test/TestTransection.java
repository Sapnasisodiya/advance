package rays.com.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.rats.util.JDBCDataSource;



public class TestTransection {
	public static void main (String []args) throws Exception {
		//add();
		//update();
		delete();
		
	}

	private static void delete() throws Exception {
		Connection conn = JDBCDataSource.getConnection();
		
		conn.setAutoCommit(false);
		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("delete from user where id = 17");
		i = stmt.executeUpdate("delete from user where id = 18");
		System.out.println("data delete "+ i);
		conn.commit();
	}

	private static void update() throws Exception {
		Connection conn = JDBCDataSource.getConnection();
		conn.setAutoCommit(false);
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("update user set name ='pooja' where id = 19");
		i = stmt.executeUpdate("update user set name = 'chotu' where id = 20");
		System.out.println("data updated "+ i);
		conn.commit();
		
	}

	private static void add() throws Exception {
		Connection conn = JDBCDataSource.getConnection();
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306:/advance","root","root");
		
		conn.setAutoCommit(false);
		
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("insert into user value (19,'puja',2000,119)");
		i = stmt.executeUpdate("insert into user value(20,'kukku',3000,200)");
		System.out.println("data inserted" + i);
		conn.commit();
		
	}

}
