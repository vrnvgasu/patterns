package behavioral.chain_of_responsibility;

import java.util.HashMap;

public class Request {

	private final HashMap<String, String> params = new HashMap<>();

	public String get(String key) {
		return params.get(key);
	}

	public void add(String key, String value) {
		params.put(key, value);
	}

}
