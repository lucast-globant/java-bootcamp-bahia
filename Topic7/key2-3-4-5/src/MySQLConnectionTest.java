package groupid.MySQLConnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import junit.framework.TestCase;

public class MySQLConnectionTest extends TestCase {

    public void testConnect() {
    String dbUrl = "jdbc:mysql://localhost/high_school";
    String dbClass = "com.mysql.jdbc.Driver";
    String query =  "Select * from course";
    String username = "root";
    String password = "martinA1987";
    try {

        Class.forName(dbClass);
        Connection connection = DriverManager.getConnection(dbUrl,
            username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
        String tableName = resultSet.getString(1);
        System.out.print("Course name : " + tableName);
        System.out.println("  Teacher id : " + resultSet.getString(1));
        }
        connection.close();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
}