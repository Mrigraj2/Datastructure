package tree;

public class Node {

    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data=data;
    }

    public void rootNode()
    {
        System.out.println("data: "+this.data);
        System.out.println("left Node value: "+this.left.data);
        System.out.println("right Node value: "+this.right.data);
    }
}
