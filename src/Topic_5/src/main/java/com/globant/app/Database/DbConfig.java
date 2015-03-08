package com.globant.app.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {

	private Connection connection;
	private final String connectionString = "jdbc:mysql://localhost/?user=root&password=root";

	public DbConfig() {
		try {
			connection = DriverManager.getConnection(connectionString);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}
}
