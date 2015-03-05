package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "schedule")
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long scheduleId;

	@NotNull
	String day;

	@NotNull
	String hourStart;

	@NotNull
	String hourEnd;

	public Schedule(Long id) {
		scheduleId = id;
	}

	public Schedule(Long scheduleId, String day, String hourStart, String hourEnd) {
		super();
		this.scheduleId = scheduleId;
		this.day = day;
		this.hourStart = hourStart;
		this.hourEnd = hourEnd;
	}

	public Long getScheduleId() {
		return scheduleId;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getHourStart() {
		return hourStart;
	}

	public void setHourStart(String hourStart) {
		this.hourStart = hourStart;
	}

	public String getHourEnd() {
		return hourEnd;
	}

	public void setHourEnd(String hourEnd) {
		this.hourEnd = hourEnd;
	}

}
