package in.ac.jyothyit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDelete{
	public static void main(String args[]) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/institutes";
		String username = "root";
		String password = "";
		String sql = "delete from students where usn = ?";
		String usn = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the usn");
		usn=scanner.next();
		scanner.close();
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
			preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setString(1, usn);
			int n  = preparedStatement.executeUpdate();
			if(n==1)
				System.out.println("deleted successfully!!!");
			else
				System.out.println("not found");
			preparedStatement.close();
			connection.close();
			
			
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		}
			catch(SQLException sqle)
			{
				System.out.println(sqle);
			}
		
	}
}