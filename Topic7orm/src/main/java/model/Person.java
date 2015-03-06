package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "person")
public class Person {
	
	@Id
	@NotNull
	@Column(name = "dni")
	protected Long dni;
	
	@NotNull
	@Column(name = "firstname")
	protected String firstname;

	@NotNull
	@Column(name = "lastname")
	protected String lastname;
	
	@NotNull
	@Column(name = "birthday")
	protected String birthday;
	
	public Person(){super();}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastName) {
		this.lastname = lastName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	
	

}
