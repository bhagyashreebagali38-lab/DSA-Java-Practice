class QimLL {

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    public boolean isEmpty() {
        return front == null && rear == null;
    }

    // enqueue
    public void enqueue(int x) {
        Node newnode = new Node(x);

        if (rear == null) {
            front = rear = newnode;
            return;
        }

        rear.next = newnode;
        rear = newnode;
    }

    // dequeue
    public int dequeue() {
        if (front == null) {
            return -1;
        }

        int val = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return val;
    }

    // peek
    public int peek() {
        if (front == null) {
            return -1;
        }
        return front.data;
    }
}
