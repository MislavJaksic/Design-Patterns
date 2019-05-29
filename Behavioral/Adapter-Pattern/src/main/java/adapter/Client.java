package adapter;

public class Client {
	public static void something() {
		ITarget target = new Adapter(new Adaptee());
		target.request();
	}
}
