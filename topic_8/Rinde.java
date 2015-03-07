package topic_8;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rinde")
public class Rinde {

	@Id
	private ObjectId id;	
	private ObjectId id_student;
	private ObjectId id_course;
	private int partial_note_1;
	private int partial_note_2;
	private int partial_note_3;
	private int final_note;

	public Rinde() {}

	public Rinde(ObjectId id, ObjectId id_student, ObjectId id_course,
			int partial_note_1, int partial_note_2, int partial_note_3,
			int final_note) {
		this.id = id;
		this.id_student = id_student;
		this.id_course = id_course;
		this.partial_note_1 = partial_note_1;
		this.partial_note_2 = partial_note_2;
		this.partial_note_3 = partial_note_3;
		this.final_note = final_note;
	}

	public ObjectId getId_student() {
		return id_student;
	}

	public void setId_student(ObjectId id_student) {
		this.id_student = id_student;
	}

	public ObjectId getId_course() {
		return id_course;
	}

	public void setId_course(ObjectId id_course) {
		this.id_course = id_course;
	}

	public int getPartial_note_1() {
		return partial_note_1;
	}

	public void setPartial_note_1(int partial_note_1) {
		this.partial_note_1 = partial_note_1;
	}

	public int getPartial_note_2() {
		return partial_note_2;
	}

	public void setPartial_note_2(int partial_note_2) {
		this.partial_note_2 = partial_note_2;
	}

	public int getPartial_note_3() {
		return partial_note_3;
	}

	public void setPartial_note_3(int partial_note_3) {
		this.partial_note_3 = partial_note_3;
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

	@Override
	public String toString() {
		return "Rinde [id=" + id + ", id_student=" + id_student
				+ ", id_course=" + id_course + ", partial_note_1="
				+ partial_note_1 + ", partial_note_2=" + partial_note_2
				+ ", partial_note_3=" + partial_note_3 + ", final_note="
				+ final_note + "]";
	}

}
