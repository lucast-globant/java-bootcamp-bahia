import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;


public class ItemsStore {
	
	private List<Item> store;
	private int index;
	private MailList mailList;
	private Calendar calendar;
	
	public ItemsStore(MailList mailList){
		store= new ArrayList<Item>();
		index=0;
		this.mailList=mailList;
		calendar = Calendar.getInstance();
	}
	
	public void addItem(Item I){
		store.add(I);
		
		mailList.addNotification(new Notification("Admin",calendar.getTime(),I.getName()+" has been created"));
	}
	
	public void deletItem(Item I){
		store.remove(I);
	}
	
	public Item getFirstItem(){
		index=0;
		return store.get(0);
	}
	
	public Item getNextItem(){
		index++;
		return store.get(index);
		
		
	}
	
	public Item getIndexItem(int index){
		
		return store.get(index);		
		
	}
	
	public int getSize(){
		return store.size();
	}
	
	public void showItems(){
		
		System.out.println("Name.... $Price");
		
		for(Item item : store){
			
			System.out.println(item.getName() + ".... $" + item.getPrice());
	    }
		
	}
	
	//Return true if itemB is the cheapest item in the store, and false in other case
	public boolean cheapest(Item itemB){
		double minPrice=Double.MAX_VALUE;
		Item minItem=null;
		
		for(Item itemA : store){
	    	if(itemA.getPrice()<minPrice){
	    		minPrice=itemA.getPrice();
	    		minItem=itemA;
	    	}
	    		
	    }
		
		return (itemB==minItem);
	}
	
	//Return true if itemB is the most expensive item in the store, and false in other case
	public boolean mostExpensive(Item itemB){
		double maxPrice=0;
		Item maxItem=null;
		
		for(Item itemA : store){
	    	if(itemA.getPrice()>maxPrice){
	    		maxPrice=itemA.getPrice();
	    		maxItem=itemA;
	    	}
	    		
	    }
		return (itemB==maxItem);
	}
	
}
