import models.Course;
import models.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import services.CourseService;
import services.StudentService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	@Autowired
	private CourseService courseService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		for (Student student : studentService.findNoteGreaterThanFour())
			System.out.println(" - " + student.getFirtName() + " , " + student.getLastName());

		for (Course course : courseService.findByTeacherId(new Long(14)))
			System.out.println(" - " + course.getCourseName());

	}
}
