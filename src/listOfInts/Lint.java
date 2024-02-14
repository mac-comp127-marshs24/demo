package listOfInts;
public class Lint {

    // class variables
    private IntNode head;
    private IntNode tail;
    private int length;

    public Lint() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        this.length++;
        if(head == null) {
            head = new IntNode(data);
            tail = head;
        } else {
            IntNode newTail = new IntNode(data);
            tail.setNext(newTail); 
            tail = newTail;
        }
    }

    public String toString() {
        String ret = "";
        IntNode itr = head;
        for(int i = 0; i < length; i ++) {
            ret += itr.get();
            itr = itr.getNext();
        }
        return ret;
    }

    public static void main(String[] args) {
        Lint l = new Lint();
        l.add(5);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(0);
        System.out.println(l);
    }
}