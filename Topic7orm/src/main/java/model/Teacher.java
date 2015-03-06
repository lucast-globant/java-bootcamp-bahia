package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "teacher")
public class Teacher extends Person{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@NotNull
	@Column(name = "dni")
	private Long dni;
	
	public Teacher(){super();}
	
	public Teacher(Long tc_id) {
		this.id = tc_id;
	}

	public Teacher(String tc_firstName, String tc_lastName) {
		super();
		this.firstname = tc_firstName;
		this.lastname = tc_lastName;
	}

	public Teacher(String tc_dateOfBirth, String tc_firstName,
			String tc_lastName) {
		this.birthday = tc_dateOfBirth;
		this.firstname = tc_firstName;
		this.lastname = tc_lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	
}