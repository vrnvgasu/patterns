package structural_patterns.adapter;

public class Bottle implements Liter {

	private final double litres;

	public Bottle(double litres) {
		this.litres = litres;
	}

	public double getLitres() {
		return litres;
	}

}
