package topic_8;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "teacher")
public class Teacher {

	@Id
	private ObjectId id;
	private String first_name;
	private String last_name;
	private Date birth;

	public Teacher() {}

	public Teacher(ObjectId id, String first_name, String last_name, Date birth) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
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
		return "Teacher [id=" + id + ", first_name=" + first_name + ", last_name="
		+ last_name + ", birth=" + date + "]";
	}

}
