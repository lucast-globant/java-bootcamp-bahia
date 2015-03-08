import java.net.ConnectException;
import java.sql.ResultSet;

public class DataBaseTest {

	public static void main(String[] args) throws Exception {

		// Connection

		DataBaseConnection dataBaseConnection = new DataBaseConnection();
		dataBaseConnection.connect();

		// Test exercise 4

		System.out.println(" ");
		System.out.println(" ---Excercise 4--- ");
		System.out.println(" ");

		DataBaseManager dataBaseManager = new DataBaseManager();

		ResultSet resultSet1;
		ResultSet resultSet2;

		int course_id = 2;

		String query1 = "SELECT name, first_name, last_name FROM (teacher T NATURAL JOIN course C) WHERE (C.course_id=" + course_id
				+ ") +  AND course.teacher_assigned = teacher_id";

		String query2 = "SELECT last_name, first_name FROM (notes N NATURAL JOIN student S) WHERE (N.course_id=" + course_id
				+ ") ORDER BY last_name";

		resultSet1 = dataBaseManager.doQuery(query1, dataBaseConnection);
		resultSet2 = dataBaseManager.doQuery(query2, dataBaseConnection);

		resultSet1.next();
		System.out.println("Course: " + resultSet1.getString(1));
		System.out.println("Teacher: " + resultSet1.getString(3) + " , " + resultSet1.getString(2));
		System.out.println("Students : ");

		while (resultSet2.next()) {
			System.out.println("\t " + resultSet2.getString(2) + ", " + resultSet2.getString(1));
		}

		// Test exercise 5
		System.out.println(" ");
		System.out.println(" ---Excercise 5--- ");
		System.out.println(" ");

		ResultSet resultSet3;

		int reg_num = 15;

		String query3 = "SELECT name, final_note FROM (rinde R NATURAL JOIN course C) WHERE (R.reg_number=" + reg_num
				+ ") ORDER BY final_note DESC, name";

		resultSet3 = dataBaseManager.doQuery(query3, dataBaseConnection);

		while (resultSet3.next()) {
			System.out.println("\t Course: " + resultSet3.getString(1) + " Final note: " + resultSet3.getString(2));
		}

		// Close connection

		dataBaseConnection.getConecction().close();

	}

}
