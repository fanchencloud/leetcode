import java.lang.StringBuffer;

class Solution {
    public String reverseString(String s) {
        if (s == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        char[] array = s.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
        }
        return sb.toString();
    }
}