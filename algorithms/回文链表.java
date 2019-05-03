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
     * 判断一个链表是否为回文链表
     *
     * @param head 链表头
     * @return 是否是回文链表
     */
    public boolean isPalindrome(ListNode head) {
        // 找到链表中点 1 2 3 4 5 6 7
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        slow = reverseList(slow);
        while (slow != null) {
            if(slow.val != head.val){
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    /**
     * 链表原地反转
     *
     * @param head 链表头部
     * @return 翻转后的链表头部
     */
    ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            // 1 2 3 4 5
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}