package topic8;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Student")
public class Student {

	@Id
	private String st_id;
	private String st_firstName;
	private String st_lastName;	
	private Long st_regNumber;
	private String st_dateOfBirth;

	public Student() {}

	public Student(String st_id, String st_firstName, String st_lastName,
			Long st_regNumber, String st_dateOfBirth) {
		super();
		this.st_id = st_id;
		this.st_firstName = st_firstName;
		this.st_lastName = st_lastName;
		this.st_regNumber = st_regNumber;
		this.st_dateOfBirth = st_dateOfBirth;
	}

	public String getSt_id() {
		return st_id;
	}

	public void setSt_id(String st_id) {
		this.st_id = st_id;
	}

	public String getSt_firstName() {
		return st_firstName;
	}

	public void setSt_firstName(String st_firstName) {
		this.st_firstName = st_firstName;
	}

	public String getSt_lastName() {
		return st_lastName;
	}

	public void setSt_lastName(String st_lastName) {
		this.st_lastName = st_lastName;
	}

	public Long getSt_regNumber() {
		return st_regNumber;
	}

	public void setSt_regNumber(Long st_regNumber) {
		this.st_regNumber = st_regNumber;
	}

	public String getSt_dateOfBirth() {
		return st_dateOfBirth;
	}

	public void setSt_dateOfBirth(String st_dateOfBirth) {
		this.st_dateOfBirth = st_dateOfBirth;
	}

}