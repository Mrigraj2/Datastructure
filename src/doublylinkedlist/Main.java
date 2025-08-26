package doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(5);
        DLLMethods dm = new DLLMethods();
//        dll.printLinkedList();
        dll.addNode(78);
        dll.addNode(45);
        dm.prePend(dll,4);
        dll.printLinkedList();
    }
}
