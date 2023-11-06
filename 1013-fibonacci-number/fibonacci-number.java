class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        int f = 0, s = 1;
        for(int i = 2; i <= n; i++) {
            int v = f + s;
            f = s;
            s = v;
        }
        return s;
    }
}