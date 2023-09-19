package structural_patterns.bridge;

public class Hp implements Printer {

	@Override
	public void printText(String text) {
		System.out.println(text);
	}

}
