package composite;

import java.util.List;

/**
 * Composite.
 */
public class Project implements TodoList {
	String title;
	List<TodoList> todos;
	
	
	
	public Project(String title, List<TodoList> todos) {
		this.title = title;
		this.todos = todos;
	}

	
	
	@Override
	public String getHtml() {
		String text = "";
		
		text += title;
		for (TodoList todo : todos) {
			text += " ";
			text += todo.getHtml();
		}
		
		return text;
	}

}
