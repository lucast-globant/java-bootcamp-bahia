package demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "student_course")
public class Student_Course {

	@Id
	@Column(name = "id_student_course")
	private long id_student_course;
	
	@Column(name = "id_student_fk")
	private long id_student_fk;
	
	@Column(name = "id_course_fk")
	private long id_course_fk;

	public Student_Course() {
		super();
	}
	
	
}
