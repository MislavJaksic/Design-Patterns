package command.receiver;

/**
 * Responsible for doing work. Commands execute its functions.
 */
public class Light {
	private boolean isOn;
	private boolean isDim;
	
	
	
	public Light() {
		this.isOn = false;
		this.isDim = false;
	}
	
	
	
	public void on() {
		this.isOn = true;
	}
	
	public void off() {
		this.isOn = false;
	}
	
	public void dim() {
		this.isDim = true;
	}
	
	public void brighten() {
		this.isDim = false;
	}
	
	
	
	public boolean isOn() {
		return isOn;
	}
	
	public boolean isDim() {
		return isDim;
	}
}
