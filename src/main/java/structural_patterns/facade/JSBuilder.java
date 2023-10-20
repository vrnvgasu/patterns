package structural_patterns.facade;

import java.nio.file.Path;

public class JSBuilder {

	private final Path path;

	public JSBuilder(Path path) {
		this.path = path;
	}

	public void build() {
		System.out.println("Собираем js");
	}

}
