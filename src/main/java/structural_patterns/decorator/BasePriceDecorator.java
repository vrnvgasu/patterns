package structural_patterns.decorator;

public abstract class BasePriceDecorator implements Price {

	protected final Price wrapper;

	protected BasePriceDecorator(Price wrapper) {
		this.wrapper = wrapper;
	}

}
