package Model;

import java.math.BigDecimal;
import java.util.List;

import API.CartService;
import API.UserService;
import Model.paymentMethods.FinancialPayment;


public class Transaction {

	private int Id;
	private List<Item> items;
	private BigDecimal total;

	public Transaction(FinancialPayment method, CustomerService customer) {
		init(method, customer);
	}

	private void init(FinancialPayment method, CustomerService customer){
		CartService cart=customer.getCart();
		items=cart.getItems();
		total=new BigDecimal("0.00");

		for (Item i : items) {
			total=total.add(i.getProduct().getPrice()).multiply(
					new BigDecimal(""+i.getQuantity()) );
		}
		System.out.println("total: "+total+ " $");

		BigDecimal finalTotal=	method.getDiscount().applyDiscount(items, total);
		System.out.println("finaltotal (con descuentos): "+finalTotal+ " $");
		if(method.getBalance().compareTo(finalTotal)==1){//if has to pay the total
			
			method.setBalance(method.getBalance().subtract(finalTotal).toString());
			System.out.println("new balance: "+method.getBalance()+" $");
			
			//update internal transaction counter
			Counter.getCounterInstance().next();
			Id=Counter.getCount();
		
		}else
			System.out.println("you dont have "+finalTotal+ " $");
	
		
	}
	
	
	
	public int getId() {
		return Id;
	}

	public List<Item> getProducts() {
		return items;
	}

	public BigDecimal getTotal() {
		return total;
	}
		
	

	
	
	

}
