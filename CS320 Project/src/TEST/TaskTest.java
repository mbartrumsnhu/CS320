package TEST;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Main.Task;

class TaskTest {
// these test for to to see if the task have everything that is correct and that it not null and if it's too long.
	@Test
	void testTask() {
		Task task = new Task("100","ToiletCleaner","Must clean Toliet") ;
			assertTrue(task.getTaskId().equals("100"));
			assertTrue(task.getTaskName().equals("ToiletCleaner"));
			assertTrue(task.getTaskDesciption().equals("Must clean Toliet"));

	}
	@Test
	void testNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null,null,null);
		});
	}
	@Test
	void testLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("10000000000","1000000000000000000000",
					"1000000000000000000000000000000000000000000000000000000000000000000000000000");
		});
	}

}
