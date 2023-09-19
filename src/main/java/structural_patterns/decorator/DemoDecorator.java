package structural_patterns.decorator;

public class DemoDecorator {

	public static void main(String[] args) {
		Product product = new Product(10);
		DiscountNewClientDecorator discountNewClientDecorator = new DiscountNewClientDecorator(product);
		DiscountClientBirthdayDecorator discountClientBirthdayDecorator = new DiscountClientBirthdayDecorator(
				discountNewClientDecorator);
		DiscountNYDecorator finalProduct = new DiscountNYDecorator(discountClientBirthdayDecorator);

		System.out.println("Цена со скидками: " + (((int) (finalProduct.getPrice() * 100) / 100.)));
	}

}
