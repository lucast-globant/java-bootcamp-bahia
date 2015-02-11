
public class Builder {
	private String lastName;
	private	String name;
	private	int dni;
	private String email;
	
	public Builder(){
		this.lastName = "";
		this.name = "";
		this.dni = 0;
		this.email = "";
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setDni(int dni){
		this.dni = dni;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getLastName(){return this.lastName;}
	public String getName(){return this.name;}
	public int getDni(){return this.dni;}
	public String getEmail(){return this.email;}
}
