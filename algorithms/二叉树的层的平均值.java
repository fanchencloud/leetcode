/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.*;

/**
 * @author chen
 */
class Solution {
    /**
     * 求二叉树的每层的平均值
     * @param root
     * @return
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> lists = new ArrayList<Double>();
        if (root == null) {
            return lists;
        }
        // 两个队列p q，p用于保存当前层的节点，q用于保存下一层的节点
        Queue<TreeNode> p = new LinkedList<TreeNode>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Queue<TreeNode> t;
        // 入队根节点
        p.add(root);
        while (!p.isEmpty()) {
            // 该层节点的数目
            int num = 0;
            // 该层所有的节点的值的总和
            double sum = 0;
            List<Integer> list = new ArrayList<Integer>();
            while (!p.isEmpty()) {
                // 出栈一个节点
                root = p.poll();
                if (root != null) {
                    if (root.left != null) {
                        q.add(root.left);
                    }
                    if (root.right != null) {
                        q.add(root.right);
                    }
                    sum += root.val;
                    num++;
                }
            }
            t = p;
            p = q;
            q = t;
            lists.add(sum / num);
        }
        return lists;
    }
}