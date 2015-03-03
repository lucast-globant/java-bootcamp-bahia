package meetingPack;

import java.util.Date;

public class Room {
	
	private final String roomID;
    private final int capacity;
    private final int doors;
    private final int windows;
    
    public Room (String roomID,int capacity,int doors,int windows){
    	this.roomID=roomID;
    	this.capacity=capacity;
    	this.doors=doors;
    	this.windows=windows;
    }
    
    public String getRoomID(){
    	return roomID;
    }
    
    public int getCapacity(){
    	return capacity;
    }
    
    public int getDoors(){
    	return doors;
    }
    
    public int getWindows(){
    	return windows;
    }
}
