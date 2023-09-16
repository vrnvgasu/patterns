package creational.abstract_factory.factory;

import creational.abstract_factory.Chair;
import creational.abstract_factory.ClassicChair;
import creational.abstract_factory.ClassicTable;
import creational.abstract_factory.Table;

public class ClassicFactory implements AbstractFactory {

	public Chair createChair() {
		return new ClassicChair();
	}

	public Table createTable() {
		return new ClassicTable();
	}

}
