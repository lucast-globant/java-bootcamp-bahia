package topic8;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Teacher")
public class Teacher {

	@Id
	private String tc_id;
	private String tc_firstName;
	private String tc_lastName;
	private String tc_dateOfBirth;

	public Teacher() {}

	public Teacher(String tc_firstName, String tc_lastName,String tc_dateOfBirth) {
		this.tc_firstName = tc_firstName;
		this.tc_lastName = tc_lastName;
		this.tc_dateOfBirth = tc_dateOfBirth;
	}

	public String getTc_id() {
		return tc_id;
	}

	public void setTc_id(String tc_id) {
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