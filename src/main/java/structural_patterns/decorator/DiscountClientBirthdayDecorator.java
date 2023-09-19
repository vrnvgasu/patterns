package structural_patterns.decorator;

public class DiscountClientBirthdayDecorator extends BasePriceDecorator {

	private static final int DISCOUNT = 10;

	protected DiscountClientBirthdayDecorator(Price wrapper) {
		super(wrapper);
	}

	@Override
	public double getPrice() {
		return this.wrapper.getPrice() * (1 - DISCOUNT / 100.);
	}

}
