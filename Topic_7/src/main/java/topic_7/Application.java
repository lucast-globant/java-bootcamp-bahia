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
public class Application implements CommandLineRunner{
	
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
    	students.save(new Student("Alejandro","Durand", "1990-05-29"));
    	System.out.println("Students: \n");
        for(Student s : students.findAll()){
        	System.out.println(s.toString()+"\n");
        };
        System.out.println("Teachers: \n");
        for(Teacher t : teachers.findAll()){
        	System.out.println(t.toString()+"\n");
        };
        System.out.println("Courses: \n");
        for(Course c : courses.findAll()){
        	System.out.println(c.toString()+"\n");
        };
//        System.out.println("All courses of a given student");
//        for(Course c : notes.findCoursesByRegistrationNumber(2)){
//        	System.out.println(c.toString()+"\n");
//        };
        System.out.println("All students of a given course");
        for(Student s : notes.findStudentsByIdCourse(2)){
        	System.out.println(s.toString()+"\n");
        };
        
    	
    }
}
