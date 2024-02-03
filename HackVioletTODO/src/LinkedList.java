
public class LinkedList {
    /**
     * first node in list
     */
    private Node head;
    /**
     * size of list
     */
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
        //get to end of list
        while(temp.getNextNode() != null) {
            temp = temp.getNextNode();
        }
        //append to ens
        temp.setNextNode(newNode);
    }
    /**
     * removes a node
     * @param data the data of the node to be removed.
     */
    public void remove(Task data) {
        Node temp = head;
        boolean isThere = false;
        //get to list where data matches
        while(temp.getNextNode() != null && temp.getNextNode().getData()!= data) {
            temp = temp.getNextNode();
            //if data matches set to true
            if(temp.getNextNode().getData() == data) {
                isThere = true;
            }
        }
        //if true remove node
        if(isThere) {
            temp.setNextNode(temp.getNextNode().getNextNode());
        }
        
    }
    /**
     * makes it so each node in list prints until there are no more nodes
     */
    public void printList() {
        Node temp = head;
        while(temp != null) {
            temp.print();
            temp = temp.getNextNode();
        }
        
    }
    
    
}
