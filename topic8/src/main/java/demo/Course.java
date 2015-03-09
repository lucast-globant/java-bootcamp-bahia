package demo;

import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Course{

	@Id
	private ObjectId id;

	private String name;

	private int hoursperWeek;
	
	public Course(){}
	
	public Course(ObjectId id) {
		this.id = id;
	}

	public Course(ObjectId id, String name, int hoursperWeek) {
		super();
		this.id = id;
		this.name = name;
		this.hoursperWeek = hoursperWeek;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHoursperWeek() {
		return hoursperWeek;
	}

	public void setHoursperWeek(int hoursperWeek) {
		this.hoursperWeek = hoursperWeek;
	}

	
	public ObjectId getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format(
		"Course[id=%s name='%s' hoursperweek='%s']", id, name, hoursperWeek);
	}

}