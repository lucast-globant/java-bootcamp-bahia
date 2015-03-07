package topic8;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Course")
public class Course {

	@Id
	private String cs_id;
	private String cs_name;
	private ObjectId cs_hoursByTeacher;
	private ObjectId cs_scheduleTime;
	private ObjectId cs_asignedTeacher;

	public Course() {}
	
	public Course(String cs_id, String cs_name, ObjectId cs_hoursByTeacher,
			ObjectId cs_scheduleTime, ObjectId cs_asignedTeacher) {
		super();
		this.cs_id = cs_id;
		this.cs_name = cs_name;
		this.cs_hoursByTeacher = cs_hoursByTeacher;
		this.cs_scheduleTime = cs_scheduleTime;
		this.cs_asignedTeacher = cs_asignedTeacher;
	}

	public Course(String cs_name) {
		super();
		this.cs_name = cs_name;
	}

	public String getCs_id() {
		return cs_id;
	}

	public void setCs_id(String cs_id) {
		this.cs_id = cs_id;
	}

	public String getCs_name() {
		return cs_name;
	}

	public void setCs_name(String cs_name) {
		this.cs_name = cs_name;
	}

	public ObjectId getCs_hoursByTeacher() {
		return cs_hoursByTeacher;
	}

	public void setCs_hoursByTeacher(ObjectId cs_hoursByTeacher) {
		this.cs_hoursByTeacher = cs_hoursByTeacher;
	}

	public ObjectId getCs_scheduleTime() {
		return cs_scheduleTime;
	}

	public void setCs_scheduleTime(ObjectId cs_scheduleTime) {
		this.cs_scheduleTime = cs_scheduleTime;
	}

	public ObjectId getCs_asignedTeacher() {
		return cs_asignedTeacher;
	}

	public void setCs_asignedTeacher(ObjectId cs_asignedTeacher) {
		this.cs_asignedTeacher = cs_asignedTeacher;
	}
}