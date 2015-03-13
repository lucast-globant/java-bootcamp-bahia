package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long st_id;

	@NotNull
	private String st_firstName;

	@NotNull
	private String st_lastName;

	@NotNull	
	private Long st_regNumber;

	@NotNull
	private String st_dateOfBirth;

	public Student(long st_id) {
		this.st_regNumber = st_id;
	}

	public Student(Long st_id, String st_firstName, String st_lastName,
			Long st_regNumber, String st_dateOfBirth) {
		super();
		this.st_id = st_id;
		this.st_firstName = st_firstName;
		this.st_lastName = st_lastName;
		this.st_regNumber = st_regNumber;
		this.st_dateOfBirth = st_dateOfBirth;
	}

	public Student(String st_firstName, String st_lastName) {
		this.st_firstName = st_firstName;
		this.st_lastName = st_lastName;
	}

	public Long getSt_id() {
		return st_id;
	}

	public void setSt_id(Long st_id) {
		this.st_id = st_id;
	}

	public String getSt_firstName() {
		return st_firstName;
	}

	public void setSt_firstName(String st_firstName) {
		this.st_firstName = st_firstName;
	}

	public String getSt_lastName() {
		return st_lastName;
	}

	public void setSt_lastName(String st_lastName) {
		this.st_lastName = st_lastName;
	}

	public Long getSt_regNumber() {
		return st_regNumber;
	}

	public void setSt_regNumber(Long st_regNumber) {
		this.st_regNumber = st_regNumber;
	}

	public String getSt_dateOfBirth() {
		return st_dateOfBirth;
	}

	public void setSt_dateOfBirth(String st_dateOfBirth) {
		this.st_dateOfBirth = st_dateOfBirth;
	}

}