package topic_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL {
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;  

	public MySQL() {
		conectDB();
	}

	private void conectDB() {
		// This will load the MySQL driver, each DB has its own driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {	}
		// Setup the connection with the DB
		try {
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/high_school?" + "user=high_school_user&password=hspw");
		} catch (SQLException e) { }
	}


	public void list_Course_Teachers_Students (int id_course) throws Exception {
		// Statements allow to issue SQL queries to the database
		statement = connect.createStatement();

		// Result set get the result of the SQL query
		resultSet = statement.executeQuery("SELECT name, first_name, last_name FROM (teacher T NATURAL JOIN course C) WHERE (C.id_course="+id_course+")");
		write_Course_Teacher(resultSet);

		resultSet = statement.executeQuery("SELECT last_name, first_name FROM (rinde R NATURAL JOIN student S) WHERE (R.id_course="+id_course+") ORDER BY last_name");
		write_Course_Students(resultSet);      

	}

	private void write_Course_Teacher (ResultSet resultSet) throws SQLException {
		resultSet.next();
		String course_name = resultSet.getString(1);
		String teacher_name = resultSet.getString(2);
		String teacher_last_name = resultSet.getString(3);
		System.out.println("Course Name: " + course_name);
		System.out.println("Teacher: " + teacher_last_name + ", " + teacher_name);
	}

	private void write_Course_Students(ResultSet resultSet) throws SQLException {
		System.out.println("Students:");
		while (resultSet.next())
			System.out.println(resultSet.getString(1) + ", " + resultSet.getString(2));
	}

	public void list_FinalNotes_Course(int reg_number) throws SQLException {
		statement = connect.createStatement();
		resultSet = statement.executeQuery("SELECT name, final_note FROM (rinde R NATURAL JOIN course C) WHERE (R.reg_number="+reg_number+") ORDER BY final_note DESC, name");
		write_FinalNotes_Course(reg_number,resultSet);
	}

	private void write_FinalNotes_Course (int reg_number, ResultSet resultSet) throws SQLException {
		System.out.println("Registration number: "+reg_number);
		while(resultSet.next())
			System.out.println("Course: " + resultSet.getString("name") + ". Final Note: " + resultSet.getString("final_note"));
	}

	// You need to close the resultSet
	public void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}
} 