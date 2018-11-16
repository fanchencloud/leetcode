/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        //后行指针
        ListNode order = head;
        // 先行指针
        ListNode pre = head;
        while (pre != null && order != null) {
            if (pre.next != null) {
                pre = pre.next.next;
            } else {
                pre = null;
                break;
            }
            order = order.next;
            if (order == pre) {
                return true;
            }
        }
        return false;
    }
}