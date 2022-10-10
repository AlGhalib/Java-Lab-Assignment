package JDBC;

import java.sql.*;
import java.util.*;

public class selection {

	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			
			String url = "jdbc:ucanaccess://D:/ICE study materials/3-1/ICE3132 Java and Network Programming Lab/Assignment 04/Database1.accdb";
			
			Connection connection = DriverManager.getConnection(url);
			
			String sql = "SELECT * FROM Student";
			PreparedStatement statement = connection.prepareStatement(sql);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next())
			{
				System.out.println("Id : "+result.getString("Id"));
				System.out.println("Name : "+result.getString("Name"));
				System.out.println("Age : "+result.getString("Age"));
                System.out.println("-----------------------");
			}
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
