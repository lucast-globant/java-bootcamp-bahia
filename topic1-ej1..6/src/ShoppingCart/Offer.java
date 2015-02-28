package ShoppingCart;

import java.util.ArrayList;
import java.util.List;

import Manager.ItemObserver;
import Manager.ObserversList;

public class Offer extends Product {
	int id;
	private String offerName;
	List<Item> items;
	float percent; //Expresed in decimal //example 0.5 for 50%

	public Offer(int _id,String _offerName, float _percent){
		this.id = _id;
		this.offerName = _offerName;
		this.items=new ArrayList<Item>();
		this.percent= _percent;
		doNotify("A new offer was created: \n" + getName());
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	@Override
	public String getName() {
		return offerName;
	}
	
	@Override
	public void doNotify(String message) {
		for (ItemObserver itemObserver : ObserversList.getItemObservers()) 
		{
			if (itemObserver != null)
			{
				itemObserver.getNotify(message);
			}
		}
	}

	public void showOffer() {
		String offerName = this.offerName;
		float offerPrice = 0;
		for(int i=0; i<this.items.size(); i++)
		{
			offerPrice += this.items.get(i).getPrice();
		}
		// 
		float total = offerPrice;
		offerPrice = (float) (offerPrice - (offerPrice*this.percent));
		System.out.println("*Oferta: "+offerName +"  Precio: "+ offerPrice);
		for(int i=0; i<this.items.size(); i++)
		{
			System.out.println("  ·Item: "+this.items.get(i).getName()+" Precio: "+this.items.get(i).getPrice());
		}
		System.out.println("Normal price without discount: "+ (total));
	}

	@Override
	public void addItemObserver(ItemObserver itemObserver) {
		ObserversList.getItemObservers().add(itemObserver);
		
	}

	@Override
	public void removeItemObserver(ItemObserver itemObserver) {
		ObserversList.getItemObservers().remove(itemObserver);
		
	}

	public void setDiscountPercentage(float discountPercentage) {
		this.percent = discountPercentage;
		doNotify("An offer's discount percentage was updated: [" + offerName +". New percentage: " + discountPercentage + "]");
	}
	
	@Override
	public float getPrice() {
		double ancillaryPrice = 0;
		// we add the price of the different articles that compound the offer
		for (Item item : items) 
		{
			ancillaryPrice += item.getPrice();
		}
		// we apply a discount on the amount we've got above
		return (float) (ancillaryPrice - ancillaryPrice * this.percent);
	}
}
