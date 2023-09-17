package creational.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Cache {

	private final Map<String, Prototype> map = new HashMap<>();

	public void put(String key, Prototype prototype) {
		map.put(key, prototype);
	}

	public Optional<Prototype> get(String key) {
		Prototype prototype = map.get(key);

		if (prototype == null) {
			return Optional.empty();
		}

		return Optional.of(prototype.clone());
	}

}
