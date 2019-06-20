package strategy.quack;

public class NoQuackStrategy implements QuackStrategy {
	@Override
	public String quack() {
		return "no quack";
	}

}
