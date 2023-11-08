class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich = 0;
        for(int i = 0; i < accounts.length; i++) {
            int tot = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                tot += accounts[i][j];
            }
            rich = Math.max(rich, tot);
        }
        return rich;
    }
}