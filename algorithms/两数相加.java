/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        ListNode head = null;
        ListNode point = head;
        int t = 0;

        // 对两个链表长度相等的位置进行相加
        while (l1 != null && l2 != null) {
            t = t + l1.val + l2.val;
            ListNode temp = new ListNode(t % 10);
            t = t / 10;
            if (head == null) {
                head = temp;
                point = head;
                point.next = null;
            } else {
                point.next = temp;
                point = point.next;
                point.next = null;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        // 对l1 剩余的部分进行加法运算
        while (l1 != null) {
            t = t + l1.val;
            ListNode temp = new ListNode(t % 10);
            t = t / 10;
            if (head == null) {
                head = temp;
                point = head;
                point.next = null;
            } else {
                point.next = temp;
                point = point.next;
                point.next = null;
            }
            l1 = l1.next;
        }
        //对 l2剩余的部分进行加法运算
        while (l2 != null) {
            t = t + l2.val;
            ListNode temp = new ListNode(t % 10);
            t = t / 10;
            if (head == null) {
                head = temp;
                point = head;
                point.next = null;
            } else {
                point.next = temp;
                point = point.next;
                point.next = null;
            }
            l2 = l2.next;
        }
        // 处理最后是否有进位的情况
        if(t != 0){
            ListNode temp = new ListNode(t);
            if (head == null) {
                head = temp;
                point = head;
                point.next = null;
            } else {
                point.next = temp;
                point = point.next;
                point.next = null;
            }
        }
        return head;
    }
}