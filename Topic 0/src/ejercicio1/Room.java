package ejercicio1;

/**
 * Clase que modela una habitación con sus respectivas características
 * 
 * @author fcuenca
 *
 */
public class Room {
	private int muebles;
	private String tipo;

	public Room(int muebles, String tipo) {
		this.muebles = muebles;
		this.tipo = tipo;
	}

	public int getMuebles() {
		return muebles;
	}

	public void setMuebles(int muebles) {
		this.muebles = muebles;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Room [muebles=" + muebles + ", tipo=" + tipo + "]";
	}

}
