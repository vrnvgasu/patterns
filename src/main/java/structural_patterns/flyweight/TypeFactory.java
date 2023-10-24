package structural_patterns.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeFactory {

	private static final Map<AnimalType, AnimalType> types = new HashMap<>();

	public static AnimalType get(AnimalType item) {
		types.putIfAbsent(item, item);
		return types.get(item);
	}

	public static int getLength() {
		return types.size();
	}

	public static List<AnimalType> getAll() {
		return types.values().stream().toList();
	}

}
