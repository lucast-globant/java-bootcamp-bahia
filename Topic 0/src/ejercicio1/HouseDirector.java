package ejercicio1;

/**
 * Director del patr�n
 * 
 * @author fcuenca
 *
 */
public class HouseDirector {
	private HouseBuilder houseBuilder = null;

	public HouseDirector(HouseBuilder houseBuilder) {

		this.houseBuilder = houseBuilder;
	}

	public void ConstructHouse() {
		houseBuilder.construirCasa();
		houseBuilder.construirTerreno();
		houseBuilder.contruirHabitaciones();
	}

	public House getHouse() {
		return houseBuilder.getHouse();
	}
}
