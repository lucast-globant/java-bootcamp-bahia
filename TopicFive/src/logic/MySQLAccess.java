package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLAccess {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public void startDataBase() throws Exception {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager
					.getConnection("jdbc:mysql://localhost/high-school?"
							+ "user=root&password=root");

		} catch (Exception e) {
			throw e;
		} finally {
			// close();
		}

	}

	public void bdClose() {
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

	public void addStudent(String first_name, String last_name,
			int registration_number, java.sql.Date date_of_birth) {
		// PreparedStatements can use variables and are more efficient
		try {
			preparedStatement = connect
					.prepareStatement("INSERT INTO student (" + "first_name,"
							+ "last_name," + "registration_number,"
							+ "date_of_birth) " + "VALUES ( ?, ?, ?, ? )");

			// Parameters start with 1
			preparedStatement.setString(1, first_name);
			preparedStatement.setString(2, last_name);
			preparedStatement.setInt(3, registration_number);
			preparedStatement.setDate(4, date_of_birth);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addTeacher(String first_name, String last_name,
			java.sql.Date date_of_birth) {
		// PreparedStatements can use variables and are more efficient
		try {
			preparedStatement = connect
					.prepareStatement("INSERT INTO teacher (" + "first_name,"
							+ "last_name," + "date_of_birth) "
							+ "VALUES ( ?, ?, ? )");

			// Parameters start with 1
			preparedStatement.setString(1, first_name);
			preparedStatement.setString(2, last_name);
			preparedStatement.setDate(3, date_of_birth);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addCourse(String name, String teacher_first_name,
			String teacher_last_name, int hours_by_week, String day, int st,
			int et) {
		// PreparedStatements can use variables and are more efficient
		try {
			int tId = getTeacherId(teacher_first_name, teacher_last_name);
			int sId = getSheduleTimeId(day, st, et);
			preparedStatement = connect
					.prepareStatement("INSERT INTO course (name, id_assigned_teacher, hours_by_week, id_shedule_time_fk) VALUES ( ?, ?, ?, ? )");

			// Parameters start with 1
			preparedStatement.setString(1, name);

			preparedStatement.setInt(2, tId);
			preparedStatement.setInt(3, hours_by_week);
			preparedStatement.setInt(4, sId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addStudentToCourse(String student_name,
			String student_last_name, String course_name) {
		try {
			int sId = getStudentId(student_name, student_last_name);
			int cId = getCourseId(course_name);
			preparedStatement = connect
					.prepareStatement("INSERT INTO student_course ("
							+ "id_student_fk," + "id_course_fk) "
							+ "VALUES ( ?, ? )");

			// Parameters start with 1
			preparedStatement.setInt(1, sId);
			preparedStatement.setInt(2, cId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void createSheduleTime(String day, int start_hour, int end_hour) {
		// PreparedStatements can use variables and are more efficient
		try {
			preparedStatement = connect
					.prepareStatement("INSERT INTO shedule_time ("
							+ "start_time," + "end_time," + "day_name) "
							+ "VALUES ( ?, ?, ? )");

			// Parameters start with 1
			preparedStatement.setInt(1, start_hour);
			preparedStatement.setInt(2, end_hour);
			preparedStatement.setString(3, day);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addTeacherToCourse(String teacher_name,
			String teacher_last_name, String course_name) {
		try {
			int tId = getTeacherId(teacher_name, teacher_last_name);
			int cId = getCourseId(course_name);
			preparedStatement = connect
					.prepareStatement("INSERT INTO teacher_course ("
							+ "id_teacher_fk2," + "id_course_fk2) "
							+ "VALUES ( ?, ? )");

			// Parameters start with 1
			preparedStatement.setInt(1, tId);
			preparedStatement.setInt(2, cId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addNotes(String student_name, String student_last_name,
			String course, int n1, int n2, int n3, int fn) {
		try {
			int sId = getStudentId(student_name, student_last_name);
			int cId = getCourseId(course);
			int scId = getStudentCourseId(sId, cId);
			preparedStatement = connect
					.prepareStatement("INSERT INTO notes (id_student_course_fk,partial_note_1,partial_note_2,partial_note_3,final_note) VALUES ( ?, ?, ?,?,? )");

			// Parameters start with 1
			preparedStatement.setInt(1, scId);
			preparedStatement.setInt(2, n1);
			preparedStatement.setInt(3, n2);
			preparedStatement.setInt(4, n3);
			preparedStatement.setInt(5, fn);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private int getStudentCourseId(int id_student, int id_course) {
		try {
			preparedStatement = connect
					.prepareStatement("SELECT sc.id_student_course FROM student_course sc WHERE sc.id_student_fk = ? AND sc.id_course_fk = ? ;");
			preparedStatement.setInt(1, id_student);
			preparedStatement.setInt(2, id_course);
			resultSet = preparedStatement.executeQuery();
			int toR = 0;
			while (resultSet.next()) {
				toR = resultSet.getInt("id_student_course");
			}
			return toR;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	private int getTeacherId(String first_name, String last_name) {
		try {
			preparedStatement = connect
					.prepareStatement("SELECT t.id_teacher FROM teacher t WHERE t.first_name = ? AND t.last_name = ? ;");
			preparedStatement.setString(1, first_name);
			preparedStatement.setString(2, last_name);
			resultSet = preparedStatement.executeQuery();
			int toR = 0;
			while (resultSet.next()) {
				toR = resultSet.getInt("id_teacher");
			}
			return toR;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	private int getCourseId(String name) {
		try {
			preparedStatement = connect
					.prepareStatement("SELECT id_course FROM course WHERE name = ? ; ");
			preparedStatement.setString(1, name);
			resultSet = preparedStatement.executeQuery();
			int toR = 0;
			while (resultSet.next()) {
				toR = resultSet.getInt("id_course");
			}
			return toR;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	private int getSheduleTimeId(String day, int start_time, int end_time) {
		try {
			preparedStatement = connect
					.prepareStatement("SELECT s.id_shedule_time FROM shedule_time s WHERE s.day_name = ? AND s.start_time = ? AND s.end_time = ? ;");
			preparedStatement.setString(1, day);
			preparedStatement.setInt(2, start_time);
			preparedStatement.setInt(3, end_time);
			resultSet = preparedStatement.executeQuery();
			int toR = 0;
			while (resultSet.next()) {
				toR = resultSet.getInt("id_shedule_time");
			}
			return toR;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	private int getStudentId(String first_name, String last_name) {
		try {
			preparedStatement = connect
					.prepareStatement("SELECT s.id_student FROM student s WHERE s.first_name = ? AND s.last_name = ?;");
			preparedStatement.setString(1, first_name);
			preparedStatement.setString(2, last_name);
			resultSet = preparedStatement.executeQuery();
			int toR = 0;
			while (resultSet.next()) {
				toR = resultSet.getInt("id_student");
			}
			return toR;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public String listStudentsAndTeachers(String course) {
		try {
			String toR = "Course: " + course + "\n" + "Teacher: ";
			preparedStatement = connect
					.prepareStatement("SELECT t.first_name, t.last_name FROM teacher t, teacher_course tc, course c WHERE t.id_teacher = tc.id_teacher_fk2 AND c.name = ? AND c.id_course = tc.id_course_fk2;");
			preparedStatement.setString(1, course);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				toR += resultSet.getString("last_name") + ", ";
				toR += resultSet.getString("first_name") + "\n";
			}
			toR += "Students: \n";
			preparedStatement = connect
					.prepareStatement("SELECT s.first_name, s.last_name FROM student s, student_course sc, course c WHERE s.id_student = sc.id_student_fk AND c.name = ? AND c.id_course = sc.id_course_fk ORDER BY s.last_name;");
			preparedStatement.setString(1, course);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				toR += "\t" + resultSet.getString("last_name") + ", ";
				toR += resultSet.getString("first_name") + "\n";
			}

			return toR;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	public String listFinalNotes(int registration_number){
		try {
			String toR = "";
			preparedStatement = connect
					.prepareStatement("select n.final_note, c.name from notes n, student_course sc, student s, course c Where sc.id_student_fk = s.id_student AND n.id_student_course_fk = sc.id_student_course AND c.id_course = sc.id_course_fk AND s.registration_number = ? ORDER BY n.final_note DESC, c.name;");
			preparedStatement.setInt(1, registration_number);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				toR += resultSet.getString("name") + ": " + resultSet.getString("final_note") + "\n";
			}
			return toR;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
}