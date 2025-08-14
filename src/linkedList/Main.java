package linkedList;


public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        // list.pahade(5);
       list.preAddNode(34);
       list.postAddNode(55);
       list.insertAtIndex(74,5);
       list.preAddNode(56);
       list.postAddNode(100);
        list.printList();
//        list.transferHeadToIndex(5);
//        list.printList();
//        list.findMiddle(list.head);
//        list.reverseLinkedList();
        LeetcodeMethods lc = new LeetcodeMethods();
        lc.findMiddleOfList(list);
//        list.printList();
    }

}
