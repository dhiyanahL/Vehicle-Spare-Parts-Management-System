//IT22055262 - LIYAUDEEN D.H - Seller CRUD 
package com.Seller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	private static String url = "jdbc:mysql://localhost:3306/vspms";
	private static String username = "root";
	private static String password = "admin123";
	private static Connection con;

	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, password);
			
			
		}
		catch (Exception e) {
			System.out.println("Database connection is unsuccessful!");
		}
		
		return con;
	}


}
