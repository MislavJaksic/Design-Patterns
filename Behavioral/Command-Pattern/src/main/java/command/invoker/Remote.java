package command.invoker;

import command.LightCommand;

/**
 * Responsible for executing chosen commands.
 */
public class Remote {
	private LightCommand turn_on;
	private LightCommand dim_down;
	
	
	
	public Remote(LightCommand turn_on, LightCommand dim_down) {
		this.turn_on = turn_on;
		this.dim_down = dim_down;
	}
	
	
	
	public void pressOn() {
		this.turn_on.execute();
	}
	
	public void pressOff() {
		this.turn_on.unexecute();
	}
	
	public void pressDim() {
		this.dim_down.execute();
	}
	
	public void pressBrigten() {
		this.dim_down.unexecute();
	}
}
