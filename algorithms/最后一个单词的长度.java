class Solution {
    public int lengthOfLastWord(String s) {
       if (s == null || "".equals(s)) {
            return 0;
        }
        String[] strings = s.split(" ");
        if (strings.length > 0) {
            return strings[strings.length - 1].length();
        }
        return 0;
    }
}