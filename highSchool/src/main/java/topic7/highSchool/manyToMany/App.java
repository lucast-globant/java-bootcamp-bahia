package topic7.highSchool.manyToMany;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;
	@Autowired
	TeacherRepository teacherRepository;
	@Autowired
	CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}

	public void run(String... strings) throws Exception {

		loadExamples();

		// Fetch all Students
		System.out.println("All Students:");
		for (Student student : studentRepository.findAll()) {
			System.out.println(student);
		}
		System.out.println("-------------------------------");

		// Fetch all Teachers
		System.out.println("All Teachers:");
		for (Teacher teacher : teacherRepository.findAll()) {
			System.out.println(teacher);
		}
		System.out.println("-------------------------------");

		// Fetch all Courses
		System.out.println("All Courses:");
		for (Course course : courseRepository.findAll()) {
			System.out.println(course);
		}
		System.out.println("-------------------------------");

		// Fetch a student by ID
		Student student5 = studentRepository.findOne(5L);
		System.out.println("Student found with findOne(5L):");
		System.out.println(student5);
		System.out.println("-------------------------------");

		// Fetch a course by ID
		Course course3 = courseRepository.findOne(3L);
		System.out.println("Student found with findOne(3L):");
		System.out.println(course3);
		System.out.println("-------------------------------");

		// Fetch a teacher by ID
		Teacher teacher2 = teacherRepository.findOne(2L);
		System.out.println("Student found with findOne(2L):");
		System.out.println(teacher2);
		System.out.println("-------------------------------");

		//
		System.out.println("Students in course3 using findByCourses(course3)");
		for (Student st : studentRepository.findByCourses(course3)) {
			System.out.println(st.getFirstName());
		}
		System.out.println("-------------------------------");

		System.out
				.println("student5 assists to (usingfindByStudents(student5)):");
		for (Course cs : courseRepository.findByStudents(student5)) {
			System.out.println(cs.getName());
		}
		System.out.println("-------------------------------");

		System.out
				.println("Students who assist course 1 using findByCourseId(1L)");
		for (Student cs : studentRepository.findByCourseId(1L)) {
			System.out.println(cs.getLastName());
		}
		System.out.println("-------------------------------");

		System.out.println("Student 2 assists to (using findByStudentId(2L)):");
		for (Course c : courseRepository.findByStudentId(2L)) {
			System.out.println(c.getName());
		}
		System.out.println("-------------------------------");

		System.out
				.println("Courses for teacher2 using findByAssignedTeacher(teacher2)");
		for (Course c : courseRepository.findByAssignedTeacher(teacher2)) {
			System.out.println(c.getName());
		}
		System.out.println("-------------------------------");

		System.out
				.println("Courses for teacher 1 using findByAssignedTeacherId(1L)");
		for (Course c : courseRepository.findByAssignedTeacherId(1L)) {
			System.out.println(c.getName());
		}
		System.out.println("-------------------------------");

	}

	private void loadExamples() {
		// Some examples
		// Students
		Student student1 = new Student("Christabella", "Arkwright", new Date());
		Student student2 = new Student("Beth", "Norris", new Date());
		Student student3 = new Student("Kimberly", "Bass", new Date());
		Student student4 = new Student("Lily", "Nowell", new Date());
		Student student5 = new Student("Jared", "Moores", new Date());
		Student student6 = new Student("Marleen", "Gary", new Date());
		Student student7 = new Student("Judah", "Bagley", new Date());
		Student student8 = new Student("Nathaniel", "Gibb", new Date());
		Student student9 = new Student("Becky", "English", new Date());
		Student student10 = new Student("Cordelia", "Martell", new Date());
		Student student11 = new Student("Russ", "Lindsey", new Date());
		Student student12 = new Student("Cyrilla", "Reynell", new Date());
		Student student13 = new Student("Bryan", "Huff", new Date());
		Student student14 = new Student("Sid", "Brigham", new Date());
		Student student15 = new Student("Cash", "Rye", new Date());

		// Teachers
		Teacher teacher1 = new Teacher("Glinda", "Gapinski", new Date());
		Teacher teacher2 = new Teacher("Maureen", "Haskett", new Date());
		Teacher teacher3 = new Teacher("Satchel", "Forrest", new Date());

		// Courses
		Course course1 = new Course("Mathematic", 10, teacher1);
		Course course2 = new Course("German", 8, teacher2);
		Course course3 = new Course("Technology", 5, teacher1);
		Course course4 = new Course("History", 5, teacher2);
		Course course5 = new Course("Science", 8, teacher3);

		teacherRepository.save(teacher1);
		teacherRepository.save(teacher2);
		teacherRepository.save(teacher3);
		courseRepository.save(course1);
		courseRepository.save(course2);
		courseRepository.save(course3);
		courseRepository.save(course4);
		courseRepository.save(course5);

		student1.addCourse(course1);
		student2.addCourse(course3);
		student3.addCourse(course4);
		student4.addCourse(course1);
		student5.addCourse(course2);
		student6.addCourse(course1);
		student7.addCourse(course3);
		student8.addCourse(course1);
		student9.addCourse(course2);
		student10.addCourse(course1);
		student11.addCourse(course2);
		student12.addCourse(course5);
		student13.addCourse(course3);
		student14.addCourse(course1);
		student15.addCourse(course1);
		student1.addCourse(course5);
		student2.addCourse(course1);
		student3.addCourse(course3);
		student4.addCourse(course4);
		student5.addCourse(course1);
		student6.addCourse(course2);
		student7.addCourse(course5);
		student8.addCourse(course3);
		student9.addCourse(course4);
		student10.addCourse(course1);
		student11.addCourse(course3);
		student12.addCourse(course1);
		student13.addCourse(course1);
		student14.addCourse(course2);
		student15.addCourse(course3);
		student1.addCourse(course4);
		student2.addCourse(course2);
		student3.addCourse(course5);
		student4.addCourse(course2);
		student5.addCourse(course5);
		student6.addCourse(course4);
		student7.addCourse(course2);
		student8.addCourse(course4);
		student9.addCourse(course2);
		student10.addCourse(course3);
		student11.addCourse(course1);
		student12.addCourse(course2);
		student13.addCourse(course5);
		student14.addCourse(course3);
		student15.addCourse(course4);

		studentRepository.save(student1);
		studentRepository.save(student2);
		studentRepository.save(student3);
		studentRepository.save(student4);
		studentRepository.save(student5);
		studentRepository.save(student6);
		studentRepository.save(student7);
		studentRepository.save(student8);
		studentRepository.save(student9);
		studentRepository.save(student10);
		studentRepository.save(student11);
		studentRepository.save(student12);
		studentRepository.save(student13);
		studentRepository.save(student14);
		studentRepository.save(student15);

	}
}
