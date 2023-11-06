package behavioral.command;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class JobQueue {

//	private final Queue<JobInterface> jobs = new ArrayBlockingQueue<>(10);
	private final Queue<JobInterface> jobs = new ArrayDeque<>(10);

	public void add(JobInterface command) {
		jobs.add(command);
		renderJobCount();
	}

	public void execute() {
		if (jobs.isEmpty()) {
			return;
		}

		JobInterface element = jobs.poll();
		element.execute();
		renderJobCount();
	}

	public void renderJobCount() {
		System.out.println("Заданий в очереди: " + jobs.size());
	}

}
