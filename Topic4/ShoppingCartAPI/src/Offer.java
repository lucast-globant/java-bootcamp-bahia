import java.util.List;


public class Offer {

	//DEFENITIONS OF VARIABLES
	//I decided don't use polymorphism and use two list to represent an offer
	private List<Item> itemsList;
	private List<Offer> offerList;
	private double price;
	private String name;
	
	//PROCEDURES
	public Offer(List<Item> items, List<Offer> offers, double price, String name){
		itemsList=items;
		offerList=offers;
		this.price=price;
		this.name=name;
	}
	
	public Offer(){
		itemsList=null;
		offerList=null;
		price=0;
		name="";
	}
	
	public void setItems(List<Item> items){
		itemsList=items;
	}
	
	public void setOffer(List<Offer> offers){
		offerList=offers;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public List<Item> getItems(){
		return itemsList;
	}

	public List<Offer> getOffers(){
		return offerList;
	}
	
	public String getName(){
		return name;
	}
	
	//Show all the offers
	public void show(){
		
		System.out.println(name + "... $" + price);
		
		if(itemsList!=null)
			for(Item item : itemsList){
		    	System.out.println("> "+item.getName()+"... $"+item.getPrice());	    		
		    }
		
		if(offerList!=null)
			for(Offer ofer : offerList){
		    	System.out.println("> "+ofer.getName()+"... $"+ofer.getPrice());
		    }
	}
	
}