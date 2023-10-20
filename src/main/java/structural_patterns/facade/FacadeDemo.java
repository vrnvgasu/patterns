package structural_patterns.facade;

public class FacadeDemo {

	public static void main(String[] args) {
		FacadeView facadeView = new FacadeView();
		facadeView.getView("./js", ".css");
	}

}
