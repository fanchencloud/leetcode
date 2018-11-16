/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // 非空判断
        if (head == null) {
            return null;
        }
        ListNode h = head;
        ListNode pre = null;
        ListNode next = null;
        while (h != null) {
            next = h.next;
            h.next = pre;
            pre = h;
            // 如果到了链表尾部，跳出循环
            if (next == null) {
                break;
            }
            h = next;
        }
        return h;
    }
}