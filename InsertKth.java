class Linkl {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at Kth position (1-based index)
    public static Node insertKth(Node head, int k, int val) {

        // Case 1: Insert at head
        if (k == 1) {
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        int count = 1;

        // Traverse to (k-1)th node
        while (temp != null && count < k - 1) {
            temp = temp.next;
            count++;
        }

        // Invalid position
        if (temp == null) {
            System.out.println("Invalid position");
            return head;
        }

        // Insert node
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // Print Linked List
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = null;

        // Build list
        head = insertKth(head, 1, 10); // 10
        head = insertKth(head, 2, 20); // 10 -> 20
        head = insertKth(head, 3, 30); // 10 -> 20 -> 30

        // Insert at Kth position
        head = insertKth(head, 2, 15); // 10 -> 15 -> 20 -> 30

        printList(head);
    }
}
