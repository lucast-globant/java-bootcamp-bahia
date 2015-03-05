package demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Teacher {

	@Id
	@GeneratedValue
	private long id_teacher;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "date_of_birth")
	private Date date_of_birth;

	public Teacher() {
		super();
	}

	public Teacher(String first_name, String last_name, Date date_of_birth) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.date_of_birth = date_of_birth;
	}

	public long getId() {
		return id_teacher;
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

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	@Override
	public String toString() {
		return "Teacher [id_teacher=" + id_teacher + ", first_name="
				+ first_name + ", last_name=" + last_name + ", date_of_birth="
				+ date_of_birth + "]";
	}

}
