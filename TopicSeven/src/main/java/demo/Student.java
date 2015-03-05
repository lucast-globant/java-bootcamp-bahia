package demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "student")
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "id_student")
	private long id_student;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@GeneratedValue
	private long registration_number;

	@Column(name = "date_of_birth")
	private Date date_of_birth;

	public Student() {
		super();
	}

	public Student(String first_name, String last_name, Date date_of_birth) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.date_of_birth = date_of_birth;
	}

	public long getId() {
		return id_student;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public long getRegistration_number() {
		return registration_number;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	@Override
	public String toString() {
		return "Student [id_student=" + id_student + ", first_name="
				+ first_name + ", last_name=" + last_name
				+ ", registration_number=" + registration_number
				+ ", date_of_birth=" + date_of_birth + "]";
	}

}
