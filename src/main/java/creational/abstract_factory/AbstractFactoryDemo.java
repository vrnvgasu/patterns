package creational.abstract_factory;

import creational.abstract_factory.factory.AbstractFactory;
import creational.abstract_factory.factory.ClassicFactory;
import creational.abstract_factory.factory.ModernFactory;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AbstractFactory factory;

		if (Arrays.stream(args).collect(Collectors.toSet()).contains("modern")) {
			factory = new ModernFactory();
		} else {
			factory = new ClassicFactory();
		}

		Chair chair = factory.createChair();
		Table table = factory.createTable();

		chair.seat();
		table.eat();
	}

}
