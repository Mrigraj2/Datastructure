package linkedList;

class Node{
    public int value;
    public Node next;

    public Node(int value){
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

public class LinkedList {
    private Node head;
    private Node tail;
    int length;

    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length=1;
    }

    public void addNode(int value){
        Node node = new Node(value);
        if (length==0){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        length++;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


}