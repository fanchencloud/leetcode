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
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Collections;

/**
 * @author chen
 */
class Solution {
    /**
     * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<List<Integer>>();
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
                    list.add(root.val);
                }
            }
            t = p;
            p = q;
            q = t;
            lists.add(list);
        }
        Collections.reverse(lists);
        return lists;
    }
}