package behavioral.mediator;


import behavioral.mediator.UnitComponent.Action;

public interface Mediator {

	void notify(Action action, UnitComponent component);

}
