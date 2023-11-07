package behavioral.iterator;

public interface Collection<T> {

	Iterator<T> createIterator();

	long size();

	T get(int index);

}
