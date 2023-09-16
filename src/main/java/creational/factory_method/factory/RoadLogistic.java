package creational.factory_method.factory;

import creational.factory_method.Product;
import creational.factory_method.ProductByCar;

public class RoadLogistic extends Logistic {

	@Override
	public Product getProduct() {
		return new ProductByCar();
	}

}
