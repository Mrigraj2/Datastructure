package linkedList;

public class LinkedList{
    Node head;
    Node tail;
    int length=0;

    public LinkedList(){
    };

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }


    public void addNode(int value){
        Node newNode = new Node(value);
            if (head == null) {
            head = newNode;
            tail = newNode;
            length++;
        } else {
            tail.setNext(newNode);
            tail = newNode;
            length++;
        }
    }


    public void pahade(int value){
        for (int i =1;i<=10;i++){
            addNode(value*i);
        }
    }


    /**
     *
     * @param value Insert at head
     */
    public void preAddNode(int value){
        Node node = new Node(value);
        node.setNext(head);
        head = node;
        length++;
    }

    /**
     *
     * @param value Insert at tail
     */

    public void postAddNode(int value){
        Node node = new Node(value);
        tail.setNext(node);
        tail = node;
        length++;
    }

    /**
     *
     * @param value insert value
     * @param index at specified index
     */
    public void insertAtIndex(int value, int index){
        Node temp = head;
        Node currentNode = new Node(value);
        for (int i = 0;i<=length;i++){
            if (index!=length){
                temp = head.getNext();
            }else {
                Node nextNode = temp.getNext();
                temp.setNext(currentNode);
                currentNode.setNext(nextNode);
                length++;
                break;
            }
        }
    }


    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("Total length: "+length);
        System.out.println("null");
    }
}