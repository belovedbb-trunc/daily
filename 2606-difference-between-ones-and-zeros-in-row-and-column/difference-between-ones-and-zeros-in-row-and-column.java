class Solution {
    Map<Integer, Integer> row = new HashMap<>();
    Map<Integer, Integer> col = new HashMap<>();
    public int[][] onesMinusZeros(int[][] grid) {
        int[][] res = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            if(!row.containsKey(i)) {
                row.put(i, getOneRow(grid[i]));
            }
            int oneR = row.get(i);
            int zeroR = grid[0].length - oneR;
            for(int j = 0; j < grid[i].length; j++) {
                if(!col.containsKey(j)) {
                    col.put(j, getOneCol(grid, j));
                }
                int oneC = col.get(j);
                int zeroC = grid.length - oneC;
                res[i][j] = (oneR + oneC - zeroR - zeroC);
            }
        }
        return res;
    }

    int getOneRow(int[] r) {
        int count = 0;
        for(int i = 0; i < r.length; i++) 
            if(r[i] == 1) count++;
        return count;
    }

    int getOneCol(int[][] m, int c) {
        int count = 0;
        for(int i = 0; i < m.length; i++) {
            if(m[i][c] == 1)  count++;
        }
        return count;
    }
}
