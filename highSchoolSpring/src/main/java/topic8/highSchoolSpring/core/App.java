package topic8.highSchoolSpring.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import topic8.highSchoolSpring.config.SpringMongoConfig;
import topic8.highSchoolSpring.model.Course;
import topic8.highSchoolSpring.model.Student;

@Component
public class App {
	@Autowired
	IHighSchoolService service;
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringMongoConfig.class);
		
		App practice = context.getBean(App.class);
		practice.tryQueries();
		context.close();
	}

	private void tryQueries() {
		List<Student> students = service.findStudentsWithNotesHigherThan4InCourse(3);
		System.out.println("Students that got notes higher in course 3:");
		for (Student i : students)
			System.out.println(i.getLastName());
		
		System.out.println();
		List<Course> coursesForTeacher2 = service.findCoursesByAssignedTeacher(2);
		System.out.println("Courses for teacher 2:");
		for (Course i : coursesForTeacher2)
			System.out.println(i.getName());
		
	}
}
