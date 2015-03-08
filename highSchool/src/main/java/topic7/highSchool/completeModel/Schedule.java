package topic7.highSchool.completeModel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "SCHEDULE")
public class Schedule {
	@Id
	@Column(name = "SCHEDULE_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long scheduleId;
	
	@ManyToOne
	private Course course;

	@Column(name = "SCHEDULE_DAY", nullable = false)
	DaysOfWeek scheduleDay;

	@Column(name = "SCHEDULE_FROM", nullable = false)
	Date scheduleFrom;

	@Column(name = "SCHEDULE_TO", nullable = false)
	Date scheduleTo;
}
