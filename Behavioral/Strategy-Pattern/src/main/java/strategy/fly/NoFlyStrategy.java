package strategy.fly;

public class NoFlyStrategy implements FlyStrategy {
	@Override
	public String Fly() {
		return "no fly";
	}
}
