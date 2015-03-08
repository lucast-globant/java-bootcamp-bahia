package demo;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "student")
public class Student {

	@Id
	private String idStudent;

	@Field(value = "first_name")
	private String firstName;
	@Field(value = "last_name")
	private String lastName;
	@Field(value = "registration_number")
	private String registrationNumber;
	@Field(value = "date_of_birth")
	private Date dateOfBirth;

	public Student() {
		super();
	}

	public Student(String firstName, String lastName,
			String registrationNumber, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registrationNumber = registrationNumber;
		this.dateOfBirth = dateOfBirth;
	}

	public String getIdStudent() {
		return idStudent;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", registrationNumber="
				+ registrationNumber + ", dateOfBirth=" + dateOfBirth + "]";
	}

}
