
import java.util.Date;

public class Notification {

	//VARIABLES DEFINITION
	private String author;
	private Date date;
	private String body;
	
	//PROCEDURES
	public Notification(String author, Date date, String body){
		this.author=author;
		this.date=date;
		this.body=body;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public Date getDate(){
		return date;
	}
	
	public String getbody(){
		return body;
	}
	
	public void show(){
		System.out.println(author);
		System.out.println(date);
		System.out.println(body);
		
	}
}
