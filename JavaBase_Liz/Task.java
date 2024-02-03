package JavaBase_Liz;

public class Task {
    private String taskName;
    private int taskCost;
    private int taskStatus;

    public static int ACTIVE = 0;
    public static int INACTIVE = 1;
    public static int COMPLETE = 2;

    public Task(String name, int cost)
    {
        this.setName(name);
        this.setCost(cost);
        this.setStatus(ACTIVE);
    }

    private void setName(String name)
    {
        this.taskName = name;
    }

    public String getName()
    {
        return this.taskName;
    }

    private void setCost(int cost)
    {
        this.taskCost = cost;
    }

    public int getCost()
    {
        return this.taskCost;
    }

    public void setStatus(int status)
    {
        this.taskStatus = status;
    }

    public int getStatus()
    {
        return this.taskStatus;
    }
}
