/**
 * Created by handsome programmer.
 * User: chen
 * Date: 19-2-25
 * Time: 上午12:39
 * Description: 深度优先遍历
 *
 * @author chen
 */
public class Solution {
    public int maxDepth(Node root) {
        return dfs(root);
    }

    private static int dfs(Node root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        if (root.children != null) {
            for (Node node : root.children) {
                depth = Math.max(depth, dfs(node));
            }
        }
        return depth + 1;
    }
}
