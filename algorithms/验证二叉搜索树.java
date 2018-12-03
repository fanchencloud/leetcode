/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/**
 * @author chen
 */
class Solution {
    private long lastValue = Long.MIN_VALUE;

    /**
     * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
     * <p>
     * 假设一个二叉搜索树具有如下特征：
     * <p>
     * 节点的左子树只包含小于当前节点的数。
     * 节点的右子树只包含大于当前节点的数。
     * 所有左子树和右子树自身必须也是二叉搜索树。
     *
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        // 空树返回true
        if (root == null) {
            return true;
        }
        // 检查是否有左子树，并遍历左子树
        if (!isValidBST(root.left)) {
            return false;
        }
        // 检查根节点的值是否大于上一次遍历的节点
        if (lastValue >= root.val) {
            return false;
        }
        lastValue = root.val;
        // 检查是否有右子树，并遍历右子树
        if (!isValidBST(root.right)) {
            return false;
        }
        return true;
    }
}