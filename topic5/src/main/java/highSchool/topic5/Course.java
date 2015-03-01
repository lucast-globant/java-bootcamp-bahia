package highSchool.topic5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Course {
	private Connection connect = null;

	// private Statement statement = null;
	// private ResultSet resultSet = null;

	public Course(Connection connect) {
		this.connect = connect;
	}

	public void infoForCourse(int courseId) throws SQLException {
		String course = "";
		String teacher = "";
		PreparedStatement courseStatement = null;
		PreparedStatement studentsStatement = null;
		ResultSet studentsResultSet = null;
		ResultSet courseResultSet = null;

		courseStatement = connect
				.prepareStatement("SELECT name, firstname, lastname FROM "
						+ "(SELECT assignedteacher, name FROM highschool.course WHERE idcourse= ?)_course "
						+ "INNER JOIN (SELECT idteacher, lastname, firstname FROM highschool.teacher)_teachers"
						+ " ON _course.assignedteacher=_teachers.idteacher;");
		courseStatement.setInt(1, courseId);
		courseResultSet = courseStatement.executeQuery();

		while (courseResultSet.next()) {
			teacher = courseResultSet.getString("lastname") + ", "
					+ courseResultSet.getString("firstname");
			course = courseResultSet.getString("name");
			studentsStatement = connect
					.prepareStatement("SELECT lastname, firstname FROM "
							+ "(SELECT regnumber, lastname, firstname FROM highschool.student)_students "
							+ "INNER JOIN (SELECT idstudent FROM notespercourse WHERE idcourse= ?)_assisted "
							+ "ON _students.regnumber=_assisted.idstudent "
							+ "ORDER BY lastname, firstname;");
			studentsStatement.setInt(1, courseId);
			studentsResultSet = studentsStatement.executeQuery();
			printInfoCourse(course, teacher, studentsResultSet);
		}

	}

	public void infoForCourse(String courseName) throws SQLException {
		int course = 0;
		String teacher = "";
		PreparedStatement studentsStatement = null;
		PreparedStatement courseStatement = null;
		ResultSet courseResultSet = null;
		ResultSet studentsResultSet = null;

		courseStatement = connect
				.prepareStatement("SELECT idcourse, firstname, lastname FROM "
						+ "(SELECT assignedteacher, idcourse FROM highschool.course WHERE name= ?)_course "
						+ "INNER JOIN (SELECT idteacher, lastname, firstname FROM highschool.teacher)_teachers"
						+ " ON _course.assignedteacher=_teachers.idteacher;");
		courseStatement.setString(1, courseName);
		courseResultSet = courseStatement.executeQuery();

		while (courseResultSet.next()) {
			teacher = courseResultSet.getString("lastname") + ", "
					+ courseResultSet.getString("firstname");
			course = courseResultSet.getInt("idcourse");
			studentsStatement = connect
					.prepareStatement("SELECT lastname, firstname FROM "
							+ "(SELECT regnumber, lastname, firstname FROM highschool.student)_students "
							+ "INNER JOIN (SELECT idstudent FROM notespercourse WHERE idcourse= ?)_assisted "
							+ "ON _students.regnumber=_assisted.idstudent "
							+ "ORDER BY lastname, firstname;");
			studentsStatement.setInt(1, course);
			studentsResultSet = studentsStatement.executeQuery();
			printInfoCourse(courseName, teacher, studentsResultSet);
		}

	}

	private void printInfoCourse(String course, String teacher,
			ResultSet resultSet) throws SQLException {
		System.out.println("Course: " + course);
		System.out.println("Teacher: " + teacher);
		System.out.println("Students:");
		while (resultSet.next()) {
			System.out.println("\t" + resultSet.getString("lastname") + ", "
					+ resultSet.getString("firstname"));
		}
	}

	public void percentagePassFail(String courseName) throws SQLException {
		int course;
		PreparedStatement percentageStatement = null;
		ResultSet percentajeResultSet = null;
		PreparedStatement courseStatement = null;
		ResultSet courseResultSet = null;

		courseStatement = connect
				.prepareStatement("SELECT idcourse FROM course WHERE name = ?;");
		courseStatement.setString(1, courseName);
		courseResultSet = courseStatement.executeQuery();

		while (courseResultSet.next()) {
			course = courseResultSet.getInt("idcourse");

			percentageStatement = connect
					.prepareStatement("SELECT A.NUM, A.DENOM, (A.NUM/A.DENOM) * 100 AS PERC FROM "
							+ "(SELECT "
							+ "(SELECT COUNT(finalnote) FROM notespercourse "
							+ "WHERE finalnote >= 7 AND idcourse = ?) AS NUM, "
							+ "(SELECT COUNT(finalnote) FROM notespercourse "
							+ "WHERE idcourse = ?) AS DENOM )A;");
			percentageStatement.setInt(1, course);
			percentageStatement.setInt(2, course);
			percentajeResultSet = percentageStatement.executeQuery();

			printPercentage(courseName, percentajeResultSet);
		}
	}

	public void percentagePassFail(int courseId) throws SQLException {
		String course = "";
		PreparedStatement percentageStatement = null;
		ResultSet percentajeResultSet = null;
		PreparedStatement courseStatement = null;
		ResultSet courseResultSet = null;

		courseStatement = connect
				.prepareStatement("SELECT name FROM course WHERE idcourse = ?;");
		courseStatement.setInt(1, courseId);
		courseResultSet = courseStatement.executeQuery();

		while (courseResultSet.next()) {
			course = courseResultSet.getString("name");

			percentageStatement = connect
					.prepareStatement("SELECT A.NUM, A.DENOM, (A.NUM/A.DENOM) * 100 AS PERC FROM "
							+ "(SELECT "
							+ "(SELECT COUNT(finalnote) FROM notespercourse "
							+ "WHERE finalnote >= 7 AND idcourse = ?) AS NUM, "
							+ "(SELECT COUNT(finalnote) FROM notespercourse "
							+ "WHERE idcourse = ?) AS DENOM )A;");
			percentageStatement.setInt(1, courseId);
			percentageStatement.setInt(2, courseId);
			percentajeResultSet = percentageStatement.executeQuery();

			printPercentage(course, percentajeResultSet);
		}
	}

	private void printPercentage(String course, ResultSet resultSet) {
		try {
			double perc;
			int passed;
			int total;
			while (resultSet.next()) {
				perc = resultSet.getDouble("PERC");
				passed = resultSet.getInt("A.NUM");
				total = resultSet.getInt("A.DENOM");
				System.out.println("Course: " + course);
				System.out
						.println("Percentage of students that passed the course: "
								+ perc
								+ "% ("
								+ passed
								+ " out of "
								+ total
								+ ")");
				System.out
						.println("Percentage of students that failed the course: "
								+ (100 - perc)
								+ "% ("
								+ (total - passed)
								+ " out of " + total + ")");
			}
		} catch (SQLException e) {
			System.out.println("There was a problem printing the information");
			e.printStackTrace();
		}
	}
}
