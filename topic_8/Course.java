package topic_8;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "course")
public class Course {

	@Id
	private ObjectId id;
	private String name;
	private ObjectId id_teacher;
	private int hours_week;
	private int schedule_time;
	private boolean finish;

	public Course() {}

	public Course(ObjectId id, String name, ObjectId id_teacher, int hours_week,
			int schedule_time, boolean finish) {
		this.id = id;
		this.name = name;
		this.id_teacher = id_teacher;
		this.hours_week = hours_week;
		this.schedule_time = schedule_time;
		this.finish = finish;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ObjectId getId_teacher() {
		return id_teacher;
	}

	public void setId_teacher(ObjectId id_teacher) {
		this.id_teacher = id_teacher;
	}

	public int getHours_week() {
		return hours_week;
	}

	public void setHours_week(int hours_week) {
		this.hours_week = hours_week;
	}

	public int getSchedule_time() {
		return schedule_time;
	}

	public void setSchedule_time(int schedule_time) {
		this.schedule_time = schedule_time;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public ObjectId getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", id_teacher="
				+ id_teacher + ", hours_week=" + hours_week
				+ ", schedule_time=" + schedule_time + ", finish=" + finish
				+ "]";
	}	
}