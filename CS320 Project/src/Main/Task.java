package Main;

public class Task {
	// public strings names
	private String taskID;
	private String taskName;
	private String taskDescription;
	// task that has id, name, and description of what needs to be done for the program
	public Task(String taskID, String taskName, String taskDescription) {
		if(taskID == null || taskID.length()>10) {
			throw new IllegalArgumentException("Invalid");
		}
		if(taskName == null || taskName.length()>20) {
			throw new IllegalArgumentException("Invalid");
	}
		if(taskDescription == null || taskID.length()>50) {
			throw new IllegalArgumentException("Invalid");
}
		this.taskID = taskID;
		this.taskName= taskName;
		this.taskDescription= taskDescription;
	}
	// getters and setters
	public  String getTaskId() {
		return taskID;
	}
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDesciption() {
		return taskDescription;
	}
	public void setTaskDesciption(String taskDescription) {
		this.taskDescription = taskDescription;
	}
}
