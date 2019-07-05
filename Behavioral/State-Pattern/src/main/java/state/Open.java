package state;

public class Open implements GateState {
	Gate gate;
	
	
	
	public Open (Gate gate) {
		this.gate = gate;
	}
	
	

	@Override
	public void enter() {
	}

	@Override
	public void paySuccess() {
		this.gate.changeState(new Closed(this.gate));
	}

	@Override
	public void payFailed() {
	}
}
