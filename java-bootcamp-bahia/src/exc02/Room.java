package exc02;

/* Room Class */

public class Room {

	private int size; // size in square meters of the room.
	private boolean haveWindow; // if the room have any window.
	private String material; // kind of material of the room.

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isHaveWindow() {
		return haveWindow;
	}

	public void setHaveWindow(boolean haveWindow) {
		this.haveWindow = haveWindow;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String toString() {
		String resu = new String();

		resu += " Size " + size + " Have any windows ? " + haveWindow + " Material " + material;

		return resu;
	}
}
