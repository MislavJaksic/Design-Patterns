package adapter;

public class Adapter implements PhaseAdapter {
	ThreePhaseSocket threePhaseSocket;
	
	
	
	public Adapter(ThreePhaseSocket threePhaseSocket) {
		this.threePhaseSocket = threePhaseSocket;
	}



	@Override
	public String connect() {
		return this.threePhaseSocket.getPower();
	}

}
