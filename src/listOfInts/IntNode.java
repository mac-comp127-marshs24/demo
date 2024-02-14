package listOfInts;
public class IntNode {
    
    // class variables
    private int data;
    private IntNode next;

    public IntNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int get() {
        return this.data;
    }

    public void setNext(IntNode next) {
        this.next = next;
    }

    public IntNode getNext() {
        return this.next;
    }
}
