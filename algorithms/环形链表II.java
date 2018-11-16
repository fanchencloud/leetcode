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
    /**
        * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
        *
        * @param head
        * @return
        */
       public ListNode detectCycle(ListNode head) {
           if (head == null) {
               return null;
           }
           // 快速指针
           ListNode fast = head;
           // 慢指针
           ListNode slow = head;
           while (fast != null) {
               fast = fast.next;
               if (fast != null) {
                   fast = fast.next;
               } else {
                   // 快指针为空，到达链表尾部
                   break;
               }
               slow = slow.next;
               if (fast == slow) {
                   break;
               }
           }
           // 快慢指针其中一个为null，表示该链表没有环
           if (fast != slow) {
               return null;
           }
           // 慢指针归位
           slow = head;
           while (slow != fast) {
               fast = fast.next;
               slow = slow.next;
           }
           return fast;
       }
   }