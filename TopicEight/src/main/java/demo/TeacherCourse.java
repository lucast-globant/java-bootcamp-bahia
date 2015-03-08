package demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "teacher_course")
public class TeacherCourse {

	@Id
	private String idTeacherCourse;

	@Field(value = "id_teacher_fk2")
	private String idTeacherFk;

	@Field(value = "id_course_fk2")
	private String idCourseFk;

	public TeacherCourse() {
		super();
	}

	public TeacherCourse(String idTeacherFk, String idCourseFk) {
		super();
		this.idTeacherFk = idTeacherFk;
		this.idCourseFk = idCourseFk;
	}

	public void setId_student_course(String id_teacher_course) {
		this.idTeacherCourse = id_teacher_course;
	}

	public String getIdStudentFk() {
		return idTeacherFk;
	}

	public void setIdStudentFk(String idStudentFk) {
		this.idTeacherFk = idStudentFk;
	}

	public String getIdCourseFk() {
		return idCourseFk;
	}

	public void setIdCourseFk(String idCourseFk) {
		this.idCourseFk = idCourseFk;
	}

	@Override
	public String toString() {
		return "StudentCourse [idStudentCourse=" + idTeacherCourse
				+ ", idStudentFk=" + idTeacherFk + ", idCourseFk=" + idCourseFk
				+ "]";
	}

}
