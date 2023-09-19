package structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Folder implements Component {

	private final String name;

	private final List<Component> children = new ArrayList<>();

	public Folder(String name) {
		this.name = name;
	}

	public void addChild(Component component) {
		children.add(component);
	}

	@Override
	public Optional<Component> searchBy(String name) {
		for (Component child : children) {
			Optional<Component> result = child.searchBy(name);

			if (result.isPresent()) {
				return result;
			}
		}

		return Optional.empty();
	}

}
