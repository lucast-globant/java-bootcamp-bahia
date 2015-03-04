package com.spring.model;

import java.text.SimpleDateFormat;

public class TimeSlot {
	
	private int id;
	private SimpleDateFormat time = new SimpleDateFormat("H:mm:ss");
	
	public TimeSlot (int _id, SimpleDateFormat _time) {
		this.id = _id;
		this.time = _time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SimpleDateFormat getTime() {
		return time;
	}

	public void setTime(SimpleDateFormat time) {
		this.time = time;
	}
	
	
	
}
