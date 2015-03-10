package model;

import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class TeacherDictateCourse {
	
	@Id
	@Field("_id")
	private ObjectId id;

	private ObjectId courseId;

	private ObjectId teacherId;
	
	private String hour;
		
	private String day;
	
	public TeacherDictateCourse(){
		super();
	}
	
	public TeacherDictateCourse(ObjectId id, ObjectId courseId,
			ObjectId teacherId, String hour, String day) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.teacherId = teacherId;
		this.hour = hour;
		this.day = day;
	}



	public TeacherDictateCourse(ObjectId teacherId, ObjectId courseId){
		this.teacherId = teacherId;
		this.courseId = courseId;
	}

	
	public ObjectId getCourseId() {
		return courseId;
	}



	public ObjectId getTeacherId() {
		return teacherId;
	}



	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	

	@Override
	public String toString() {
		return String.format(
		"TeacherDictateCourse[id=%s courseId='%s' teacherId='%s' hour='%s' day='%s']", 
		id,
		courseId,
		teacherId,
		hour,
		day);
	}

}
