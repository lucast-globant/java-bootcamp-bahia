package topic_8;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class TestApplication {
	public static void main(String[] args) throws UnknownHostException {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

		System.out.println("Fetch all students whose notes in a specific course were greater than 4.");
		System.out.println("For Algebra: ");
		fetchStudentsNotesGreater4(mongoOperation,"Algebra");
		System.out.println("For Philosophy: ");
		fetchStudentsNotesGreater4(mongoOperation,"Philosophy");
		System.out.println("For Literature: ");
		fetchStudentsNotesGreater4(mongoOperation,"Literature");
		System.out.println("For Chemestry: ");
		fetchStudentsNotesGreater4(mongoOperation,"Chemestry");
		System.out.println("For Physics: ");
		fetchStudentsNotesGreater4(mongoOperation,"Physics");

		System.out.println("Fetch all courses ordered by name for a given teacher.");
		System.out.println("Testing for the teacher: NameTeacher1");
		fetchCoursesOrderedByName(mongoOperation, "NameTeacher1");

		System.out.println("Identify which courses are finished.");
		Query courseFinishQuery = new Query(Criteria.where("finish").is(true));
		List<Course> courses = mongoOperation.find(courseFinishQuery, Course.class);
		for (int i = 0; i<courses.size(); i++ ) {
			System.out.println(courses.get(i).toString());
		}

	}
	private static void fetchCoursesOrderedByName(MongoOperations mongoOperation, String teacherName) {
		Query searchTeacherQuery = new Query(Criteria.where("first_name").is(teacherName));
		Teacher teacher = mongoOperation.findOne(searchTeacherQuery, Teacher.class);
		Query coursesQuery = new Query();
		coursesQuery.addCriteria(Criteria.where("id_teacher").is(teacher.getId()));
		coursesQuery.with(new Sort(Sort.Direction.DESC, "age"));
		List<Course> courses = mongoOperation.find(coursesQuery, Course.class);
		for (int i = 0; i<courses.size(); i++ ) {
			System.out.println(courses.get(i).toString());
		}
	}
	private static void fetchStudentsNotesGreater4 (MongoOperations mongoOperation, String name_course) {
		Query searchCourseQuery = new Query(Criteria.where("name").is(name_course));
		Course course = mongoOperation.findOne(searchCourseQuery, Course.class);
		Query searchCourseNotesQuery = new Query(Criteria.where("id_course").is(course.getId()).and("partial_note_1").gt(4).and("partial_note_2").gt(4).and("partial_note_3").gt(4).and("final_note").gt(4));
		List<Rinde> courseNotes = mongoOperation.find(searchCourseNotesQuery,Rinde.class);
		List<ObjectId> studentIds = new ArrayList<ObjectId>();
		for (int i = 0; i < courseNotes.size() ; i++) {
			studentIds.add(courseNotes.get(i).getId_student());
		}
		Query searchStudentCourseNotesQuery = new Query(Criteria.where("id").in(studentIds));
		List<Student> studentsCourseNotes = mongoOperation.find(searchStudentCourseNotesQuery, Student.class);
		if(!studentsCourseNotes.isEmpty())
			for(int i=0;i<studentsCourseNotes.size();i++)
				System.out.println(studentsCourseNotes.get(i));
		else
			System.out.println("No students");
	}
}