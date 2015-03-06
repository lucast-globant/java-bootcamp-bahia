package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "teacher_dictate_course")
public class TeacherDictateCourse {
	
	@Id
	@NotNull
	@Column(name = "teacher_id")
	private long teacher_id; 
	
	@Id
	@NotNull
	@Column(name = "course_id")
	private long course_id;
	
	@NotNull
	@Column(name = "hour")
	private String hour;
	
	@NotNull
	@Column(name = "day")
	private String day;
	
	public TeacherDictateCourse(){
		super();
	}

	public TeacherDictateCourse(long teacher_id, long course_id, String hour,
			String day) {
		super();
		this.teacher_id = teacher_id;
		this.course_id = course_id;
		this.hour = hour;
		this.day = day;
	}
	
	public TeacherDictateCourse(long teacher_id, long course_id){
		this.teacher_id = teacher_id;
		this.course_id = course_id;
	}

	public long getTeacherId() {
		return teacher_id;
	}

	public void setTeacherId(long teacher_id) {
		this.teacher_id = teacher_id;
	}

	public long getCourse_id() {
		return course_id;
	}

	public void setCourse_id(long course_id) {
		this.course_id = course_id;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	

}
