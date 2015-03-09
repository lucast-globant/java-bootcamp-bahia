package topic_7.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "students_courses")
@IdClass(value = Notes.class)
public class Notes implements Serializable {
	@Id
	@Column(name = "student_id")
	private Integer registrationNumber;
	@Id
	@Column(name = "course_id")
	private Integer idCourse;

	@ManyToOne
	@JoinColumn(name = "course_id", updatable = false, insertable = false)
	private Course course;
	@ManyToOne
	@JoinColumn(name = "student_id", updatable = false, insertable = false)
	private Student student;
	
	@Column(name = "exam1")
	private Integer noteOne;
	@Column(name = "exam2")
	private Integer noteTwo;
	@Column(name = "exam3")
	private Integer noteThree;
	@Column(name = "final")
	private Integer finalNote;

	public Notes() {
	}

	public Notes(Course course, Student student, Integer noteOne, Integer noteTwo, Integer noteThree, Integer finalNote) {
		this.course = course;
		this.student = student;
		this.noteOne = noteOne;
		this.noteTwo = noteTwo;
		this.noteThree = noteThree;
		this.finalNote = finalNote;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getNoteOne() {
		return noteOne;
	}

	public void setNoteOne(Integer noteOne) {
		this.noteOne = noteOne;
	}

	public Integer getNoteTwo() {
		return noteTwo;
	}

	public void setNoteTwo(Integer noteTwo) {
		this.noteTwo = noteTwo;
	}

	public Integer getNoteThree() {
		return noteThree;
	}

	public void setNoteThree(Integer noteThree) {
		this.noteThree = noteThree;
	}

	public Integer getFinalNote() {
		return finalNote;
	}

	public void setFinalNote(Integer finalNote) {
		this.finalNote = finalNote;
	}

	@Override
	public String toString() {
		return "Notes [course=" + course + ", student=" + student + ", noteOne=" + noteOne + ", noteTwo=" + noteTwo + ", noteThree="
				+ noteThree + ", finalNote=" + finalNote + "]";
	}

	public int hashCode() {
		return (int) registrationNumber + idCourse;
	}

	public boolean equals(Object object) {
		if (object instanceof Notes) {
			Notes otherId = (Notes) object;
			return (otherId.idCourse == this.idCourse) && (otherId.registrationNumber == this.registrationNumber);
		}
		return false;
	}

}
