package adapter;

/**
 * The user of the adapter pattern.
 */
public class TwoPhaseAppliance {
	public String powerOn() {
		PhaseAdapter phaseAdapter = new Adapter(new ThreePhaseSocket());
		return phaseAdapter.connect();
	}
}
