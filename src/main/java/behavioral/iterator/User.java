package behavioral.iterator;

public class User {

	private final String login;

	private final Integer id;

	public User(String login, Integer id) {
		this.login = login;
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public Integer getId() {
		return id;
	}

}
