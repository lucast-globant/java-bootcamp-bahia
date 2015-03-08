package topic7.highSchool.completeModel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "TEACHER")
public class Teacher {
	private static AtomicLong nextId = new AtomicLong(0);

	@Id
	@Column(name = "TEACHER_ID", nullable = false)
	private long teacherId;

	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "BIRTH_DATE")
	private Date birthDate;

	@OneToMany(mappedBy = "assignedTeacher", targetEntity = Course.class, fetch = FetchType.EAGER)
	private List<Course> assignedCourses;

	protected Teacher() {
	}

	public Teacher(String firstName, String lastName, Date birthDate) {
		teacherId = nextId.incrementAndGet();
		this.setLastName(lastName);
		this.setFirstName(firstName);
		this.setBirthDate(birthDate);
		assignedCourses = new ArrayList<Course>();
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

	public long getTeacherId() {
		return teacherId;
	}

	@Override
	public String toString() {
		return String
				.format("Teacher[id=%d, firstName='%s', lastName='%s', birthDate='%s']",
						teacherId, getFirstName(), getLastName(),
						new SimpleDateFormat("dd/MM/yyyy").format(birthDate));
	}

	public List<Course> getAssignedCourses() {
		return assignedCourses;
	}
}
