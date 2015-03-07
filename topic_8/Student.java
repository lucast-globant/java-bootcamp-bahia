package topic_8;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {

	@Id
	private ObjectId id;
	private String first_name;
	private String last_name;
	private int reg_number;
	private Date birth;

	public Student() {}

	public Student(ObjectId id, String first_name, String last_name,
			int reg_number, Date birth) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.reg_number = reg_number;
		this.birth = birth;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getReg_number() {
		return reg_number;
	}

	public void setReg_number(int reg_number) {
		this.reg_number = reg_number;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public ObjectId getId() {
		return id;
	}

	@Override
	public String toString() {
		String[] date_and_time = birth.toLocaleString().split(" ");
		String date = date_and_time[0];
		return "Student [id = " + id + ", first_name = " + first_name
				+ ", last_name = " + last_name + ", reg_number = " + reg_number
				+ ", birth = " + date + "]";
	}

}