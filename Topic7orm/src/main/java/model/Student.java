package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "student")
public class Student extends Person{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "registerNumber")
	private Long registerNumber;

	@NotNull
	@Column(name = "dni")
	private Long dni;

	public Student(){super();}
	
	public Student(long st_id) {
		this.registerNumber = st_id;
	}

	public Student(Long st_id, String st_firstName, String st_lastName,
			Long st_regNumber, String st_dateOfBirth) {
		super();
		this.registerNumber = st_id;
		this.firstname = st_firstName;
		this.lastname = st_lastName;
		this.dni = st_regNumber;
		this.birthday = st_dateOfBirth;
	}

	public Student(String st_firstName, String st_lastName) {
		this.firstname = st_firstName;
		this.firstname = st_lastName;
	}

	public Long getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(Long registerNumber) {
		this.registerNumber = registerNumber;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	
	
}