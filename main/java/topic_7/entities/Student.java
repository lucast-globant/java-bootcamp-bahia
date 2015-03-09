package topic_7.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Integer registrationNumber;
	@Column(name = "first_name", nullable = false)
	private String firstName;
	@Column(name = "last_name", nullable = false)
	private String lastName;
	@Column(name = "student_lu", nullable = false)
	private Integer lu;


	public Student() {
	}

	public Student(String firstName, String lastName, Integer lu) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.lu = lu;
	}

	public Integer getRegistrationNumber() {
		return registrationNumber;
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


	public Integer getLu() {
		return lu;
	}

	public void setLu(Integer lu) {
		this.lu = lu;
	}

	public void setRegistrationNumber(Integer registrationNumber) {
		this.registrationNumber = registrationNumber;
	}


	@Override
	public String toString() {
		return "Student [registrationNumber=" + registrationNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", lu=" + lu + "]";
	}

}
