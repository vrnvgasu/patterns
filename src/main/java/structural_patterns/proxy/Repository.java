package structural_patterns.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Repository implements RepositoryInterface {

	public List<UUID> getAll() {
		List<UUID> result = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			result.add(UUID.randomUUID());
		}

		return result;
	}

}
