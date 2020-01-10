package com.jdbcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

public class DatabaseConnection {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/University?useSSL=false";
		String username = "root";
		String password = "root";
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");//For any other versions of MYSQL
			Class.forName("com.mysql.cj.jdbc.Driver");//For MYSQL 8+ only
			Connection conn = DriverManager.getConnection(url, username, password);

			if (conn != null) {
				System.out.println("Database is connected!!!");
				String query = "Insert into student(id, first_name, last_name, date_of_entry) values(?,?,?,?)";
				// Creating an object of prepared statement.
				PreparedStatement prep = conn.prepareStatement(query);
				Scanner sc = new Scanner(System.in);
				System.out.print("Please Enter your ID: "+"\n");
				int id= sc.nextInt();
				prep.setInt(1, id);
				System.out.print("Please Enter your first name: "+"\n");
				String first_name= sc.next();
				prep.setString(2, first_name);
				System.out.print("Please Enter your last name: "+"\n");
				String last_name= sc.next();
				prep.setString(3, last_name);
				Timestamp times = new Timestamp(new Date().getTime());
				prep.setTimestamp(4, times);

				// Execute the query
				int numberOfRecords = prep.executeUpdate();
				System.out.println("Records updated!!!");
				System.out.println("Number of records:  "+ numberOfRecords);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

