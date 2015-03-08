package topic7.highSchool.manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name = "COURSE")
public class Course {
	@Id
	@Column(name = "COURSE_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseId;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "HOURS_BY_WEEK", nullable = false)
	private int hoursByWeek;

	@ManyToOne(optional = false)
	@JoinColumn(name = "ASSIGNED_TEACHER")
	private Teacher assignedTeacher;

	@ManyToMany(mappedBy = "courses")
	private List<Student> students;

	protected Course() {
	}

	public Course(String name, int hoursByWeek, Teacher assignedTeacher) {
		this.setName(name);
		this.setHoursByWeek(hoursByWeek);
		this.setAssignedTeacher(assignedTeacher);
		students = new ArrayList<Student>();
	}

	@Override
	public String toString() {
		return String
				.format("Course[id=%d, name='%s', hoursByWeek='%d', assignedTeacher='%s']",
						courseId, getName(), getHoursByWeek(),
						getAssignedTeacher().toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHoursByWeek() {
		return hoursByWeek;
	}

	public void setHoursByWeek(int hoursByWeek) {
		this.hoursByWeek = hoursByWeek;
	}

	public Teacher getAssignedTeacher() {
		return assignedTeacher;
	}

	public void setAssignedTeacher(Teacher assignedTeacher) {
		this.assignedTeacher = assignedTeacher;
	}

	public List<Student> getStudents() {
		return students;
	}
}
