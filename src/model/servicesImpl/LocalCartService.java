package model.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import model.Cart;
import model.ConcreteProduct;
import model.DataConnection;
import model.EcommerceService;
import model.User;
import model.Item;
import model.Product;
import model.Transaction;
import model.mailingList.EmailSender;
import model.paymentMethods.FinancialPayment;
import api.CartService;

public class LocalCartService implements CartService {

	private List<Cart> cartsRepo;
	private List<Transaction> transactionsRepo;

	
	public LocalCartService() {
		cartsRepo = new ArrayList<Cart>();
		transactionsRepo = new ArrayList<Transaction>();

	}

	@Override
	public void createCart(Cart cart) {
		cartsRepo.add(cart);		
		
	}

	@Override
	public void addItem(String userName, Product product, int quantity) {
		int index = getPositionOfUserCart(userName);
		Cart mycart;
		if(index>-1){
			mycart = cartsRepo.get(index);
			mycart.add(product,quantity);
			cartsRepo.set(index, mycart);
		}
	}


	@Override
	public void removeItem(String userName, Item prod) {
		int index = getPositionOfUserCart(userName);
		Cart cart = cartsRepo.get(index);
		cart.removeItem(prod);
		cartsRepo.set(index, cart);
		
	}

	@Override
	public Cart getCart(String username) {
		
		int index = getPositionOfUserCart(username);
		if (index >= 0) {
			return cartsRepo.get(index);
		} else {
			return null;
		}
	}

	@Override
	public void cleanCart(String username) {
		int index = getPositionOfUserCart(username);
		Cart mycart=cartsRepo.get(index);
		mycart.cleanCart();	
		
	}

	@Override
	public Transaction checkout(FinancialPayment method, String username) {
		int index = getPositionOfUserCart(username);
		Cart mycart=cartsRepo.get(index);
		Transaction t=mycart.checkout(method);
		mycart.cleanCart();
		EmailSender.getInstance().notifyToList("TRANSACTION_DONE"+"("+t.getId()+")");
		return t;
	}

	@Override
	public int transactionsDone() {
		return transactionsRepo.size();
	}

	private int getPositionOfUserCart(String userName) {
		int i = 0;
		
		while (i < cartsRepo.size()) {
			if(cartsRepo.get(i).getOwnerAccount().getUserName().equals(userName)){
				return i;
			}
			i++;
		}
		return -1;
		
	}


	
}
