package structural_patterns.decorator;

public class Product implements Price {

	private final double price;

	public Product(double price) {
		this.price = price;
	}

	@Override
	public double getPrice() {
		return 10;
	}

}
