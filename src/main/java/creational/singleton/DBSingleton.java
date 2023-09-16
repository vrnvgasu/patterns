package creational.singleton;

public class DBSingleton {

	private static volatile DBSingleton instance;

	private final String url;

	private final String user;

	private final String password;

	private DBSingleton(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;

		System.out.println("get connection to:" + url + " by:" + user + "/" + password);
	}

	public static DBSingleton getInstance(String url, String user, String password) {
		DBSingleton result = instance;
		if (result != null) {
			return result;
		}

		synchronized (DBSingleton.class) {
			if (instance == null) {
				instance = new DBSingleton(url, user, password);
			}
			return instance;
		}
	}

}
