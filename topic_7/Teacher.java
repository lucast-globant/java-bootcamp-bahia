package topic_7;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {

	@Id
	@GeneratedValue
	@Column(name="id_teacher", nullable = false)
	private int idTeacher;
	@Column(name="first_name", nullable = false)
	private String first_name;
	@Column(name="last_name", nullable = false)
	private String last_name;
	@Column(name="birth", nullable = false)
	private Date birth;
	
	public Teacher() {}

	public Teacher(String first_name, String last_name,	Date birth) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.birth = birth;
	}

	public int getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(int id_teacher) {
		this.idTeacher = id_teacher;
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

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Teacher [id_teacher=" + idTeacher + ", first_name="
				+ first_name + ", last_name=" + last_name + ", birth=" + birth
				+ "]";
	}
	
}
