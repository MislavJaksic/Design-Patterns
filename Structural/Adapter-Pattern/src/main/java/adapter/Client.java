package adapter;

public class Client {
	public static void something() {
		Target target = new Adapter(new Adaptee());
		target.request();
	}
}
