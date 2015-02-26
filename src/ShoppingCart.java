import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
	
	//DECLARATION
    private List<Item> itemsList;
    private List<Offer> offersList;
    private PaymentStrategy payment;
    private ItemsStore itemsStore;

    
    //PROCEDURES
    public ShoppingCart(ItemsStore itemsStore, MailList mailList){
        itemsList=new ArrayList<Item>();
        offersList=new ArrayList<Offer>();
        this.itemsStore=itemsStore;
    }


    public void addItem(Item item){
        itemsList.add(item);
    }

    public void removeItem(Item item){
        itemsList.remove(item);
    }
    
    public void addOffer(Offer o){
    	offersList.add(o);
    }
    
    public void removeOffer(Offer o){
    	offersList.remove(o);
    }

    //It's shows all the items that user has in his cart shopping
    public void showItems(){
    	System.out.println("Name.... $Price");
    	if(!itemsList.isEmpty())
    	for(Item item : itemsList){
	    	System.out.println(item.getName() + ".... $" + item.getPrice());
	    }
    	if(!offersList.isEmpty())
	    	for(Offer item : offersList){
		    	System.out.println(item.getName() + ".... $" + item.getPrice());
		    }
    }
    
    //It's calculates the total considering the discount of the pay way
    public double total(){    	
    	
        double sum = 0;
                
        if("Paypal".equals(payment.getType())){
        	//It's sum all the costs less the cheapest cost
        	for(Item item : itemsList){
        		if (!itemsStore.cheapest(item))        			
        			sum += item.getPrice();
    	    }
        }else{
        	 if("Cash".equals(payment.getType())){
        		//It's sum all the costs less the most expensive cost
        		 for(Item item : itemsList){
        			 
             		if (itemsStore.mostExpensive(item)){        			
             			sum += 0.1*item.getPrice();
             		}
             		else
             			sum += item.getPrice();
             		
         	    }
        	 }else{
        		//It's sums all the costs
        	    for(Item item : itemsList){
        	    	sum += item.getPrice();
        	    }
        	    //Credit card discount
        	    sum=sum*0.9;

        	 }
        }        
        
        return sum;
    } 

    //It's calculates the total and call pay method
    public void buy(PaymentStrategy paymentMethod, int counter, MailList mailList){
    	double amount;
    	
    	payment=paymentMethod;
    	amount = total();        
    	paymentMethod.pay(amount, counter, mailList);
        
        
    }

}