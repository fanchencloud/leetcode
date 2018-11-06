class Solution {
    public boolean isHappy(int n) {
        int index = 0;
        while (true) {
            index++;
            int sum = 0;
            while (n > 0) {
                int t = n % 10;
                sum = sum + t * t;
                n = n / 10;
            }
            if (index == 1000) {
                return false;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;

        }
    }
}