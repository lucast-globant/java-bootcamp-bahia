package topic_7;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rinde")
public class Rinde {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="reg_number", nullable = false)
	private int reg_number;
	@Id
	@Column(name="id_course", nullable = false)
	private int id_course;
	@Column(name="partial_note_1", nullable = false)
	private int partial_note_1;
	@Column(name="partial_note_2", nullable = false)
	private int partial_note_2;
	@Column(name="partial_note_3", nullable = false)
	private int partial_note_3;
	@Column(name="final_note", nullable = false)
	private int final_note;
	
	public Rinde() {}

	public Rinde(int reg_number, int id_course, int partial_note_1,
			int partial_note_2, int partial_note_3, int final_note) {
		this.reg_number = reg_number;
		this.id_course = id_course;
		this.partial_note_1 = partial_note_1;
		this.partial_note_2 = partial_note_2;
		this.partial_note_3 = partial_note_3;
		this.final_note = final_note;
	}

	public int getReg_number() {
		return reg_number;
	}

	public void setReg_number(int reg_number) {
		this.reg_number = reg_number;
	}

	public int getId_course() {
		return id_course;
	}

	public void setId_course(int id_course) {
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

	@Override
	public String toString() {
		return "Rinde [reg_number=" + reg_number + ", id_course=" + id_course
				+ ", partial_note_1=" + partial_note_1 + ", partial_note_2="
				+ partial_note_2 + ", partial_note_3=" + partial_note_3
				+ ", final_note=" + final_note + "]";
	}
	
}
