package demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "course")
public class Course {

	@Id
	private String idCourse;

	@Field(value = "name")
	private String name;

	@Field(value = " id_assigned_teacher")
	private String idAssignedTeacher;

	@Field(value = "hours_by_week")
	private String hoursByWeek;

	@Field(value = "id_shedule_time_fk")
	private String idSheduleTimeFk;

	public Course() {
		super();
	}

	public Course(String name, String idAssignedTeacher, String hoursByWeek,
			String idSheduleTimeFk) {
		super();
		this.name = name;
		this.idAssignedTeacher = idAssignedTeacher;
		this.hoursByWeek = hoursByWeek;
		this.idSheduleTimeFk = idSheduleTimeFk;
	}

	public String getIdCourse() {
		return idCourse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdAssignedTeacher() {
		return idAssignedTeacher;
	}

	public void setIdAssignedTeacher(String idAssignedTeacher) {
		this.idAssignedTeacher = idAssignedTeacher;
	}

	public String getHoursByWeek() {
		return hoursByWeek;
	}

	public void setHoursByWeek(String hoursByWeek) {
		this.hoursByWeek = hoursByWeek;
	}

	public String getIdSheduleTimeFk() {
		return idSheduleTimeFk;
	}

	public void setIdSheduleTimeFk(String idSheduleTimeFk) {
		this.idSheduleTimeFk = idSheduleTimeFk;
	}

	@Override
	public String toString() {
		return "Course [idCourse=" + idCourse + ", name=" + name
				+ ", idAssignedTeacher=" + idAssignedTeacher + ", hoursByWeek="
				+ hoursByWeek + ", idSheduleTimeFk=" + idSheduleTimeFk + "]";
	}

}
