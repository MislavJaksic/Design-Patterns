package command;

import command.receiver.Light;

/**
 * Responsible for dimming and brightening the light.
 */
public class DimCommand implements ILightCommand {
	private Light light;
	
	
	
	public DimCommand(Light light) {
		this.light = light;
	}



	@Override
	public void execute() {
		this.light.dim();
	}



	@Override
	public void unexecute() {
		this.light.brighten();
	}
}
