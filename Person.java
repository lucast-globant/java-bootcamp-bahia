package Ejercicio3;

public class Person {
	private String name;
	private	String lastName;
	private String email;
	
	public Person(){
	}
	public Person(String name, String lastName, String email){
		this.name = name;
		this.lastName = lastName;
		this.email = email;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getName(){return name;}
	public String getLastName(){return lastName;}
	public String getEmail(){return email;}
}
