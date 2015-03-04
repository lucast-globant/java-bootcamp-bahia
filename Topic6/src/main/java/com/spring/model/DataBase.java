package com.spring.model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	
	private static List<Meeting> meetings = new ArrayList<Meeting>();
	private static DataBase instance = new DataBase();
	/*
	private  DataBase(){
		meetings = new List<Meeting>();
	}
	*/
	public static DataBase getInstance(){
		return instance;
	}
	
	public void createMeeting(Meeting meeting){
		meetings.add(meeting);
	}
	
	public void updateMeeting(Meeting meeting){
		meetings.set(meetings.indexOf(meeting), meeting);
	}
	
	public void removeMeeting(Long id) {
		meetings.remove(id);
	}

	public Meeting getMeeting(Long id) {
		Meeting m = null;
		for (int i=0; i <= meetings.size() ;i++ ) {
			if (id == meetings.get(i).getId()) {
				m= meetings.get(i);
			}
			else {
				m=null;
			}
		}
		return m;
	}

	
	public List<Meeting> getMeetings() {
		return meetings;
	}
	
}