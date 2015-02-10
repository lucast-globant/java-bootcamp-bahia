package ejercicio2.rooms;

import java.util.ArrayList;

public abstract class HospitalRoom implements Room {
	private ArrayList<String> patients;
	private int capacity;
	private int price;
	private int number;

	public String toString() {
		return "Room n° " + number + " Price: $" + price;

	}

	public ArrayList<String> patients() {
		return patients;

	}

	public int getCantBeds() {
		return capacity;

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public ArrayList<String> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<String> patients) {
		this.patients = patients;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
