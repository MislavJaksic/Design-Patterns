package state;

/**
 * Gate.
 */
public class Gate {
	private GateState state;
	
	
	
	public Gate () {
		this.state = new Closed(this);
	}
	
	
	
	public void changeState(GateState state) {
		this.state = state;
	}
	
	
	
	public void enter() {
		this.state.enter();
	}
	
	public void paySuccess() {
		this.state.paySuccess();
	}
	
	public void payFailed() {
		this.state.payFailed();
	}
}
