package highSchool.topic5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student {
	private Connection connect = null;

	public Student(Connection connect) {
		this.connect = connect;
	}

	public void insertExampleValues() {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			preparedStatement = connect.prepareStatement("SELECT * from highschool.student");
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		writeResults(resultSet);
	}
	
	public void writeResults(ResultSet resultSet){
		
	}

	public void finalNotesCourses(int studentId) throws SQLException {
		String firstname = "";
		String lastname = "";
		PreparedStatement studentStatement = null;
		PreparedStatement notesStatement = null;
		ResultSet notesResultSet = null;
		ResultSet studentResultSet = null;

		studentStatement = connect
				.prepareStatement("SELECT firstname, lastname FROM student WHERE regnumber = ?;");
		studentStatement.setInt(1, studentId);
		studentResultSet = studentStatement.executeQuery();

		while (studentResultSet.next()) {
			lastname = studentResultSet.getString("lastname") ;
			firstname = studentResultSet.getString("firstname");
			notesStatement = connect
					.prepareStatement("SELECT finalnote, name FROM "
							+ "(SELECT finalnote, idcourse FROM notespercourse WHERE idstudent =?)_notes "
							+ "INNER JOIN (SELECT idcourse, name FROM course)_courses "
							+ "ON _notes.idcourse = _courses.idcourse "
							+ "ORDER BY finalnote DESC, finalnote;");
			notesStatement.setInt(1, studentId);
			notesResultSet = notesStatement.executeQuery();
			printInfoStudent(firstname, lastname, notesResultSet);
		}
		
	}

	public void printInfoStudent(String firstNameStudent, String lastNameStudent, ResultSet resultSet)
			throws SQLException {
		System.out.println("Student: " + lastNameStudent + ", " +firstNameStudent);
		System.out.println("Final notes:");
		while (resultSet.next()) {
			System.out.println("\t" + resultSet.getInt("finalnote") + " in "
					+ resultSet.getString("name"));
		}
	}
}
