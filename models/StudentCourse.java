package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Student - Course")
public class StudentCourse {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sc_id;
	
	@Id
	@OneToMany
	@NotNull
	private Long sc_studentId;

	@Id
	@OneToMany
	@NotNull
	private Long sc_courseId;

	@NotNull
	private float sc_partial1;

	@NotNull
	private float sc_partial2;

	@NotNull
	private float sc_partial3;

	@NotNull
	private float sc_finalNote;
	
	private int sc_year;

	public StudentCourse(Long sc_studentId, Long sc_courseId) {
		this.sc_studentId = sc_studentId;
		this.sc_courseId = sc_courseId;
	}


	public StudentCourse(Long sc_studentId, Long sc_courseId,
			float sc_partial1, float sc_partial2, float sc_partial3,
			float sc_finalNote, int sc_year) {
		this.sc_studentId = sc_studentId;
		this.sc_courseId = sc_courseId;
		this.sc_partial1 = sc_partial1;
		this.sc_partial2 = sc_partial2;
		this.sc_partial3 = sc_partial3;
		this.sc_finalNote = sc_finalNote;
		this.sc_year = sc_year;
	}

	public Long getSc_id() {
		return sc_id;
	}

	public void setSc_id(Long sc_id) {
		this.sc_id = sc_id;
	}

	public Long getSc_studentId() {
		return sc_studentId;
	}

	public void setSc_studentId(Long sc_studentId) {
		this.sc_studentId = sc_studentId;
	}

	public Long getSc_courseId() {
		return sc_courseId;
	}

	public void setSc_courseId(Long sc_courseId) {
		this.sc_courseId = sc_courseId;
	}

	public float getSc_partial1() {
		return sc_partial1;
	}

	public void setSc_partial1(float sc_partial1) {
		this.sc_partial1 = sc_partial1;
	}

	public float getSc_partial2() {
		return sc_partial2;
	}

	public void setSc_partial2(float sc_partial2) {
		this.sc_partial2 = sc_partial2;
	}

	public float getSc_partial3() {
		return sc_partial3;
	}

	public void setSc_partial3(float sc_partial3) {
		this.sc_partial3 = sc_partial3;
	}

	public float getSc_finalNote() {
		return sc_finalNote;
	}

	public void setSc_finalNote(float sc_finalNote) {
		this.sc_finalNote = sc_finalNote;
	}

	public int getSc_year() {
		return sc_year;
	}

	public void setSc_year(int sc_year) {
		this.sc_year = sc_year;
	}

}