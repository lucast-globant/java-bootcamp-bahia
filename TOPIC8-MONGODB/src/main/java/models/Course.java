package models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "course")
public class Course {

	@Id
	private Long courseId;

	private String courseName;

	private int hoursByWeek;

	private int scheduleTime;

	private int teacherAssigned;

	private boolean isFinished;

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
