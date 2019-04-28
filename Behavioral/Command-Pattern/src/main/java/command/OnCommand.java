package command;

import command.receiver.Light;

/**
 * Responsible for turning the light on and off.
 */
public class OnCommand implements ILightCommand {
	private Light light;
	
	
	
	public OnCommand(Light light) {
		this.light = light;
	}
	
	
	
	@Override
	public void execute() {
		this.light.on();
	}

	@Override
	public void unexecute() {
		this.light.off();
	}

}
