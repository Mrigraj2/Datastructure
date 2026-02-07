package tree;

public class TreeTraversal {

    public void preOderTraversal(Node node)
    {
        if(node ==null) return;

        System.out.print(node.data);
        preOderTraversal(node.left);
        preOderTraversal(node.right);
    }

    public void inOrderTraversal(Node node)
    {
        if(node==null) return;

        inOrderTraversal(node.left);
        System.out.print(node.data);
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(Node node)
    {
        if(node==null) return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data);
    }
}
