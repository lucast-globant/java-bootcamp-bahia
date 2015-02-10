package key3;

import java.awt.List;

/**
 * @author Jordan
 * a sector contains a variety of rooms and each sector has a name
 */
public class Sector {
	protected String name;
	
	/**
	 * each room have a number equal to the Room index in the rooms array 
	 */
	protected Room[] rooms;
		
	public Sector(String sectorName, int numberOfRooms){
		name=sectorName;
		rooms=new Room[numberOfRooms];
		
		//populate with rooms
		for(int i=0; i<numberOfRooms; i++)
			rooms[i]=new Room(2);
		
	}
	
		
	/**
	 * calculated atribute for determine the total of beds in a sector
	 * @return
	 */
	public int getTotalBeds(){
		int total=0;
		for (Room room : rooms) {
			total+=( room.getBeds() );
		}
		return total;
	}
	
	/**
	 * register a new patient
	 * @return if can register a new patient in this sector
	 */
	public boolean registerGuest(){
		boolean found=false;
		for (Room room : rooms) {
			if( room.addPatient() ){
				found=true;
				break;
			}
			
		}
		return found;
	}
	
}
