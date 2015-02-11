package Ejercicio3;

public class Patient extends Person{
	private int id;
		
	public Patient(){}	
	public Patient(int id){
		this.id = id;
	}
		
	public void setId(int id){
		this.id = id;
	}
	public int getId(){return id;}
	}