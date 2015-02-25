	/**
	 * This API provides tools to implement a shopping cart. The Shopping cart items could be Items or offers and it let you pay by credit card, paypal or cash.
	 * @author: Rocca Martín Andrés
	 * @version: 25/02/2015/A
	 *
	 */
public interface Service {  

	/**
     * Add an item passed by parameter
     * @param item Item to be added
     */
	public void addItem(Item item);
	
	
	/**
     * Remove an item passed by parameter
     * @param item Item to be removed
     */
	public void removeItem(Item item);
	
	
	/**
     * Return an item which position is passed by parameter
     * @param index Position of the item to be returned
     * @return Item in index position
     */
	public Item getItem(int index);
	
	
	/**
     * Add an offer passed by parameter
     * @param o Offer to be added
     */
	public void addOffer(Offer o);
	
	
	/**
     * Remove an item passed by parameter
     * @param o Offer to be removed
     */
	public void removeOffer(Offer o);
	
	
	/**
     * Show all the items in the shopping cart
     */
	public void showItems();
	
	
	/**
     * Pay the items added in the shopping cart
     * @param paymentMethod Method the client pay
     * @param counter Transaction counter
     * @return the amount of the payment
     */
	public double buy(PaymentStrategy paymentMethod, int counter);
    
}