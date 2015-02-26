/*Interface to represent a general payment*/

public interface Payment {

	void pay(float total);

	Discount getDiscount();

}
