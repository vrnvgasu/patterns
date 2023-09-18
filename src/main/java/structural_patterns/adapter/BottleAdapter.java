package structural_patterns.adapter;

public class BottleAdapter implements Liter {

	private static final double GALLON_TO_LITER = 4.55D;

	private final AmericanBottle americanBottle;

	public BottleAdapter(AmericanBottle americanBottle) {
		this.americanBottle = americanBottle;
	}


	@Override
	public double getLitres() {
		return (int) this.americanBottle.getGallons() * GALLON_TO_LITER * 1000 / 1000.;
	}

}
