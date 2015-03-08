package topic7.highSchool.completeModel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "STUDENT")
public class Student {
	private static AtomicLong nextId = new AtomicLong(0);

	@Id
	@Column(name = "STUDENT_ID", nullable = false)
	private long studentId;

	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "BIRTH_DATE")
	private Date birthDate;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
	private List<Note> courses;

	protected Student() {
	}

	public Student(String firstName, String lastName, Date birthDate) {
		studentId = nextId.incrementAndGet();
		this.setLastName(lastName);
		this.setFirstName(firstName);
		this.setBirthDate(birthDate);
		courses = new ArrayList<Note>();
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public void addCourse(Course course, int year, int note1, int note2,
			int note3, int finalNote) {
		Note note = new Note();
		note.setCourse(course);
		note.setStudent(this);
		note.setCourseId(course.getCourseId());
		note.setStudentId(this.getStudentId());
		note.setYear(year);
		note.setNote1(note1);
		note.setNote2(note2);
		note.setNote3(note3);
		note.setFinalNote(finalNote);

		this.courses.add(note);
		course.addStudent(note);
	}

	@Override
	public String toString() {
		return String
				.format("Student[id=%d, firstName='%s', lastName='%s', birthDate='%s']",
						studentId, getFirstName(), getLastName(),
						new SimpleDateFormat("dd/MM/yyyy").format(birthDate));
	}

	public List<Note> getCourses() {
		return courses;
	}

	public long getStudentId() {
		return studentId;
	}

}
