package strategy.client;

import strategy.display.DisplayStrategy;
import strategy.fly.FlyStrategy;
import strategy.quack.QuackStrategy;

/**
 * An empty shell that is filled with different types of algorithms.
 */
public class DuckClient  {
	private FlyStrategy flying;
	private QuackStrategy quacking;
	private DisplayStrategy displaying;
	
	
	
	public DuckClient(FlyStrategy flying, QuackStrategy quacking, DisplayStrategy displaying) {
		this.flying = flying;
		this.quacking = quacking;
		this.displaying = displaying;
	}
	
	
	
	public String fly() {
		return this.flying.fly();
	}
	
	public String quack() {
		return this.quacking.quack();
	}
	
	public String display() {
		return this.displaying.display();
	}
}
