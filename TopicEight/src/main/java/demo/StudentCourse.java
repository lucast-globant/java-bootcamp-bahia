package demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "student_course")
public class StudentCourse {

	@Id
	private String idStudentCourse;

	@Field(value = "id_student_fk")
	private String idStudentFk;

	@Field(value = "id_course_fk")
	private String idCourseFk;

	public StudentCourse() {
		super();
	}

	public StudentCourse(String idStudentFk, String idCourseFk) {
		super();
		this.idStudentFk = idStudentFk;
		this.idCourseFk = idCourseFk;
	}

	public String getIdStudentCourse() {
		return this.idStudentCourse;
	}

	public String getIdStudentFk() {
		return idStudentFk;
	}

	public void setIdStudentFk(String idStudentFk) {
		this.idStudentFk = idStudentFk;
	}

	public String getIdCourseFk() {
		return idCourseFk;
	}

	public void setIdCourseFk(String idCourseFk) {
		this.idCourseFk = idCourseFk;
	}

	@Override
	public String toString() {
		return "StudentCourse [idStudentCourse=" + idStudentCourse
				+ ", idStudentFk=" + idStudentFk + ", idCourseFk=" + idCourseFk
				+ "]";
	}

}
