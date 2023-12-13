package com.cg.jdbc;

import java.sql.*;

public class JavaDataBacseConnectivity {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/sql_intro";
		String userName = "root";
		String Password = "Root";
		String query = "select Name from Student_info Where Age = 26";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection(url,userName, Password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		
		String name = rs.getString("Name");
		
		System.out.println(name);
		
		st.close();
		con.close();

	}

}
