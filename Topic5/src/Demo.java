import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		java.sql.Connection connection;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// connection to the DB
			String servidor = "localhost:3306";
			String baseDatos = "high_school";
			String uriConexion = "jdbc:mysql://" + servidor + "/" + baseDatos;
			String user = "adminBD";
			String password = "admin";

			connection = java.sql.DriverManager.getConnection(uriConexion, user, password);

			java.sql.Statement statement = connection.createStatement();

			// KEY POINT 4
			System.out.println("List students and teachers for a given course.");
			System.out.println("Courses: ");
			System.out.println("1.Java course 2.PHP course 3.C course 4.C++ course 5.Phyton course");
			System.out.print("Choose a course number: ");

			// the id_course chosen by the user
			int id_course;

			Scanner scanner = new Scanner(System.in);
			id_course = scanner.nextInt();

			// the id_course must be between 1 and 5
			while (id_course < 1 || id_course > 5) {
				System.out.println();
				System.out.println("Wrong choice, please choose one of the following number course: ");
				System.out.println("1.Java course 2.PHP course 3.C course 4.C++ course 5.Phyton course");
				System.out.print("Choose a course number: ");
				id_course = scanner.nextInt();
			}

			System.out.println();

			// query to obtain the name of the course and the first_name and
			// last_name of the teacher
			String sql = "SELECT name_course,first_name,last_name FROM Course NATURAL JOIN Teacher WHERE id_course=" + id_course;

			java.sql.ResultSet resultSet = statement.executeQuery(sql);
			resultSet.next();
			System.out.println("Course: " + resultSet.getString(1));
			System.out.println("Teacher: " + resultSet.getString(3) + ", " + resultSet.getString(2));
			System.out.println("Students: ");

			// query to obtain the first_name and last_name from students in the
			// chosen course ordered by alphabetically by last_name
			sql = "SELECT first_name,last_name FROM Student_Course NATURAL JOIN Student WHERE id_course=" + id_course
					+ " ORDER BY last_name";

			resultSet = statement.executeQuery(sql);

			// print the students of the course
			while (resultSet.next()) {
				System.out.println("\t " + resultSet.getString(2) + ", " + resultSet.getString(1));
			}

			System.out.println();

			// KEY POINT 5
			// registration_number of the student
			int registration_number = 0;

			System.out.println("List final course notes for a given student.");
			System.out.print("Enter the number of register of the student: ");

			boolean exist = false;

			while (!exist) {
				registration_number = scanner.nextInt();
				// query to check if exists a student with the
				// registration_number entered by the user
				sql = "SELECT first_name,last_name FROM Student WHERE registration_number=" + registration_number;
				resultSet = statement.executeQuery(sql);
				System.out.println();
				// exists a student with that registration_number
				if (resultSet.next()) {
					exist = true;
				}
				// doesn't exist a student with that registration_number
				else {
					System.out.print("Inexistent register, enter again the number of register of the student: ");
				}
			}

			scanner.close();

			System.out.println("Student: " + resultSet.getString(2) + ", " + resultSet.getString(1));
			System.out.println("Final notes: ");

			// query to obtain the name and final note of each course in which
			// the student is enrolled ordered by highest notes and course name
			sql = "SELECT name_course,final_note FROM Student_Course NATURAL JOIN Course WHERE registration_number=" + registration_number
					+ " ORDER BY final_note DESC,name_course";
			resultSet = statement.executeQuery(sql);

			// print the name and final note of each course
			while (resultSet.next()) {
				System.out.println("\t Course: " + resultSet.getString(1) + " Final note: " + resultSet.getString(2));
			}

			// connection is closed
			connection.close();

		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
