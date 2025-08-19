package doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(5);
//        dll.printLinkedList();
        dll.addNode(78);
        dll.addNode(45);
        dll.printLinkedList();
    }
}
