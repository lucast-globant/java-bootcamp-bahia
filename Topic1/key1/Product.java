package Topic1.key1;

import java.math.BigDecimal;
import java.math.RoundingMode;



public abstract class Product {
	protected String name;
	protected String description;
	
	protected String category;
	protected BigDecimal price; 
	



	public Product() {
	
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getPrice() {
		return price.setScale(2, RoundingMode.UP);
	}

	public void setPrice(String price) {
		this.price = new BigDecimal(""+price).setScale(2, RoundingMode.UP);
	}


	/**
	 * generate a string with the details of the product
	 * @return
	 */
	public String listMe() {
		return getName()+"..."+getPrice()+"$\n";
	}
	
		
	
}
