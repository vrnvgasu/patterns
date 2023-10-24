package behavioral.chain_of_responsibility;

public class CheckCredentials extends Middleware {

	@Override
	public boolean handle(Request request) {
		String login = request.get("login");
		String password = request.get("password");

		if (login == null || password == null) {
			return false;
		}

		return handleNext(request);
	}

}
