package ShoppingCart;

import Manager.ItemObserver;
import Manager.ItemSubject;
import Manager.ObserversList;

//Item/product
public class Item extends Product {

	private String upcCode;
	private String name;
	private float price;

	public Item(String upc,String _name, float cost){
		this.upcCode=upc;
		this.name= _name;
		this.price=cost;
		
		doNotify("A new item was created: " + getName() + "Price: "+ getPrice());
		
	}

	public void setPrice(float _price) {
		this.price = _price;
		doNotify("A item's price was updated: [" + name + ". New price: "+ price + "]");
		}
	
	public String getUpcCode() {
		return upcCode;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public void addItemObserver(ItemObserver itemObserver) {
		ObserversList.getItemObservers().add(itemObserver);
	}

	@Override
	public void removeItemObserver(ItemObserver itemObserver) {
		ObserversList.getItemObservers().remove(itemObserver);
	}

	@Override
	public void doNotify(String message) {
		for (ItemObserver articleObserver : ObserversList.getItemObservers()) 
		{
			if (articleObserver != null)
			{
				articleObserver.getNotify(message);
			}
		}
		
	}

}