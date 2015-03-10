package topic8.highSchool;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class HighSchoolInfoService {
	private MongoDBConnection connection;

	public HighSchoolInfoService(MongoDBConnection connection) {
		this.connection = connection;
	}

	public List<String> studentsWithNotesHigherThan4(int courseId) {
		List<String> result = new ArrayList<String>();
		DBCollection notes = connection.getDb().getCollection("Note");
		DBCollection students = connection.getDb().getCollection("Student");
		int studentId;
		BasicDBObject studentQuery;
		DBCursor notesData, studentData;
		DBObject currentStudent;

		BasicDBObject higherThan4 = new BasicDBObject("note1",
				new BasicDBObject("$gt", 4));
		higherThan4.append("note2", new BasicDBObject("$gt", 4));
		higherThan4.append("note3", new BasicDBObject("$gt", 4));
		higherThan4.append("finalNote", new BasicDBObject("$gt", 4));
		higherThan4.append("curseId", courseId);

		notesData = notes.find(higherThan4, new BasicDBObject("studentId", 1));

		while (notesData.hasNext()) {
			studentId = ((Number) notesData.next().get("studentId")).intValue();
			studentQuery = new BasicDBObject();
			studentQuery.put("_id", studentId);
			studentData = students.find(studentQuery, new BasicDBObject(
					"firstName", 1).append("lastName", 1));
			while (studentData.hasNext()) {
				// There should be exactly 1 result
				currentStudent = studentData.next();
				result.add((String) currentStudent.get("lastName") + ", "
						+ currentStudent.get("firstName"));
			}
		}
		return result;
	}

	public List<String> studentsWithNotesHigherThan4(String courseName) {
		DBCollection courses = connection.getDb().getCollection("Course");
		int teacherId = -1;
		BasicDBObject teachersQuery = new BasicDBObject();
		DBCursor teacherData;

		teachersQuery.put("name", courseName);
		teacherData = courses.find(teachersQuery);
		if (teacherData.hasNext()) {
			teacherId = ((Number) teacherData.next().get("_id")).intValue();
		}
		return studentsWithNotesHigherThan4(teacherId);
	}

	public List<String> coursesForTeacher(int teacherId) {
		List<String> result = new ArrayList<String>();
		DBCollection courses = connection.getDb().getCollection("Course");
		DBCursor coursesData;

		BasicDBObject coursesForTeacher = new BasicDBObject("teacherId",
				teacherId);
		BasicDBObject sort = new BasicDBObject("name", 1);
		coursesData = courses.find(coursesForTeacher, new BasicDBObject("name",
				1)).sort(sort);

		while (coursesData.hasNext()) {
			result.add((String) coursesData.next().get("name"));
		}
		return result;
	}

	public List<String> coursesForTeacher(String teacherLastName) {
		DBCollection teachers = connection.getDb().getCollection("Teacher");
		int teacherId = -1;
		BasicDBObject teachersQuery = new BasicDBObject();
		DBCursor teacherData;

		teachersQuery.put("lastName", teacherLastName);
		teacherData = teachers.find(teachersQuery);
		if (teacherData.hasNext()) {
			teacherId = ((Number) teacherData.next().get("_id")).intValue();
		}
		return coursesForTeacher(teacherId);
	}

}
