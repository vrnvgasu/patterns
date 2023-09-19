package structural_patterns.composite;

import java.util.Optional;

public class File implements Component {

	private final String name;

	public File(String name) {
		this.name = name;
	}

	@Override
	public Optional<Component> searchBy(String name) {
		return this.name.equals(name) ? Optional.of(this) : Optional.empty();
	}

}
