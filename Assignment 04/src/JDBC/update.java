package JDBC;

import java.sql.*;
import java.util.*;

public class update 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String url = "jdbc:ucanaccess://D:/ICE study materials/3-1/ICE3132 Java and Network Programming Lab/Assignment 04/Database1.accdb";
		
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			
			String sql = "UPDATE Student SET Name=? ,Age=? where ID=?" ;
			PreparedStatement statement = connection.prepareStatement(sql);
			
			System.out.print("Enter ID : ");
			int id = sc.nextInt();
			statement.setString(3, String.valueOf(id));
			
			System.out.print("Enter Name : ");
			statement.setString(1, sc.next());
			
			System.out.print("Enter Age : ");
			statement.setString(2, sc.next());
			
			
			int rows = statement.executeUpdate() ;
			
			if (rows >0) {
				System.out.println("Updated successfully");
			}
			else System.out.println("Cannot Update");
			
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
