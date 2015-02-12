/* Represents a general Item , it could be a product or an offer */

public interface Item {

	public int getPrice();

	public String getName();

	public void setName(String name);

	public String getCode();

	public void setCode(String code);

	public void setPrice(int price);

	public String toString();

}
