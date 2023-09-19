package structural_patterns.bridge;

public class Windows implements Computer {

	private Printer printer;

	@Override
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void print() {
		printer.printText("Print page from " + this.getClass().getSimpleName());
	}

}
