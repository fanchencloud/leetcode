import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author chen
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        // 判断该节点是否为空节点
        if (root == null) {
            return new ArrayList<Integer>(0);
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new LinkedList<Integer>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            // 连续将该节点的左子树压入栈
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()) {
                p = stack.peek();
                list.add(p.val);
                p = p.right;
                stack.pop();
            }
        }
        return list;
    }
}