package tree;

import queue.QueueNode;

public class Queue {
    QueueNode current;

    static int length;
    public Queue(int data){
        current = new QueueNode(data);

        if(length==0){
            current.head =null;
            current.tail =null;
        }
        if(length>0){
            current.head =current.tail;
            current.tail =null;
        }
        length++;
    }
}
