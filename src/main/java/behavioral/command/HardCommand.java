package behavioral.command;

public class HardCommand implements JobInterface {

	@Override
	public void execute() {
		System.out.println("Начинаем выполнять сложную команду...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Сложная команда выполнена");
	}

}
