package topic7.highSchool.completeModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity(name = "NOTE")
@Table(name = "STUDENT_COURSE")
@IdClass(NoteId.class)
public class Note {
	@Id
	private long studentId;

	@Id
	private long courseId;

	@Id
	int year;

	@ManyToOne
	@PrimaryKeyJoinColumn(name = "STUDENT_ID", referencedColumnName = "STUDENT_ID")
	private Student student;

	@ManyToOne
	@PrimaryKeyJoinColumn(name = "COURSE_ID", referencedColumnName = "COURSE_ID")
	private Course course;

	@Column(name = "NOTE1")
	int note1;

	@Column(name = "NOTE2")
	int note2;

	@Column(name = "NOTE3")
	int note3;

	@Column(name = "FINAL_NOTE")
	int finalNote;

	protected Note() {

	}

	public Note(Student student, Course course, int year) {
		this.student = student;
		this.course = course;
		this.year = year;
		this.studentId = student.getStudentId();
		this.courseId = course.getCourseId();
	}

	public void setNote1(int note) {
		this.note1 = note;
	}

	public int getNote1() {
		return note1;
	}

	public void setNote2(int note) {
		this.note2 = note;
	}

	public int getNote2() {
		return note2;
	}

	public void setNote3(int note) {
		this.note3 = note;
	}

	public int getNote3() {
		return note3;
	}

	public void setFinalNote(int finalNote) {
		this.finalNote = finalNote;
	}

	public int getFinalNote() {
		return finalNote;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setYear(int year) {
		this.year = year;
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
}
