package com.cg.jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Jdbc3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String url      = "jdbc:mysql://localhost:3306/sql_intro";
		String userName = "root";
		String Password = "root";
		
		String Name   = "hari";
		int Age       = 29;
		String Gender = "Male";
		String Email  = "hari@gmail.com";
		String Address= "kkl";
		String query  = "insert into Student_info values(?,?,?,?,? )";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,userName, Password);
		PreparedStatement st   = con.prepareStatement(query);
		
		st.setString(1, Name);
		st.setInt(2, Age);
		st.setString(3, Gender);
		st.setString(4, Email);
		st.setString(5, Address);
		
		int count      =  st.executeUpdate();
		
		System.out.println(count+ "rows/affected");
		
		st.close();
		con.close();

	}

}
