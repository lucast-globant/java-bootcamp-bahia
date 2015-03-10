package topic8.highSchoolSpring.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Student")
public class Student {
	private static AtomicLong nextId = new AtomicLong(0);
	private static SimpleDateFormat yyyyMMdd = new SimpleDateFormat(
			"yyyy-MM-dd");
	@Id
	private long studentId;
	@Field("firstName")
	private String firstName;
	@Field("lastName")
	private String lastName;
	@Field("birthDate")
	private String birthDate;

	@PersistenceConstructor
	public Student(String firstName, String lastName, String birthDate) {
		setFirstName(firstName);
		setLastName(lastName);
		setBirthDate(birthDate);
		studentId = nextId.incrementAndGet();
	}

	public Student(String firstName, String lastName, Date birthDate) {
		setFirstName(firstName);
		setLastName(lastName);
		setBirthDate(birthDate);
		studentId = nextId.incrementAndGet();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getBirthDate() {
		try {
			return yyyyMMdd.parse(birthDate);
		} catch (ParseException e) {
			return null;
		}
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = yyyyMMdd.format(birthDate);
	}
	
	private void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getStudentId() {
		return studentId;
	}

}
