package JavaBase_Liz;

import java.util.*;

public class TaskList {
    
    private List<Task> taskList;

    public TaskList()
    {
        this.taskList = new ArrayList<Task>();
    }

    public void addTask(Task newTask)
    {
        taskList.add(newTask);
    }

}
