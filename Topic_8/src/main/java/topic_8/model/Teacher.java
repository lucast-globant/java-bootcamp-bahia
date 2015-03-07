package topic_8.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "teachers")
public class Teacher {
	@Id
	private String id;
	private Integer idTeacher;
	private String firstName;
	private String lastName;
	private String dateOfBirth;

	public Teacher() {
	}

	public Teacher(Integer idTeacher, String firstName, String lastName, String dateOfBirth) {
		this.idTeacher = idTeacher;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(Integer idTeacher) {
		this.idTeacher = idTeacher;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Teacher [idTeacher=" + idTeacher + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}

}
