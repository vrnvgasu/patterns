package behavioral.chain_of_responsibility;

public class DemoChainOfResponsibility {

	public static void main(String[] args) {
		Middleware chain = Middleware.link(
				new CheckCredentials(),
				new CheckPrivate()
		);

		success(chain);
		failed(chain);
	}

	private static void success(Middleware chain) {
		Request request = new Request();
		request.add("login", "test");
		request.add("password", "1234");

		check(chain, request);
	}

	private static void failed(Middleware chain) {
		Request request = new Request();
		request.add("login", "test");
		request.add("password", "1234");
		request.add("isPrivate", "true");

		check(chain, request);
	}

	public static void check(Middleware chain, Request request) {
		if (chain.handle(request)) {
			System.out.println("Все проверки пройдены");
		} else {
			System.out.println("ДОСТУП ЗАПРЕЩЕН!!!");
		}
	}

}
