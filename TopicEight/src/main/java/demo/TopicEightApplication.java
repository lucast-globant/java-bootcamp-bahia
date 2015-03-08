package demo;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TopicEightApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private TeacherRepository teacherRepository;

	@Autowired
	private NoteRepository noteRepository;

	@Autowired
	private SheduleRepository sheduleRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private StudentCourseRepository studentCourseRepository;

	@Autowired
	private TeacherCourseRepository teacherCourseRepository;

	public static void main(String[] args) {
		SpringApplication.run(TopicEightApplication.class, args);
	}

	public void run(String... arg0) throws Exception {

		loadInitialData();
		for (Student s : studentRepository.findAll()) {
			System.out.println(s);
		}
		System.out.println("----------------------");
		for (Note n : noteRepository.findAll()) {
			System.out.println(n);
		}
		System.out.println("----------------------");
		for (Note n : noteRepository.findNotesGreaterThanFour()) {
			System.out.println(n);
		}
		System.out.println("----------------------");
		for (StudentCourse sc : studentCourseRepository.findAll()) {
			System.out.println(sc);
		}
		System.out.println("----------------------");
		for (Course c : courseRepository.findAll()) {
			System.out.println(c);
		}
		System.out.println("----------------------");
		for (Student s : getStudentsOfCourseWithNoteGreaterThanFour("Math")) {
			System.out.println(s.getFirstName());
		}
		System.out.println("----------------------");
		for (Course c : getCoursesOfTeacher("Jose")) {
			System.out.println(c);
		}
	}

	private List<Student> getStudentsOfCourseWithNoteGreaterThanFour(
			String courseName) {
		List<Student> toReturn = new LinkedList<Student>();
		for (Note n : noteRepository.findNotesGreaterThanFour()) {
			StudentCourse sc = studentCourseRepository.findByIdStudentCourse(n
					.getIdStudentCourseFk());
			Course c = courseRepository.findByName(courseName);
			if (c.getIdCourse().equals(sc.getIdCourseFk())) {
				toReturn.add(studentRepository.findByIdStudent(sc
						.getIdStudentFk()));
			}
		}
		return toReturn;
	}

	private List<Course> getCoursesOfTeacher(String teacherName) {
		List<Course> toReturn = new LinkedList<Course>();
		Teacher teacher = teacherRepository.findByFirstName(teacherName);
		for (TeacherCourse tc : teacherCourseRepository
				.findByIdTeacherFk(teacher.getIdTeacher())) {
			toReturn.add(courseRepository.findByIdCourse(tc.getIdCourseFk()));
		}
		toReturn.sort(new OrderByCourseName());
		return toReturn;
	}

	private void loadInitialData() {
		studentRepository.deleteAll();
		teacherRepository.deleteAll();
		noteRepository.deleteAll();
		sheduleRepository.deleteAll();
		courseRepository.deleteAll();
		studentCourseRepository.deleteAll();
		teacherCourseRepository.deleteAll();

		Student student1 = new Student("Leonel", "Messi", "1", new Date());
		Student student2 = new Student("Pepe", "Mujica", "2", new Date());
		Student student3 = new Student("Flor", "de la V", "3", new Date());
		studentRepository.save(student1);
		studentRepository.save(student2);
		studentRepository.save(student3);

		Teacher teacher1 = new Teacher("Jose", "Pintos", new Date());
		Teacher teacher2 = new Teacher("Carina", "Roca", new Date());
		teacherRepository.save(teacher1);
		teacherRepository.save(teacher2);

		Shedule shedule1 = new Shedule("14", "18", "Monday");
		Shedule shedule2 = new Shedule("14", "18", "Friday");
		sheduleRepository.save(shedule1);
		sheduleRepository.save(shedule2);

		Course course1 = new Course("Math", teacher1.getIdTeacher(), "4",
				shedule1.getIdSheduleTime());
		Course course2 = new Course("Physics", teacher2.getIdTeacher(), "4",
				shedule2.getIdSheduleTime());
		Course course3 = new Course("English", teacher2.getIdTeacher(), "4",
				shedule2.getIdSheduleTime());
		Course course4 = new Course("Italian", teacher2.getIdTeacher(), "4",
				shedule2.getIdSheduleTime());
		courseRepository.save(course1);
		courseRepository.save(course2);
		courseRepository.save(course3);
		courseRepository.save(course4);

		StudentCourse sc1 = new StudentCourse(student1.getIdStudent(),
				course1.getIdCourse());
		StudentCourse sc2 = new StudentCourse(student2.getIdStudent(),
				course1.getIdCourse());
		StudentCourse sc3 = new StudentCourse(student3.getIdStudent(),
				course1.getIdCourse());
		StudentCourse sc4 = new StudentCourse(student1.getIdStudent(),
				course2.getIdCourse());
		studentCourseRepository.save(sc1);
		studentCourseRepository.save(sc2);
		studentCourseRepository.save(sc3);
		studentCourseRepository.save(sc4);

		Note note1 = new Note(sc1.getIdStudentCourse(), 5, 5, 5, 5);
		Note note2 = new Note(sc2.getIdStudentCourse(), 3, 3, 3, 3);
		Note note3 = new Note(sc3.getIdStudentCourse(), 3, 5, 3, 3);
		Note note4 = new Note(sc4.getIdStudentCourse(), 9, 10, 10, 10);
		noteRepository.save(note1);
		noteRepository.save(note2);
		noteRepository.save(note3);
		noteRepository.save(note4);

		TeacherCourse tc1 = new TeacherCourse(teacher1.getIdTeacher(),
				course1.getIdCourse());
		TeacherCourse tc2 = new TeacherCourse(teacher2.getIdTeacher(),
				course2.getIdCourse());
		TeacherCourse tc3 = new TeacherCourse(teacher1.getIdTeacher(),
				course3.getIdCourse());
		TeacherCourse tc4 = new TeacherCourse(teacher1.getIdTeacher(),
				course4.getIdCourse());
		teacherCourseRepository.save(tc1);
		teacherCourseRepository.save(tc2);
		teacherCourseRepository.save(tc3);
		teacherCourseRepository.save(tc4);
	}
}
