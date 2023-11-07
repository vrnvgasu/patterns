package behavioral.iterator;

public class UserIterator implements Iterator<User> {

	private int index;
	private final UserCollection collection;

	public UserIterator(UserCollection collection) {
		this.collection = collection;
	}

	@Override
	public boolean hasNext() {
		return index < collection.size();
	}

	@Override
	public User getNext() {
		if (index > (collection.size() - 1)) {
			return null;
		}

		User user = collection.get(index);
		index++;

		return user;
	}

}
