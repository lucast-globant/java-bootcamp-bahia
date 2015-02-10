package topic_0_3;

public class Doctor {
	private String nombre;
	private int dni;
	private int matricule;
	
	public Doctor(String nombre, int dni, int matricule) {
		this.nombre = nombre;
		this.dni = dni;
		this.matricule = matricule;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
}
