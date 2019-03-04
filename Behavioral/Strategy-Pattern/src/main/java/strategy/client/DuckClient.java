package strategy.client;

import strategy.display.DisplayStrategy;
import strategy.fly.FlyStrategy;
import strategy.quack.QuackStrategy;

public class DuckClient  {
	private FlyStrategy flying;
	private QuackStrategy quacking;
	private DisplayStrategy displaying;
	
	
	
	public DuckClient(FlyStrategy flying, QuackStrategy quacking, DisplayStrategy displaying) {
		this.flying = flying;
		this.quacking = quacking;
		this.displaying = displaying;
	}
	
	
	
	public String Fly() {
		return this.flying.Fly();
	}
	
	public String Quack() {
		return this.quacking.Quack();
	}
	
	public String Display() {
		return this.displaying.Display();
	}
}
