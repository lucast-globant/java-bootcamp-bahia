package ejercicio1;

/**
 * 
 * Representa una interfaz para un builder de una casa
 * 
 * @author fcuenca
 */
public interface HouseBuilder {

	public void construirCasa();

	public void construirTerreno();

	public void contruirHabitaciones();

	public House getHouse();

}
