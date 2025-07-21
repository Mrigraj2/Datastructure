package linkedList;


public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList(5);
        System.out.println(list.toString());
        list.addNode(34);
        System.out.println(list);
    }

}
