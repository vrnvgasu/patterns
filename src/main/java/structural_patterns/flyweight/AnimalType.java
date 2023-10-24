package structural_patterns.flyweight;

import java.util.Objects;

public class AnimalType {

	private final String name;

	private final String voice;

	public AnimalType(String name, String voice) {
		this.name = name;
		this.voice = voice;
	}

	public String getName() {
		return name;
	}

	public String getVoice() {
		return voice;
	}

	@Override
	public String toString() {
		return "AnimalType{" +
				"name='" + name + '\'' +
				", voice='" + voice + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AnimalType that = (AnimalType) o;
		return name.equals(that.name) && voice.equals(that.voice);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, voice);
	}

}
