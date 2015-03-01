import java.sql.ResultSet;
import java.sql.SQLException;

public class DBQuery {
	private Database db;

	public DBQuery() {
		db = new Database();
	}

	public void ex4(int course_id) {
		db.open();
		String result = "";
		try {
			String query = "CALL listStudentsTeachers(" + course_id + ");";
			ResultSet rs = db.executeQuery(query);

			if (rs.next()) {
				result += "Course: " + rs.getString(3) + "\n";
				result += "Teacher: " + rs.getString(1) + ", " + rs.getString(2) + "\n";
				result += "Students:\n";
				while (rs.next()) {
					result += "\t" + rs.getString(4) + ", " + rs.getString(5) + "\n";
				}
				System.out.println(result);

			}
			rs.close();
			db.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ex5(int reg_num) {

		db.open();
		String result = "";
		try {
			String query = "CALL listNotes("+reg_num+");";
			ResultSet rs = db.executeQuery(query);
			while (rs.next()) {
				result += "Course: " + rs.getString(1) + "\t";
				result += "Final course note: " + rs.getString(2) + "\n";
			}
			System.out.println(result);
			rs.close();
			db.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
