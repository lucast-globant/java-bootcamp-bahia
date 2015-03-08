package demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "notes")
public class Note {

	@Id
	private String idNotes;

	@Field(value = "id_student_course_fk")
	private String idStudentCourseFk;

	@Field(value = "partial_note_1")
	private int partialNote1;

	@Field(value = "partial_note_2")
	private int partialNote2;

	@Field(value = "partial_note_3")
	private int partialNote3;

	@Field(value = "final_note")
	private int finalNote;

	public Note() {
		super();
	}

	public Note(String idStudentCourseFk, int partialNote1, int partialNote2,
			int partialNote3, int finalNote) {
		super();
		this.idStudentCourseFk = idStudentCourseFk;
		this.partialNote1 = partialNote1;
		this.partialNote2 = partialNote2;
		this.partialNote3 = partialNote3;
		this.finalNote = finalNote;
	}

	public String getIdNotes() {
		return idNotes;
	}

	public String getIdStudentCourseFk() {
		return idStudentCourseFk;
	}

	public void setIdStudentCourseFk(String idStudentCourseFk) {
		this.idStudentCourseFk = idStudentCourseFk;
	}

	public int getPartialNote1() {
		return partialNote1;
	}

	public void setPartialNote1(int partialNote1) {
		this.partialNote1 = partialNote1;
	}

	public int getPartialNote2() {
		return partialNote2;
	}

	public void setPartialNote2(int partialNote2) {
		this.partialNote2 = partialNote2;
	}

	public int getPartialNote3() {
		return partialNote3;
	}

	public void setPartialNote3(int partialNote3) {
		this.partialNote3 = partialNote3;
	}

	public int getFinalNote() {
		return finalNote;
	}

	public void setFinalNote(int finalNote) {
		this.finalNote = finalNote;
	}

	@Override
	public String toString() {
		return "Notes [idNotes=" + idNotes + ", idStudentCourseFk="
				+ idStudentCourseFk + ", partialNote1=" + partialNote1
				+ ", partialNote2=" + partialNote2 + ", partialNote3="
				+ partialNote3 + ", finalNote=" + finalNote + "]";
	}

}
