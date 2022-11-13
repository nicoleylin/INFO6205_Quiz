public class Question4 {
    public Node head;

    public int length = 0;

    public LinkList() {
        head = null;
    }

    public void insert(Integer data){
        // Insert in sorted manner
        Node current;
        Node new_node = new Node(data)

        if (head == null || head.data
                >= new_node.data) {
            new_node.next = head;
            head = new_node;
        }
        else {
            current = head;
            while (current.next != null && current.next.data < new_node.data) {
                current = current.next;
                new_node.next = current.next;
                current.next = new_node;
            }
        }
    }

}
