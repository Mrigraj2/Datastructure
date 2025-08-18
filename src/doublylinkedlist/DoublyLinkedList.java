package doublylinkedlist;

public class DoublyLinkedList {

    Node head;
    Node tail;

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public void addNode(int value){
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        tail.next = null;

    }

    public void printLinkedList(){
        Node temp = head;

        while(temp!=null){
            System.out.println(temp);
            temp = temp.next;
        }
    }

}
