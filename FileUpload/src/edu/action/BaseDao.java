package edu.action;

import java.sql.Connection;

public class BaseDao {

	private Connection connection=null;

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
}
