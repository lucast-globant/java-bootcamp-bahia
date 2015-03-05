package demo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "course")
public class Course {

	@Id
	@GeneratedValue
	@Column(name = "id_course")
	private long id_course;

	@Column(name = "name")
	private String name;

	@Column(name = " id_assigned_teacher")
	private long id_assigned_teacher;

	@Column(name = "hours_by_week")
	private int hours_by_week;

	@Column(name = "id_shedule_time_fk")
	private long id_shedule_time_fk;

	public Course() {
		super();
	}

	public Course(String name, long id_assigned_teacher, int hours_by_week,
			long id_shedule_time_fk) {
		super();
		this.name = name;
		this.id_assigned_teacher = id_assigned_teacher;
		this.hours_by_week = hours_by_week;
		this.id_shedule_time_fk = id_shedule_time_fk;
	}

	public long getId() {
		return id_course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId_assigned_teacher() {
		return id_assigned_teacher;
	}

	public void setId_assigned_teacher(long id_assigned_teacher) {
		this.id_assigned_teacher = id_assigned_teacher;
	}

	public int getHours_by_week() {
		return hours_by_week;
	}

	public void setHours_by_week(int hours_by_week) {
		this.hours_by_week = hours_by_week;
	}

	public long getId_shedule_time_fk() {
		return id_shedule_time_fk;
	}

	public void setId_shedule_time_fk(long id_shedule_time_fk) {
		this.id_shedule_time_fk = id_shedule_time_fk;
	}

	@Override
	public String toString() {
		return "Course [id_course=" + id_course + ", name=" + name
				+ ", id_assigned_teacher=" + id_assigned_teacher
				+ ", hours_by_week=" + hours_by_week + ", id_shedule_time_fk="
				+ id_shedule_time_fk + "]";
	}

}
