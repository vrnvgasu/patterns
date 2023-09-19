package structural_patterns.decorator;

public class DiscountNYDecorator extends BasePriceDecorator {

	private static final int DISCOUNT = 20;

	protected DiscountNYDecorator(Price wrapper) {
		super(wrapper);
	}

	@Override
	public double getPrice() {
		return this.wrapper.getPrice() * (1 - DISCOUNT / 100.);
	}

}
