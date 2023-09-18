package structural_patterns.adapter;

public class AdapterDemo {

	public static void main(String[] args) {
		Bottle bottle = new Bottle(10);
		AmericanBottle americanBottle = new AmericanBottle(10);
		BottleAdapter bottleAdapter = new BottleAdapter(americanBottle);

		System.out.println("bottle value: " + bottle.getLitres());
		System.out.println("bottleAdapter value: " + bottleAdapter.getLitres());

	}

}
