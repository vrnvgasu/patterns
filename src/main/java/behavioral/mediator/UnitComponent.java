package behavioral.mediator;

public abstract class UnitComponent {

	protected Mediator mediator;

	protected Integer health;

	protected Integer strong;

	public UnitComponent(Integer health, Integer strong) {
		this.health = health;
		this.strong = strong;
	}

	public void addHealth(Integer health) {
		this.health += health;

		if (this.health < 0) {
			throw new RuntimeException("Your team is failed!!!");
		}

		System.out.println(this.getClass().getSimpleName() + ": health=" + this.health);
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void addStrong(Integer strong) {
		this.strong += strong;

		if (this.strong < 0) {
			this.strong = 0;
		}

		System.out.println(this.getClass().getSimpleName() + ": strong=" + this.strong);
	}

	public void makeAction(Action action) {
		mediator.notify(action, this);
	}

	enum Action {
		CAST,
		CURE,
		PROTECT,
		HIT,
		INSPIRE
	}

}
