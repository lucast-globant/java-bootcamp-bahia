package Topic1.key1;


public class ConcreteProduct extends Product{
	
	public ConcreteProduct(String name, String description, String category, String price) {
			super();
			this.name = name;
			this.description = description;
			this.category = category;
			setPrice(price);
		
	}
	
	public ConcreteProduct() {
		
	}

	
}
