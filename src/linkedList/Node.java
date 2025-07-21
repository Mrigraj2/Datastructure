package linkedList;

public class Node {

    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
