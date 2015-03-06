package topic_7.model;

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
@Table(name = "notes")
@IdClass(value = Notes.class)
public class Notes implements Serializable {
	@Id
	@Column(name = "registration_number")
	private Integer registrationNumber;
	@Id
	@Column(name = "id_course")
	private Integer idCourse;

	@ManyToOne
	@JoinColumn(name = "id_course", updatable = false, insertable = false)
	private Course course;
	@ManyToOne
	@JoinColumn(name = "registration_number", updatable = false, insertable = false)
	private Student student;
	
	@Column(name = "note_one")
	private Integer noteOne;
	@Column(name = "note_two")
	private Integer noteTwo;
	@Column(name = "note_three")
	private Integer noteThree;
	@Column(name = "final_note")
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
