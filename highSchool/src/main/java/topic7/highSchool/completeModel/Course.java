package topic7.highSchool.completeModel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "COURSE")
public class Course {
	private static AtomicLong nextId = new AtomicLong(0);

	@Id
	@Column(name = "COURSE_ID", nullable = false)
	private long courseId;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "HOURS_BY_WEEK", nullable = false)
	private int hoursByWeek;

	@ManyToOne(optional = false)
	@JoinColumn(name = "ASSIGNED_TEACHER")
	private Teacher assignedTeacher;

	@OneToMany(mappedBy = "course")
	// cascade = CascadeType.ALL,
	private List<Note> students;

	@OneToMany(mappedBy = "course")
	private List<Schedule> schedules;

	protected Course() {
	}

	public Course(String name, int hoursByWeek, Teacher assignedTeacher) {
		courseId = nextId.incrementAndGet();
		this.setName(name);
		this.setHoursByWeek(hoursByWeek);
		this.setAssignedTeacher(assignedTeacher);
		students = new ArrayList<Note>();
		schedules = new ArrayList<Schedule>();
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

	public List<Note> getStudents() {
		return students;
	}

	public long getCourseId() {
		return courseId;
	}

	public void addStudent(Note note) {
		students.add(note);
	}
}
