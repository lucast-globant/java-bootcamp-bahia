package models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {

	@Id
	private Long registrationNumber;

	private String dateOfBirth;

	private String firstName;

	private String lastName;

	public Student(long registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Student(Long registrationNumber, String dateOfBirth, String firtName, String lastName) {
		super();
		this.registrationNumber = registrationNumber;
		this.dateOfBirth = dateOfBirth;
		this.firstName = firtName;
		this.lastName = lastName;
	}

	public Student(String name, String lastName2) {
		this.firstName = name;
		this.lastName = lastName2;

	}

	public Long getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(Long registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirtName() {
		return firstName;
	}

	public void setFirtName(String firtName) {
		this.firstName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
