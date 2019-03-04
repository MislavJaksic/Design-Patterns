package strategy.quack;

public class NoQuackStrategy implements QuackStrategy {
	@Override
	public String Quack() {
		return "no quack";
	}

}
