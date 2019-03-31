/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2019/3/18
 * Time: 0:35
 * Description:
 *
 * @author chen
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode myHead = head;
        ListNode fast = head;
        ListNode slow = head;
        // 快指针移动n步
        int index = 0;
        while (index < n) {
            if (fast == null) {
                break;
            }
            fast = fast.next;
            index++;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}