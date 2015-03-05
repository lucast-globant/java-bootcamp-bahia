package demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_shedule_time;

	@Column(name = "start_time")
	private int start_time;

	@Column(name = "end_time")
	private int end_time;

	@Column(name = "day_name")
	private String day_name;

	public Shedule(int start_time, int end_time, String day_name) {
		super();
		this.start_time = start_time;
		this.end_time = end_time;
		this.day_name = day_name;
	}

	public Shedule() {
		super();
	}

	public long getId_shedule_time() {
		return id_shedule_time;
	}

	public int getStart_time() {
		return start_time;
	}

	public void setStart_time(int start_time) {
		this.start_time = start_time;
	}

	public int getEnd_time() {
		return end_time;
	}

	public void setEnd_time(int end_time) {
		this.end_time = end_time;
	}

	public String getDay_name() {
		return day_name;
	}

	public void setDay_name(String day_name) {
		this.day_name = day_name;
	}

	@Override
	public String toString() {
		return "Shedule [id_shedule_time=" + id_shedule_time + ", start_time="
				+ start_time + ", end_time=" + end_time + ", day_name="
				+ day_name + "]";
	}

}
