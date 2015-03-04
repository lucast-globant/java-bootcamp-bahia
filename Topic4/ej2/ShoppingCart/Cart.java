package ShoppingCart;
//Shopping Cart
import java.util.ArrayList;
import java.util.List;

public class Cart implements IntCart {

	//List of items/products
	List<Item> items;
	//transaction id
	public static int idT = 1;
	int idTransaction;


	public Cart(){
		this.items=new ArrayList<Item>();
	}

	@Override
	public void addItem(Item item){
		this.items.add(item);
	}

	@Override
	public void removeItem(int i){
		this.items.remove(i);
	}
	
	@Override
	public Item getItem(int i) {
		return this.items.get(i);
	}
	
	@Override
	public void printItems(){
		for(int i=0; i<items.size(); i++)
		{
			System.out.println("-Item: "+items.get(i).getName()+" -Precio: "+items.get(i).getPrice());
		}
	}
	
	@Override
	public List<Item> getItemsList() {
		return this.items;
	}
	
	@Override
	public float calculateTotal(){
		int sum = 0;
		for(Item item : items){
			sum += item.getPrice();
		}
		return sum;
	}

	@Override
	public void pay(PaymentMethod paymentMethod){
		float amount = calculateTotal();
		List<Item> _items = this.items;
		idTransaction = Cart.idT++;
		paymentMethod.pay(amount, _items, idTransaction);
	}

	@Override
	public float getOfferPrice() {
		return this.getOfferPrice();
	}
}