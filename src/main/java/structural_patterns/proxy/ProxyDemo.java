package structural_patterns.proxy;

public class ProxyDemo {

	public static void main(String[] args) throws InterruptedException {
		RepositoryCache proxy = new RepositoryCache();
		Service service = new Service(proxy);

		System.out.println("result from db: " + service.getAll());
		System.out.println("result from cache: " + service.getAll());

		Thread.sleep(1000);
		System.out.println("new result from db after 1s: " + service.getAll());
	}

}
