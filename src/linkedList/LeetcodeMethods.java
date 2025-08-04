package linkedList;

import java.util.Vector;

public class LeetcodeMethods {

    //	LinkedList list;
    int length =0;

    public void findMiddleOfList(LinkedList list) {
        Node head = list.head;
//		Node tail = list.tail;

        Vector<Object> v = new Vector<>();

        Node temp;

        while(head!=null) {
            temp = head.getNext();
            head = temp;
            length++;
        }

        int x = length%2;

        if(x==0) {
            int y = length/2;
            for(int i =y;i<v.size();i++) {
                v.add(y);
            }
//			System.out.println(v);

        }else {
            int y = length/2;
            for(int i =(y-1);i<v.size();i++) {
                v.add(y);
            }
//			System.out.println(v);
        }
        System.out.println(v);
    }
}
