import java.util.List;
import java.util.ArrayList;

public class ServiceImp implements Service{

	//DECLARATION
	private List<Item> itemsList;
	private List<Offer> offersList;
	private PaymentStrategy payment;
	private ItemsStore itemsStore;
	
	protected ServiceImp(ItemsStore itemsStore){
		itemsList=new ArrayList<Item>();
		offersList=new ArrayList<Offer>();
		this.itemsStore=itemsStore;
	}
  

    @Override 
    public void addItem(Item item){
        itemsList.add(item);
    }
    
    @Override
    public void removeItem(Item item){
        itemsList.remove(item);
    }
    
    @Override
    public Item getItem(int index){
    	return itemsList.get(index);
    }
    
    @Override
    public void addOffer(Offer o){
    	offersList.add(o);
    }
    
    @Override
    public void removeOffer(Offer o){
    	offersList.remove(o);
    }

    //It's shows all the items that user has in his cart shopping
    @Override
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
    @Override
    public double buy(PaymentStrategy paymentMethod, int counter){
    	double amount;
    	
    	payment=paymentMethod;
    	amount = total();        
    	paymentMethod.pay(amount, counter);
        return amount;
        
    }
}