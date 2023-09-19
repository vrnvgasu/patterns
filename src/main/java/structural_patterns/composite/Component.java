package structural_patterns.composite;

import java.util.Optional;

public interface Component {

	Optional<Component> searchBy(String name);

}
