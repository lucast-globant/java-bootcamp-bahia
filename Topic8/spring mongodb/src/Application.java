package mongodb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	
	@Autowired
	private StudentRepository sRepository;

	@Autowired
	private TeacherRepository tRepository;
	
	@Autowired
	private CourseRepository cRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Student test
		System.out.println();
		System.out.println();
		sRepository.deleteAll();
		sRepository.save(new Student("1","PENELOPE","GUINESS","2006-02-15"));
		sRepository.save(new Student("2","NICK","WAHLBERG","2006-02-15"));
		sRepository.save(new Student("3","JENNIFER","DAVIS","2006-02-15"));
		sRepository.save(new Student("4","JOHNNY","LOLLOBRIGIDA","2006-02-15"));
		
		for (Student student : sRepository.findAll()) {
			System.out.println(student);
		}
		
		
		//Teacher test
		System.out.println();
		System.out.println();
		tRepository.deleteAll();
		tRepository.save(new Teacher("1","BETTE","NICHOLSON","2006-02-15"));
		tRepository.save(new Teacher("2","GRACE","MOSTEL","2006-02-15"));
		
		for (Teacher teacher : tRepository.findAll()) {
			System.out.println(teacher);
		}
		
		//student-course data
		List<StudentCourse> studentCourse;
		studentCourse=new ArrayList<StudentCourse>();
		studentCourse.add(new StudentCourse("1",90,100,90,100));
		studentCourse.add(new StudentCourse("2",60,60,60,80));
		studentCourse.add(new StudentCourse("3",80,60,80,20));
		studentCourse.add(new StudentCourse("4",60,70,60,30));
		
		//Course test
		System.out.println();
		System.out.println();
		cRepository.deleteAll();
		Course course1=new Course("1","PHYSICS","1",8,2,"2006-02-15");
		course1.setAllStudent(studentCourse);
		cRepository.save(course1);
		cRepository.save(new Course("2","MATHEMATICS","2",8,2,"2006-02-15"));
		cRepository.save(new Course("3","DATA BASE","2",8,2,"2006-02-15"));
		
		for (Course course : cRepository.findAll()) {
			System.out.println(course);
		}
		
		
		
		cRepository.findOne("2").setAllStudent(studentCourse);
		System.out.println(cRepository.findOne("2"));
		
		//Query test
		List<Course> courses = cRepository.findByAssignedTeacher("2");
		
		Collections.sort(courses, new Comparator<Course>(){

			@Override
			public int compare(Course arg0, Course arg1) {
				
				return arg0.getName().compareTo(arg1.getName());
			}
			
		});
		
		for (Course course : courses) {
			System.out.println(course);
		}
		
		//Query test
		Course course=cRepository.findByID("1");
		System.out.println(course.getName());
		
		List<StudentCourse> studentCourseResult;
		studentCourseResult=course.getAllStudentes();
		
		if(studentCourseResult==null){
			
		}
		System.out.println("Student with score greater than 40");
		for (StudentCourse sC : studentCourseResult) {
			if (sC.getFinalExam()>=40)
				System.out.println(sC.getStudentID());
		}
		
	}

}
