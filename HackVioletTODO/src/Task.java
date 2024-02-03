/**
 * 
 */
public class Task {
    private int staminaCost;
    private String name;
    private Date date;
    public Task(int cost, String name, Date date) {
        setStaminaCost(cost);
        this.name = name;
        this.setDate(date);
    }
    
    public String getName() {
        return name;
    }
    public int getStaminaCost() {
        return staminaCost;
    }
    public void setStaminaCost(int staminaCost) {
        this.staminaCost = staminaCost;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}
