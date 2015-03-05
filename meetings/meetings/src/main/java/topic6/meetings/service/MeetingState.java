package topic6.meetings.service;

public enum MeetingState {
	PENDING ("Pending"), CANCELED ("Canceled"), RESOLVED ("Resolved");
	
	private final String name;       

	private MeetingState(String s) {
        name = s;
    }
	
    public String toString(){
    	return name;
    }
}
