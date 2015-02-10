package ejercicio1;

/**
 * Builder Correspondiente a una casa del tipo "Mansion"
 * 
 * @author fcuenca
 *
 */
public class MansionBuilder implements HouseBuilder {

	private House casa;

	public MansionBuilder() {
		casa = new House();
	}

	@Override
	public void construirCasa() {
		casa.setDireccion("Dubai 456");

	}

	@Override
	public void construirTerreno() {
		casa.setMetrosCuadrados(3000);

	}

	@Override
	public void contruirHabitaciones() {
		Room r1 = new Room(4, "Cocina");
		Room r2 = new Room(2, "Dormitorio");
		Room r3 = new Room(4, "Dormitorio");
		Room r4 = new Room(2, "Dormitorio");
		Room r5 = new Room(4, "Dormitorio");
		Room r6 = new Room(2, "Dormitorio");
		Room r7 = new Room(4, "Dormitorio");
		Room r8 = new Room(2, "Dormitorio");
		Room r9 = new Room(4, "Dormitorio");
		Room r10 = new Room(4, "Lavadero");
		this.casa.addHabitacionIndividual(r1);
		this.casa.addHabitacionIndividual(r2);
		this.casa.addHabitacionIndividual(r3);
		this.casa.addHabitacionIndividual(r4);
		this.casa.addHabitacionIndividual(r5);
		this.casa.addHabitacionIndividual(r6);
		this.casa.addHabitacionIndividual(r7);
		this.casa.addHabitacionIndividual(r8);
		this.casa.addHabitacionIndividual(r9);
		this.casa.addHabitacionIndividual(r10);

	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return casa;
	}

}
