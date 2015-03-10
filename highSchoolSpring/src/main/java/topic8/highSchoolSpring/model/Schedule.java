package topic8.highSchoolSpring.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Schedule {
	private static SimpleDateFormat HHmmss = new SimpleDateFormat("HH:mm:ss");
	private String day;
	private String fromHour;
	private String toHour;

	protected Schedule() {

	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Date getFromHour() {
		try {
			return HHmmss.parse(fromHour);
		} catch (ParseException e) {
			return null;
		}
	}

	public void setFromHour(Date fromHour) {
		this.fromHour = HHmmss.format(fromHour);
	}

	public void setFromHour(String fromHour) {
		this.fromHour = fromHour;
	}

	public Date getToHour() {
		try {
			return HHmmss.parse(toHour);
		} catch (ParseException e) {
			return null;
		}
	}

	public void setToHour(Date toHour) {
		this.toHour = HHmmss.format(toHour);
	}

	public void setToHour(String toHour) {
		this.toHour = toHour;
	}
}
