class Solution {
    /**
     * 找到两个单链表相交的起始节点。
     * 第一版：使用hash表进行遍历，效率低下
     *
     * @param headA 链表A
     * @param headB 链表B
     * @return 相交的起始节点
     */
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        ListNode t = headA;
        while (t != null) {
            hashSet.add(t.hashCode());
            t = t.next;
        }
        t = headB;
        while (t != null) {
            if ((hashSet.contains(t.hashCode()))) {
                return t;
            }
            t = t.next;
        }
        return null;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length1 = getListLength(headA);
        int length2 = getListLength(headB);
        // 较长的链表
        ListNode l = null;
        // 较短的链表
        ListNode s = null;
        if (length1 > length2) {
            l = headA;
            s = headB;
        } else {
            l = headB;
            s = headA;
        }
        // 长链表先走
        int len = Math.abs(length1 - length2);
        while (len > 0) {
            l = l.next;
            len--;
        }
        while (l != null && s != null) {
            if (l == s) {
                return l;
            }
            l = l.next;
            s = s.next;
        }
        return null;
    }

    /**
     * 获取链表的长度
     *
     * @param node 链表头结点
     * @return 链表长度
     */
    public static int getListLength(ListNode node) {
        int length = 0;
        if (node != null) {
            while (node != null) {
                length++;
                node = node.next;
            }
        }
        return length;
    }
}