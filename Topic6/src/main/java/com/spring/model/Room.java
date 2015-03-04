package com.spring.model;

public class Room {
	private int number;
	private String desc;
	
	public Room (int _number, String _desc) {
		this.number = _number;
		this.desc = _desc;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
