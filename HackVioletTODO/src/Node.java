
public class Node<T> {
    private T data;
    private Node<T> nextNode;
    public Node(T data) {
        this.setData(data);
        setNextNode(null);
    }
    /**
     * gets next node
     * @return the next node
     */
    public Node<T> getNextNode() {
        return nextNode;
    }
    /**
     * 
     * @param nextNode the new node which will be next
     */
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
    /**
     * gets data
     * @return the data
     */
    public T getData() {
        return data;
    }
    /**
     * sets the data
     * @param data the new data
     */
    public void setData(T data) {
        this.data = data;
    }
}
