package adapter;

public class Adapter implements Target {
	Adaptee adaptee;
	
	
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}



	@Override
	public String request() {
		this.adaptee.specificRequest();
	}

}
