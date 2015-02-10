package ejercicio1;

/**
 * Builder Correspondiente a una casa del tipo "duplex"
 * 
 * @author fcuenca
 *
 */
public class DuplexBuilder implements HouseBuilder {

	private House casa;

	public DuplexBuilder() {
		casa = new House();
	}

	@Override
	public void construirCasa() {
		casa.setDireccion("Estados Unidos 11");

	}

	@Override
	public void construirTerreno() {
		casa.setMetrosCuadrados(211);

	}

	@Override
	public void contruirHabitaciones() {
		Room r1 = new Room(4, "Cocina");
		Room r2 = new Room(2, "Dormitorio");
		Room r3 = new Room(4, "Dormitorio");
		Room r4 = new Room(4, "Lavadero");
		this.casa.addHabitacionIndividual(r1);
		this.casa.addHabitacionIndividual(r2);
		this.casa.addHabitacionIndividual(r3);
		this.casa.addHabitacionIndividual(r4);

	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return casa;
	}

}
