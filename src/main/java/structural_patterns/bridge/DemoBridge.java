package structural_patterns.bridge;

public class DemoBridge {

	public static void main(String[] args) {
		Hp printer = new Hp();
		Windows windows = new Windows();
		Mac mac = new Mac();

		windows.setPrinter(printer);
		windows.print();

		mac.setPrinter(printer);
		mac.print();
	}

}
