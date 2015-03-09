package com.globant.app.data.mongo;

import com.globant.app.data.mongo.entities.Course;
import com.globant.app.data.mongo.entities.CourseNote;
import com.globant.app.data.mongo.entities.Student;
import com.globant.app.data.mongo.entities.Teacher;
import com.globant.app.data.mongo.services.ICourseNoteService;
import com.globant.app.data.mongo.services.ICourseService;
import com.globant.app.data.mongo.services.IStudentService;
import com.globant.app.data.mongo.services.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Date;
import java.util.List;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MongoApplication implements CommandLineRunner {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	private ICourseService courseService;

	@Autowired
	private IStudentService studentService;

	@Autowired
	private ICourseNoteService courseNoteService;

	@Autowired
	private ITeacherService teacherService;

	@Override
	public void run(String... args) throws Exception {
		mongoTemplate.getDb().dropDatabase();

		System.out.println("\n\n\n");

		Student ronaldo = studentService.addStudent(new Student("cristiano", "ronaldo", "3984", new Date()));
		Student neymar = studentService.addStudent(new Student("Neymar", "Da Silva Jr.", "389", new Date()));
		Student diego = studentService.addStudent(new Student("diego", "maradona", "31984", new Date()));

		Teacher m10 = teacherService.addTeacher(new Teacher("lionel", "messi", new Date()));
		Teacher cr7 = teacherService.addTeacher(new Teacher("cristiano", "ronaldo", new Date()));

		Course dribbling = courseService.addCourse(new Course("Dribbling with Messi", m10, 10));
		Course definition = courseService.addCourse(new Course("Definition with Messi", m10, 8));
		Course hairstyling = courseService.addCourse(new Course("Hairstyling with CR7", cr7, 3));

		courseNoteService.addCourseNote(new CourseNote(ronaldo.getId(), dribbling.getId(), 2, 2, 2, 2));
		courseNoteService.addCourseNote(new CourseNote(neymar.getId(), dribbling.getId(), 7, 7, 2, 7));
		courseNoteService.addCourseNote(new CourseNote(diego.getId(), dribbling.getId(), 5, 5, 5, 5));

		List<Student> students = studentService
				.findByCoursesNotesFinalNoteGreaterThanAndCoursesNotesFirstPartialNoteGreaterThanAndCoursesNotesSecondPartialNoteGreaterThanAndCoursesNotesThirdPartialNoteGreaterThan(
						4, 4, 4, 4);

		List<Course> courses = courseService
				.findByTeacherOrderByNameAsc(m10);

		System.out.println("All Messi's courses\n--------------");
		for (Course course : courses) {
			System.out.println(course);
		}

		System.out.println("\nStudents that passed a course\n-------------");
		for (Student student : students) {
			System.out.println(student);
		}

		System.out.println("\n\n\n");
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MongoApplication.class, args);
	}
}
