package edu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	static{
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection() throws SQLException{
		
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","student");
		return connection;
		
	}
}
