package models;

@Document(collection = "schedule")
public class Schedule {

	@Id
	private Long scheduleId;

	String day;

	String hourStart;

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
