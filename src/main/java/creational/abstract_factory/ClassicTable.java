package creational.abstract_factory;

public class ClassicTable implements Table {

	@Override
	public void eat() {
		System.out.println("eat on " + this.getClass().getSimpleName());
	}

}
