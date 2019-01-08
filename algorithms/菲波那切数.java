class Solution {
    private int[] array = new int[10];

    public Solution() {
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < 10; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
    }

    public int fib(int N) {
        if (N < 0) {
            return 0;
        } else if (N < 10) {
            return array[N];
        } else {
            int a = array[8];
            int b = array[9];
            int t;
            for (int i = 10; i <= N; i++) {
                t = b;
                b = a + b;
                a = t;
            }
            return b;
        }
    }
}