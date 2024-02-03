
public class LinkedList<T> {
    private Node<T> head;
    private int size;
    /**
     * constructor
     * @param data initial data
     */
    public LinkedList(T data) {
        head = new Node<T>(data);
        size = 0;
    }
    /**
     * gets size of list
     * @return size of list
     */
    public int getSize() {
        return size;
    }
    /**
     * adds a new node
     * @param data data for new node
     */
    public void add(T data) {
        Node<T> temp = head;
        Node<T> newNode = new Node<T>(data);
        while(temp.getNextNode() != null) {
            temp = temp.getNextNode();
        }
        temp.setNextNode(newNode);
    }
    /**
     * removes a node
     * @param data the data of the node to be removed.
     */
    public void remove(T data) {
        Node<T> temp = head;
        while(temp.getNextNode() != null && temp.getNextNode().getData()!= data) {
            temp = temp.getNextNode();
        }
        temp.setNextNode(temp.getNextNode().getNextNode());
    }
    
    
}
