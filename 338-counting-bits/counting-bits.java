class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            char[] chs = Integer.toString(i, 2).toCharArray(); int count = 0;
            for(int j = 0; j < chs.length; j++) {
                if(chs[j] == '1') count++;
            }
            res[i] = count;
        }
        return res;
    }
}