package JDBC;

import java.util.*;
import java.sql.*;

public class connection 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		String url = "jdbc:ucanaccess://D:/ICE study materials/3-1/ICE3132 Java and Network Programming Lab/Assignment 04/Database11.accdb";
		
		try 
		{
			Connection connection = DriverManager.getConnection(url);
			System.out.println("Database connected successfully");
			connection.close();
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
