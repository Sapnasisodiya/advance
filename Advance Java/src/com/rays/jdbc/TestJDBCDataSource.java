package com.rays.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.rats.util.JDBCDataSource;
import com.rays.marksheet.MarksheetBean;

public class TestJDBCDataSource {
	public static void main (String []args)throws Exception {
		for(int i = 1; i<=50; i++) {
			System.out.println("connection ="+ i );
		
			testDCP();
		}
	}
			
		private static void testDCP() throws Exception {
		Connection conn = JDBCDataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("select * from marksheet where id = 1");
		ResultSet rs = ps.executeQuery();
		MarksheetBean bean = null;
		while(rs.next()) {
			bean = new MarksheetBean();
			System.out.println(rs.getInt(1));
			System.out.println(rs.getInt(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			System.out.println(rs.getInt(5));
			System.out.println(rs.getInt(6));
		}

		
		
		
		
		
	
		
		
		
	}

}
