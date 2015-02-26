package ShoppingCart;
//Shopping Cart
import java.util.ArrayList;
import java.util.List;

public class Cart {

	//List of items/products
	List<Item> items;
	//transaction id
	public static int idT = 1;
	int idTransaction;


	public Cart(){
		this.items=new ArrayList<Item>();
	}

	public void addItem(Item item){
		this.items.add(item);
	}

	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	public void showItems(){
		for(int i=0; i<items.size(); i++)
		{
			System.out.println("-Item: "+items.get(i).getName()+" -Precio: "+items.get(i).getPrice());
		}
	}
	
	public float calculateTotal(){
		int sum = 0;
		for(Item item : items){
			sum += item.getPrice();
		}
		return sum;
	}

	public void pay(PaymentMethod paymentMethod){
		float amount = calculateTotal();
		List<Item> _items = this.items;
		idTransaction = Cart.idT++;
		paymentMethod.pay(amount, _items, idTransaction);
	}
}