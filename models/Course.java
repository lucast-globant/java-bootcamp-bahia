package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cs_id;

	@NotNull
	private String cs_name;

	@NotNull
	private int cs_hoursByTeacher;

	@NotNull
	@OneToMany
	private int cs_scheduleTime;

	@NotNull
	@OneToMany
	private int cs_asignedTeacher;


	public Course(Long cs_id) {
		this.cs_id = cs_id;
	}

	public Course(Long cs_id, String cs_name, int cs_hoursByTeacher,
			int cs_scheduleTime, int cs_asignedTeacher) {
		super();
		this.cs_id = cs_id;
		this.cs_name = cs_name;
		this.cs_hoursByTeacher = cs_hoursByTeacher;
		this.cs_scheduleTime = cs_scheduleTime;
		this.cs_asignedTeacher = cs_asignedTeacher;
	}

	public Course(String cs_name) {
		super();
		this.cs_name = cs_name;
	}

	public Long getCs_id() {
		return cs_id;
	}

	public void setCs_id(Long cs_id) {
		this.cs_id = cs_id;
	}

	public String getCs_name() {
		return cs_name;
	}

	public void setCs_name(String cs_name) {
		this.cs_name = cs_name;
	}

	public int getCs_hoursByTeacher() {
		return cs_hoursByTeacher;
	}

	public void setCs_hoursByTeacher(int cs_hoursByTeacher) {
		this.cs_hoursByTeacher = cs_hoursByTeacher;
	}

	public int getCs_scheduleTime() {
		return cs_scheduleTime;
	}

	public void setCs_scheduleTime(int cs_scheduleTime) {
		this.cs_scheduleTime = cs_scheduleTime;
	}

	public int getCs_asignedTeacher() {
		return cs_asignedTeacher;
	}

	public void setCs_asignedTeacher(int cs_asignedTeacher) {
		this.cs_asignedTeacher = cs_asignedTeacher;
	}

}