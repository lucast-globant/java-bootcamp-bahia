public class ServiceAProxy implements Service {
    Service implementation;

    protected ServiceAProxy(Service imp) {
        this.implementation = imp;
    }

    public void addItem(Item item) {
        implementation.addItem(item);
    }

    public void removeItem(Item item) {
        implementation.removeItem(item);
    }
    
    public Item getItem(int index) {
        return implementation.getItem(index);
    }
    
    public void addOffer(Offer o){
    	implementation.addOffer(o);
    }
    
    public void removeOffer(Offer o){
    	implementation.removeOffer(o);
    }
	
	public void showItems(){
		implementation.showItems();
	}
		
	public double buy(PaymentStrategy paymentMethod, int counter){
		return implementation.buy(paymentMethod,counter);
	}
}