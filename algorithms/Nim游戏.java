class Solution {
    public boolean canWinNim(int n) {
        if((n & 3) == 0){
            return false;
        }else{
            return true;
        }
    }
}