package Topic_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	private Connection con;
	private Statement statement;
	private ResultSet resultSet;
	
	public void open(){
		try {
			if(con == null || con.isClosed()){
				Class.forName("com.mysql.jdbc.Driver");
				String server = "localhost:3306";
				String db = "high-school";
				String user = "root";
				String pass = "root";
				String url = "jdbc:mysql://"+server+"/"+db;
				con = DriverManager.getConnection(url,user,pass);
				System.out.println("SQL: Opened");
			}
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close(){
		if(con != null){
			try {
				con.close();
				System.out.println("SQL: Closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public ResultSet executeQuery(String query){
		try {
			statement = con.createStatement();
			return resultSet = statement.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}
	
	public void closeResultSet(){
		try {
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
