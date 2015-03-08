package demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "shedule_time")
public class Shedule {

	@Id
	private String idSheduleTime;

	@Field(value = "start_time")
	private String startTime;

	@Field(value = "end_time")
	private String endTime;

	@Field(value = "day_name")
	private String dayName;

	public Shedule() {
		super();
	}

	public Shedule(String startTime, String endTime, String dayName) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.dayName = dayName;
	}

	public String getIdSheduleTime() {
		return idSheduleTime;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	@Override
	public String toString() {
		return "Shedule [idSheduleTime=" + idSheduleTime + ", startTime="
				+ startTime + ", endTime=" + endTime + ", dayName=" + dayName
				+ "]";
	}

}
