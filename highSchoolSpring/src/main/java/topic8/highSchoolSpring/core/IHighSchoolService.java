package topic8.highSchoolSpring.core;

import java.util.Date;
import java.util.List;

import topic8.highSchoolSpring.model.Course;
import topic8.highSchoolSpring.model.Note;
import topic8.highSchoolSpring.model.Schedule;
import topic8.highSchoolSpring.model.Student;
import topic8.highSchoolSpring.model.Teacher;

public interface IHighSchoolService {
	public void addCourse(Course course);
	public void addCourse(String name, int hoursByWeek, long assignedTeacher, List<Schedule> schedule);
	public void addStudent(Student student);
	public void addStudent(String firstName, String lastName, Date birthDate);
	public void addTeacher(Teacher teacher);
	public void addTeacher(String firstName, String lastName, Date birthDate);
	public void addNote(Note note);
	public void addNote(long studentId, long courseId, int year, int note1, int note2, int note3, int finalNote);
	
	public List<Student> findAllStudents();
	public List<Teacher> findAllTeachers();
	public List<Course> findAllCourses();
	
	public Student findStudent(long id);
	public Teacher findTeacher(long id);
	public Course findCourse(long id);
	
	public Student findStudent(String lastName);
	public Teacher findTeacher(String lastName);
	public Course findCourse(String name);
	
	public List<Student> findStudentsWithNotesHigherThan4InCourse(long courseId);
	public List<Course> findCoursesByAssignedTeacher(long teacherId);
	
}
