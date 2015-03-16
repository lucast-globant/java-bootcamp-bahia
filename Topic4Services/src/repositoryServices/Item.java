package repositoryServices;


public interface Item {

	public float getPrice();

	public String getName();

	public void setName(String name);

	public int getCode();

	public void setCode(int code);

	public void setPrice(float price);

	public String toString();

}
