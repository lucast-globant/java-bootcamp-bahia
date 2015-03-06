package mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Teacher {
	@Id
	private String iD;
	
	String firstName;
	String lastName;
	String dateOfBirth;
	
	protected Teacher() {}
	
	public Teacher(String iD, String firstName, String lastName, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth=date;
        this.iD=iD;
    }
	
	@Override
    public String toString() {
        return String.format(
                "Teacher[id='%s', firstName='%s', lastName='%s', dateOfBirth='%s']",
                iD, firstName, lastName,dateOfBirth);
    }
	
	public String getID(){
		return iD;
	}
	
	public void setID(String iD){
		this.iD=iD;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	
	public String getDateOfBirth(){
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth=dateOfBirth;
	}
}
