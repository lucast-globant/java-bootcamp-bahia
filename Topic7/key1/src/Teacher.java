package orm;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Teacher {
	@Id
	private long iD;
	
	String firstName;
	String lastName;
	String dateOfBirth;
	
	protected Teacher() {}
	
	public Teacher(long iD, String firstName, String lastName, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth=date;
        this.iD=iD;
    }
	
	@Override
    public String toString() {
        return String.format(
                "Teacher[id=%d, firstName='%s', lastName='%s', dateOfBirth='%s']",
                iD, firstName, lastName,dateOfBirth);
    }
}
