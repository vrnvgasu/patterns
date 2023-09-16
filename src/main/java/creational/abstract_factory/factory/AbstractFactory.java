package creational.abstract_factory.factory;

import creational.abstract_factory.Chair;
import creational.abstract_factory.Table;

public interface AbstractFactory {

	public Chair createChair();

	public Table createTable();

}
