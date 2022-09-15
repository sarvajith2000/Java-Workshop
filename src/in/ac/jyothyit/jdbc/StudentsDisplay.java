package in.ac.jyothyit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentsDisplay {
	public static void main(String args []) {
	Connection connection =  null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/institutes";
	String username = "root";
	String password = "";
	String sql = "select* from students";
	try {
		Class.forName(driver);
		connection = DriverManager.getConnection(url, username, password);
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);
		while(resultSet.next()) {
			System.out.println(resultSet.getString("usn")+" "+resultSet.getString("name")+ " "+resultSet.getString("gender")+" "+resultSet.getInt("age")+" "+resultSet.getString("email")+" "+resultSet.getString("City"));
		}
			
		statement.close();
		connection.close();}
	catch(ClassNotFoundException cnfe) {
		System.out.println(cnfe);
	}
		catch(SQLException sqle)
		{
			System.out.println(sqle);
		}
	}
	

}
