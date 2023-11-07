package behavioral.iterator;

import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection<User> collection = new UserCollection(List.of(
				new User("test1", 1),
				new User("test2", 2),
				new User("test3", 3)
		));
		Iterator<User> iterator = collection.createIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.getNext().getLogin());
		}

	}

}
