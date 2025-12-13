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
        Node temp = tail;
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        tail.next = null;
        tail.prev = temp;

    }

    public void printLinkedList(){
        Node temp = head;

        do {
            System.out.print(temp.value +" -->");
            temp = temp.next;
        }while (temp!=null);
    }


}
