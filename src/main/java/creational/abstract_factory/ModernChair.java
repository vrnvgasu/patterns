package creational.abstract_factory;

public class ModernChair implements Chair {

	@Override
	public void seat() {
		System.out.println("seat on " + this.getClass().getSimpleName());
	}

}
