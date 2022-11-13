public class Question1 {
    public void populateLeft(Node root) {
        if(root == null) return null;
        if(root.right != null) root.right.nextLeft = root.left;
        if(root.left != null && root.nextLeft != null) root.left.nextLeft = root.nextLeft.right;
        populateLeft(root.right);
        populateLeft(root.left);
    }
}
