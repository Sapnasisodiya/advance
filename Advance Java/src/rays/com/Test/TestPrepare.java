package rays.com.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPrepare {
	public static void main (String []args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		PreparedStatement ps = conn.prepareStatement("insert into user values (22, 'ddd', 2000, 106)");
		int i = ps.executeUpdate();
		System.out.println("data inserted" + i);
	}

}
