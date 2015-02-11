package Ejercicio3;

public class Hospital {
	private	String name;
	private int numberRooms;
	private int numberPatients;
	
	public Hospital() {
	}
	public Hospital(String name, int numberRooms, int numberPatients){
		this.name = name;
		this.numberRooms = numberRooms;
		this.numberPatients = numberPatients;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setNumberRooms(int numberRooms){
		this.numberRooms = numberRooms;
	}
	public void setNumberPatients(int numberPatients){
		this.numberPatients = numberPatients;
	}
	
	public String getName(){return name;}
	public int getNumberRooms(){return numberRooms;}
	public int getNumberPatients(){return numberPatients;}
}
