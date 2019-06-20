package strategy.fly;

public class NoFlyStrategy implements FlyStrategy {
	@Override
	public String fly() {
		return "no fly";
	}
}
