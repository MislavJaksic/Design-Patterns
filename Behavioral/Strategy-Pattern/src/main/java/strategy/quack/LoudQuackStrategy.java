package strategy.quack;

public class LoudQuackStrategy implements QuackStrategy {
	@Override
	public String quack() {
		return "loud quack";
	}

}
