package structural_patterns.flyweight;

import java.util.UUID;

public class Animal {

	private final UUID uuid;
	private final AnimalType type;

	public Animal(UUID uuid, AnimalType type) {
		this.uuid = uuid;
		this.type = type;
	}

	public void makeBuzz() {
		System.out.println(type.getName() + "(" + uuid + ") say: \"" + type.getVoice() + "\"");
	}

}
