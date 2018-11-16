/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        int index = 1;
        // 链表连接位置1
        ListNode p1 = null;
        // 遍历链表节点到达反转开始的地点
        while (index != m && current != null) {
            p1 = current;
            current = current.next;
            index++;
        }
        // 开始反转链表
        ListNode h = current;
        ListNode pre = null;
        ListNode next = null;
        while (h != null && index <= n) {

            next = h.next;
            h.next = pre;
            pre = h;
            if (next == null || index == n) {
                break;
            }
            index++;
            h = next;
        }
        // 如果头部还有数据
        if (p1 != null) {
            p1.next = h;
        } else {
            head = h;
        }
        // 如果末尾还有数据
        if (next != null) {
            current.next = next;
        }

        return head;
    }
}