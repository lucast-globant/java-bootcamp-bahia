package topic0.excercise3;

public class MedicalOffice {
	
	private String name; 
	private int cod; 
	private boolean state;
	
	public MedicalOffice(String name, int cod, boolean state) {
		super();
		this.name = name;
		this.cod = cod;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "MedicalOffice [name=" + name + ", cod=" + cod + ", state="
				+ state + "]";
	} 
	
	

}
