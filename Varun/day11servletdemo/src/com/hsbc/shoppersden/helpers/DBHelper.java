package com.hsbc.shoppersden.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBHelper {
	
	private static ResourceBundle resourceBundle;

	public static Connection getConnection() throws SQLException
	{
		Connection conn=null;
		resourceBundle=ResourceBundle.getBundle("com/hsbc/shoppersden/resources/db");
		String url=resourceBundle.getString("url");
		String userName=resourceBundle.getString("username");
		String password=resourceBundle.getString("password");
		String driver=resourceBundle.getString("driver");
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,userName,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
}
