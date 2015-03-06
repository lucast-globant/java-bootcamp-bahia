package topic_7.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue
	@Column(name = "id_course", nullable = false)
	private Integer idCourse;
	@Column(name = "name", nullable = false)
	private String name;
	@ManyToOne
	private Teacher assignedTeacher;
	@Column(name = "hours_by_week", nullable = false)
	private Integer hoursByWeek;
	@ManyToOne
	private Schedule scheduleTime;

	@OneToMany(mappedBy = "course")
	private List<Notes> notes;

	public Course() {
	}

	public Course(String name, Teacher assignedTeacher, Integer hoursByWeek, Schedule scheduleTime) {
		this.name = name;
		this.assignedTeacher = assignedTeacher;
		this.hoursByWeek = hoursByWeek;
		this.scheduleTime = scheduleTime;
	}

	public Integer getIdCourse() {
		return idCourse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getAssignedTeacher() {
		return assignedTeacher;
	}

	public void setAssignedTeacher(Teacher assignedTeacher) {
		this.assignedTeacher = assignedTeacher;
	}

	public Integer getHoursByWeek() {
		return hoursByWeek;
	}

	public void setHoursByWeek(Integer hoursByWeek) {
		this.hoursByWeek = hoursByWeek;
	}

	public Schedule getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduleTime(Schedule scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public List<Notes> getNotes() {
		return notes;
	}

	public void setNotes(List<Notes> notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Course [idCourse=" + idCourse + ", name=" + name + ", assignedTeacher=" + assignedTeacher + ", hoursByWeek=" + hoursByWeek
				+ ", scheduleTime=" + scheduleTime + "]";
	}

}
