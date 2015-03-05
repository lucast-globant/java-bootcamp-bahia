package topic7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import controllers.StudentController;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

	@Override
	public void run(String... arg0) throws Exception {

		StudentController studentController = new StudentController();

		studentController.create("1", "1");
		studentController.create("2", "2");
		studentController.create("3", "3");
		studentController.create("4", "4");
		studentController.create("4", "4");

		System.out.println(studentController.findAll());

	}

}