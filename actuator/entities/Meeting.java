package topic6.actuator.entities;

public class Meeting {
	private static int uniqueMeetingID = 1;
	private int idMeeting;
	private String name;
	private Room room;
	private Atendee atendee;

	public Meeting(String name, Room room, Atendee atendee) {
		this.idMeeting = newIdMeeting();
		this.name = name;
		this.room = room;
	}

	private int newIdMeeting() {
		return uniqueMeetingID++;
	}

	public int getMeetingID() {
		return idMeeting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

    public String toString(){
        return "idMeeting: "+idMeeting+"Room: "+room+"\n";
    }

	public Atendee getAtendee() {
		return atendee;
	}

	public void setAtendee(Atendee atendee) {
		this.atendee = atendee;
	}

}
