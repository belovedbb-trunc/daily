class Solution {
    Map<Integer, Integer> row = new HashMap<>();
    Map<Integer, Integer> col = new HashMap<>();
    public int[][] onesMinusZeros(int[][] grid) {
        int[][] res = new int[grid.length][grid[0].length];
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    row[i] += grid[i][j];
                    col[j] += grid[i][j];
                }
            }
        }
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                int oneRow = row[i];
                int zeroRow = grid.length - oneRow;
                int oneCol = col[j];
                int zeroCol = grid[0].length - oneCol;
                res[i][j] = oneRow + oneCol - zeroRow - zeroCol;
            }
        }
        return res;
    }


}
