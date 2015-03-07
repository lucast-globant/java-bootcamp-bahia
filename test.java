package topic8;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.domain.Sort;
import org.slf4j.impl.StaticLoggerBinder;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

		System.out.println ("Key point 2:");
		System.out.println (fetchStudents(mongoOperation,"1",4).toString());
		System.out.println ("Key point 3:");
		System.out.println (fetchCourses(mongoOperation,"1").toString());
		System.out.println ("Key point 4:");
		System.out.println (fetchFinishedCourses(mongoOperation).toString());

	}
	
	//Fetch all students whose notes in a specific course were greater than 4.
	private static List<Student> fetchStudents(MongoOperations mongoOperation, String courseId, int note) {
		Query studentQuery = new Query (Criteria.where("sc_course").is(courseId).and
				("sc_finalNote").gt(note));
		List<StudentCourse> list = mongoOperation.find(studentQuery, StudentCourse.class);
		List<Student> students = new ArrayList<Student>();
		for (StudentCourse sc: list) {
			studentQuery = new Query (Criteria.where("st_id").is(sc.getSc_studentId()));
			students.add(mongoOperation.findOne(studentQuery, Student.class));
		}
		
		return students;
	}
	
	//Fetch all courses ordered by name for a given teacher.
	private static List<Course> fetchCourses(MongoOperations mongoOperation, String teacherId) {
		Query teacherQuery = new Query(Criteria.where("tc_id").is(teacherId));
		Teacher teacher = mongoOperation.findOne(teacherQuery, Teacher.class);
		
		Query coursesQuery = new Query(Criteria.where("cs_teacher").is(teacherId));
		coursesQuery.with(new Sort(Sort.Direction.DESC, "cs_name"));
		
		return mongoOperation.find(coursesQuery, Course.class);	
	}
	
	//Fetch finished courses 
	private static List<Course> fetchFinishedCourses (MongoOperations mongoOperation) {
		Query finishedQuery = new Query(Criteria.where("cs_finished").is(true));
		return mongoOperation.find(finishedQuery, Course.class);
	}
	
}
