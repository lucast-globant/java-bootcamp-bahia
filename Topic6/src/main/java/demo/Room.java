package demo;

import java.util.Date;

public class Room {
	
	private final String id;
    private final int capacity;
   
    public Room (String roomId,int capacity){
    	this.id=roomId;
    	this.capacity=capacity;
    }
    
    public String getId(){
    	return id;
    }
    
    public int getCapacity(){
    	return capacity;
    }
    
   
}
