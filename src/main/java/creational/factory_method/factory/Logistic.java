package creational.factory_method.factory;

import creational.factory_method.Product;

public abstract class Logistic {

	public void sendProduct(Product product) {
		System.out.println("send: " + product.getClass().getSimpleName());
	}

	public abstract Product getProduct();

}
