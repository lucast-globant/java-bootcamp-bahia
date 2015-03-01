package highSchool.topic5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
	private Connection connect = null;

	public Connection getConnection() throws Exception {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager
					.getConnection("jdbc:mysql://localhost/highschool?"
							+ "user=bootcampjava");
			return connect;
		} catch (Exception e) {
			throw e;
		}
	}

	public void closeConnection() {
		try {
			connect.close();
		} catch (SQLException e) {
			System.out.println("There was a problem colsing the connection");
			e.printStackTrace();
		}
	}
}
