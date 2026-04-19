class add2LList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add two linked lists
    public Node addList(Node t1, Node t2) {
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;

        while (t1 != null || t2 != null || carry != 0) {
            int sum = carry;

            if (t1 != null) {
                sum += t1.data;
                t1 = t1.next;
            }

            if (t2 != null) {
                sum += t2.data;
                t2 = t2.next;
            }

            Node newNode = new Node(sum % 10);
            carry = sum / 10;

            temp.next = newNode;
            temp = temp.next;
        }

        return dummy.next;
    }

    // Print list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        add2LL obj = new add2LL();

        Node l1 = new Node(1);
        l1.next = new Node(8);
        l1.next.next = new Node(7);

        Node l2 = new Node(3);
        l2.next = new Node(6);

        System.out.print("List1: ");
        obj.printList(l1);

        System.out.print("List2: ");
        obj.printList(l2);

        Node result = obj.addList(l1, l2);

        System.out.print("Result: ");
        obj.printList(result);
    }
}
