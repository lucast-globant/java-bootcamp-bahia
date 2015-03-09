package demo;

import java.util.Collections;
import java.util.List;

import org.apache.tools.ant.taskdefs.optional.junit.TearDownOnVmCrash;
import org.bson.types.ObjectId;
import org.codehaus.jackson.schema.JsonSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.converter.json.GsonFactoryBean;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Comparator;

@SpringBootApplication
public class MongoHighschoolApplication implements CommandLineRunner{

	@Autowired
	private StudentDao studentRepository;
	
	@Autowired 
	CourseDao courseRepository;
	
	@Autowired 
	StudentTakesCourseDao studentCourseRepository;
		
	@Autowired 
	TeacherDao teacherRepository;
	
	@Autowired 
	TeacherDictateCourseDao teacherCourseRepository;
	
	
	
    public static void main(String[] args) {
        SpringApplication.run(MongoHighschoolApplication.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
    	MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

    		
    	
		studentRepository.deleteAll();
		teacherRepository.deleteAll();
		teacherCourseRepository.deleteAll();
		courseRepository.deleteAll();
		studentCourseRepository.deleteAll();
	    	    
	    //save a student
	    Person p=new Person(new ObjectId(), 1, "jordan", "holtz", "1989/06/12");
	    mongoOperation.save(p);
	    Student s=new Student(new ObjectId(), p.getId(), 1);
	    mongoOperation.save(s);
	    
	    //consult the student
	    Query searchUserQuery = new Query(Criteria.where("firstname").is("jordan"));
	    //get the student name
	    Person newEntry = mongoOperation.findOne(searchUserQuery, Person.class);
		System.out.println("find saved: student-person : " + newEntry);
		
		//save a teacher
		 p=new Person(new ObjectId(), 1, "manuel", "gonzalez", "1989/06/12");
		 mongoOperation.save(p);
		 Teacher t=new Teacher(new ObjectId(), p.getId(), 2);
		 mongoOperation.save(t);
		
		 //consult the new teacher
		 searchUserQuery = new Query(Criteria.where("teacherNumber").is(2));
		 Teacher newTeacher = mongoOperation.findOne(searchUserQuery, Teacher.class);
		 System.out.println("find saved: teacher : " + newTeacher);
		
		 //save a course
		 Course c=new Course(new ObjectId(), "phisics", 8);
		 mongoOperation.save(c);
		
		 //consult the new course
		 searchUserQuery = new Query(Criteria.where("name").is("phisics"));
		 Course newcourse = mongoOperation.findOne(searchUserQuery, Course.class);
		 System.out.println("find saved: course : " + newcourse);
		 
		//save a studentTakesCourse
		 StudentTakesCourse stc=new StudentTakesCourse(new ObjectId(), s.getId(), c.getId(), 4, 5,6, 6);
		 mongoOperation.save(stc);
				 
		//save a teacherDictateCourse
		 TeacherDictateCourse tdc=new TeacherDictateCourse(new ObjectId(), c.getId(), t.getId(), "13:00", "LU");
		 mongoOperation.save(tdc);
		 for (TeacherDictateCourse teachCourse : teacherCourseRepository.findAll()) {
			 System.out.println(teachCourse);
		}
				
		 //students with final note>4, for a given course (c1)
		 Course course = courseRepository.findById(c.getId());
		 System.out.println(course.getName());
		 List<StudentTakesCourse> studentCourseList=studentCourseRepository.findAllByCourseId(c.getId());
		 
		 System.out.println("Student with final note greater than 4");
		 for (StudentTakesCourse studentCourse : studentCourseList) {
			 if (studentCourse.getFinal_note() >= 4)
				 System.out.println(studentCourse);
		 }

		 
		 //courses for a given teacher order ascendent by name
		 System.out.println("");
		 System.out.println("Courses for teacher: "+t);
		 List<TeacherDictateCourse> courses = teacherCourseRepository.findByTeacherId(t.getId()); 
		 Collections.sort(courses, new Comparator<TeacherDictateCourse>() {

			@Override
			public int compare(TeacherDictateCourse o1, TeacherDictateCourse o2) {
				return o1.getCourseId().compareTo(o2.getCourseId());
			}
		 });
		 
		 for (TeacherDictateCourse teachercourse : courses) {
			  System.out.println("teacher: "+teachercourse);
		 }

	
    }
}
