package creational.prototype;

import java.util.Optional;

public class DemoPrototype {

	public static void main(String[] args) {
		PaymentDocument template = new PaymentDocument();
		template.setTo("grandson");
		template.setFrom("grandfather");
		template.setCount(100);

		Cache cache = new Cache();
		cache.put("внучку", template);

		Optional<Prototype> copy1 = cache.get("внучку");
		Optional<Prototype> copy2 = cache.get("внучку");
		System.out.println("copy1 != copy2: " + (copy1==copy2));
		System.out.println("copy1.equals(copy2): " + (copy1.equals(copy2)));
	}

}
