package creational.abstract_factory.factory;

import creational.abstract_factory.Chair;
import creational.abstract_factory.ModernChair;
import creational.abstract_factory.ModernTable;
import creational.abstract_factory.Table;

public class ModernFactory implements AbstractFactory {

	public Chair createChair() {
		return new ModernChair();
	}

	public Table createTable() {
		return new ModernTable();
	}

}
