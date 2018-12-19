/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // 下一个节点
        ListNode next = node.next;
        // 用下一个节点的数据将当前节点的数据覆盖
        node.val = next.val;
        // 当前节点的下一个节点设置为想一个节点的下一个
        node.next = next.next;
        // 删除下一个节点
        next = null;
    }
}