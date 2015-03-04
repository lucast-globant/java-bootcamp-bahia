package orm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {


    
    @Autowired
    StudentRepository studenRepository;
    
    @Autowired
    TeacherRepository teacherRepository;
    
    @Autowired
    CourseRepository courseRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
    	Teacher teacher1=new Teacher (32716595,"nameTeacher0","LastNameTeacher0","08/01/1987");
    	List<Student> students;  
    	List<Student> studentsResult;  
    	
    	List<Course> courses;    
    	
    	//Test of Student
    	studenRepository.save(new Student ("Martin","Rocca","08/01/1987"));
    	studenRepository.save(new Student ("Penelope","Guiness","08/08/1980"));
    	studenRepository.save(new Student ("Nick","Wahlberg","08/08/1950"));
    	studenRepository.save(new Student ("Jennifer","Davis","08/08/1943"));
    	System.out.println();
    	System.out.println("Show all students");
        for (Student student : studenRepository.findAll()) {
            System.out.println(student);
        }
    	
        //Test of teacher
        teacherRepository.save(teacher1);
        teacherRepository.save(new Teacher (12345678,"JOHNNY","LOLLOBRIGIDA","08/01/1987"));
        teacherRepository.save(new Teacher (11111111,"BETTE","NICHOLSON","08/01/1987"));
        teacherRepository.save(new Teacher (22222222,"GRACE","MOSTEL","08/01/1987"));
        System.out.println();
    	System.out.println("Show all teachers");
        for (Teacher teacher : teacherRepository.findAll()) {
            System.out.println(teacher);
        }
        
        //Test of course 
        courseRepository.save(new Course ("Fisic", teacher1, 8, 2, "12/12/1988"));
        courseRepository.save(new Course ("Fisic", teacherRepository.findOne(12345678l), 8, 2, "12/12/1988"));
        courseRepository.save(new Course ("Fisic", teacherRepository.findOne(11111111l), 8, 2, "12/12/1988"));
        courseRepository.save(new Course ("Fisic", teacherRepository.findOne(22222222l), 8, 2, "12/12/1988"));
    	System.out.println();
        System.out.println("Show all courses");
        for (Course course : courseRepository.findAll()) {
            System.out.println(course);
        }
        
        Course course1=courseRepository.findOne(1l);
        Student student1=studenRepository.findOne(1l);
        
        students=new ArrayList<Student>();
        students.add(student1);
        students.add(studenRepository.findOne(2l));
        students.add(studenRepository.findOne(3l));
        course1.addStudents(students);
        
        
        studentsResult=course1.getAllStudentes();
        System.out.println();
        System.out.println("Show all student of course 1");
        System.out.println(studentsResult.toString());
        
        courses=new ArrayList<Course>();
        courses.add(course1);
        courses.add(courseRepository.findOne(2l));
        
        student1.addCourses(courses);
        System.out.println();
        System.out.println("Show all courses of student 1");
        System.out.println(student1.getAllCourses().toString());
        
    }

}
