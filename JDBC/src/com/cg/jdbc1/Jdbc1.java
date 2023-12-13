package com.cg.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args)throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/sql_intro";
		String userName = "root";
		String Password = "root";
		String query = "select * from Student_info";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection(url,userName, Password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
		
		String userData = rs.getString(1)+ ": " + rs.getInt(2)+ ": " + rs.getString(3)+ ": " + rs.getString(4)+": " +rs.getString(5);
		
		System.out.println(userData);
		}
		
		st.close();
		con.close();

	}

}
