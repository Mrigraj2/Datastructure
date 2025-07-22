package linkedList;

public class LinkedList{
    Node head;
    Node tail;

    public LinkedList(){
    };

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }


    public void addNode(int value){
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }


    public void pahade(int value){
        for (int i =1;i<=10;i++){
            addNode(value*i);
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}