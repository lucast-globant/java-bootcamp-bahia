package meetingPack;

import java.util.Date;

public class Attendee {

	private final int iD;
	private final String name;
	private final Date date;
	
	public Attendee(int iD, String name, Date date){
		this.date =date;
		this.iD=iD;
		this.name=name;
	}
	
	public int getID(){
		return iD;
	}
	
	public String getName(){
		return name;
	}
	
	public Date getDate(){
		return date;
	}
}
