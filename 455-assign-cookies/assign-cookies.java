class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int j = 0 , i = 0;
        while(j < s.length && i < g.length) {
            int v = s[j];
            int vv = g[i];
            int r = v - vv;
            if(r >= 0) {
                res++;
                i++;
            }
            j++;
        }
        return res;
    }
}