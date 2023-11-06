package behavioral.command;

import java.util.Random;

public class CommandDemo {

	public static void main(String[] args) {
		JobQueue jobQueue = new JobQueue();
		Random random = new Random();

		Runnable adder = () -> {
			while (true) {
				JobInterface job = random.nextBoolean() ? new HardCommand() : new SimpleCommand();
				jobQueue.add(job);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		};
		Runnable executor = () -> {
			while (true) {
				jobQueue.execute();
			}
		};

		Thread threadAdder = new Thread(adder);
		Thread threadExecutor = new Thread(executor);
		threadAdder.start();
		threadExecutor.start();


	}

}
