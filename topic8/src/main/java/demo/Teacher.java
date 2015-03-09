package demo;


import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Teacher{


	@Id
	private ObjectId id;
	
	private ObjectId parent;
	
	private int teacherNumber;

	public Teacher(){super();}

	public Teacher(ObjectId id, ObjectId parent_id, int teacherNumber) {
		super();
		this.id = id;
		this.parent = parent_id;
		this.teacherNumber = teacherNumber;
	}

	public int getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(int teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public ObjectId getId() {
		return id;
	}

	public ObjectId getParent() {
		return parent;
	}

	@Override
	public String toString() {
		return String.format(
		"Teacher[id=%s teacherNumber='%s']", id, teacherNumber);
	}


	
	
}