package creational.abstract_factory;

public class ClassicChair implements Chair {

	@Override
	public void seat() {
		System.out.println("seat on " + this.getClass().getSimpleName());
	}

}
