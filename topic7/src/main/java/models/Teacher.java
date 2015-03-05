package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long teacherId;

	@NotNull
	private String dateOfBirth;

	@NotNull
	private String firtName;

	@NotNull
	private String lastName;

	public Teacher(long teacherId) {
		this.teacherId = teacherId;
	}

	public Teacher(String name, String lastName2) {
		this.firtName = name;
		this.lastName = lastName2;
	}

	public Long getteacherId() {
		return teacherId;
	}

	public void setteacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
