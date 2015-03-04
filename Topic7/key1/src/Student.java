package orm;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long registrationNumber;
	
	String firstName;
	String lastName;
	String dateOfBirth;

	protected Student() {}
	
	public Student(String firstName, String lastName, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth=date;
    }
	
	 @ManyToMany(mappedBy="students")
	 private List<Course> courses; 
	
	@Override
    public String toString() {
        return String.format(
                "Student[id=%d, firstName='%s', lastName='%s', dateOfBirth='%s']",
                registrationNumber, firstName, lastName,dateOfBirth);
    }
	public List<Course> getAllCourses(){
    	return courses;
    }
	
	public void addCourses(List<Course> courses){
    	this.courses=courses;
    }
}
