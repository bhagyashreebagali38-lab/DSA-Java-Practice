class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // Step 1: Find size
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        // Step 2: If deleting first node
        if (n == size) {
            return head.next;
        }

        // Step 3: Move to (size-n)th node
        int target = size - n;
        current = head;
        for (int i = 1; i < target; i++) {
            current = current.next;
        }

        // Step 4: Delete node
        current.next = current.next.next;

        return head;
    }
}
