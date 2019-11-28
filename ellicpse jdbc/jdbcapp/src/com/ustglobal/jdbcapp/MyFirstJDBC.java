package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//Step1 : Load the driver
			Driver driver = new Driver();//to communicate b/w java and mysql we use driver(jar file)
			DriverManager.registerDriver(driver);//to register the driver


			//Step2 :Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			conn = DriverManager.getConnection(url, "root", "root");

			//Step3 : Issue SQL query
			String sql = "select * from employee_info";
			stmt = conn.createStatement();//it is a platform to execute any query
			rs = stmt.executeQuery(sql);//resultset is the table representation in java
			
			//Step4 : Read the result 
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				System.out.println("Id: "+id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gender);
				System.out.println("**********************");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//Step5 : Close all jDBC objects
			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(rs != null) {
					rs.close();
				}
			}catch (SQLException e){
				e.printStackTrace();
			}

		}

	}//end of main()
}//end of MyFirstJDBC
