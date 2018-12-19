class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode t = head;
        ListNode next = null;
        if (head.next != null) {
            next = head.next;
        }
        while (next != null) {
            if (next.val != head.val) {
                head.next = next;
                head = head.next;
            }
            next = next.next;
        }
        head.next = null;
        return t;
    }
}