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
        System.out.println("Original length-->" +this.length);
        Node x = head;
        Node temp = x;
        Node currentNode = new Node(value);
        for (int i = 0;i<=length;i++){
            if (i<index){
                temp = x.getNext();
                x= temp;
                System.out.println(x.getValue());

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
    }

    public void transferHeadToIndex(int index){
        Node temp = head;
        System.out.println("Current head: "+temp.getValue());
        for (int i=1;i<=length;i++){

            if (i<=index){
                temp=head.getNext();
                head = temp;
                System.out.println(head.getValue());
                length--;
            }else {
                break;
            }
        }
        System.out.println("Final head: "+temp.getValue());
    }


    public void findMiddle(Node head){
        Node temp;
        int length=1;

        do {
            temp = head.getNext();
            head = temp;
            length++;
        }while(head.getNext()!=null);

        System.out.println("Length of linked list: "+length);


    }

    public void reverseLinkedList(){
        Node prev = null;
        Node current = head;
        Node next = null;

        tail = head;

        while (current!=null){
           next = current.getNext();
           current.setNext(prev);
           prev = current;
           current = next;
        }
        head = prev;

    }
}