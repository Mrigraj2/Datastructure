package linkedList;

public class LinkedList{
    Node head;
    Node tail;

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }


    public void addNode(int value){
        Node newNode = new Node(value);
        head.setNext(newNode);
        tail = newNode;
        tail.setNext(null);
    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}