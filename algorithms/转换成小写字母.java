class Solution {
    public String toLowerCase(String str) {
        if(str == null){
            return null;
        }
        StringBuilder sb = new StringBUilder();
        for(int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c = (char)c + 32;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}