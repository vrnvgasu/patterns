package structural_patterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Farm {

	private final List<Animal> animals = new ArrayList<>();

	public void addAnimal(String name, String voice) {
		AnimalType animalType = TypeFactory.get(new AnimalType(name, voice));
		Animal animal = new Animal(UUID.randomUUID(), animalType);
		animals.add(animal);
	}

	public void makeBuzz() {
		animals.forEach(Animal::makeBuzz);
	}

}
