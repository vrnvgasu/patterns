package structural_patterns.proxy;

import java.util.List;
import java.util.UUID;

public class Service {

	private final RepositoryInterface repository;

	public Service(RepositoryInterface repository) {
		this.repository = repository;
	}

	public List<UUID> getAll() {
		return repository.getAll();
	}

}
