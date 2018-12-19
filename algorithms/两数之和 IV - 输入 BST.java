import java.util.HashSet;

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        return function(root, set, k);
    }

    private boolean function(TreeNode root, HashSet<Integer> set, int k) {
        if (root == null) {
            return false;
        }
        if (set.contains((k - root.val))) {
            return true;
        }
        set.add(root.val);
        return function(root.left, set, k) || function(root.right, set, k);
    }
}