package structural_patterns.decorator;

public class DiscountNewClientDecorator extends BasePriceDecorator {

	private static final int DISCOUNT = 5;

	protected DiscountNewClientDecorator(Price wrapper) {
		super(wrapper);
	}

	@Override
	public double getPrice() {
		return this.wrapper.getPrice() * (1 - DISCOUNT / 100.);
	}

}
