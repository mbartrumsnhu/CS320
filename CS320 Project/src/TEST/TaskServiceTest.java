package TEST;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.Task;
import Main.TaskService;

class TaskServiceTest {
// these test the add and delete contact and the updates of task name and description
	@Test
	void testAddContact() {
		Task task = new Task("800", "Matthew",  "Bartrum");
		TaskService ts = new TaskService();
		assertTrue(ts.addTask(task));

}
	@Test
	void testDeleteContact() {
		Task task1 = new Task("800", "Matthew",  "Bartrum");
		TaskService ts = new TaskService();
		ts.addTask(task1);
		assertTrue(ts.deleteTask(task1));

}
	@Test
	void testDeleteContactFail() {
		Task task1 = new Task("800", "Matthew",  "Bartrum");
		Task task2 = new Task("900", "Matthew",  "Bartrum");
		TaskService ts = new TaskService();
		ts.addTask(task1);
		assertFalse(ts.deleteTask(task2));

}
	@Test
	void testUpdateTaskName() {
		Task task = new Task("700", "Matthew",  "Bartrum");
		TaskService ts = new TaskService();
		ts.addTask(task);
      assertTrue(ts.updateTaskName("700","Bob"));
    }
	@Test
	void testUpdateTaskNameFail() {
		Task task = new Task("700", "Matthew",  "Bartrum");
		TaskService ts = new TaskService();
		ts.addTask(task);
      assertFalse(ts.updateTaskName("900","Bob"));
    }
	@Test
	void testUpdateDescription() {
		Task task = new Task("700", "Matthew",  "Bartrum");
		TaskService ts = new TaskService();
		ts.addTask(task);
      assertTrue(ts.updateTaskDescription("700","Bob"));
    }
}
