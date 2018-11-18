import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    // hash表保存字母
    private final static HashSet<Character> tabl1 = new HashSet<Character>() {
        {
            add('q');
            add('w');
            add('e');
            add('r');
            add('t');
            add('y');
            add('u');
            add('i');
            add('o');
            add('p');
        }
    };
    // hash表保存字母
    private final static HashSet<Character> tabl2 = new HashSet<Character>() {
        {
            add('a');
            add('s');
            add('d');
            add('f');
            add('g');
            add('h');
            add('j');
            add('k');
            add('l');
        }
    };
    // hash表保存字母
    private final static HashSet<Character> tabl3 = new HashSet<Character>() {
        {
            add('z');
            add('x');
            add('c');
            add('v');
            add('b');
            add('n');
            add('m');
        }
    };

    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<String>(words.length);
        for (String str : words) {
            String s = str.toLowerCase();
            boolean flag = true;
            HashSet<Character> temp = tabl1;
            if (tabl2.contains(s.charAt(0))) {
                temp = tabl2;
            } else if (tabl3.contains(s.charAt(0))) {
                temp = tabl3;
            }
            for (int i = 1; i < s.length(); i++) {
                if (!temp.contains(s.charAt(i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(str);
            }
        }
        return list.toArray(new String[0]);
    }
}