package behavioral.mediator;

import behavioral.mediator.UnitComponent.Action;
import java.util.ArrayList;
import java.util.List;

public class RuleMediator implements Mediator {

	private final List<UnitComponent> components = new ArrayList<>();

	public void registerComponent(UnitComponent component) {
		component.setMediator(this);
		components.add(component);
	}

	@Override
	public void notify(Action action, UnitComponent component) {
		if (Action.CAST.equals(action)) {
			if (component instanceof Wizard) {
				System.out.println("Wizard gives strong to everybody");
				components.forEach(c -> c.addStrong(5));
			} else {
				System.out.println(component.getClass().getSimpleName() + " can't cast");
			}
		}

		if (Action.CURE.equals(action)) {
			if (component instanceof Doctor) {
				System.out.println("Wizard gives health to everybody");
				components.forEach(c -> c.addHealth(5));
			} else {
				System.out.println(component.getClass().getSimpleName() + " gives health to everybody");
				components.forEach(c -> c.addHealth(1));
			}
		}

		if (Action.INSPIRE.equals(action)) {
			if (component instanceof Warrior) {
				System.out.println("Warrior gives strong to everybody");
				components.forEach(c -> c.addStrong(15));
			} else {
				System.out.println(component.getClass().getSimpleName() + " can't inspire");
				components.forEach(c -> c.addStrong(-10));
			}
		}

		if (Action.HIT.equals(action)) {
			System.out.println(component.getClass().getSimpleName() + " hits enemy");
		}

		System.out.println("--------------------------------");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

}
