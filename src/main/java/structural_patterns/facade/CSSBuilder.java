package structural_patterns.facade;

import java.nio.file.Path;

public class CSSBuilder {

	private final Path path;

	public CSSBuilder(Path path) {
		this.path = path;
	}

	public void build() {
		System.out.println("Собираем css");
	}

}
