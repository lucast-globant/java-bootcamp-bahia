package topic_8.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "schedules")
public class Schedule {
	@Id
	private ObjectId id;
	private Integer idSchedule;
	private String day;
	private String initHour;
	private String finishHour;

	public Schedule() {
	}

	public Schedule(Integer idSchedule, String day, String initHour, String finishHour) {
		this.idSchedule = idSchedule;
		this.day = day;
		this.initHour = initHour;
		this.finishHour = finishHour;
	}

	public Integer getIdSchedule() {
		return idSchedule;
	}

	public void setIdSchedule(Integer idSchedule) {
		this.idSchedule = idSchedule;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getInitHour() {
		return initHour;
	}

	public void setInitHour(String initHour) {
		this.initHour = initHour;
	}

	public String getFinishHour() {
		return finishHour;
	}

	public void setFinishHour(String finishHour) {
		this.finishHour = finishHour;
	}

	@Override
	public String toString() {
		return "Schedule [idSchedule=" + idSchedule + ", day=" + day + ", initHour=" + initHour + ", finishHour=" + finishHour + "]";
	}

}
