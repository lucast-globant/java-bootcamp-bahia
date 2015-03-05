package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tc_id;

	@NotNull
	private String tc_dateOfBirth;

	@NotNull
	private String tc_firstName;

	@NotNull
	private String tc_lastName;

	public Teacher(Long tc_id) {
		this.tc_id = tc_id;
	}

	public Teacher(String tc_firstName, String tc_lastName) {
		super();
		this.tc_firstName = tc_firstName;
		this.tc_lastName = tc_lastName;
	}

	public Teacher(String tc_dateOfBirth, String tc_firstName,
			String tc_lastName) {
		this.tc_dateOfBirth = tc_dateOfBirth;
		this.tc_firstName = tc_firstName;
		this.tc_lastName = tc_lastName;
	}

	public Long getTc_id() {
		return tc_id;
	}

	public void setTc_id(Long tc_id) {
		this.tc_id = tc_id;
	}

	public String getTc_firstName() {
		return tc_firstName;
	}

	public void setTc_firstName(String tc_firstName) {
		this.tc_firstName = tc_firstName;
	}

	public String getTc_lastName() {
		return tc_lastName;
	}

	public void setTc_lastName(String tc_lastName) {
		this.tc_lastName = tc_lastName;
	}

	public String getTc_dateOfBirth() {
		return tc_dateOfBirth;
	}

	public void setTc_dateOfBirth(String tc_dateOfBirth) {
		this.tc_dateOfBirth = tc_dateOfBirth;
	}

}