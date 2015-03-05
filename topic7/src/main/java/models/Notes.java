package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "notes")
public class Notes {

	@Id
	@OneToMany
	@NotNull
	private Long studentId;

	@Id
	@OneToMany
	@NotNull
	private Long courseId;

	@NotNull
	private float partialNote1;

	@NotNull
	private float partialNote2;

	@NotNull
	private float partialNote3;

	@NotNull
	private float finalNote;

	public Notes(Long sid, Long cid) {
		this.studentId = sid;
		this.courseId = cid;
	}

	public Notes(Long studentId, Long courseId, float partialNote1, float partialNote2, float partialNote3, float finalNote) {
		super();
		this.studentId = studentId;
		this.courseId = courseId;
		this.partialNote1 = partialNote1;
		this.partialNote2 = partialNote2;
		this.partialNote3 = partialNote3;
		this.finalNote = finalNote;
	}

	public float getPartialNote1() {
		return partialNote1;
	}

	public void setPartialNote1(float partialNote1) {
		this.partialNote1 = partialNote1;
	}

	public float getPartialNote2() {
		return partialNote2;
	}

	public void setPartialNote2(float partialNote2) {
		this.partialNote2 = partialNote2;
	}

	public float getPartialNote3() {
		return partialNote3;
	}

	public void setPartialNote3(float partialNote3) {
		this.partialNote3 = partialNote3;
	}

	public float getFinalNote() {
		return finalNote;
	}

	public void setFinalNote(float finalNote) {
		this.finalNote = finalNote;
	}

	public Long getStudentId() {
		return studentId;
	}

	public Long getCourseId() {
		return courseId;
	}

}
