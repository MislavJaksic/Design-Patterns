package state;

/**
 * Models the following state machine:
 *        | enter  | paySuccess | payFailed
 * Closed | Closed |    Open    |  Closed
 * Open   | Closed |    Open    |   Open
 */
public interface GateState {
	public void enter();
	public void paySuccess();
	public void payFailed();
}
