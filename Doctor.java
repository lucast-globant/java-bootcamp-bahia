package topic0.excercise3;

import topic0.excercise2.Person;

public class Doctor extends Person {
	
	private int cod;
	private boolean state; 

	public Doctor(int cod, boolean state, String name, String lastName, String dateBird, String email,
			long mobile) {
		super(name, lastName, dateBird, email, mobile);
		this.setCod(cod);
		this.setState(state);
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
		return "Doctor [cod=" + cod + ", state=" + state + "]";
	}
	
}
