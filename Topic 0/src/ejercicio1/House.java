package ejercicio1;

import java.util.ArrayList;

/**
 * Corresponde a un Objeto del tipo House ( Casa) con todas sus respectivas
 * características (atributos de clase)
 * 
 * @author fcuenca
 *
 */
public class House {

	private ArrayList<Room> habitaciones;
	private double metrosCuadrados;
	private double precio;
	private String direccion;

	public House() {
		habitaciones = new ArrayList<Room>();
	}

	public ArrayList<Room> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Room> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String toString() {
		String ret;
		ret = "Esta casa, esta ubicada  en: " + direccion + "\n";
		ret += "Posee exactamente: " + metrosCuadrados + " metros cuadrados\n";
		ret += "Está tasada en un precio de: " + precio + "\n";
		ret += "y tiene: " + habitaciones.size() + " habitaciones, las cuales son: \n" + this.printHabitaciones();
		return ret;
	}

	// setea una habitacion individual
	public void addHabitacionIndividual(Room r) {
		this.habitaciones.add(r);

	}

	private String printHabitaciones() {
		String ret = "";
		int counter = 1;
		for (Room room : habitaciones) {
			ret += counter + ") " + room.getTipo() + "\n";
			counter++;
		}
		return ret;

	}
}
