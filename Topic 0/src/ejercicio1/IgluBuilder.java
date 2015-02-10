package ejercicio1;

/**
 * Builder Correspondiente a una casa del tipo "Iglú"
 * 
 * @author fcuenca
 *
 */
public class IgluBuilder implements HouseBuilder {

	private House casa;

	public IgluBuilder() {
		casa = new House();
	}

	@Override
	public void construirCasa() {
		casa.setDireccion("Alaska 666");

	}

	@Override
	public void construirTerreno() {
		casa.setMetrosCuadrados(50);

	}

	@Override
	public void contruirHabitaciones() {
		Room r1 = new Room(0, "Piso");
		this.casa.addHabitacionIndividual(r1);

	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return casa;
	}

}
