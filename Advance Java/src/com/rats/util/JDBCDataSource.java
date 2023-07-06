package com.rats.util;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public final class JDBCDataSource {
	
	private static  JDBCDataSource jds = null;
	
	private ComboPooledDataSource ds = null;
	
	private ResourceBundle rs = null;

	private JDBCDataSource() {
		
		
		rs = ResourceBundle.getBundle("path");
		
		try {
		
		ds = new ComboPooledDataSource();
		
		ds.setDriverClass("Driver");
		ds.setJdbcUrl("url");
		ds.setUser("user");
		ds.setPassword("password");
		ds.setInitialPoolSize(5);
		ds.setAcquireIncrement(5);
		ds.setMaxPoolSize(25);
		}catch(PropertyVetoException e) {
			e.printStackTrace();
		}
	}
	public static JDBCDataSource getInstance() {
		if(jds == null) {
			jds = new JDBCDataSource();
		}
		return jds;
		
	}
	public static Connection getConnection() {
		try {
			return getInstance().ds.getConnection();
		}catch(SQLException e) {
		return null;
		}
	}
		
	
		
		
	
}

