package queue;

public class QueueNode {

    public int data;
    public QueueNode head;
    public QueueNode tail;

    public QueueNode(int data){
        this.data=data;
    }

    public QueueNode getNextNode(){
        return this.tail;
    }

    public QueueNode getPrevNode(){
        return this.head;
    }

    public int getData(){
        return this.data;
    }

}
