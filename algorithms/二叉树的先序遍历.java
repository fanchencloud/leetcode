/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author chen
 */
class Solution {
    /**
     * 二叉树的非递归先序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        // 根节点入栈
        stack.push(root);
        while (!stack.isEmpty()) {
            // 弹出栈顶元素
            root = stack.pop();
            // 如果弹出的元素右孩子不为空，将该节点的右孩子入栈
            if (root.right != null) {
                stack.push(root.right);
            }
            // 如果弹出的元素的左孩子不为空，将该节点的左孩子入栈
            if (root.left != null) {
                stack.push(root.left);
            }
            // 访问该节点的值
            list.add(root.val);
        }
        return list;
    }
}