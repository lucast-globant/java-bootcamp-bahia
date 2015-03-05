package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;

	@NotNull
	private String courseName;

	@NotNull
	private int hoursByWeek;

	@NotNull
	@OneToMany
	private int scheduleTime;

	@NotNull
	@OneToMany
	private int teacherAssigned;

	public Course(Long id) {
		courseId = id;
	}

	public Course(Long courseId, String courseName, int hoursByWeek, int scheduleTime, int teacherAssigned) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.hoursByWeek = hoursByWeek;
		this.scheduleTime = scheduleTime;
		this.teacherAssigned = teacherAssigned;
	}

	public Course(String name) {
		this.courseName = name;
	}

	public Long getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getHoursByWeek() {
		return hoursByWeek;
	}

	public void setHoursByWeek(int hoursByWeek) {
		this.hoursByWeek = hoursByWeek;
	}

	public int getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduleTime(int scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public int getTeacherAssigned() {
		return teacherAssigned;
	}

	public void setTeacherAssigned(int teacherAssigned) {
		this.teacherAssigned = teacherAssigned;
	}

}
