package demo;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "teacher")
public class Teacher {

	@Id
	private String idTeacher;

	@Field(value = "first_name")
	private String firstName;

	@Field(value = "last_name")
	private String lastName;

	@Field(value = "date_of_birth")
	private Date dateOfBirth;

	public Teacher() {
		super();
	}

	public Teacher(String firsNname, String lastName, Date dateOfBirth) {
		super();
		this.firstName = firsNname;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public String getIdTeacher() {
		return idTeacher;
	}

	public String getFirsNname() {
		return firstName;
	}

	public void setFirsNname(String firsNname) {
		this.firstName = firsNname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Teacher [idTeacher=" + idTeacher + ", firsNname=" + firstName
				+ ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}

}
