/*
给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。

你可以假设除了数字 0 之外，这两个数字都不会以零开头。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-two-numbers-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/
// 输入：(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
// 输出：7 -> 8 -> 0 -> 7
public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode work = l1;
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    while (work != null) {
      stack1.push(work.val);
      work = work.next;
    }
    work = l2;
    while (work != null) {
      stack2.push(work.val);
      work = work.next;
    }
    ListNode head = new ListNode(0);
    head.next = null;
    int temp = 0;
    while (!stack1.empty() && !stack2.empty()) {
      temp += stack1.pop() + stack2.pop();
      ListNode t = new ListNode(temp % 10);
      temp = temp / 10;
      t.next = head.next;
      head.next = t;
    }
    while (!stack1.empty()) {
      temp += stack1.pop();
      ListNode t = new ListNode(temp % 10);
      temp = temp / 10;
      t.next = head.next;
      head.next = t;
    }
    while (!stack2.empty()) {
      temp += stack2.pop();
      ListNode t = new ListNode(temp % 10);
      temp = temp / 10;
      t.next = head.next;
      head.next = t;
    }
    while (temp != 0) {
      ListNode t = new ListNode(temp % 10);
      temp = temp / 10;
      t.next = head.next;
      head.next = t;
    }
    ListNode t = head.next;
    head.next = null;
    return t;
  }
}