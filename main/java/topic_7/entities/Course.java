package topic_7.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Integer idCourse;
	@Column(name = "name", nullable = false)
	private String name;
	@ManyToOne
	private Teacher assignedTeacher;
	@Column(name = "hours", nullable = false)
	private Integer hoursByWeek;


	@OneToMany(mappedBy = "course")
	private List<Notes> notes;

	public Course() {
	}

	public Course(String name, Teacher assignedTeacher, Integer hoursByWeek) {
		this.name = name;
		this.assignedTeacher = assignedTeacher;
		this.hoursByWeek = hoursByWeek;
	
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


	public List<Notes> getNotes() {
		return notes;
	}

	public void setNotes(List<Notes> notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Course [idCourse=" + idCourse + ", name=" + name + ", assignedTeacher=" + assignedTeacher + ", hoursByWeek=" + hoursByWeek+ "]";
	}

}
