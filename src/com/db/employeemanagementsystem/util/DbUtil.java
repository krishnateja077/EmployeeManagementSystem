package com.db.employeemanagementsystem.util;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public final static String USER_NAME = "root";
	public final static String PASSWORD = "";
	public final static String DRIVER_NAME="com.mysql.jdbc.Driver";
	public final static String URI = "jdbc:mysql://localhost:3306/sample";
	
	public static Connection getConnection() {
		
		Connection connection=null;
		try {
		Class.forName(DRIVER_NAME);
		connection=DriverManager.getConnection(URI, USER_NAME, PASSWORD);
		return connection;
		}catch(ClassNotFoundException e) {
		e.printStackTrace();
		}catch(SQLException e) {
		e.printStackTrace();
		}
		return connection;
		}

		public static void closeConnection(Connection connection) {
		try {
		connection.close();

		}catch(SQLException e) {
			
		e.printStackTrace();
		}
		}
}
