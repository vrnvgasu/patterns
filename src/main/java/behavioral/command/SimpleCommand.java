package behavioral.command;

public class SimpleCommand implements JobInterface {

	@Override
	public void execute() {
		System.out.println("Простая команда выполнена");
	}

}
