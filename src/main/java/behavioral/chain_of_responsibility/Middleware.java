package behavioral.chain_of_responsibility;

public abstract class Middleware {

	private Middleware next;

	public static Middleware link(Middleware first, Middleware... chain) {
		Middleware head = first;

		for (Middleware next : chain) {
			head.next = next;
			head = next;
		}

		return first;
	}

	public abstract boolean handle(Request request);

	public boolean handleNext(Request request) {
		if (next == null) {
			return true;
		}

		return next.handle(request);
	}

}
