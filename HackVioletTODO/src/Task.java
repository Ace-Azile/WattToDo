/**
 * 
 */
public class Task {
    private int staminaCost;
    private String name;
    private Boolean active;
    public Task(int cost, String name) {
        setStaminaCost(cost);
        this.name = name;
        setActive(true);
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
    

    public void print() {
        System.out.println(name + " cost: " + staminaCost);
        
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
