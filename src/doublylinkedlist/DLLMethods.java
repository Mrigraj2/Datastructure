package doublylinkedlist;

public class DLLMethods {

    public void prePend(DoublyLinkedList list, int value){
        Node newNode = new Node(value);
        Node temp = list.head;
        newNode.next = list.head;
        list.head = newNode;
    }

    public void addNode(DoublyLinkedList list, int value){
        Node newNode = new Node(value);
        if(list.head.next == null){
            list.head.next = newNode;
            list.tail = newNode;
            list.tail.prev = list.head;
            System.out.println(list.tail.prev);
        }else {
            Node temp = list.tail;
            list.tail.next = newNode;
            list.tail = list.tail.next;
            list.tail.prev = temp;
        }
    }

    public void printAll(DoublyLinkedList list){
        Node temp = list.head;
        while(list.head!=null){
            System.out.println(list.head.value + "----> ");
            list.head = list.head.next;
        }
    }
}
