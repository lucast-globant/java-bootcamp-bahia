package mongodb;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Course {

	@Id
    private String iD;
	
	private String name;
	private int hoursWeek;
	private int scheduleTime;
	private String dateOfAssignment;
	private boolean finished;	
    private String assignedTeacher;
	
	protected Course() {}

    public Course(String iD, String name, String teacher, int hours, int sT, String date) {
        this.iD=iD;
    	this.name = name;
        this.assignedTeacher = teacher;
        this.hoursWeek=hours;
        this.scheduleTime=sT;
        this.dateOfAssignment=date;
        this.finished=false;
    }
    
   private List<StudentCourse> studentsC;  

    @Override
    public String toString() {
        return String.format(
                "Course[id='%s', name='%s', teacher='%s', hoursWeek='%d', scheduleTime='%d', dateOfAssignment='%s']",
                iD, name, assignedTeacher,hoursWeek,scheduleTime,dateOfAssignment);
    }
	
    public void setAllStudent(List<StudentCourse> students){
    	this.studentsC=students;    	
    }
    
    public List<StudentCourse> getAllStudentes(){    	
    	return studentsC;
    }
    
    
    public void setFinished(boolean state){
    	finished=state;
    }
    
    public boolean getFinished(){
    	return finished;
    }
    
    public String getID(){
		return iD;
	}
	
	public void setID(String iD){
		this.iD=iD;
	}
    
    public String getName(){
    	return name;
    }
    
    public void setName(String name){
    	this.name=name;
    }
    
    public int getHoursWeek(){
    	return hoursWeek;
    }
    
    public void setHoursWeek(int hoursWeek){
    	this.hoursWeek=hoursWeek;
    }
    
    public int getScheduleTime(){
    	return scheduleTime;
    }
    
    public void setScheduleTime(int scheduleTime){
    	this.scheduleTime=scheduleTime;
    }
    
    public String getDateOfAssigment(){
    	return dateOfAssignment;
    }
    
    public void setDateOfAssigment(String dateOfAssignment){
    	this.dateOfAssignment=dateOfAssignment;
    }
}
