/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/3/19
 * Time: 13:19
 * Description: 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 *
 * @author chen
 */
public class Solution {
    /**
     * 合并 k 个排序链表，返回合并后的排序链表
     *
     * @param lists K 个排序链表
     * @return 合并后的排序链表
     */
    public ListNode mergeKLists(ListNode[] lists) {
        // 链表的个数
        int len = lists.length;
        if (len == 0) {
            return null;
        }
        while (len > 1) {
            // 两两合并
            int index = 0;
            for (int i = 0; i < len; i = i + 2) {
                if ((i + 1) < len) {
                    lists[index++] = mergeTwoLists(lists[i], lists[i + 1]);
                } else {
                    lists[index++] = lists[i];
                }
            }
            len = index;
        }
        return lists[0];
    }

    /**
     * 合并两个排序链表
     *
     * @param list1 排序链表1
     * @param list2 排序链表2
     * @return 合并后的排序链表
     */
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 创建一个链表头
        ListNode head = new ListNode(0);
        head.next = null;
        // 工作指针
        ListNode work = head;
        // 当两个链表都还有数据
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                work.next = list1;
                list1 = list1.next;
            } else {
                work.next = list2;
                list2 = list2.next;
            }
            work = work.next;
        }
        if (list1 != null) {
            work.next = list1;
        }
        if (list2 != null) {
            work.next = list2;
        }
        return head.next;
    }
}
