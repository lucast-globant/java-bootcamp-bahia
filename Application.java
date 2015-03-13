package topic7;

import java.util.List;

import models.Course;
import models.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import controllers.CourseController;
import controllers.StudentController;
import controllers.TeacherController;


@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		TeacherController teacherController = new TeacherController();

		teacherController.create("Laura", "Perez");
		teacherController.create("Jose", "Garcia");

		System.out.println(teacherController.findAll());

		StudentController studentController = new StudentController();

		studentController.create("Laura", "Prez");
		studentController.create("Joselo", "Garcia");

		System.out.println(studentController.findAll());

		CourseController courseController = new CourseController();

		courseController.create("Programacion I");
		courseController.create("Programacion II");

		System.out.println(courseController.findAll());

	}

}

