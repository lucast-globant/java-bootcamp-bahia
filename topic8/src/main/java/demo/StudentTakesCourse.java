package demo;

import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StudentTakesCourse {

	
	@Id
	private ObjectId id;

	private ObjectId studentId;
	
	private ObjectId courseId;
	
	private int partial_1_note;


	private int partial_2_note;


	private int partial_3_note;


	private int final_note;
	

	public StudentTakesCourse(){super();}
	
	
	public StudentTakesCourse(ObjectId id, ObjectId studentId,
			ObjectId courseId, int partial_1_note, int partial_2_note,
			int partial_3_note, int final_note) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.courseId = courseId;
		this.partial_1_note = partial_1_note;
		this.partial_2_note = partial_2_note;
		this.partial_3_note = partial_3_note;
		this.final_note = final_note;
	}



	

	public int getPartial_1_note() {
		return partial_1_note;
	}


	public void setPartial_1_note(int partial_1_note) {
		this.partial_1_note = partial_1_note;
	}


	public int getPartial_2_note() {
		return partial_2_note;
	}


	public void setPartial_2_note(int partial_2_note) {
		this.partial_2_note = partial_2_note;
	}


	public int getPartial_3_note() {
		return partial_3_note;
	}


	public void setPartial_3_note(int partial_3_note) {
		this.partial_3_note = partial_3_note;
	}


	public int getFinal_note() {
		return final_note;
	}


	public void setFinal_note(int final_note) {
		this.final_note = final_note;
	}


	
	
	public ObjectId getId() {
		return id;
	}


	public ObjectId getStudentId() {
		return studentId;
	}


	public ObjectId getCourseId() {
		return courseId;
	}


	@Override
	public String toString() {
		return String.format(
		"StudentTakesCourse[id=%s studentId='%s' courseId='%s' partial_1_note='%s' partial_2_note='%s' partial_3_note='%s' final_note='%s']", 
		id,
		studentId,
		courseId,
		partial_1_note,
		partial_2_note,
		partial_3_note,
		final_note);
	}
	

}