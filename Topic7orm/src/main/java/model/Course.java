package model;

import javax.persistence.Column;
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
	@Column(name = "id")
	private Long id;

	@NotNull
	@Column(name = "name")
	private String name;

	@NotNull
	@Column(name = "hoursperWeek")
	private int hoursperWeek;
	
	public Course(){}
	
	public Course(long id) {
		this.id = id;
	}

	public Course(long id, String cs_name, int cs_hoursByTeacher,
			int cs_scheduleTime, int cs_asignedTeacher) {
		super();
		this.id = id;
		this.name = cs_name;
		this.hoursperWeek = cs_hoursByTeacher;
	}

	public Course(String cs_name) {
		super();
		this.name = cs_name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHoursperWeek() {
		return hoursperWeek;
	}

	public void setHoursperWeek(int hoursperWeek) {
		this.hoursperWeek = hoursperWeek;
	}

	

}