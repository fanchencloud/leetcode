class Solution {
    /**
     * 输入: "Let's take LeetCode contest" 
     * 输出: "s'teL ekat edoCteeL tsetnoc"
     * 
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        if (s == null || "".equals(s)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        // 字符串长度
        int len = chars.length;
        // 标志位
        int start, end, index = 0;
        while (index < len) {
            // 结束位置默认值
            end = -1;
            // 起始位置
            start = index;
            // 寻找结束位置
            while (index < len && chars[index] != ' ') {
                char t = chars[index];
                index++;
            }
            // 处理 index 超过数组下标
            if (index >= len) {
                end = len - 1;
            }

            // 处理 index 未越界，但是表示的是空格的情况
            else if (index < len && chars[index] == ' ') {
                end = index - 1;
            }
            // 数据复制
            for (int j = end; j >= start; j--) {
                sb.append(chars[j]);
            }
            // 添加空格
            if (index < (len - 1)) {
                sb.append(" ");
            }
            // 下标后移一位
            index++;
        }
        return sb.toString();
    }
}