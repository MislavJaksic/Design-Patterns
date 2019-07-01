package facade;

public class ComputerFacade {
	Computer computer;
	
	
	
	public ComputerFacade(Computer computer) {
		this.computer = computer;
	}
	
	
	
	public String on() {
		return this.computer.powerOn();
	}
	
	public String off() {
		return this.computer.shutDown();
	}
}
