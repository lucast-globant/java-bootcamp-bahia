package demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Notes {

	@Id
	@GeneratedValue
	private long id_notes;

	@Column(name = "id_student_course_fk")
	private long id_student_course_fk;

	@Column(name = "partial_note_1")
	private int partial_note_1;

	@Column(name = "partial_note_2")
	private int partial_note_2;

	@Column(name = "partial_note_3")
	private int partial_note_3;

	@Column(name = "final_note")
	private int final_note;

	public Notes() {
		super();
	}

	public Notes(long id_student_course_fk) {
		super();
		this.id_student_course_fk = id_student_course_fk;
	}

	public long getId_notes() {
		return id_notes;
	}

	public long getId_student_course_fk() {
		return id_student_course_fk;
	}

	public void setId_student_course_fk(long id_student_course_fk) {
		this.id_student_course_fk = id_student_course_fk;
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

	@Override
	public String toString() {
		return "Notes [id_notes=" + id_notes + ", id_student_course_fk="
				+ id_student_course_fk + ", partial_note_1=" + partial_note_1
				+ ", partial_note_2=" + partial_note_2 + ", partial_note_3="
				+ partial_note_3 + ", final_note=" + final_note + "]";
	}

}
