package creational.singleton;

public class Demo {

	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> DBSingleton.getInstance("url1", "user1", "pass1"));
		Thread thread2 = new Thread(() -> DBSingleton.getInstance("url2", "user2", "pass2"));

		thread1.start();
		// второй поток не создаст новый объект подключения, а вернет первый
		thread2.start();
	}

}
