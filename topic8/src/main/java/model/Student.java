package model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Student {

	@Id
	private ObjectId id;
	
	protected ObjectId parent;
	
	protected int registerNumber;	
	
	
	protected Student() {}
	

	public Student(ObjectId id, ObjectId parent_id, int registerNumber) {
		super();
		this.id = id;
		this.parent = parent_id;
		this.registerNumber = registerNumber;
	}





	@Override
	public String toString() {
		return String.format(
		"Student[id=%s registerNumber='%s']", id, registerNumber);
	}

	

	public ObjectId getId() {
		return id;
	}


	public ObjectId getParent() {
		return parent;
	}


	public int getRegisterNumber() {
		return registerNumber;
	}



	public void setRegisterNumber(int registerNumber) {
		this.registerNumber = registerNumber;
	}
	
		
	

}
