package topic_8.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "courses")
public class Course {
	@Id
	private ObjectId id;
	private Integer idCourse;
	private String name;
	private Teacher assignedTeacher;
	private Integer hoursByWeek;

	public Course() {
	}

	public Course(Integer idCourse, String name, Teacher assignedTeacher, Integer hoursByWeek) {
		this.idCourse = idCourse;
		this.name = name;
		this.assignedTeacher = assignedTeacher;
		this.hoursByWeek = hoursByWeek;

	}

	public Integer getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(Integer idCourse) {
		this.idCourse = idCourse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getAssignedTeacher() {
		return assignedTeacher;
	}

	public void setAssignedTeacher(Teacher assignedTeacher) {
		this.assignedTeacher = assignedTeacher;
	}

	public Integer getHoursByWeek() {
		return hoursByWeek;
	}

	public void setHoursByWeek(Integer hoursByWeek) {
		this.hoursByWeek = hoursByWeek;
	}

	@Override
	public String toString() {
		return "Course [idCourse=" + idCourse + ", name=" + name + ", assignedTeacher=" + assignedTeacher + ", hoursByWeek=" + hoursByWeek
				+ ", scheduleTime=" + "]";
	}

}
