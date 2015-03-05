package topic_7.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
public class Schedule {
	@Id
	@GeneratedValue
	@Column(name = "id_schedule", nullable = false)
	private Integer idSchedule;
	@Column(name = "day", nullable = false)
	private String day; 
	@Column(name = "init_hour", nullable = false)
	private String initHour;
	@Column(name = "finish_hour", nullable = false)
	private String finishHour;
	
	public Schedule(){}
	
	public Schedule(String day, String initHour, String finishHour) {
		this.day = day;
		this.initHour = initHour;
		this.finishHour = finishHour;
	}

	public Integer getIdSchedule() {
		return idSchedule;
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
