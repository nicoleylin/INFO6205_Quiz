public class Question2 {
    public void populateParent(Node node)
    {
        if (node == null)
            return;
        node.left.parent = node.right.parent;
        System.out.print(node.left.parent)
        populateParent(node.left);
        populateParent(node.right);
    }
}
