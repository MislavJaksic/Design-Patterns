package composite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TodoTest {
	@Nested
	class TodoListTests {
		public Todo first;
		public Todo second;
		public Project project;
		
		@BeforeEach
		public void setup() {
			this.first = new Todo("world");
			this.second = new Todo("!");
			
			List<TodoList> todos = new ArrayList<TodoList>();
			todos.add(first);
			todos.add(second);
			this.project = new Project("hello", todos);
		}
		
		@Test
		public void testProject() {
			String expected = "hello world !";
			
			assertEquals(expected, this.project.getHtml());
		}
		
		@Test
		public void testFirst() {
			String expected = "world";
			
			assertEquals(expected, this.first.getHtml());
		}
		
		@Test
		public void testSecond() {
			String expected = "!";
			
			assertEquals(expected, this.second.getHtml());
		}
	}
}
