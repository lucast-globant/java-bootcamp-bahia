package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "student_takes_course")
public class StudentTakesCourse {

	
	@Id
	@NotNull
	@Column(name = "registerNumber")
	private Long registerNumber; //student id

	@Id
	@NotNull
	@Column(name = "course_id")
	private Long course_id;

	@Column(name = "partial_1_note")
	private int partial_1_note;

	@Column(name = "partial_2_note")
	private int partial_2_note;

	@Column(name = "partial_3_note")
	private int partial_3_note;

	@Column(name = "final_note")
	private int final_note;
	

	public StudentTakesCourse(){super();}
	
	public StudentTakesCourse(Long sc_studentId, Long sc_courseId) {
		this.registerNumber = sc_studentId;
		this.course_id = sc_courseId;
	}


	public StudentTakesCourse(Long sc_studentId, Long sc_courseId,
			int sc_partial1, int sc_partial2, int sc_partial3,
			int sc_finalNote) {
		this.registerNumber = sc_studentId;
		this.course_id = sc_courseId;
		this.partial_1_note = sc_partial1;
		this.partial_2_note = sc_partial2;
		this.partial_3_note = sc_partial3;
		this.final_note = sc_finalNote;
	
	}


	public Long getRegisterNumber() {
		return registerNumber;
	}


	public void setRegisterNumber(Long registerNumber) {
		this.registerNumber = registerNumber;
	}


	public Long getCourse_id() {
		return course_id;
	}


	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
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

	
	

}