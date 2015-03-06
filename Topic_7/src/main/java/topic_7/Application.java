package topic_7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import topic_7.model.Course;
import topic_7.model.Student;
import topic_7.model.Teacher;
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
			System.out.println(s.toString() + "\n");
		}
		;
		System.out.println("Teachers: \n");
		for (Teacher t : teachers.findAll()) {
			System.out.println(t.toString() + "\n");
		}
		;
		System.out.println("Courses: \n");
		for (Course c : courses.findAll()) {
			System.out.println(c.toString() + "\n");
		}
		Course c = courses.findOne(1);
		for (Student student : notes.findStudentsByCourse(c)) {
			System.out.println(student.toString());
		}
		Student s = students.findOne(1);
		for (Course course : notes.findCoursesByStudent(s)) {
			System.out.println(course.toString());
		}

	}
}
