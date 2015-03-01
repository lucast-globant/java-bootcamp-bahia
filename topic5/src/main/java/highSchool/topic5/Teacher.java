package highSchool.topic5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class Teacher {
	private Connection connect = null;

	public Teacher(Connection connection) {
		this.connect = connection;
	}

	public void infoSchedule(String teacherLastName) throws SQLException {
		String teacherName = "";
		int teacherId;
		PreparedStatement teacherStatement = null;
		PreparedStatement coursesStatement = null;
		ResultSet coursesResultSet = null;
		ResultSet teacherResultSet = null;

		teacherStatement = connect
				.prepareStatement("SELECT idteacher, firstname, lastname FROM teacher WHERE lastname = ?;");
		teacherStatement.setString(1, teacherLastName);
		teacherResultSet = teacherStatement.executeQuery();

		while (teacherResultSet.next()) {
			teacherId = teacherResultSet.getInt("idteacher");
			teacherName = teacherResultSet.getString("lastname") + ", "
					+ teacherResultSet.getString("firstname");
			coursesStatement = connect
					.prepareStatement("SELECT name, scheduleday, schedulefrom, scheduleto FROM  "
							+ "(SELECT idcourse,name FROM course WHERE assignedteacher= ?)_teachercourses "
							+ "INNER JOIN schedule "
							+ "ON _teachercourses.idcourse = schedule.idcourse "
							+ "ORDER BY scheduleday ASC, schedulefrom ASC;");
			coursesStatement.setInt(1, teacherId);
			coursesResultSet = coursesStatement.executeQuery();
			printInfoCoursesTeacher(teacherName, coursesResultSet);
		}
	}

	public void infoSchedule(int teacherId) throws SQLException {
		String teacher = "";
		PreparedStatement teacherStatement = null;
		PreparedStatement coursesStatement = null;
		ResultSet teacherResultSet = null;
		ResultSet coursesResultSet = null;

		teacherStatement = connect
				.prepareStatement("SELECT firstname, lastname FROM teacher WHERE idteacher = ?;");
		teacherStatement.setInt(1, teacherId);
		teacherResultSet = teacherStatement.executeQuery();

		while (teacherResultSet.next()) {
			teacher = teacherResultSet.getString("lastname") + ", "
					+ teacherResultSet.getString("firstname");
			coursesStatement = connect
					.prepareStatement("SELECT name, scheduleday, schedulefrom, scheduleto FROM  "
							+ "(SELECT idcourse,name FROM course WHERE assignedteacher= ?)_teachercourses "
							+ "INNER JOIN schedule "
							+ "ON _teachercourses.idcourse = schedule.idcourse "
							+ "ORDER BY scheduleday ASC, schedulefrom ASC;");
			coursesStatement.setInt(1, teacherId);
			coursesResultSet = coursesStatement.executeQuery();
			printInfoCoursesTeacher(teacher, coursesResultSet);
		}
	}

	public void printInfoCoursesTeacher(String teacher, ResultSet resultSet)
			throws SQLException {
		String day;
		Time from, to;
		SimpleDateFormat hhmm = new SimpleDateFormat("HH:mm");

		System.out.println("Teacher: " + teacher);
		System.out.println("Schedule:");
		while (resultSet.next()) {
			day = resultSet.getString("scheduleday");
			from = resultSet.getTime("schedulefrom");
			to = resultSet.getTime("scheduleto");
			System.out.println("\t" + String.format("%1$-" + 11 + "s", day)
					+ " " + hhmm.format(from) + " - " + hhmm.format(to) + " -> "
					+ resultSet.getString("name"));
		}
	}
}
