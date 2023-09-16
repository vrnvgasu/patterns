package creational.factory_method.factory;

import creational.factory_method.Product;

public class SeaLogistic extends Logistic {

	@Override
	public Product getProduct() {
		return new ProductByBoat();
	}

}
