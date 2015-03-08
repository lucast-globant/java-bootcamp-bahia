import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DataBaseConnection {

	private Connection connect;
	private ResultSet resultSet;

	public void connect() throws Exception {

		Class.forName("com.mysql.jdbc.Driver").newInstance();

		String server = "localhost:3306";
		String dataBase = "high_school";
		String urlConnection = "jdbc:mysql://" + server + "/" + dataBase;
		String user = "root";
		String password = "mh35776251";

		connect = java.sql.DriverManager.getConnection(urlConnection, user, password);

		System.out.println("Connection with DataBase " + dataBase + " was succesful !");
	}

	public Connection getConecction() {
		return connect;
	}

}