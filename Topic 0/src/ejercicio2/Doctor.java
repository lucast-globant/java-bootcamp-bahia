package ejercicio2;

public class Doctor {
	private String name;

	@Override
	public String toString() {
		return "Doctor name: " + name + ", mat:" + mat;
	}

	private int mat;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

}
