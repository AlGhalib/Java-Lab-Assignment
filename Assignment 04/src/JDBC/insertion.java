package JDBC;

import java.sql.*;
import java.util.Scanner;

public class insertion 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		String url = "jdbc:ucanaccess://D:/ICE study materials/3-1/ICE3132 Java and Network Programming Lab/Assignment 04/Database1.accdb";
		
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			
			String sql = "INSERT INTO Student (Name,Age) Values(?,?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
		
			System.out.print("Enter Name : ");
			statement.setString(1, sc.nextLine());
			
			System.out.print("Enter Age : ");
			statement.setString(2, sc.nextLine());
			
			int rows = statement.executeUpdate() ;
			
			if (rows >0) {
				System.out.println("Inserted Successfully");
			}
			else System.out.println("Doesn't Inserted");
			
			
			
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
