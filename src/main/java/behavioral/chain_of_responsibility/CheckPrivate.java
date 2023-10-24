package behavioral.chain_of_responsibility;

public class CheckPrivate extends Middleware {

	private static final String TRUE_FLAG = "true";

	@Override
	public boolean handle(Request request) {
		String isPrivate = request.get("isPrivate");
		String login = request.get("login");

		if (TRUE_FLAG.equals(isPrivate) && !"admin".equals(login)) {
			return false;
		}

		return handleNext(request);
	}

}
