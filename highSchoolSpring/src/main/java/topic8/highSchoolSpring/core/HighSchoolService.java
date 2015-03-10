package topic8.highSchoolSpring.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import topic8.highSchoolSpring.model.Course;
import topic8.highSchoolSpring.model.Note;
import topic8.highSchoolSpring.model.Schedule;
import topic8.highSchoolSpring.model.Student;
import topic8.highSchoolSpring.model.Teacher;
import topic8.highSchoolSpring.repositories.CourseRepository;
import topic8.highSchoolSpring.repositories.NoteRepository;
import topic8.highSchoolSpring.repositories.StudentRepository;
import topic8.highSchoolSpring.repositories.TeacherRepository;

@Service
public class HighSchoolService implements IHighSchoolService {

	private StudentRepository studentRepository;
	private CourseRepository courseRepository;
	private TeacherRepository teacherRepository;
	private NoteRepository noteRepository;

	@Autowired
	public HighSchoolService(StudentRepository studentRepository,
			CourseRepository courseRepository,
			TeacherRepository teacherRepository, NoteRepository noteRepository) {
		this.courseRepository = courseRepository;
		this.studentRepository = studentRepository;
		this.noteRepository = noteRepository;
		this.teacherRepository = teacherRepository;
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void addCourse(String name, int hoursByWeek, long assignedTeacher,
			List<Schedule> schedule) {
		courseRepository.save(new Course(name, hoursByWeek, assignedTeacher,
				schedule));
	}

	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	public void addStudent(String firstName, String lastName, Date birthDate) {
		studentRepository.save(new Student(firstName, lastName, birthDate));
	}

	public void addTeacher(Teacher teacher) {
		teacherRepository.save(teacher);
	}

	public void addTeacher(String firstName, String lastName, Date birthDate) {
		teacherRepository.save(new Teacher(firstName, lastName, birthDate));
	}

	public void addNote(Note note) {
		noteRepository.save(note);
	}

	public void addNote(long studentId, long courseId, int year, int note1,
			int note2, int note3, int finalNote) {
		noteRepository.save(new Note(studentId, courseId, year, note1, note2,
				note3, finalNote));
	}

	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}

	public List<Teacher> findAllTeachers() {
		return teacherRepository.findAll();
	}

	public List<Course> findAllCourses() {
		return courseRepository.findAll();
	}

	public Student findStudent(long id) {
		return studentRepository.findOne(id);
	}

	public Teacher findTeacher(long id) {
		return teacherRepository.findOne(id);
	}

	public Course findCourse(long id) {
		return courseRepository.findOne(id);
	}

	public Student findStudent(String lastName) {
		return studentRepository.findByLastName(lastName);
	}

	public Teacher findTeacher(String lastName) {
		return teacherRepository.findByLastName(lastName);
	}

	public Course findCourse(String name) {
		return courseRepository.findByName(name);
	}

	public List<Student> findStudentsWithNotesHigherThan4InCourse(long courseId) {
		List<Long> goodStudentsIds = new ArrayList<Long>();
		List<Note> goodStudents = noteRepository
				.findStudentsWithNotesGreaterThan4FromCourse(courseId);

		for (Note i : goodStudents) {
			goodStudentsIds.add(i.getStudentId());
		}

		List<Student> goodStudentsData = studentRepository
				.findByIds(goodStudentsIds);
		return goodStudentsData;
	}

	public List<Course> findCoursesByAssignedTeacher(long teacherId) {
		return courseRepository.findByAssignedTeacher(teacherId);
	}

}
