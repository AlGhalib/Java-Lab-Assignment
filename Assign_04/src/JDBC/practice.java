package JDBC;


import java.sql.*;
import java.util.*;


class practice 
{
	public static void main(String[] args) 
	{
		//String url = "jdbc:ucanaccess://D:/ICE study materials/3-1/ICE3132 Java and Network Programming Lab/Assign_04/Database11.accdb";
		
		Scanner input = new Scanner(System.in);
		
		try 
		{
			Connection connection = DriverManager.getConnection("jdbc:ucanaccess://D:/ICE study materials/3-1/ICE3132 Java and Network Programming Lab/Assign_04/Database11.accdb");
			System.out.println("Database Connected Successfully");
			
			//insert
			
			//String sqlString = "INSERT INTO Student (Name,Email,Roll) Values(?,?,?)";
			PreparedStatement update = connection.prepareStatement("INSERT INTO Student (Name,Email,Roll) Values(?,?,?)");
			
			System.out.print("Enter Name : ");
			//String nameString = input.nextLine();
			update.setString(1, input.next());
			
			System.out.print("Enter Email : ");
			//String emailString = input.nextLine();
			update.setString(2, input.next());
			
			System.out.print("Enter Roll : ");
			//String rollString = input.nextLine();
			update.setString(3, input.next());
			
			
			update.executeUpdate();
			
			System.out.println("Updated Successfully");
//			
//			if(row > 0)
//			{
//				System.out.println("Row has been Inserted Successfully");
//			}
//			else
//			{
//				System.out.println("Not Inserted");
//			}
			
			//View
			//String sqlString = "SELECT * FROM student";
//			PreparedStatement show = connection.prepareStatement("SELECT * FROM student");
//			ResultSet result = show.executeQuery();
//			while(result.next())
//			{
////				int id = result.getInt("ID");
////				String name = result.getString("Name");
////				String email = result.getString("Email");
////				String roll = result.getString("Roll");
////				System.out.println(id + " " + name + " " + roll + " " + email);
//				
//				System.out.println("Id : "+result.getString("Id"));
//				System.out.println("Name : "+result.getString("Name"));
//				System.out.println("Roll : "+result.getString("Roll"));
//                System.out.println("Email : "+result.getString("Email"));
//                System.out.println("-----------------------");
//			}
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
