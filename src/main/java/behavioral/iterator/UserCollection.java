package behavioral.iterator;

import java.util.List;

public class UserCollection implements Collection<User> {



	private final List<User> users;

	public UserCollection(List<User> users) {
		this.users = users;
	}

	@Override
	public Iterator<User> createIterator() {
		return new UserIterator(this);
	}

	@Override
	public long size() {
		return users.size();
	}

	@Override
	public User get(int index) {
		return users.get(index);
	}

}
