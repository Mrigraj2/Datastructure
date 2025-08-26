package doublylinkedlist;

public class DLLMethods {
    private DoublyLinkedList dll;

    public void prePend(DoublyLinkedList list, int value){
        Node newNode = new Node(value);
        Node temp = list.head;
        newNode.next = list.head;
        list.head = newNode;
    }
}
