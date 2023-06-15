package Main;
import java.util.ArrayList;
public class TaskService {
	static ArrayList<Task> list = new ArrayList<Task>();
	// checks array list for one and if the array list doesn't have one or nothing in it, ithe task will be added
	public boolean addTask(Task task){
		   if(list.size() == 0){
		          
	           list.add(task);
	           return true;
	             
	         }
		   
		   else if (list.contains(task)) {
				throw new IllegalArgumentException("Invalid id");
			
			}
			else  {
				list.add(task);
				return true;
				  }
     
		   
	}
	// deletes the task
	public boolean deleteTask (Task taskID){
			if(list.contains(taskID)) {
				list.remove(taskID);
				return true;
			}
			

		  return false;
    }
	// updates name
	public boolean updateTaskName (String taskID, String taskName){
		  for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getTaskId().equals(taskID)) {
            list.get(i).setTaskName(taskName);
            return true;
			}
      }
		  return false;
	}
	//updates description
	public boolean updateTaskDescription (String ID, String taskDescription){
		  for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getTaskId().equals(ID)) {
          list.get(i).setTaskName(taskDescription);
          return true;
			}
    }
		  return false;
	}
	
}