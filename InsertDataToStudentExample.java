package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataToStudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/edubridge?characterEncoding=utf8","root","73Dp@1729");
		    Statement statement=connection.createStatement();
		  int result = statement.executeUpdate("insert into student values(5000,'manishakoyarla',89,4)");
 if (result ==1)
 {
	 System.out.println("insert sucessfully");
 }
				}
				catch(ClassNotFoundException ex)
			{
				System.out.println("class not found"+ex.getMessage());
			}catch ( SQLException ex)
				{
				System.out.println("class not found"+ex.getMessage());
				}

	}

}
