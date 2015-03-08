package topic7.highSchool.completeModel;

import java.io.Serializable;

public class NoteId implements Serializable {

	private static final long serialVersionUID = 1L;

	private long studentId;
	private long courseId;
	private int year;

	public int hashCode() {
		return (int) (studentId + courseId + year);
	}

	public boolean equals(Object object) {
		if (object instanceof NoteId) {
			NoteId otherId = (NoteId) object;
			return (otherId.studentId == this.studentId)
					&& (otherId.courseId == this.courseId)
					&& (otherId.year == this.year);
		}
		return false;
	}

}
