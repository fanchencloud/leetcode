import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2020/3/8
 * Time: 19:09
 * Description:
 *
 * @author chen
 */
public class Solution {
    private static int[][] direction = {
            // 向右走
            {0, 1},
            // 向左走
            {0, -1},
            // 向上走
            {1, 0},
            // 向下走
            {-1, 0}
    };

    private class Node {
        int x;
        int y;

        public Node() {
        }

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public int maxAreaOfIsland(int[][] grid) {
        // 行数
        int numberOfLines = grid.length;
        // 列数
        int numberOfColumns = grid[0].length;
        // 标记数组
        int[][] mark = new int[numberOfLines][numberOfColumns];
        // 初始化标记数组
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                mark[i][j] = 0;
            }
        }
        // 最大的岛屿面积
        int maxArea = 0;
        // 遍历岛屿
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if (grid[i][j] == 1) {
                    // 遍历队列
                    Queue<Node> nodeQueue = new LinkedList<>();
                    // 将降落的起始坐标插入队列
                    Node node = new Node(i, j);
                    nodeQueue.add(node);
                    // 将降落点标记为已遍历
                    mark[i][j] = 1;
                    int sum = 1;
                    while (!nodeQueue.isEmpty()) {
                        node = nodeQueue.poll();
                        // 枚举当前点的四个方向
                        for (int k = 0; k < 4; k++) {
                            // 下一个的坐标
                            int x = node.getX() + direction[k][0];
                            int y = node.getY() + direction[k][1];
                            // 判断是否越界
                            if (x < 0 || x > numberOfLines-1 || y < 0 || y > numberOfColumns-1) {
                                continue;
                            }
                            // 判断是否遍历过该点并且改点是否是陆地
                            if (grid[x][y] != 0 && mark[x][y] == 0) {
                                sum++;
                                // 入队该节点并标记为已遍历
                                nodeQueue.add(new Node(x, y));
                                mark[x][y] = 1;
                            }
                        }
                    }
                    // 更新最大的岛的大小
                    if (sum > maxArea) {
                        maxArea = sum;
                    }
                }
            }
        }
        return maxArea;
    }
}