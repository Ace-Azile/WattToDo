
public class Node {
    private Task data;
    private Node nextNode;
    public Node(Task data) {
        this.setData(data);
        setNextNode(null);
    }
    /**
     * gets next node
     * @return the next node
     */
    public Node getNextNode() {
        return nextNode;
    }
    /**
     * 
     * @param nextNode the new node which will be next
     */
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    /**
     * gets data
     * @return the data
     */
    public Task getData() {
        return data;
    }
    /**
     * sets the data
     * @param data the new data
     */
    public void setData(Task data) {
        this.data = data;
    }
    public void print() {
        data.print();
        
    }
}
