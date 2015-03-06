package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import controller.CourseController;
import controller.StudentController;
import controller.TeacherController;



@SpringBootApplication
public class Topic7ormApplication implements CommandLineRunner{

	
    public static void main(String[] args) {
        SpringApplication.run(Topic7ormApplication.class, args);
    }
 
	@Override
	public void run(String... arg0) throws Exception {

		TeacherController teacherController = new TeacherController();

		teacherController.create("Juan", "Perez");
		teacherController.create("Juan", "Domingo");

		System.out.println("find teachers: "+teacherController.findAll());

		StudentController studentController = new StudentController();

		studentController.create("Pedro", "Perez");
		studentController.create("Javier", "Torres");

		System.out.println("find students: "+studentController.findAll());

		CourseController courseController = new CourseController();

		courseController.create("Introduction to OOP");
		courseController.create("Phisic I");

		System.out.println("find courses: "+courseController.findAll());

	}
}
