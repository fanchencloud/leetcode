/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    /**
     * 返回链表的中间节点
     * @param head 链表头结点
     * @return 链表的中间节点
     */
    public ListNode middleNode(ListNode head) {
        // 若链表是空链表，直接返回空
        if(head == null){
            return  null;
        }
        // 快慢指针
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}