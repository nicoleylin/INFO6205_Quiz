public class Question3 {
    public void insideRange(Node node, int rangeL, int rangeR) {
        if (node == null) {
            return;
        }

        if (rangeL < node.data) {
            insideRange(node.left, rangeL, rangeR);
        }
        if (rangeL <= node.data && rangeR >= node.data) {
            System.out.print(node.data + " ");
        }
        insideRange(node.right, rangeL, rangeR);
    }
}
