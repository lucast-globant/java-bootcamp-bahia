package topic8.highSchoolSpring.model;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Course")
public class Course {
	private static AtomicLong nextId = new AtomicLong(0);
	@Id
	private long courseId;
	@Field("name")
	private String name;
	@Field("hoursByWeek")
	private int hoursByWeek;
	@Field("schedule")
	private List<Schedule> schedule;
	@Field("teacherId")
	private long assignedTeacher;

	@PersistenceConstructor
	public Course(String name, int hoursByWeek, long assignedTeacher, List<Schedule> schedule) {
		setName(name);
		setHoursByWeek(hoursByWeek);
		setTeacher(assignedTeacher);
		setSchedule(schedule);
		courseId = nextId.incrementAndGet();
	}

	private void setName(String name) {
		this.name = name;
	}
	
	private void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}

	private void setTeacher(long teacherId) {
		this.assignedTeacher=teacherId;
	}

	private void setHoursByWeek(int hoursByWeek) {
		this.hoursByWeek = hoursByWeek;
	}

	public String getName() {
		return name;
	}

	public List<Schedule> getSchedule() {
		return schedule;
	}

	public long getTeacher() {
		return assignedTeacher;
	}

	public int getHoursByWeek() {
		return hoursByWeek;
	}

}
