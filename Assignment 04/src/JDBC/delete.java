package JDBC;

import java.sql.*;
import java.util.*;

public class delete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String url = "jdbc:ucanaccess://D:/ICE study materials/3-1/ICE3132 Java and Network Programming Lab/Assignment 04/Database1.accdb";
		
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			
			System.out.print("Enter ID : ");
			
			int id = sc.nextInt() ;
			
			String sql = "DELETE Student WHERE ID = ?" ;
			PreparedStatement statement = connection.prepareStatement(sql) ;
			
			statement.setString(1, String.valueOf(id));
			
			int rows = statement.executeUpdate() ;
			
			if (rows > 0) System.out.println("Deleted successfully");
			else System.out.println("Cannot delete");
			
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
