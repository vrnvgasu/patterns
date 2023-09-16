package creational.factory_method;

import creational.factory_method.factory.Logistic;
import creational.factory_method.factory.RoadLogistic;
import creational.factory_method.factory.SeaLogistic;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		Logistic logistic;

		if (Arrays.stream(args).collect(Collectors.toSet()).contains("sea")) {
			logistic = new SeaLogistic();
		} else {
			logistic = new RoadLogistic();
		}

		Product product = logistic.getProduct();
		logistic.sendProduct(product);
	}

}
