package shoppingCart;

import java.util.List;

public class Store {
	// This class represents all the Products the store sells
	// To make the searching more efficient, the code of each product is the
	// same as its position in both lists: one of them (listOfProducts) stores
	// the Product itself, the other one (stockOfProducts) stores the quantity
	// of that Product

	private List<Item> stockOfProducts;

	public Store() {
		stockOfProducts = new SparseArrayList<>();
		// The first position -zero-, is not a valid one, so it keeps a null
		// value:
		stockOfProducts.add(null);
	}

	/*
	 * These methods are related to products
	 */
	// Adds a product to the catalog, in the position indicated by its code.
	// It doesn't add a product to the list if there's already a product in the
	// given position.
	public boolean addProduct(Product product, float quantity) {
		int position = product.getCode();
		if (position < stockOfProducts.size()) {
			if (stockOfProducts.get(position).equals(null)) {
				stockOfProducts.add(position, new Item(product, quantity));
				return true;
			} else {
				return false;
			}
		} else {
			stockOfProducts.add(position, new Item(product, quantity));
			return true;
		}
	}

	// If an object is deleted, its code is not reused, so this method replaces
	// the object in the position 'position' with null.
	public void deleteProduct(int position) {
		stockOfProducts.set(position, null);
	}

	/*
	 * These methods are related to the stock of each product
	 */
	public void setStock(int productCode, float quantity) {
		if (productCode <= stockOfProducts.size()) {
			Item stockAux = stockOfProducts.get(productCode);
			stockAux.setQuantity(quantity);
			stockOfProducts.add(productCode, stockAux);
		} else {
			// error
		}
	}

	public float getStock(int productCode) {
		if (productCode <= stockOfProducts.size()) {
			return stockOfProducts.get(productCode).getQuantity();
		} else {
			return (-1);
		}
	}

	public void incrementStock(int productCode, float quantity) {
		if (productCode <= stockOfProducts.size()) {
			Item stockAux = stockOfProducts.get(productCode);
			float oldStock = stockAux.getQuantity();
			stockAux.setQuantity(oldStock + quantity);
			stockOfProducts.add(productCode, stockAux);
		} else {
			// error
		}
	}

	public void decrementStock(int productCode, int quantity) {
		if (productCode <= stockOfProducts.size()) {
			Item stockAux = stockOfProducts.get(productCode);
			float oldStock = stockAux.getQuantity();
			if (oldStock <= quantity) {
				stockAux.setQuantity(oldStock - quantity);
				stockOfProducts.add(productCode, stockAux);
			} else {
				// error
			}
		} else {
			// error
		}
	}

	public Product getProduct(int productCode) {
		return stockOfProducts.get(productCode).getProduct();
	}

	public void createExampleProducts() {
		Product product = new Product("Coca Cola 1.5lt", 20.5f, true); // 1
		this.addProduct(product, 100);
		product = new Product("Ham", 150f, false); // 2
		this.addProduct(product, 100);
		product = new Product("Cheese", 90f, false); // 3
		this.addProduct(product, 100);
		product = new Product("Orange", 8f, false); // 4
		this.addProduct(product, 100);
		product = new Product("Yerba Amanda 1Kg", 38f, true); // 5
		this.addProduct(product, 100);
		product = new Product("Salt Celusal 500gr", 12.3f, true); // 6
		this.addProduct(product, 100);
		product = new Product("Chips Pringles", 24.5f, true); // 7
		this.addProduct(product, 100);
		product = new Product("Jam BC Strawberry", 22f, true); // 8
		this.addProduct(product, 100);
		product = new Product("Rice 500gr", 18.6f, true); // 9
		this.addProduct(product, 100);
		product = new Product("Beer Heineken 1lt", 26.4f, true); // 10
		this.addProduct(product, 100);
		product = new Product("Canned tuna 320gr", 32.4f, true); // 11
		this.addProduct(product, 100);
		product = new Product("Hamburger x4", 55f, true); // 12
		this.addProduct(product, 100);
	}
}
