package doublylinkedlist;

public class Node {
    int value;
    Node next;
    Node prev;

    public Node(int value){
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }
}
