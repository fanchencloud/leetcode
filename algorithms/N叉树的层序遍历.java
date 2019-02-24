/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists = new LinkedList<List<Integer>>();
        if (root != null) {
            List<Integer> integerList = new ArrayList<>(1);
            integerList.add(root.val);
            lists.add(integerList);
        }
        List<Node> first = bfs(root);
        List<Node> second = new LinkedList<>();
        while (first != null && first.size() != 0) {
            List<Integer> integerList = new ArrayList<>(first.size());
            for (Node node : first) {
                integerList.add(node.val);
                List<Node> bfs = bfs(node);
                if (bfs != null) {
                    second.addAll(bfs);
                }
            }
            lists.add(integerList);
            first.clear();
            first.addAll(second);
            second.clear();
        }
        return lists;
    }

    private static List<Node> bfs(Node root) {
        if (root != null && root.children != null) {
            return root.children;
        }
        return null;
    }
}