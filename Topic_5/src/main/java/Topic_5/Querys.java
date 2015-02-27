package Topic_5;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Querys {
	protected Database db;
	
	public Querys(){
		db = new Database();
	}
	
	public void exercise_4(int course_id){
		db.open();
		String result = "";
		try {
			String query = 
					"SELECT course.name, teacher.last_name, teacher.first_name "
					+ "FROM course, teacher "
					+ "WHERE id_course ="+course_id+" AND course.assigned_teacher = id_teacher;";
			ResultSet rs = db.executeQuery(query);
			if(rs.next()){
				result += "Course: "+rs.getString(1)+"\n";
				result += "Teacher: "+rs.getString(2)+", "+rs.getString(3)+"\n";
				query = "SELECT last_name, first_name "
						+"FROM notes, student "
						+"WHERE id_course = "+course_id+" AND id_course=1 AND notes.registration_number=student.registration_number "
						+"ORDER BY last_name";
				result += "Students:\n";
				rs = db.executeQuery(query);
				while(rs.next()){
					result += "\t"+rs.getString(1)+", "+rs.getString(2)+"\n";
				}
				System.out.println(result);
			}
			rs.close();
			db.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void exercise_5(int reg_num){
		db.open();
		String result = "";
		try {
			String query = "SELECT course.name, notes.final_note "
							+"FROM notes, course " 
							+"WHERE notes.registration_number = "+reg_num+" AND course.id_course = notes.id_course "
							+"ORDER BY notes.final_note DESC, course.name;";
			ResultSet rs = db.executeQuery(query);
			while(rs.next()){
				result += "Course: "+rs.getString(1)+"\t";
				result += "Final course note: "+rs.getString(2)+"\n";
			}
			System.out.println(result);
			rs.close();
			db.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
