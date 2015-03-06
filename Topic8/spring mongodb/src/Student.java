package mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
	
	@Id
    private String registrationNumber;
	
	private String firstName;
	private String lastName;
	private String dateOfBirth;

	protected Student() {}
	
	public Student(String id, String firstName, String lastName, String date) {
        this.registrationNumber=id;
		this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth=date;
    }
	@Override
    public String toString() {
        return String.format(
                "Student[id=%s, firstName='%s', lastName='%s', dateOfBirth='%s']",
                registrationNumber, firstName, lastName,dateOfBirth);
    }
	public String getID(){
		return registrationNumber;
	}
	
	public void setID(String iD){
		registrationNumber=iD;
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
