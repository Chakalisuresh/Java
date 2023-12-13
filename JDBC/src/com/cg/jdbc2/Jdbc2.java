package com.cg.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc2 {

	public static void main(String[] args)throws Exception {
		String url      = "jdbc:mysql://localhost:3306/sql_intro";
		String userName = "root";
		String Password = "root";
		
		String Name   = "Dheerajj";
		int Age       = 29;
		String Gender = "Male";
		String Email  = "dheeraj@gmail.com";
		String Address= "Delhi";
		String query  = "insert into Student_info values('"+Name+"', "+Age+", '"+Gender+"', '"+Email+"', '"+Address+"' )";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,userName, Password);
		Statement st   = con.createStatement();
		int count      =  st.executeUpdate(query);
		
		System.out.println(count+ "rows/affected");
		
		st.close();
		con.close();
	}

}
