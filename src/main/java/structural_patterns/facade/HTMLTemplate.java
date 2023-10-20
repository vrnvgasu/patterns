package structural_patterns.facade;

public class HTMLTemplate {

	public void render(JSBuilder jsBuilder, CSSBuilder cssBuilder) {
		jsBuilder.build();
		cssBuilder.build();
		System.out.println("Front is rendered");
	}

}
