package topic_7;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue
	@Column(name="id_course", nullable = false)
	private int idCourse;
	@Column(name="name", nullable = false)
	private String name;
	@Column(name="id_teacher", nullable = false)
	private int id_teacher;
	@Column(name="hours_week", nullable = false)
	private int hours_week;
	@Column(name="schedule_time", nullable = false)
	private int schedule_time;
	
	public Course() {}

	public Course(String name, int id_teacher, int hours_week, int schedule_time) {
		this.name = name;
		this.id_teacher = id_teacher;
		this.hours_week = hours_week;
		this.schedule_time = schedule_time;
	}

	public int getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(int id_course) {
		this.idCourse = id_course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId_teacher() {
		return id_teacher;
	}

	public void setId_teacher(int id_teacher) {
		this.id_teacher = id_teacher;
	}

	public int getHours_week() {
		return hours_week;
	}

	public void setHours_week(int hours_week) {
		this.hours_week = hours_week;
	}

	public int getSchedule_time() {
		return schedule_time;
	}

	public void setSchedule_time(int schedule_time) {
		this.schedule_time = schedule_time;
	}

	@Override
	public String toString() {
		return "Course [id_course=" + idCourse + ", name=" + name
				+ ", id_teacher=" + id_teacher + ", hours_week=" + hours_week
				+ ", schedule_time=" + schedule_time + "]";
	}
	
}
