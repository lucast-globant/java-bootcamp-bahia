package topic_7;



import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

	@Autowired
	StudentRepository st_repository;
	
	@Autowired
	CourseRepository c_repository;
	
	@Autowired
	TeacherRepository t_repository;
	
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

	@Override
    public void run(String... strings) throws Exception {
		
		st_repository.save(new Student("nm1","lm1",new Date (12,15,1554)));
		st_repository.save(new Student("nm2","lm2",new Date (15,15,1554)));
		Student st = st_repository.save(new Student("nm3","lm3",new Date (18,15,1554)));
		
		// save a couple of teachers
		t_repository.save(new Teacher("teac1","lasteac1",new Date(14,12,1978)));
		t_repository.save(new Teacher("teac2","lasteac2",new Date(14,12,1978)));
		Teacher t = t_repository.save(new Teacher("teac3","lasteac3",new Date(14,12,1978)));
		
		// save a course
		Course c = c_repository.save(new Course ("course1",t.getIdTeacher(),4,2));
		
		// fetch all students
		for (Student student : st_repository.findAll())
			System.out.println(student.toString());
		
		// fetch all teachers
			for (Teacher teacher : t_repository.findAll())
				System.out.println(teacher.toString());
			
			// fetch all courses
			for (Course course : c_repository.findAll())
				System.out.println(course.toString());
	}
	
}