package structural_patterns.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RepositoryCache implements RepositoryInterface {

	private static final int CACHE_PERIOD = 1000;

	private List<UUID> getAllCached = new ArrayList<>();
	private long expireTime;
	private final Repository repository;

	public RepositoryCache() {
		this.repository = new Repository();
	}

	@Override
	public List<UUID> getAll() {
		if (System.currentTimeMillis() < expireTime) {
			return getAllCached;
		}

		getAllCached = repository.getAll();
		expireTime = System.currentTimeMillis() + CACHE_PERIOD;
		return getAllCached;
	}

}
