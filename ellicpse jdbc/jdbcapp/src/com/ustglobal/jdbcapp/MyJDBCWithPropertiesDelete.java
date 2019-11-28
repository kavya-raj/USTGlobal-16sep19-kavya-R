package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;



public class MyJDBCWithPropertiesDelete {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			


			//Step1 : Load the driver
			Class.forName(prop.getProperty("driver-class-name"));
			
			//Step2 :Get the connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);

			//Step 3 :Issue SQL query
			String sql = prop.getProperty("delete-query");
			
			pstmt =conn.prepareStatement(sql); 
			pstmt.setInt(1, Integer.parseInt(args[0]));

			int count = pstmt.executeUpdate();

			//Step 4 :Read the result
			System.out.println(count + "Row(s) deleted");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//Step 5 : Close all JDBC objects
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}//End of main

}
