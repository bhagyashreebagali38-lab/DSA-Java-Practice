class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
        ListNode t2 = list2;

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }

        // Attach remaining nodes AFTER loop
        if (t1 != null) {
            temp.next = t1;
        } else {
            temp.next = t2;
        }

        return dummy.next;
    }
}
