
package orm;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Course {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
	String name;
	int hoursWeek;
	int scheduleTime;
	String dateOfAssignment;
	
	@OneToOne
    private Teacher assigneTeacher;
	
	protected Course() {}

    public Course(String name, Teacher teacher, int hours, int sT, String date) {
        this.name = name;
        this.assigneTeacher = teacher;
        this.hoursWeek=hours;
        this.scheduleTime=sT;
        this.dateOfAssignment=date;
        
    }
    
    
    @ManyToMany
    private List<Student> students;  

    @Override
    public String toString() {
        return String.format(
                "Course[id=%d, name='%s', teacher='%s', hoursWeek='%d', scheduleTime='%d', dateOfAssignment='%s']",
                id, name, assigneTeacher,hoursWeek,scheduleTime,dateOfAssignment);
    }
	
    public void addStudents(List<Student> students){
    	this.students=students;
    }
    
    public List<Student> getAllStudentes(){
    	return students;
    }
}
