package structural_patterns.facade;

import java.nio.file.Path;

public class FacadeView {

	public void getView(String jsDir, String cssDir) {
		JSBuilder jsBuilder = new JSBuilder(Path.of(jsDir));
		CSSBuilder cssBuilder = new CSSBuilder(Path.of(cssDir));
		HTMLTemplate htmlTemplate = new HTMLTemplate();
		htmlTemplate.render(jsBuilder, cssBuilder);
	}

}
