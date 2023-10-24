package structural_patterns.flyweight;

import java.util.Random;

public class DemoFlyweight {

	public static void main(String[] args) {
		String[] names = {"курочка", "котик", "собачка", "ослик", "гусь"};
		String[] voices = {"ко-ко-ко", "мяу", "гав-гав", "иа", "га-га-га"};
		Farm mutantFarm = new Farm();
		Random random = new Random();

		for (int i = 0; i < 1000000; i++) {
			String name = names[random.nextInt(names.length)];
			String voice = voices[random.nextInt(voices.length)];
			mutantFarm.addAnimal(name, voice);
		}

		mutantFarm.makeBuzz();
		System.out.println("Animal types created: " + TypeFactory.getLength());
		System.out.println(TypeFactory.getAll());
	}

}
