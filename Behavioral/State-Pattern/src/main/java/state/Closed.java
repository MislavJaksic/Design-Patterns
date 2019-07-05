package state;

public class Closed implements GateState {
    Gate gate;
	
	
	
	public Closed (Gate gate) {
		this.gate = gate;
	}
	
	

	@Override
	public void enter() {
	}

	@Override
	public void paySuccess() {
	}

	@Override
	public void payFailed() {
	}
}
