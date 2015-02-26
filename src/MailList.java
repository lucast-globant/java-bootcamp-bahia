import java.util.ArrayList;
import java.util.List;


public class MailList {
	
	//VARIABLES DEFINITION
	private List<Notification> mailList;
	
	//PROCEDURES
	public MailList(){
		mailList=new ArrayList<Notification>();
	}
	
	public void addNotification (Notification N){
		mailList.add(N);
	}
	
	public void removeNotification (Notification N){
		mailList.remove(N);
	}
	
	public Notification getNotification(int index){
		return mailList.get(index);
	}
	
	public int numberOfNotifications(){
		return mailList.size();
	}
	
	public void showNotification(){
		for (Notification N : mailList){
			System.out.println("");
			N.show();
		}
	}
	
}