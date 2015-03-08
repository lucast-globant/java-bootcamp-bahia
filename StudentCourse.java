package topic8;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="StudentCourse")
public class StudentCourse {

	@Id
	private String sc_id;
	private String sc_studentId;
	private String sc_courseId;
	private float sc_partial1;
	private float sc_partial2;
	private float sc_partial3;
	private float sc_finalNote;
	private int sc_year;
	
	public StudentCourse() {}

	public StudentCourse(String sc_studentId, String sc_courseId,
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

	public String getSc_id() {
		return sc_id;
	}

	public void setSc_id(String sc_id) {
		this.sc_id = sc_id;
	}

	public String getSc_studentId() {
		return sc_studentId;
	}

	public void setSc_studentId(String sc_studentId) {
		this.sc_studentId = sc_studentId;
	}

	public String getSc_courseId() {
		return sc_courseId;
	}

	public void setSc_courseId(String sc_courseId) {
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