package Ejercicio3;

public class Doctor extends Person{
	private int cod;
	
	public Doctor(){}	
	public Doctor(int cod){
		this.cod = cod;
	}
	
	public void setCod(int cod){
		this.cod = cod;
	}
	public int getCod(){return cod;}
}
