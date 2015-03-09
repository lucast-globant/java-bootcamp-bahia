package topic_7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;






import topic_7.entities.Course;
import topic_7.entities.Student;
import topic_7.entities.Teacher;
import topic_7.repositories.CourseRepository;
import topic_7.repositories.NotesRepository;
import topic_7.repositories.StudentRepository;
import topic_7.repositories.TeacherRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private StudentRepository students;
	@Autowired
	private TeacherRepository teachers;
	@Autowired
	private CourseRepository courses;
	@Autowired
	private NotesRepository notes;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("Students: \n");
		for (Student s : students.findAll()) {
			System.out.println(s.toString());
		}
		System.out.println("\n");
		System.out.println("Teachers: \n");
		for (Teacher t : teachers.findAll()) {
			System.out.println(t.toString());
		}
		System.out.println("\n");
		System.out.println("Courses: \n");
		for (Course c : courses.findAll()) {
			System.out.println(c.toString());
		}
		System.out.println("\n");
		System.out.println("All courses of a given student.\n");
		for (Course course : notes.findCoursesByStudent(1)) {
			System.out.println(course.toString());
		}
		System.out.println("\n");
		System.out.println("All students of a given course.\n");
		for (Student student : notes.findStudentsByCourse(1)) {
			System.out.println(student.toString());
		}
		System.out.println("\n");

	}
}
