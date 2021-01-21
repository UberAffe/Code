package com.revature.day05;

import java.sql.*;

public class Main {
	public static void main(String []args) {
		//IExample ex= new ExampleObject();
		//System.out.println(ex.testing(5));
		String url= "jdbc:postgresql://localhost/dvdrental";
		String username="postgre";
		String password="Eleven28Ten";
		Statement s1 = null;
		try (Connection connection = DriverManager.getConnection(url,username,password);){
			s1= connection.createStatement();
			ResultSet rows=s1.executeQuery("select * from actor where actor_id=1;");
			ResultSet row=rows;
			do {
				System.out.println(row.toString());
			} while(row.next());
		}
		catch(SQLException e) {
			System.out.println("failed connection");
		}
	}
}
