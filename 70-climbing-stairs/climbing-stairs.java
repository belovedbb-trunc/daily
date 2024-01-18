class Solution {
    Map<Integer, Integer> m = new HashMap<>();
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(m.containsKey(n)) return m.get(n);
        int f =  climbStairs(n - 1);
        int s =  climbStairs(n - 2);
        int res = f + s;
        m.put(n, res);
        return res;
    }
}