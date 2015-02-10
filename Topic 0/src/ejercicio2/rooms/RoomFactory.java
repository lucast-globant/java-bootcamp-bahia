package ejercicio2.rooms;

public class RoomFactory {

	public Room factory(String type) {

		switch (type) {
		case "therapy":
			return new IntensiveCare();
		case "basic":
			return new Basic();
		case "surgery":
			return new Surgery();

		}
		return null;
	}
}
