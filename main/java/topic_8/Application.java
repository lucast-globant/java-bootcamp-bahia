package topic_8;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import topic_8.services.CourseService;
import topic_8.entities.Course;
import topic_8.entities.Student;
import topic_8.services.NotesService;
import topic_8.services.StudentService;
import topic_8.services.TeacherService;



@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private StudentService students;
	@Autowired
	private TeacherService teachers;
	@Autowired
	private CourseService courses;

	@Autowired
	private NotesService notes;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Fetch all courses ordered by name for a given teacher:");
		for (Course c : courses.findAll()) {
			System.out.println(c.toString());
		}
		System.out.println("Fetch all students whose notes in a specific course were greater than 4:");
		for (Student s : notes.findStudentsWithNotesGreaterThanFour(2)) {
			System.out.println(s.toString());
		}

	}

}
