package composite;

public class Todo implements TodoList {
	String text;
	
	
	
	public Todo (String text) {
		this.text = text;
	}

	
	
	@Override
	public String getHtml() {
		return this.text;
	}

}
