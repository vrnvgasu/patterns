package behavioral.mediator;

import behavioral.mediator.UnitComponent.Action;

public class MediatorDemo {

	public static void main(String[] args) {
		Doctor doctor = new Doctor(100, 20);
		Warrior warrior = new Warrior(100, 200);
		Wizard wizard = new Wizard(50, 100);

		RuleMediator ruleMediator = new RuleMediator();
		ruleMediator.registerComponent(doctor);
		ruleMediator.registerComponent(warrior);
		ruleMediator.registerComponent(wizard);

		doctor.makeAction(Action.HIT);
		warrior.makeAction(Action.HIT);
		wizard.makeAction(Action.CAST);
		doctor.makeAction(Action.CAST);
		wizard.makeAction(Action.CURE);
		wizard.makeAction(Action.INSPIRE);
		warrior.makeAction(Action.INSPIRE);
		warrior.makeAction(Action.CURE);
	}

}
