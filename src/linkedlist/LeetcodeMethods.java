package linkedlist;

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
            Node temp1;
            Node next =list.head;
            int count=0;
            while (next!=null){
                temp1 = next.getNext();
                if (temp1 == null){
                    break;
                }
                count++;
                if (count==y){
                    continue;
                } else if (count>y) {
                    v.add(next.getValue());
                }
                System.out.print( "Counting heads before insertion "+next.getValue()+" -> ");
                next = temp1;


            }

        }else {
            int y = length/2;
            Node temp1;
            while(head!=null){
                temp1 = head.getNext();
                v.add(head.getValue());
                head = temp1;
            }
        }
        System.out.println(v);
        long lengthOfVector = v.stream().count();
        if ((lengthOfVector%2)>0){
            System.out.print("Middle element: "+v.get(1));
        } else if ((lengthOfVector%2)==0) {
            System.out.print("Middle element: "+v.get(0));
        }
    }

    public int getDecimalValue(Node head) {
        int result = 0;
        while(head!=null){
            result = result*2 + head.getValue();
            head = head.getNext();
        }
        return result;
    }
}
