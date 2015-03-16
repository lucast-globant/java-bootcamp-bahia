package topic_8.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notes")
public class Notes {
	@Id
	private ObjectId id;
	private Course course;
	private Student student;
	private Integer noteOne;
	private Integer noteTwo;
	private Integer noteThree;
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
		return "Notes [noteOne=" + noteOne + ", noteTwo=" + noteTwo + ", noteThree=" + noteThree + "]";
	}

}
