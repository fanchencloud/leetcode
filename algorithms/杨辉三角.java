
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<Integer>(i + 1);
            for (int j = 0; j <= i; j++) {
                // 杨辉三角第一个数
                if (j == 0) {
                    list.add(1);
                } else if (j < i && i > 1) {
                    list.add((result.get(i - 1).get(j) + result.get(i - 1).get(j - 1)));
                } else if (i == j) {
                    list.add(1);
                }
            }
            result.add(list);
        }
        return result;
    }
}