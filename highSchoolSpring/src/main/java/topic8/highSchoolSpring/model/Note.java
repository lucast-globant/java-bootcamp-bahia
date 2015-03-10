package topic8.highSchoolSpring.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Note")
public class Note {
	@Field("studentId")
	private long studentId;
	@Field("curseId")
	private long courseId;
	@Field("year")
	private int year;
	@Field("note1")
	private int note1;
	@Field("note2")
	private int note2;
	@Field("note3")
	private int note3;
	@Field("finalNote")
	private int finalNote;

	public Note(long studentId, long courseId, int year, int note1, int note2, int note3, int finalNote){
		setStudentId(studentId);
		setCourseId(courseId);
		setYear(year);
		setNote1(note1);
		setNote2(note2);
		setNote3(note3);
		setFinalNote(finalNote);
	}

	protected Note(){
		
	}
	
	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNote1() {
		return note1;
	}

	public void setNote1(int note1) {
		this.note1 = note1;
	}

	public int getNote2() {
		return note2;
	}

	public void setNote2(int note2) {
		this.note2 = note2;
	}

	public int getNote3() {
		return note3;
	}

	public void setNote3(int note3) {
		this.note3 = note3;
	}

	public int getFinalNote() {
		return finalNote;
	}

	public void setFinalNote(int finalNote) {
		this.finalNote = finalNote;
	}
}
