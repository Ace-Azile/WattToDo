
public class LinkedList {
    private Node head;
    private int size;
    /**
     * constructor
     * @param data initial data
     */
    public LinkedList(Task data) {
        head = new Node(data);
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
    public void add(Task data) {
        Node temp = head;
        Node newNode = new Node(data);
        while(temp.getNextNode() != null) {
            temp = temp.getNextNode();
        }
        temp.setNextNode(newNode);
    }
    /**
     * removes a node
     * @param data the data of the node to be removed.
     */
    public void remove(Task data) {
        Node temp = head;
        while(temp.getNextNode() != null && temp.getNextNode().getData()!= data) {
            temp = temp.getNextNode();
        }
        temp.setNextNode(temp.getNextNode().getNextNode());
    }
    public void printList() {
        Node temp = head;
        while(temp.getNextNode() != null) {
            temp.print();
        }
        
    }
    
    
}
