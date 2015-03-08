package topic7.highSchool.manyToMany;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity(name = "STUDENT")
public class Student {
	@Id
	@Column(name = "STUDENT_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long studentId;

	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "BIRTH_DATE")
	private Date birthDate;

	@ManyToMany
	@JoinTable(name = "STUDENT_COURSE", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "COURSE_ID") })
	private List<Course> courses;

	protected Student() {
	}

	public Student(String firstName, String lastName, Date birthDate) {
		this.setLastName(lastName);
		this.setFirstName(firstName);
		this.setBirthDate(birthDate);
		courses = new ArrayList<Course>();
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

	public void addCourse(Course course) {
		courses.add(course);
	}

	@Override
	public String toString() {
		return String
				.format("Student[id=%d, firstName='%s', lastName='%s', birthDate='%s']",
						studentId, getFirstName(), getLastName(),
						new SimpleDateFormat("dd/MM/yyyy").format(birthDate));
	}

	public List<Course> getCourses() {
		return courses;
	}

}
