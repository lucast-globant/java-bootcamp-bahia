package com.aguirre.topic8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.aguirre.topic8.models.Course;
import com.aguirre.topic8.models.Student;
import com.aguirre.topic8.services.CourseService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private CourseService courseService;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		for (Student student : courseService.getStudentIdAprovvedByCourseId(new Long(1)))
			System.out.println(student.getLastName() + ", " + student.getFirstName());

		for (Course course : courseService.getCoursesNameByTeacherId(new Long(2))) {
			System.out.println(course.getCourseName());
		}
	}
}
