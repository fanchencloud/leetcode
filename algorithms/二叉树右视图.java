/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> res = new LinkedList<Integer>();
    // 二叉树为空，直接返回
    if (root == null) {
      return res;
    }
    // 保存节点的队列
    Queue<TreeNode> nodes = new LinkedList<>();
    // 当前层数的节点数量
    int currentNodeNumber = 1;
    // 当前层数的序号，是第几层
    int currentLineNumber = 1;
    // 下一层的节点数量
    int nextLineNodeNumber = 0;
    // 入队根节点
    nodes.offer(root);
    while (!nodes.isEmpty()) {
      // 元素出队
      TreeNode temp = nodes.poll();
      // 当前层的节点数量减少一个
      currentNodeNumber--;
      if (currentNodeNumber == 0) {
        res.add(temp.val);
      }
      if (temp.left != null) {
        nextLineNodeNumber++;
        nodes.offer(temp.left);
      }
      if (temp.right != null) {
        nextLineNodeNumber++;
        nodes.offer(temp.right);
      }
      // 判断当前层是否已经遍历完成
      if (currentNodeNumber == 0) {
        currentNodeNumber = nextLineNodeNumber;
        nextLineNodeNumber = 0;
        currentLineNumber++;
      }
    }
    return res;
  }
}