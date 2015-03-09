package demo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person{
	

	@Id
	private ObjectId id;
	
	protected int dni;

	protected String firstname;


	protected String lastname;
	

	protected String birthday;
	
	public Person(){super();}

	
	public Person(ObjectId id, int dni, String firstname, String lastname,
			String birthday) {
		super();
		this.id = id;
		this.dni = dni;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
	}

	

	public ObjectId getId() {
		return id;
	}


	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastName) {
		this.lastname = lastName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		return String.format(
		"Person[id=%s firstname='%s']", id, firstname);
	}

	
	

}
